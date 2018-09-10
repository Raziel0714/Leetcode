package com.daisy;

public class FindtheDuplicateNumber {
    public static int findDuplicate(int[] nums){
        int slow = 0;
        int fast = 0;

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
            System.out.println("aaa "+slow + " " + fast);
        }while(fast != slow);

        fast = 0;

        while(fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
    }

    public static void main(String[] args){
        int[] nums = {3, 1, 3,3,4,5};
        System.out.println(findDuplicate(nums));
    }
}
