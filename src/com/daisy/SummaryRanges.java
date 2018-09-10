package com.daisy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums){
        List<String> res = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        res.add(nums[0]+"");
        count.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            System.out.println(nums[i]);
            if(nums[i] != nums[i-1]+1){
                if(!count.contains(nums[i-1])){
                    String temp = res.remove(res.size()-1);
                    res.add(temp +"->" + nums[i-1]);
                    count.add(nums[i-1]);
                }
                res.add(nums[i] + "");
                count.add(nums[i]);
            }

            if(i == nums.length-1 && (nums[i] == nums[i-1]+1)){
                String temp = res.remove(res.size()-1);
                res.add(temp +"->" + nums[i]);
                count.add(nums[i]);
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] a = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(a));
    }


}
