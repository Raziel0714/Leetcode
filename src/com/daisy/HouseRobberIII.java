package com.daisy;

public class HouseRobberIII {
    public static int rob(TreeNode root){
        return dfs(root)[1];
    }

    public static int[] dfs(TreeNode root){
        int[] rob = {0, 0};
        if(root != null){
            int[] robLeft = dfs(root.left);
            int[] robRight = dfs(root.right);
            rob[0] = robLeft[1] + robRight[1];
            rob[1] = Math.max(robLeft[0] + robRight[0] + root.val, rob[0]);
            System.out.println(rob[0] + " : " + rob[1]);
        }
        return rob;
    }

    public static void main(String[] args){
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(3);
        TreeNode t6 = new TreeNode(1);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.right = t6;

        System.out.println(rob(t1));
    }
}
