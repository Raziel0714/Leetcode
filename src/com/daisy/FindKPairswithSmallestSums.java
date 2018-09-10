package com.daisy;

import java.util.*;

public class FindKPairswithSmallestSums {
    public static List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k){
        List<int[]> res = new ArrayList<>();
        if(k == 0 || nums1.length == 0 || nums2.length == 0) return res;
        int len = Math.min(k*k, Math.min(k, nums1.length)*Math.min(k, nums2.length));
        int[][] temp = new int[len][2];

        int index = 0;
        for(int i=0; i<Math.min(k, nums1.length); i++){
            for(int j = 0; j< Math.min(k, nums2.length); j++){
                System.out.println(nums1[i] + " : " + nums2[j]);
                temp[index++] = new int[]{nums1[i], nums2[j]};
            }
        }

        Arrays.sort(temp, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0]+ints[1]-t1[0]-t1[1];
            }
        });

        for(int i=0; i<Math.min(k, len); i++){
            res.add(temp[i]);
        }
        return res;
    }
    public static void main(String[] args){
        int[] num1 = {1};
        int[] num2 = {3,5,6,7,8,100};
        List<int[]> res = kSmallestPairs(num1, num2, 4);
        for(int[] i : res){
            System.out.println(i[0] + " : " + i[1]);
        }
    }
}
