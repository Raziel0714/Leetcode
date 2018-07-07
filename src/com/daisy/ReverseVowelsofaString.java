package com.daisy;


public class ReverseVowelsofaString {

    public static boolean checkVowel(char s) {
        if (s == 'a' || s == 'e' || s == 'e' || s == 'o' || s == 'u') {
            return true;
        }
        return false;
    }

        public static String reverseVowels (String s){
            char[] ch = s.toCharArray();
            int start = 0;
            int end = s.length()-1;
            char temp;
            while(end > start){
                if(checkVowel(ch[start]) && checkVowel(ch[end])){
                    temp = ch[end];
                    ch[end] = ch[start];
                    ch[start] = temp;
                    start++;
                    end--;
                }else{
                    if(!checkVowel(ch[start])){
                        start++;
                    }
                    if(!checkVowel(ch[end])){
                        end--;
                    }
                }
            }
            return new String(ch);
        }
        public static void main (String[]args){
            System.out.println(reverseVowels("leetcode"));

        }

}
