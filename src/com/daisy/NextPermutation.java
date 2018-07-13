package com.daisy;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        if(nums.length==1){
            return;
        }
        int pointerA = nums.length-2;
        int pointerB = nums.length-1;
        while(nums[pointerB] <= nums[pointerA]){
            if(pointerA == 0){
                break;
            }
            pointerA--;
            pointerB--;
        }
        System.out.println(pointerA+ " " + pointerB);
        int cur=nums[pointerB]; int index = pointerB;
        if(pointerA == 0 && nums[pointerA] >= nums[pointerB]){
            int start = 0; int end = nums.length-1;
            while(end > start){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
                start++;
            }
        }else{
            for(int i = pointerB; i<nums.length; i++){
                if(nums[i] > nums[pointerA] && nums[i] <= nums[index]){
                    cur = nums[i];
                    index = i;
                }
            }
            cur = nums[index];
            nums[index] = nums[pointerA];
            nums[pointerA] = cur;
            System.out.println(nums[index] + " " + index);
        }
        for(int i : nums){
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.sort(nums, pointerA+1, nums.length);

        for(int i : nums){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args){
        nextPermutation(new int[]{5, 1,1});

    }
}
