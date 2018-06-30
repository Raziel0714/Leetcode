package com.daisy;

public class FactorialTrailingZero {
    private static int NumofZero(int num){
        int count = 1;
        int sum = 0;
        while( num / Math.pow(5,count) > 0){
            sum += num / Math.pow(5, count);
            count++;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(NumofZero(3));
    }
}
