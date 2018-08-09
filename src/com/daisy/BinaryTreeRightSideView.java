package com.daisy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();

            if(root == null) return res;
            queue.offer(root);
            while(!queue.isEmpty()){
                int size = queue.size();
                for(int i=0; i<size; i++){
                    TreeNode cur = queue.remove();
                    if(i == size-1) res.add(cur.val);
                    if(cur.left != null) queue.add(cur.left);
                    if(cur.right != null) queue.add(cur.right);
                }
            }
            return res;
        }
    }
