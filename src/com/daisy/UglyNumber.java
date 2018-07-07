package com.daisy;

public class UglyNumber {

    public static boolean isUgly(int num) {
        if(num == 0) return false;
        while (num != 1 && (num % 2 == 0 || num % 3 == 0 || num % 5 == 0)) {
            if (num % 2 == 0) {
                num = num / 2;
            }
            if (num % 3 == 0) {
                num = num / 3;
            }
            if (num % 5 == 0) {
                num = num / 5;
            }

        }
        if (num == 1) return true;
        return false;

    }

    public static void main(String[] args){
        System.out.println(isUgly(8));
    }
}
