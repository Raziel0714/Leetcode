package com.daisy;

import java.util.Arrays;

public class ThreeSumCloset {
    public static int threeSumClosest(int[] nums, int target) {
        int res1 = target;
        int res2 = target;
        Arrays.sort(nums);
        while(true){
            for(int i=0; i<nums.length-2; i++){
                int[] s = new int[nums.length-1];
                for(int j=0; j<s.length; j++){
                    if(j<i) s[j]=nums[j];
                    else s[j] = nums[j+1];
                }

                int start = i, end = s.length-1;
                while(end > start){
                    if(s[start] + s[end] == res1 - nums[i]) return res1-target;
                    else{
                        if(s[start] + s[end] > res1-nums[i]) end--;
                        else start++;
                    }
                }
                int left = i, right = s.length-1;
                while(right > left){
                    if(s[left] + s[right] == res2 - nums[i]) return target-res2;
                    else{
                        if(s[left] + s[right] > res2-nums[i]) right--;
                        else left++;
                    }
                }
            }

            res1++;
            res2--;
        }
    }

    public static void main(String[] args){
        int[] q = {0, 1, 2};
        System.out.println(threeSumClosest(q, 3));
    }
}
