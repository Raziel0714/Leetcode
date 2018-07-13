package com.daisy;

public class StringtoInteger_atoi {
    private static int myAtoi(String str){
        if(str == null || str.length() == 0) return 0;
        str = str.trim();
        char[] ch = str.toCharArray();
        int sign=1, cur, start = 0;
        long num = 0;
        if(!Character.isLetterOrDigit(ch[start])){
            if(ch[start] == '-') {
                sign = -1;
                start = 1;
            }else if(ch[start] == '+'){
                start = 1;
            }
        }
        while(start < ch.length){
            if(!Character.isDigit(ch[start])){
                return (int)num * sign;
            }else{
                cur = Character.getNumericValue(ch[start]);
                num = num*10 + cur;
                start++;
            }
            if(!(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)){
                return sign == -1? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

        }
        return (int)num*sign;
    }

    public static void main(String[] args){
        System.out.println(myAtoi("  -2147483647"));
    }
}
