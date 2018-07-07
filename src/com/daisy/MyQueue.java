package com.daisy;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();
    private int peak = 0;

    public void push(int x){
        if(s1.size()==0){
            s1.add(x);
            peak = x;
        }else{
            s1.add(x);
        }
    }

    public int pop(){
        while(s1.size()>1){
            s2.add(s1.pop());
        }
        int res = s1.pop();
        while(s2.size()>0){
            int n = s2.pop();
            s1.add(n);
            peak = n;
        }
        return res;
    }

    public int peek(){
        return peak;
    }
}
