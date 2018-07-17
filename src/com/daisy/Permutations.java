package com.daisy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute2(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, res, new ArrayList<>(), 0);
        return res;
    }

    public static void helper(int[] nums, List<List<Integer>> res, List<Integer> list, int n){
        if(n == nums.length) res.add(list);
        for(int i = 0; i<nums.length; i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            helper(nums, res, new ArrayList<>(list), n+1);
            list.remove(list.size()-1);
        }
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : nums){
            arr.add(i);
        }
        backtrack(arr, res);

        return res;
    }

    private static void backtrack(ArrayList<Integer> arr, List<List<Integer>> list){
        if(list.contains(arr)){
            return;
        }else{
            list.add(new ArrayList<>(arr));
            ArrayList<Integer> a = findnextPermutation(arr);
            backtrack(a, list);
        }
    }

    private static ArrayList<Integer> findnextPermutation(ArrayList<Integer> s){
        ArrayList<Integer> res = new ArrayList<>();
        if(s.size() == 1){
            res.add(s.get(0));
            return res;
        }
        int pointerA = s.size()-2;
        int pointerB = s.size()-1;
        while(s.get(pointerB) <= s.get(pointerA)){
            if(pointerA == 0){
                break;
            }
            pointerA--;
            pointerB--;
        }
        int start = 0; int end = s.size()-1; int cur=s.get(pointerB); int index = pointerB;
        if(pointerA == 0 && s.get(pointerA) >= s.get(pointerB)){
            while(end > start){
                int temp = s.get(start);
                s.set(start, s.get(end));
                s.set(end, temp);
                end--;
                start++;
            }
        }else{
            for(int i = pointerB; i<s.size(); i++){
                if(s.get(i) > s.get(pointerA) && s.get(i) <= s.get(index)){
                    cur = s.get(i);
                    index = i;
                }
            }
            cur = s.get(index);
            s.set(index, s.get(pointerA));
            s.set(pointerA, cur);
        }

        int[] h = new int[s.size()];
        for(int i = 0; i < h.length; i++){
            h[i] = s.get(i);
        }
        Arrays.sort(h, pointerA+1, h.length);
        for(int i = 0; i<h.length; i++){
            res.add(h[i]);
        }
        return res;
    }


    public static void main(String[] args){
        System.out.println(permute2(new int[]{1,2,3}));
    }
}
