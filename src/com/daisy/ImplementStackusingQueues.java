package com.daisy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private int top;

    public void push(int x){
        q1.add(x);
    }

    public int pop(){
        while(q1.size() > 1){
            top = q1.remove();
            q2.add(top);
        }
        int res = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return res;
    }

    public int top(){
        return top;
    }

    public boolean empty(){
        return q1.isEmpty();
    }
}
