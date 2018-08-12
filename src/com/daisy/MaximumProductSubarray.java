package com.daisy;

public class MaximumProductSubarray {

    public int maxProduct(int[] nums){
        if(nums.length == 0 || nums == null) return 0;

        int maxProduct = nums[0], minProduct = nums[0], res = nums[0];
        for(int i=1; i<nums.length; i++){
            int max = maxProduct, min = minProduct;
            maxProduct = Math.max(Math.max(maxProduct*nums[i], nums[i]), minProduct*nums[i]);
            minProduct = Math.min(Math.min(maxProduct*nums[i], nums[i]), minProduct*nums[i]);
            res = Math.max(res, maxProduct);
        }
        return res;
    }
}
