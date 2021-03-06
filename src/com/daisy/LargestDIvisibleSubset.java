package com.daisy;

import java.util.*;

public class LargestDIvisibleSubset {

    public static List<Integer> largestDivisibleSubset(int[] nums){
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);

        int[] dp = new int[nums.length];
        int[] index = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(index, -1);
        int max_index = 0, max_dp = 1;
        for(int i=1; i<dp.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i] % nums[j] == 0 && dp[j]+1 > dp[i]){
                    dp[i] = dp[j] + 1;
                    index[i] = j;
                }
            }
            if(max_dp < dp[i]){
                max_dp = dp[i];
                max_index = i;
            }
        }
        for(int i : dp){
            System.out.print(i + " ");
        }

        for(int i = max_index; i != -1; i=index[i]){
            res.add(nums[i]);
        }
        return res;
    }

    public static void main(String[] args){
        int[] num = {4,8,10,240};
        System.out.println(largestDivisibleSubset(num));
    }
}
