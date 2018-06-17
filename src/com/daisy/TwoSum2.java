package com.daisy;

public class TwoSum2 {
    private static int[] twoSum(int[] nums, int target){
        int start =0, end = nums.length-1;
        while(start<end){
            for(int i=1;i<nums.length;i++){
                if((nums[start]+nums[end])==target){
                    return new int[]{start+1, end+1};
                }else if((nums[start]+nums[end])>target){
                    end--;
                }else start++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,5,7,10};
        int[] ans = twoSum(nums, 7);
        for(int n:ans){
            System.out.println(n);
        }

    }

}
