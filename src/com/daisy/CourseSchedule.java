package com.daisy;

import java.util.*;

public class CourseSchedule {
    // actually , this is detect whether a circle is exist or not.
    // because all prerequisites is pairs, we can use topological method.
    public boolean canFinish(int numCourses, int[][] prerequisites){
        int[] map = new int[numCourses];

        for(int i=0; i<prerequisites.length; i++){
            map[ prerequisites[i][1]] ++;
        }
        Queue<Integer> que = new LinkedList<Integer>();

        for(int i=0; i<map.length; i++){
            if(map[i] == 0) que.add(i);
        }

        int count = que.size();
        while(!que.isEmpty()){
            int k = que.remove();
            for(int i=0; i<prerequisites.length; i++){
                if( k == prerequisites[i][0]){
                    int l = prerequisites[i][1];
                    map[l]--;
                    if(map[l]==0){
                        que.add(l);
                        ++count;
                    }
                }
            }
        }
        return count == numCourses;
    }


}
