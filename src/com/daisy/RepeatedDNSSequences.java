package com.daisy;

import java.util.*;

public class RepeatedDNSSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new LinkedList<>();
        if(s.length() < 11 || s == null) return res;
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);

        Set<Integer> set = new HashSet();
        Set<Integer> unique = new HashSet();
        int hash = 0;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(i<9) {
                hash = (hash<<2) + map.get(c);
            } else {
                hash = (hash<<2) + map.get(c);
                hash &= (1<<20) - 1;


                if(set.contains(hash) && !unique.contains(hash)){
                    res.add(s.substring(i-9, i+1));
                    unique.add(hash);
                }else{
                    set.add(hash);
                }
            }

        }
        return res;
    }
}
