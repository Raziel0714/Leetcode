package com.daisy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElement {
    public List<Integer> topKFrequent(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i], 1 + map.get(nums[i]));
            }
        }

        List<Integer>[] bucket = new List[nums.length+1];
        for(int key : map.keySet()){
            int count = map.get(key);

            if(bucket[count] == null){
                bucket[count] = new ArrayList<>();
            }
            bucket[count].add(key);
        }

        List<Integer> res = new ArrayList<>();
        for(int i = nums.length; i>0; i--){
            if(bucket[i] != null && res.size() < k){
                res.addAll(bucket[i]);
            }
        }
        return res;

    }
}
