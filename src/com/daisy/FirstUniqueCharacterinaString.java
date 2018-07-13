package com.daisy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterinaString {
    public static int firstUniqChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }

        int[] res = new int[map.size()];
        int i = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                res[i] = s.indexOf(entry.getKey());
                i++;
            }
        }
        int[] res1 = Arrays.copyOfRange(res, 0, i);
        if(res1.length == 0) return -1;
        int ans=Integer.MAX_VALUE;
        for(int j=0; j<res1.length; j++){
            if(res1[j]<ans) ans = res1[j];
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(firstUniqChar("leetcode"));

    }
}
