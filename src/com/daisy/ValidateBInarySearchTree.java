package com.daisy;

public class ValidateBInarySearchTree {
    public static boolean isValidBST(TreeNode root){
        return Valid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static boolean Valid(TreeNode root, int min, int max){
        if(root == null) return true;
        if(min > max) return false;
        if(root.val < min || root.val > max) return false;
        int val = root.val;
        if(!Valid(root.left, min, val-1)) return false;
        if(!Valid(root.right, max, val-1)) return false;
        return true;
    }

    public static void main(String[] args){
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(1);
        a.left = b;
        a.right = c;
        System.out.println(isValidBST(b));
    }
}
