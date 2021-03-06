package com.daisy;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n){
        if(n <= 0) return new ArrayList<>();
        return greateSubTree(1, n);
    }
    private List<TreeNode> greateSubTree(int start, int end){
        List<TreeNode> res = new ArrayList<>();
        if(end < start){
            res.add(null);
            return res;
        }
        for(int i=start; i<=end; i++){
            for(TreeNode l : greateSubTree(start, i-1)){
                for(TreeNode r : greateSubTree(i+1, end)){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    res.add(root);
                }
            }
        }
        return res;
    }

}
