package com.daisy;


public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost){
        int start = 0, lack = 0, left = 0;
        for(int i=0; i<gas.length; i++){
            left += gas[i] - cost[i];
            if(left < 0){
                start = i+1;
                lack += left;
                left = 0;
            }
        }
        return left + lack >= 0?start:-1;
    }
}
