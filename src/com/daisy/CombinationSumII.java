package com.daisy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        if(candidates.length == 0 || candidates == null) return res;

        Arrays.sort(candidates);

        backtrack(candidates, target, 0, new ArrayList<Integer>(), res);
        return res;
    }

    private static void backtrack(int[] nums, int target, int i, ArrayList<Integer> list, List<List<Integer>> res){
        if(target < 0) return;
        if(target == 0){
            if(!res.contains(list)){
                res.add(new ArrayList<>(list));
                return;
            }
        }

        for(int j = i; j < nums.length; j++){
            list.add(nums[j]);
            backtrack(nums, target-nums[j], j+1, list, res);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args){
        int[] a = new int[]{1,2,2,3,6,7};
        System.out.println(combinationSum2(a, 7));
    }
}
