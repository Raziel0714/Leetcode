package com.daisy;

public class ConvertSortedArraytoBinarySearchTre {

    private static TreeNode sortedArrayToBST(int[] nums){
        if(nums == null || nums.length == 0) return null;
        return helper(nums, 0, nums.length-1);
    }
    public static TreeNode helper(int[] nums, int left, int right){
        if(left > right) return null;
        int mid = (right - left)/2 + left;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid+1, right);
        return root;
    }

}
