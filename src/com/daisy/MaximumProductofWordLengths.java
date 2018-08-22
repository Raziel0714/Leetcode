package com.daisy;

public class MaximumProductofWordLengths {
    public static int maxProduct(String[] words){
        if(words.length <= 1) return 0;

        int[] preProcecssed = new int[words.length];
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                preProcecssed[i] |= 1 << (words[i].charAt(j)-'a');
            }
        }
        int res = 0;
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                if((preProcecssed[i] & preProcecssed[j]) == 0){
                    res = Math.max(words[i].length() * words[j].length(), res);
                }
            }
        }
        return res;
}


    public static void main(String[] args){
        String[] word = {"adf", "dfs"};
        System.out.println(maxProduct(word));
    }
}
