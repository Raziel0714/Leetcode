package com.daisy;

public class PlusOne {

    private static int[] pluso(int[] nums){
        int end = nums.length -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 9){
                nums[end]++;
                for(int j=end;j>=0;j--){
                    if(nums[j]>=10){
                        nums[j]=0;
                        nums[j-1]++;
                    }
                }
            }
            return nums;
        }
        int[] ans = new int[nums.length+1];
        ans[0]=1;
        return ans;

    }
    public static void main(String[] args){
        int[] nums = new int[]{9,1,4,6,8,4,2,4};
        int[] ans = pluso(nums);

    }
}
