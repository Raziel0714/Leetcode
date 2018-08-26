package com.daisy;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIV {
    public static int combinationSum4(int[] nums, int target){
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, target, 0);
        return res.size();
    }

    public static void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int target, int index){

        if(target < 0) return;
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index; i<nums.length; i++){
            temp.add(nums[i]);
            backtrack(res, temp, nums, target-nums[i], i);
            temp.remove(temp.size()-1);
        }
    }

    //dp solution

    public int combinationSum4II(int[] nums, int target){
        int[] dp = new int[target+1];
        dp[0] = 1;

        for(int i=0; i<=target; i++){
            for(int num : nums){
                if(num + i < target){
                    dp[num+i] += dp[i];
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args){
        int[] nums = {4,2,1};
        System.out.println(combinationSum4(nums,32));
    }

}
