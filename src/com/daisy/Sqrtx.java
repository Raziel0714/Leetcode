package com.daisy;

public class Sqrtx {
    private static int mySqrt(int x){
        int low = 1, high =x;
        while(low <= high){
            long mid = (high-low)/2+low;
            if(mid*mid == x) return (int)mid;
            else{
                if(mid * mid < x){
                    low = (int)mid + 1;
                }else high = (int)mid - 1;
            }
        }
        if(high * high < x) return (int)high;
        else return(int)low;
        }


    private static int mySqurtNewton(int x){
        int a = x;
        while(a*a>x){
            a = (a+x/a)/2;
        }
        return (int)a;
    }


    public static void main(String[] args){
        System.out.print(mySqrt(8));
        System.out.print(mySqurtNewton(12));
    }

}
