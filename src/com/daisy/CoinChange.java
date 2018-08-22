package com.daisy;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for(int i = 1; i <= amount ; i++){
            dp[i] = 0x7fffffff;
            for(int j=0; j<coins.length; j++){
                if(i >= coins[i] && dp[i-coins[j]] != 0x7fffffff){
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount] == 0x7fffffff? -1 : dp[amount];
    }

    public static void main(String[] args){
        int[] num = {186,419,83,408};
        System.out.println(coinChange(num, 6249));
    }
}
