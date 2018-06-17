package com.daisy;

public class BestTimetoBuyandSellStocks2 {

    private static int BestTime(int[] nums){
        int maxProfit = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                maxProfit += (nums[i]-nums[i-1]);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){

        int[] nums = {1,3,5,3,6,7,0,9};
        System.out.println(BestTime(nums));
    }
}
