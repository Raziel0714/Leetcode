package com.daisy;

public class ReverseBits {
    private static int reverseBits(int n){
        if ( n == 0 ) return 0;
        int res = 0;
        for (int i = 0; i < 32; i++){
            res <<= 1;
            if((n & 1) == 1) res++;
            n >>= 1;

        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(reverseBits(2));
    }

}
