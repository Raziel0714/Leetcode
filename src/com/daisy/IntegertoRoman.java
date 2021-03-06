package com.daisy;

public class IntegertoRoman {

    private static String intToRoman(int num){
        String[][] roman = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"}
        };

        String res = "";
        int digit = 0;
        while(num != 0){
            int remain = num%10;
            res = roman[digit][remain] + res;
            digit++;
            num /= 10;
        }
        return res;
    }


    public static void main(String[] args){
        System.out.println(intToRoman(213));
    }
}
