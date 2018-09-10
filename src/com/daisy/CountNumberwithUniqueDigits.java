package com.daisy;

public class CountNumberwithUniqueDigits {
    public static int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1; dp[1] = 10;
        for(int i=2; i<=n; i++){
            int temp = 0;
            for(int j=9;j>=Math.max(1,11-i);j--){
                temp += C(9,1);
            }
            dp[i] = dp[i-1]+temp*9;
        }
        return dp[n];
    }

    public static int[] cache = new int[16];
    public static int fact(int n){
        if(n == 1) cache[n] = 1;
        if(n>1 && cache[n]==0)
            cache[n]=fact(n-1)*n;
        return cache[n];
    }

    public static int C(int a, int b){
        return fact(a)/ (fact(b)*fact(a-b));
    }

    public static void main(String[] args){
        System.out.println(countNumbersWithUniqueDigits(9));
    }
}
