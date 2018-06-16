package com.daisy;

public class SearchinRotatedSortedArray {

    private static int Search(int[] nums, int target){
        if(nums == null || nums.length == 0) return -1;
        int start =0, end=nums.length-1;
        while(start+1<end){
            int mid = (end-start)/2 + start;
            if (nums[mid]==target) return mid;
            if(nums[start]<nums[mid]){
                if(nums[start]<=target && target<nums[mid]){
                    end = mid;
                }else start = mid;
            }else{
                if(nums[mid]< target && target <nums[end]){
                    start = mid;
                }else end = mid;
            }
        }
        if(nums[start] == target) return start;
        if(nums[end] == target) return end;
        return -1;



    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,0};
        int target = 3;
        int position = Search(nums, target);
        System.out.print(position);



    }
}
