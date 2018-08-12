package com.daisy;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new LinkedList<>();
        traversal(res, root);
        return res;
    }

    public static void traversal(List<Integer> res, TreeNode root){
        if(root == null) return;
        res.add(root.val);
        if(root.left != null) traversal(res, root.left);
        if(root.right != null) traversal(res, root.right);
    }
}
