package com.daisy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

    private static List<Integer> pasc(int indexRow){
        List<Integer> one = new ArrayList<>();
        one.add(1);
        if(indexRow == 0) return one;

        List<Integer> row = new ArrayList<>();

        for(int i=1; i<indexRow+1; i++){
            row = new ArrayList<>();
            row.add(1);
            for(int j=1; j<i; j++){
                row.add(one.get(j-1)+one.get(j));

            }
            row.add(1);
            one = row;

        }
        return one;
    }


    public static void main(String[] args){
        List<Integer> ans = pasc(5);
        for(Integer n:ans){
            System.out.print(n+" ");
        }
    }
}
