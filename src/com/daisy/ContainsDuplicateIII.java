package com.daisy;

import java.util.SortedSet;
import java.util.TreeSet;

public class ContainsDuplicateIII {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k < 1 || t < 0 || nums == null || nums.length < 2) return false;
        SortedSet<Long> set = new TreeSet<Long>();

        for(int i = 0; i<nums.length; i++){
            SortedSet<Long> subSet = set.subSet((long)nums[i]-t,(long)nums[i]+t+1);
            System.out.println(set);
            System.out.println(nums[i]+" "+ (nums[i]-t)+" "+(nums[i]+t+1));

            if(!subSet.isEmpty()) return true;

            if(i>=k){
                set.remove((long)nums[i-k]);
            }
            set.add((long)nums[i]);

        }
        return false;
    }


    public static void main(String[] args){
        int[] nums = {1,5,9,1,5,9};
        System.out.println(containsNearbyAlmostDuplicate(nums, 2, 3));
    }
}
