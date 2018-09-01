package com.daisy;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ShuffleanArray {

    int[] n;
    Random rand;
    Map<Integer, Integer> map;
    int index;
    public ShuffleanArray(int[] nums) {
        this.n = nums;
        this.rand = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return n;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        map = new HashMap<>();
        index = 0;
        for(int num : n){
            map.put(index++,num);
        }
        int[] res = new int[n.length];
        for(int i=res.length; i>0; i--){
            int tem = rand.nextInt(i);
            res[i-1] = map.get(tem);
            int last = map.get(i-1);
            map.put(tem, last);
            map.remove(i-1);
        }
        int index = 5;
        String s = "[[[]]";
        boolean a = s.charAt(--index) == ']';

        return res;
    }
}

