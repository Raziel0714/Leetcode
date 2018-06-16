package com.daisy;

public class MergeSortedArray {

    private static int[] MergeSArray(int[] num1, int m, int[] num2, int n){
        int i = m-1, j=n-1, k=m+n-1;
        while(i>=0 && j>=0){
            num1[k--] = num1[i]>=num2[j] ? num1[i--] : num2[j--];
        }
        while(j>=0){
            num1[k--] = num2[j--];
        }
        return num1;
    }

    public static void main(String[] args){
        int[] num1 = {1};
        int[] num2 = {};
        int[] ans = MergeSArray(num1,1, num2,0);
        for(int n:ans){
            System.out.print(n+" ");
        }
    }
}
