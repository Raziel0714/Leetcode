package com.daisy;

import java.util.ArrayList;
import java.util.List;

public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++){
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            backtrack(nums, i+1, list, res);
            if(res.size() > 0) return true;
        }
        return false;
    }

    public static void backtrack(int[] nums, int index, List<Integer> list, List<List<Integer>> res){
        if(list.size() == 3){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index; i<nums.length; i++){
            if(nums[i]>list.get(list.size()-1)){
                list.add(nums[i]);
                backtrack(nums, i+1, list, res);
                list.remove(list.size()-1);
            }
        }
    }

    public static boolean increasingTriplet1(int[] nums){
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int n : nums){
            if(n <= min){
                min = n;
            }else if(n <= min2){
                min2 = n;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {5,1,5,5,2,5,4};
        System.out.println(increasingTriplet(nums));
    }
}
