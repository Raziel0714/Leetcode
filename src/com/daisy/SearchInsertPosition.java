package com.daisy;

public class SearchInsertPosition {
/*Given a sorted array and a target value, return the index if the
target is found. If not, return the index where it would be if it
were inserted in order.*/
    private static int SearchPosition(int[] nums, int target){
        if(nums == null || nums.length == 0) return 0;
        if(target>nums[nums.length-1]) return nums.length;
        if(target<nums[0]) return 0;
        int start = 0; int end = nums.length -1;
        while(start+1<end){
            int mid = (end-start)/2 + start;
            if(target==nums[mid]) return mid;
            if(target<nums[mid]){
                end = mid;
            }else start = mid;
        }

        if(nums[start]==target) return start;
        if(nums[end]==target) return end;
        return start+1;
    }
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int p =SearchPosition(nums, 5);
        System.out.println(p);
    }
}
