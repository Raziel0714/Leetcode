package com.daisy;
import java.util.List;
import java.util.ArrayList;


public class CombinationSumIII {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(), 1, k, n);
        return res;
    }
    public static void backtrack(List<List<Integer>> res, ArrayList<Integer> temp, int start, int k, int n){
        if(k==0 && n==0 && !res.contains(temp)){
            res.add(new ArrayList<>(temp));
        }

        for(int i=start; i<10; i++){
            temp.add(i);
            backtrack(res, temp, i+1, k-1, n-i);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args){
        System.out.println(combinationSum3(3, 9));
    }
}
