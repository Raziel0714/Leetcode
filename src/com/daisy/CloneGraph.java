package com.daisy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
        if(node == null) return null;
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        queue.offer(node);
        UndirectedGraphNode root = new UndirectedGraphNode(node.label);
        map.put(node, root);

        while(!queue.isEmpty()){
            UndirectedGraphNode cur = queue.poll();
            for(UndirectedGraphNode temp : cur.neighbors){
                if(!map.containsKey(cur)){
                    map.put(temp, new UndirectedGraphNode(temp.label));
                    queue.offer(temp);
                }
                map.get(cur).neighbors.add(map.get(temp));
            }
        }
        return root;
    }
}
