package com.daisy;

public class DivideTwoInteger {
    public static int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1){
            return Integer.MAX_VALUE;
        }

        long[] arr = new long[40];

        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        int res = 0; long sum = 0; int count = -1;

        for(int i=0; i< arr.length; i++){
            if(b <= a){
                arr[i] = b;
                b <<= 1;
                count++;
            }
        }

        for(int j = count; j >= 0; j--){
            if(sum + arr[j] > a){
                continue;
            }else{
                sum += arr[j];
                res += Math.pow(2, j);
            }
        }

        boolean sign = true;
        if(dividend < 0) sign = !sign;
        if(divisor < 0) sign = !sign;
        if(!(res < Integer.MAX_VALUE && res > Integer.MIN_VALUE)){
            if(sign) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }else{
            return res *= sign? 1:-1;
        }

    }

    public static void main(String[] args){
        System.out.println(divide(Integer.MIN_VALUE,1));
    }
}
