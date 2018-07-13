package com.daisy;


import java.util.HashMap;

public class IsomorphicStrings {
    private static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> map = new HashMap<Character, Character>();
        for(int i=0; i<s.length(); i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
            }else{
                if(t.charAt(i) != map.get(s.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isIsomorphic("add", "eee"));
    }
}
