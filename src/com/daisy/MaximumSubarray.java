package com.daisy;

public class MaximumSubarray {

    private static int Subarray(int[] nums){
        int res = nums[0];
        int sum = nums[0];
        for ( int i=1;i<nums.length;i++){
            sum = Math.max(nums[i], sum+nums[i]);
            res = Math.max(res, sum);
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {3,5,-4,6,-7,8};
        int m = Subarray(nums);
        System.out.println(m);

    }
}
