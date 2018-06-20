package com.daisy;

public class PalindromeNumber {
    private static boolean isPalindrome(int num){
        //negative number is not palindrome
        if(num<0 || num % 10 == 0 && num != 0) return false;
        // o and positive number
        int revertedNum = 0;
        while(num > revertedNum){
            revertedNum = revertedNum * 10 + num % 10;
            num = num / 10;
        }
        if(num == revertedNum || num == revertedNum/10) return true;
        return false;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(121));

    }
}
