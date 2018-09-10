package com.daisy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DifferentWaystoAddParenthese {
    public List<Integer> diffWaysToCompute(String input){
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                List<Integer> left = diffWaysToCompute(input.substring(0,i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1,input.length()));
                for(int l : left){
                    for(int r : right){
                        switch(ch){
                            case '+':
                                res.add(l+r);
                                break;
                            case '-':
                                res.add(l-r);
                                break;
                            case '*':
                                res.add(l*r);
                                break;
                        }
                    }
                }
            }
        }
        if(res.size() == 0) res.add(Integer.valueOf(input));
        return res;
    }

    private HashMap<String, List<Integer>> hm = new HashMap<>();
    public List<Integer> diffWaysToCompute1(String input){
        if(hm.containsKey(input)) return hm.get(input);
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                for(Integer l : diffWaysToCompute1(input.substring(0, i))){
                    for(Integer r : diffWaysToCompute1(input.substring(i+1, input.length()))){
                        if(ch=='+') res.add(l+r);
                        else if(ch=='-') res.add(l-r);
                        else res.add(l*r);
                    }
                }
            }
        }
        if(res.size() == 0) res.add(Integer.valueOf(input));
        hm.put(input, res);
        return res;


    }

}
