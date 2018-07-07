package com.daisy;

import java.util.HashMap;

public class ContainsDuplicate2 {

    private static boolean containsDuplicate(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if(!map.containsKey(num) || i-map.get(num) > k){
                map.put(num, i);
            }else{
                return true;
            }
        }
        return false;
    }
}
