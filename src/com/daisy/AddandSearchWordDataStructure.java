package com.daisy;

import java.util.HashSet;
import java.util.Set;

public class AddandSearchWordDataStructure {
    Set<String> dict = new HashSet<>();

    public AddandSearchWordDataStructure(){

    }

    public void addWord(String word){
        dict.add(word);
    }

    public boolean search(String word){
        if(dict.contains(word)) return true;
        else if(!word.contains(".")) return false;

        for(int c='a'; c<'z'; c++){
            int i=0;
            while(word.charAt(i++) != '.'){};
            StringBuilder sb = new StringBuilder(word);
            sb.setCharAt(i-1, (char)c);
            if(search(sb.toString())) return true;
        }

        return false;
    }

}
