package com.daisy;

import java.util.Arrays;

public class SingleNumberIII {

    public static int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        int index = 1;
        if(nums[nums.length-1] != nums[nums.length-2]){
            res[1] = nums[nums.length-1];
        }
        for(int i=0; i<2; i++){
            while(index < nums.length) {
                if (nums[index - 1] != nums[index]) {
                    res[i] = nums[index - 1];
                    index++;
                    break;
                } else {
                    index += 2;
                }
            }
        }
        return res;

    }

    public static void main(String[] args){
        int[] num = {0, 1, 2, 2};
        int[] res = singleNumber(num);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
