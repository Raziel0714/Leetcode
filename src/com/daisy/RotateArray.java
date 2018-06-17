package com.daisy;

public class RotateArray {
    private static int[] Rotate(int[] nums, int k){
        int s = 0;
        for(int i=0;i<k;i++){
            s=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j] = nums[j-1];
            }
            nums[0] = s;
        }
        return nums;

    }


    public static void main(String[] args){
        int[] nums = new int[]{1,2,4,5,6};
        int[] ans = Rotate(nums, 2);
        for(int n:ans){
            System.out.print(n+" ");
        }
    }

}
