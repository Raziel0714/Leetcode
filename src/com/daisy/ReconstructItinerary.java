package com.daisy;

import java.util.*;

public class ReconstructItinerary {

    public List<String> findItinerary(String[][] tickets){
        HashMap<String, PriorityQueue<String>> maps = new HashMap<>();
        LinkedList<String> res = new LinkedList<>();
        for(int i=0; i<tickets.length; i++){
            String key = tickets[i][0];
            if(maps.get(key) == null){
                maps.put(key, new PriorityQueue<>());
            }
            maps.get(key).offer(tickets[i][1]);
        }

        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        while(!stack.isEmpty()){
            String cur = stack.peek();
            if(maps.containsKey(cur) && maps.get(cur).size() > 0){
                stack.push(maps.get(cur).poll());
            }else{
                res.addFirst(stack.pop());
            }
        }
        return res;
    }

    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Mary");
        list.addFirst("Amy");
        list.addFirst("Bob");
        System.out.println(list);
    }
}
