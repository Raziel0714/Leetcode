package com.daisy;

public class WiggleSubsequence {
    public static int wiggleMaxLength(int[] nums){
        if(nums.length == 0 || nums == null) return 0;
        int positive = 0, negative = 0;
        boolean p = true; boolean n = false;

        for(int i=1; i<nums.length; i++){
            if(nums[i] - nums[i-1] == 0) continue;
            if(nums[i] - nums[i-1] > 0 == p) {
                positive++;
                p = !p;
            }
            if(nums[i] - nums[i-1] > 0 == n){
                    negative++;
                    n = !n;
                }
            }
            System.out.println(positive + " : " + negative);
        return Math.max(positive+1, negative+1);
    }

    public static void main(String[] args){
        int[] num = {0,0};
        System.out.println(wiggleMaxLength(num));
    }
}
