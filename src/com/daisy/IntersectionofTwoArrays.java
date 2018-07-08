package com.daisy;

import java.util.Arrays;

public class IntersectionofTwoArrays {

    public static int[] intersect(int[] nums1, int[] nums2){
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] res = new int[nums1.length > nums2.length ? nums2.length : nums1.length];
        int k = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                res[k++] = nums1[i++];
                j++;
            }else{
                int t = nums1[i] > nums2[j] ? j++ : i++;
            }
        }

        return Arrays.copyOfRange(res, 0, k);
    }

    public static void main(String[] args){
        int[] num1 = {2,2,2,1};
        int[] num2 = {2,2};

        int[] res = intersect(num1, num2);

        for(int i : res){
            System.out.println(i);
        }
    }
}
