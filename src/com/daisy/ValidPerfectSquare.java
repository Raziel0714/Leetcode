package com.daisy;

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num){
        if(num < 0) return false;

        long i=0, j = num;
        while(i < j){
            long mid = (j-i) / 2 + i;
            System.out.println("mid:" + mid);
            if( mid * mid == num){
                return true;
            }else{
                if( mid*mid > num){
                    j = mid-1;
                    System.out.println("j:" + j);
                }else{
                    i = mid+1;
                }
            }
        }
        if(i==j && i*i == num) return true;
        return false;
    }

    public static void main(String[] args){
        System.out.print(isPerfectSquare(808201));


    }
}
