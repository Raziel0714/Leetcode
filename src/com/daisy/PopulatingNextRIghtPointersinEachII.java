package com.daisy;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRIghtPointersinEachII {
    public void connect(TreeLinkNode root){
        Queue<TreeLinkNode> queue = new LinkedList<>();
        if(root != null) queue.offer(root);
        while(queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeLinkNode cur = queue.poll();
                TreeLinkNode temp = null;
                if(i<size-1){
                    temp = queue.peek();
                    cur.next = temp;
                }
                cur.next = temp;
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
            }

        }
    }
}
