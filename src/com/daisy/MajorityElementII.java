package com.daisy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {

    public static List<Integer> majorityElement(int[] nums){
        List<Integer> res = new ArrayList<>();
        if(nums.length == 0 || nums == null) return res;
        if(nums.length == 1){
            res.add(nums[0]);
            return res;
        }
        if(nums.length == 2){
            res.add(nums[0]);
            if(!res.contains(nums[1])){
                res.add(nums[1]);
            }
            return res;
        }

        Arrays.sort(nums);
        int len = nums.length;
        System.out.println(len);
        int index = 0;
        for(int i=1; i<len; i++){
            if(nums[i] != nums[i-1]){
                if(i - index> len/3) {
                    res.add(nums[i-1]);
                }
                index = i;
            }
            if(i == nums.length-1){
                if(i - index + 1 > len/3){
                    res.add(nums[i]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] a = {1};
        System.out.println(majorityElement(a));
    }
}
