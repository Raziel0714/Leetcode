package com.daisy;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int[] len = new int[nums.length];
        len[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int[] count = new int[i];
            len[i] = 1;
            for (int j = 0; j < count.length; j++) {
                if (nums[i] > nums[j]) {
                    count[j] = len[j] + 1;
                    if (count[j] > len[i]) {
                        len[i] = count[j];
                    }
                }
            }
        }

        int res = Integer.MIN_VALUE;
        for (int i = 0; i < len.length; i++) {
            System.out.print(len[i]+" ");
            res = Math.max(res, len[i]);
        }
        return res == Integer.MIN_VALUE ? 0 : res;
    }

    public static void main(String[] args){
        int[] nums = {10,9,2,5,3,4};
        System.out.println(lengthOfLIS(nums));
    }
}
