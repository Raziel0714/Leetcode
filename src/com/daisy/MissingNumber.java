package com.daisy;

public class MissingNumber {

    private static int Mnum(int[] nums){
        int[] res = new int[nums.length+1];
        for(int n:nums){
            res[n] = 1;
        }
        for(int i=0;i<res.length;i++){
            if(res[i] == 0){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(Mnum(new int[]{2,3,0}));
    }
}
