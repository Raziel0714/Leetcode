package com.daisy;

public class ContainDuplicate2 {
    private static boolean ConDuplicate(int[] nums, int k){
        for(int i=0;i<nums.length;i++){
            System.out.println("i:"+i);
            int end = (nums.length-1 - i) >= k ? i+k : nums.length-1;
            System.out.println("end:"+end);
            for(int j=i+1;j<=end;j++){
                if(nums[i] == nums[j]){
                    System.out.println(nums[i]+" "+nums[j]);
                    return true;
                }
            }
        }

        return false;

    }

    public static void main(String[] args){

        System.out.println(ConDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }

}
