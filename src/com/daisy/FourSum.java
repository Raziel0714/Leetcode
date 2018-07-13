package com.daisy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0; i<nums.length-3; i++){
            int[] cur = new int[nums.length-i-1];
            for(int j=0; j<cur.length; j++){
                cur[j] = nums[j+i+1];
            }
            res = threeSum(nums[i], cur, target-nums[i], res);
        }
        return res;
    }

    public static List<List<Integer>> threeSum(int n4, int[] nums, int target, List<List<Integer>> res){
        for(int i=0; i<nums.length-2; i++){

            int[] temp = new int[nums.length-i-1];
            for(int j=0; j<temp.length; j++){
                temp[j] = nums[j+i+1];
            }

            int start = 0; int end = temp.length-1; List<Integer> l;
            while(end > start){
                if(temp[start] + temp[end] == target - nums[i]){
                    l = Arrays.asList(n4, nums[i], temp[start], temp[end]);
                    if(!res.contains(l)) res.add(l);
                    start++;
                    end--;
                }else{
                    if(temp[start] + temp[end] > target - nums[i]) end--;
                    else start++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args){
        int[] nums = {-1,-5,-5,-3,2,5,0,4};
        System.out.print(fourSum(nums, -7));
    }

}
