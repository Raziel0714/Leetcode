package com.daisy;

public class AddDigits {
    public static int addDigits(int num){
        int res = 0;
        while(num > 0){
            res += num%10;
            num = num/10;
        }
        if(res > 9){
            return addDigits(res);
        }else{
            return res;
        }
    }
    public static void main(String[] args){
        System.out.println(addDigits(38));
    }
}
