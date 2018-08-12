package com.daisy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrder {
    public List<List<Integer>> LevelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, 0, root);
        return res;
    }

    public static void dfs(List<List<Integer>> res, int index, TreeNode root){
        if(root == null) return;
        if(res.size() <= index){
            res.add(new ArrayList<Integer>());
        }
        res.get(index).add(root.val);
        dfs(res, index+1, root.left);
        dfs(res, index+1, root.right);
    }
}
