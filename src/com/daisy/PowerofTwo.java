package com.daisy;

public class PowerofTwo {

    public static boolean isPowerOfTwo(int n){
        return n>0 && ((n & (n-1)) == 0);
    }

    public static void main(String[] args){
        System.out.println(isPowerOfTwo(9));
        System.out.println(8 & 7);
    }
}
