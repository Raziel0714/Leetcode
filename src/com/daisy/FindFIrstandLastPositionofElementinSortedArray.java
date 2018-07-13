package com.daisy;


public class FindFIrstandLastPositionofElementinSortedArray {
    public static int[] searchRange(int[] nums, int target){
        if(nums.length == 0) return new int[]{-1, -1};
        int start = 0, end = nums.length-1;
        int index = search(nums, start, end, target);
        if(index == -1) {
            return new int[]{-1, -1};
        }else{
            int i = index, j = index;
            while(nums[i-1] == target) i--;
            while(nums[j+1] == target) j++;
            return new int[]{i, j};
        }

    }

    public static int search(int[] nums, int start, int end, int target){
        if(nums[start] == target) return start;
        if(nums[end] == target) return end;

        while(end > start){
            int mid = (end-start)/2 + start;
            System.out.println(mid);
            if(nums[mid] == target) {
                return mid;
            }else{
                if(nums[mid]> target) {
                    return search(nums,start, mid, target);
                }else {
                    return search(nums, mid+1, end, target);
                }
            }
        }

        return -1;

    }

    public static void main(String[] args){
        int[] ans  =searchRange(new int[]{2, 2}, 1);
        for(int i : ans){
            System.out.print(i+ " ");
        }
    }

}
