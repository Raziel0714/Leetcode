package com.daisy;

public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes){
        int len = primes.length;
        int[] times = new int[len];
        int[] result = new int[n];
        result[0] = 1;

        for(int i=1; i< n; i++){
            int min = Integer.MIN_VALUE;
            for(int j = 0; j<len; j++){
                min = Math.min(min, primes[j] * result[times[j]]);
            }
            result[i] = min;

            for(int j = 0; j<times.length; j++){
                if(result[times[j]] * primes[j] == min){
                    times[j] ++ ;
                }
            }

        }
        return result[n-1];

    }
}
