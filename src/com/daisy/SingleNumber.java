package com.daisy;


import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums){
        Arrays.sort(nums);
        for(int i:nums){
            System.out.print(i);
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1]) return nums[i];
            i++;
        }
        return nums[nums.length-1];
    }
    public static void main(String[] args){
        System.out.println(singleNumber(new int[]{1,2,2,6,1}));
    }
}
