package com.daisy;

public class KthSmallestElementinaBST {
    private TreeNode temp;
    private int counter;
    public int kthSmallest(TreeNode root, int k){
        inorder(root, k);
        return temp.val;
    }

    public void inorder(TreeNode node, int k){
        if(node == null) return;

        inorder(node.left, k);
        if(++counter == k){
            temp = node;
            return;
        }
        inorder(node.right, k);
    }
}
