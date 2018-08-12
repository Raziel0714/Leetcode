package com.daisy;

public class BitwiseANDofNumber {
    public static int rangeBitwiseAnd(int m, int n){
        if(m == n) return m;

        int step = 0;
        while(!detectSame(m, n)){
            m >>= 1;
            n >>= 1;
            step++;
        }
        return m<<=step;
    }

    public static boolean detectSame(int m, int n){
        for(int i = m; i<=n; i++){
            if( i!=m) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int s = rangeBitwiseAnd(1,1);
        System.out.println(s);
    }
}
