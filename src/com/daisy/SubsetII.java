package com.daisy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
    public static List<List<Integer>> SubsetsWithDup(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length == 0 || nums == null) return res;
        for(int i=0; i<=nums.length; i++){
            backtrack(res, new ArrayList<>(), nums, 0, i);
        }
        return res;
    }

    public static void backtrack(List<List<Integer>> res, List<Integer> comb, int[] nums, int start, int k){
        if(k == 0 && !res.contains(comb)){
            res.add(new ArrayList<>(comb));
        }
        for(int i = start; i<nums.length; i++){
            comb.add(nums[i]);
            backtrack(res, comb, nums, i+1, k-1);
            comb.remove(comb.size()-1);
        }

    }

        public static void main(String[] args){
        int[] nums = {1, 2, 2};
        System.out.println(SubsetsWithDup(nums));
    }

}
