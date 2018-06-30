package com.daisy;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root){
        if(root == null) return true;
        return (treeDepth(root) != -1);
    }
    public int treeDepth(TreeNode root){
        if(root == null) return 0;
        int l = treeDepth(root.left);
        int r = treeDepth(root.right);
        if( l == -1 || r == -1) return -1;
        if( Math.abs(l - r) > 1) return -1;
        return Math.max(l, r) + 1;
    }
}
