package com.daisy;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), s, 0);
        return res;
    }
    public static void backtrack(List<List<String>> res, List<String> temp, String s, int index){
        if(index == s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index; i<s.length(); i++){
            if(checkPalindrome(s, index, i)){
                temp.add(s.substring(index, i+1));
                backtrack(res, temp, s, i+1);
                temp.remove(temp.size()-1);
            }
        }


    }

    public static boolean checkPalindrome(String s, int start, int end){
        while(end > start){
            if(s.charAt(end--) != s.charAt(start++)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(partition("aab"));
    }
}
