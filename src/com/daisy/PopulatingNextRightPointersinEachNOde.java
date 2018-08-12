package com.daisy;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNOde {
    public void connect(TreeLinkNode root){
        Queue<TreeLinkNode> queue = new LinkedList<>();
        if(root != null){
            queue.add(root);
        }
        int count =1, gate =2;
        while(!queue.isEmpty()){
            TreeLinkNode tmp = queue.poll();
            if(++count == gate){
                gate *= 2;
                tmp.next = null;
            }else{
                tmp.next = queue.peek();
            }
            if(tmp.left != null) queue.add(tmp.left);
            if(tmp.right != null) queue.add(tmp.right);
        }
    }

}
