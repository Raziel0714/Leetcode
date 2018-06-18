package com.daisy;


import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    private static boolean ConDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ConDuplicate(new int[]{1,3,3,4}));
    }
}
