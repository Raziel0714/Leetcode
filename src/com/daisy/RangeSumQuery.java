package com.daisy;

public class RangeSumQuery {

    private int[] data;
    public void NumArray(int[] nums){
        data = nums;
    }

    public int[] preCompute(){
        int[] sum = new int[data.length+1];
        for(int k=1; k<sum.length; k++){
            sum[k] = sum[k-1] + data[k-1];
        }
        return sum;
    }

    public int sumRange(int i, int j){
        int[] a = preCompute();
        return a[j+1]-a[i];
    }

    public static void main(String[] args){
    }
}
