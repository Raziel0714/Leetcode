package com.daisy;

import java.util.ArrayList;
import java.util.List;

public class SumRoottoLeafNumbers {
    public static int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        int sum = 0;
        List<Integer> res = new ArrayList<>();
        backtrack(res, 0, root);
        for(Integer i : res){
            sum += i;
        }
        return sum;
    }
    public static void backtrack(List<Integer> res, int temp, TreeNode root) {
        if (root == null) return;
        temp = temp * 10 + root.val;
        if (root.left == null && root.right == null) {
            res.add(temp);
        }
        if (root.left != null) backtrack(res, temp, root.left);
        if (root.right != null) backtrack(res, temp, root.right);
        temp /= 10;

    }
    public static void main(String[] args){
        TreeNode a1 = new TreeNode(4);
        TreeNode a2 = new TreeNode(9);
        TreeNode a3 = new TreeNode(0);
        TreeNode a4 = new TreeNode(5);
        TreeNode a5 = new TreeNode(1);
        a1.left = a2; a1.right = a3;
        a2.left = a4; a2.right = a5;

        System.out.println(sumNumbers(a1));
    }
}
