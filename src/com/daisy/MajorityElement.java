package com.daisy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    private static int MElement(int[] nums){
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for(int n:nums){
            if(!counts.containsKey(n)){
                counts.put(n, 1);
            }else {
                counts.put(n, counts.get(n)+1);
            }
        }

        Map.Entry<Integer, Integer> majorityEntry = null;
        for(Map.Entry<Integer, Integer> entry: counts.entrySet()) {
            if(majorityEntry == null || entry.getValue() > majorityEntry.getValue()){
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();

    }

    private static int MElement2(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args){
        System.out.println(MElement(new int[]{1,1,3,5,4}));
    }


}
