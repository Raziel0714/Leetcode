package com.daisy;

public class Powxn {
    public double powhelper(double x, int n){
        if( n == 0) return 1;
        double res = powhelper(x, n/2);

        if(n % 2 == 0)
            return res * res;
        else
            return res * res * x;
    }

    public double myPow(double x, int n){
        if(n == 0) return 1;
        else if(n<0) return 1.0 / powhelper(x, -n);
        return powhelper(x, n);
    }

}
