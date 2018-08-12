package com.daisy;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        List<Integer> list = new ArrayList<>();
        backtrack(res, list, root, sum);
        return res;
    }
    public void backtrack(List<List<Integer>> res, List<Integer> cur, TreeNode root,int sum){
        cur.add(root.val);
        sum -= root.val;
        if(root.left == null && root.right == null){
            if(sum == 0) res.add(new ArrayList<>(cur));}
        if(root.left != null) backtrack(res, cur, root.left, sum);
        if(root.right != null) backtrack(res, cur, root.right, sum);
        cur.remove(cur.size()-1);

    }
}
