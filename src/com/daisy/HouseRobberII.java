package com.daisy;

public class HouseRobberII {
    public int rob(int[] nums){
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int len = nums.length;
        int[] dp1 = new int[len + 1], dp2 = new int[len + 1];
        dp1[1] = nums[0];
        for(int i=1; i<len - 1; i++) dp1[i+1] = Math.max(dp1[i], dp1[i-1]+nums[i]);
        for(int i=1; i<len; i++) dp2[i+1] = Math.max(dp2[i], dp2[i-1]+nums[i]);
        return Math.max(dp1[len-1], dp2[len]);
    }
}
