package com.daisy;

import java.util.HashMap;
import java.util.Map;

public class RangeSumQueryMutable {
    Map<Integer, Integer> map = new HashMap<>();
    public RangeSumQueryMutable(int[] nums){
        for(int i=0; i<nums.length; i++){
            map.put(i, nums[i]);
        }
    }

    public void update(int i, int val){
        map.put(i, val);
    }

    public int sumRange(int i, int j){
        int res = 0;
        for(int k=i; k<=j; k++){
            res += map.get(k);
        }
        return res;
    }

}
