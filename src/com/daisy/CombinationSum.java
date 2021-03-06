package com.daisy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(candidates == null || candidates.length == 0){
            return res;
        }
        Arrays.sort(candidates);
        backtrack(candidates, target, res, new ArrayList<Integer>(), 0);
        return res;
    }
    private static void backtrack(int[] nums, int target, List<List<Integer>> res, ArrayList<Integer> list, int start){
        if(target < 0) return;
        if(target == 0){
            res.add(list);
            return;
        }
        for(int i = start; i < nums.length && target >= nums[i]; i++){
            list.add(nums[i]);
            backtrack(nums, target - nums[i], res, new ArrayList<Integer>(list), i);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args){
        int[] a = new int[]{2,3,6,7};
        System.out.println(combinationSum(a, 7));
    }

}
