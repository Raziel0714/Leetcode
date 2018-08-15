package com.daisy;

import java.util.Arrays;

public class KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i = nums.length-1; i>=0; i--){
            k--;
            if(k==0) return nums[i];
        }
        return nums[0];
    }
}
