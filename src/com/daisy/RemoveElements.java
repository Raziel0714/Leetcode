package com.daisy;

public class RemoveElements {
    private static int removeElements(int[] nums, int val){
        int i=0;
        for(int j=0; j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args){
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeElements(nums, 3));
    }
}
