package com.daisy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<Integer>(), nums, new boolean[nums.length]);
        return result;
    }
    private static void backtrack(List<List<Integer>> result, ArrayList<Integer> arr, int[]nums, boolean[] used){
        if(!result.contains(arr) && arr.size() == nums.length){
            result.add(arr);
        }

        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;
            used[i] = true;
            arr.add(nums[i]);
            backtrack(result, new ArrayList<>(arr), nums, used);
            arr.remove(arr.size()-1);
            used[i] = false;
        }

    }

    public static void main(String[] args){
        System.out.println(permuteUnique(new int[]{1,1,2}));
    }
}
