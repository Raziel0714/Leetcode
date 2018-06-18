package com.daisy;

public class MoveZeros {

    private static int[] Move0(int[] nums){
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index; i<nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }

    public static void main(String[] args){
        int[] res = Move0(new int[]{1,0,3,0,12,0});
        for(int n:res){
            System.out.print(n+" ");
        }
    }
}
