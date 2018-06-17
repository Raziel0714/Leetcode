package com.daisy;

public class BestTimetoBuyandSellStocks {
    private static int BestTime(int[] nums){
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minprice){
                minprice=nums[i];
            }if(nums[i]-minprice>maxprofit){
                maxprofit=nums[i]-minprice;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args){

        int[] nums = {1,3,5,3,6,7,0,9};
        System.out.println(BestTime(nums));
    }

}
