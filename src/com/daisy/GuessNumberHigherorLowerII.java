package com.daisy;

public class GuessNumberHigherorLowerII {
    public int getMoneyAmount(int n){
        int[][] dp = new int[n+1][n+1];
        return solve(dp, 1, n);
    }

    public int solve(int[][] dp, int l, int r){
        if(l >= r) return 0;
        if(dp[l][r] != 0) return dp[l][r];
        dp[l][r] = 0x7FFFFFFF;
        for(int i=l; i<=r; i++){
            dp[l][r] = Math.min(dp[l][r], Math.max(solve(dp, l, i-1), solve(dp, i+1, r)));
        }
        return dp[l][r];
    }

}
