package com.daisy;

public class EliminationGame {
    public int lastRemaining(int n){
        int remaining = n;
        boolean left = true;
        int head = 1;
        int step = 1;
        while(remaining > 1){
            if(left || remaining % 2 == 1){
                head += step;
            }
            step *= 2;
            left = !left;
            remaining /= 2;
        }
        return head;
    }

}
