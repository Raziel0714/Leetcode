package com.daisy;

public class IntegerBreak {
    public static int integerBreak(int n){
        int res = 1;
        for(int i=2; i<=n/2; i++){
            int temp = 1, help = 0;
            for(int j =0; j<= i; j++){
                if(j==i-1){
                    temp *= ((n-help) == 0 ? 1 : (n - help));
                    System.out.println("#####  "+res + " : " + temp);
                    res = Math.max(res, temp);
                }else{
                    temp *= Math.round((float)n / i);
                    help += Math.round((float)n / i);
                    System.out.println(temp + " : " + help + " : " + i);
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(integerBreak(48));
        System.out.println(Math.round((float)8/3));
    }
}
