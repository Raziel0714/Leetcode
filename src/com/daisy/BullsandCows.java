package com.daisy;

import java.util.HashMap;
import java.util.Map;

public class BullsandCows {
    public static String getHint(String secret, String guess) {
        int a = 0, b = 0;
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sbs = new StringBuilder(secret);
        StringBuilder sbg = new StringBuilder(guess);
        for(int i = 0; i<sbs.length(); i++){
            char c = sbs.charAt(i);
            char g = sbg.charAt(i);
            System.out.println(c+" : "+g);
            if(c == g){
                a++;
                sbs.deleteCharAt(i);
                sbg.deleteCharAt(i);
                i--;
            }else{
                if(!map.containsKey(c)){
                    map.put(c, 1);
                }else{
                    map.put(c, map.get(c)+1);
                }
            }
        }


        for(Map.Entry<Character, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        for(int i=0; i<sbg.length(); i++){
            char ch = sbg.charAt(i);
            if(map.containsKey(ch)){
                b++;
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch)-1);
                }
            }
        }
        return new String(a+"A"+b+"B");
    }

    public static void main(String[] args){
        System.out.println(getHint("11", "10"));
    }
}
