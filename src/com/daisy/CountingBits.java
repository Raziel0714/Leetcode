package com.daisy;

public class CountingBits {
    public static int[] countBits(int num){
        int[] res = new int[num+1];
        res[0] = 0;
        int start = 0;
        int count = 1;
        for(int i=1; i<res.length;i++){
            if(i == Math.pow(2, start)){
                start++;
                res[i] = 1;
                count = 1;
            }else{
                res[i] = 1 + res[count++];
            }
        }
        return res;
    }

    public static int[] countBits2(int num){
        int[] dp = new int[num+1];
        for(int i=1; i<= num; i++){
            dp[i] = dp[ i & (i-1)] +1;
        }
        return dp;
    }

    public static void main(String[] args){

        System.out.println( 11 & 10);
    }
}
