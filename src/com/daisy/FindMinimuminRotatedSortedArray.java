package com.daisy;

public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums){
        int start = 0, end = nums.length-1;
        while(start < end){
            int mid = (end - start)/2 + start;
            if(nums[mid] < nums[end]) end = mid;
            else start = mid + 1;
        }
        return nums[start];
    }
}
