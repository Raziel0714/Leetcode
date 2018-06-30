package com.daisy;

public class ValidPalindrome {

    public static boolean isPalindrome(String s){
        if(s == null || s.length()==0) return true;
        int left = 0, right = s.length()-1;
        while(left < right){
            while(left<right && Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right))){
                if(Character.toLowerCase(s.charAt(left))== Character.toLowerCase(s.charAt(right))){
                    left++;
                    right--;
                }else return false;
            }
            if(!Character.isLetterOrDigit(s.charAt(left))) left++;
            if(!Character.isLetterOrDigit(s.charAt(right))) right--;
        }
        return true;
        }

    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

}
