package com.daisy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        Map<Integer, List<String>> map = new HashMap<>();
        int key = 1;
        for(String s : strs){
            for(int i=0; i<s.length(); i++){
                key *= prime[(s.charAt(i) - 'a')];
            }
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
    public static void main(String[] args){
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(s);
    }
}
