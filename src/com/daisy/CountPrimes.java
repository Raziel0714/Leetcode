package com.daisy;

public class CountPrimes {

    private static int countPrimes(int n){
        boolean[] notPrime = new boolean[n];
        int res = 0;
        for(int i=2; i<n; i++){
            if(notPrime[i] == false){
                res++;
                for(int j = 2; i*j<n; j++){
                    notPrime[i * j] = true;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(countPrimes(10));
    }

}
