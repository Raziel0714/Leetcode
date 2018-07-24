package com.daisy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static List<Integer> InorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        helper(list, root);
        return list;
    }
    public static void helper(List<Integer> list, TreeNode root){
        if(root == null) return;
        if(root.left != null){
            list.add(root.left.val);
            helper(list, root.left);
        }
        list.add(root.val);
        if(root.left != null){
            list.add(root.left.val);
            helper(list, root.left);
        }
    }


    public static void main(String[] args){
    }
}
