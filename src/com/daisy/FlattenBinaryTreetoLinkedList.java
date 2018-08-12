package com.daisy;

public class FlattenBinaryTreetoLinkedList {
    public static void flatten(TreeNode root){
        TreeNode p = root;
        while (p != null){
            if(p.left != null){
                TreeNode left = p.left;
                while(left.right != null) {
                    left = left.right;
                }
                left.right = p.right;
                p.right = p.left;
                p.left = null;
            }
            p = p.right;
        }
    }

    public static void main(String[] args){
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);
        TreeNode a6 = new TreeNode(6);
        a1.right = a5;
        a1.left = a2;
        a2.right = a4;
        a2.left = a3;
        a5.right = a6;

        flatten(a1);

        while(a1 != null){
            System.out.println(a1.val);
            a1 = a1.right;
        }
    }
}
