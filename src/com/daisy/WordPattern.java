package com.daisy;

import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String str){
        String[] strs = str.split(" ");
        if(pattern.length() != strs.length) return false;
        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))&&map.containsValue(strs[i])) return false;
            if(!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i), strs[i]);
            }else{
                if(!strs[i].equals(map.get(pattern.charAt(i)))){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(wordPattern("aaba", "egg egg egg egg"));
    }

}
