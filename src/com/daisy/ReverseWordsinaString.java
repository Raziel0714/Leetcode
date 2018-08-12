package com.daisy;

public class ReverseWordsinaString {

    public static String reverseWords(String s){
        s.trim();
        String[] strs = s.split(" ");


        StringBuilder sb = new StringBuilder();

        for(int i=strs.length-1; i>=0; i--){
            if(!strs[i].trim().equals("")){
                sb.append(strs[i] + " ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args){
        System.out.println(reverseWords("t  b "));
    }

}
