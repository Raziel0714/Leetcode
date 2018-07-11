package com.daisy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int[] save = new int[nums.length-1];
        int start = 0, end = nums.length - 2;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<save.length; j++){
                if(j<i) save[j] = nums[j];
                else save[j] = nums[j+1];
            }

            while(end > start){
                if(nums[start] + nums[end] == -nums[i]){
                    List<Integer> list = Arrays.asList(nums[i],nums[start], nums[end]);
                    if(!res.contains(list)) res.add(list);
                    start++;
                    end--;
                }else{
                    if(nums[start]+nums[end] > -nums[i]){
                        end--;
                    }else start++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args){
        int[] q = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(q));
    }

}
