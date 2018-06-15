package com.daisy;


public class RemoveDuplicatesfromSortedArray {

    private static int removeDuplicates(int[] nums){
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        System.out.println(i+1);
        return i+1;

    }

    public static void main(String[] args){
        int[] nums = {0, 3, 3 ,3, 5};
        removeDuplicates(nums);
    }
}
