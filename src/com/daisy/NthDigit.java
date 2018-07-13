package com.daisy;

public class NthDigit {

    public static int findNthDigit(int n){
        int digitType = 1;
        long digitNum = 9;

        while(n > digitType*digitNum){
            n -= digitType*digitNum;
            digitType++;
            digitNum *= 10;
        }

        int indexOfSubArray = (n-1)/digitType;
        int indexOfNum = (n-1) % digitType;

        int num = (int)Math.pow(10, digitType-1)+indexOfSubArray;
        int res = Integer.parseInt((""+num).charAt(indexOfNum)+"");
        return res;

    }

    public static void main(String[] args){
        System.out.println(findNthDigit(2147483647));
    }

}
