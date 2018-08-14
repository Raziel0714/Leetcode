package com.daisy;

import java.util.LinkedList;
import java.util.Queue;


public class CountCompleteTreeNodes {

    //for all kinds of tree;
    public int countNodes1(TreeNode root){
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int res = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            res += size;
            for(int i=0; i<size; i++){
                TreeNode cur = queue.poll();
                if(cur.right != null) queue.offer(cur.right);
                if(cur.left != null) queue.offer(cur.left);
            }
        }
        return res;
    }

    //for complete tree
    public int countNodes2(TreeNode root){
        if(root == null) return 0;
        int leftmost = 0;
        TreeNode left = root;
        while(left != null){
            leftmost ++;
            left = left.left;
        }

        int rightmost = 0;
        TreeNode right = root;
        while(right != null){
            rightmost++;
            right = right.right;
        }

        if(leftmost == rightmost) return (int)Math.pow(2, leftmost) -1;
        return 1 + countNodes2(root.left) + countNodes2(root.right);
    }

}
