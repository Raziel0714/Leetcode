package com.daisy;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    private static int lengthofLongestSubstring(String s) {
        int num = s.length();
        //i represent the beginning of the substring, j represent the end.
        int ans = 0, i = 0, j = 0;
        //substring elements
        Set<Character> set = new HashSet<>();
        while(j<num){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int ans = lengthofLongestSubstring("abcabcbb");
        System.out.println(ans);
    }
}

