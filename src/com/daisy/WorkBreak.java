package com.daisy;

import com.sun.org.apache.xerces.internal.xs.LSInputList;

import java.util.LinkedList;
import java.util.List;

public class WorkBreak {

    public static boolean wordBreak(String s, List<String> wordDict){

        return backtrack(new LinkedList<String>(), s, wordDict, 0);
    }

    public static boolean backtrack(LinkedList<String> queue, String s, List<String> wordDict, int start){
        if(start == s.length()) return true;
        for(String str : wordDict){
            if(start+str.length() > s.length()) continue;
            if(s.substring(start, str.length()+start).equals(str)){
                System.out.println(str);
                queue.add(str);
            }
        }

        while(!queue.isEmpty()){
            String temp = queue.poll();
            if(backtrack(new LinkedList<>(), s, wordDict, temp.length()+start)){
                return true;
            }
        }
        return false;
    }

    public static boolean wordBreak1(String s, List<String> wordDict){
        if(s == null || s.length() < 1 || wordDict == null || wordDict.size() < 1 ){
            return false;
        }
        int length = s.length();
        boolean[] match = new boolean[length+1];
        match[0] = true;

        for(int i=1; i<length+1; i++){
            for(int j=0; j<i ; j++){
                if(match[j] && wordDict.contains(s.substring(j, i))){
                    match[i] = true;
                    break;
                }
            }
        }
        return match[length];
    }


    public static void main(String[] args){
        List<String> list = new LinkedList<>();
        list.add("car");
        list.add("ca");
        list.add("rs");
        System.out.println(wordBreak("cars",list));
    }

}
