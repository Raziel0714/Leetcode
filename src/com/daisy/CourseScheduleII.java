package com.daisy;

import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] map = new int[numCourses];
        int[] res = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            map[prerequisites[i][1]]++;
        }

        int index = numCourses - 1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < map.length; i++) {
            if (map[i] == 0) {
                if (map[i] == 0) {
                    queue.add(i);
                    res[index--] = i;
                }
            }}

            while (!queue.isEmpty()) {
                int k = queue.remove();
                for (int i = 0; i < prerequisites.length; i++) {
                    int l = prerequisites[i][1];
                    if (k == prerequisites[i][0]) {
                        map[l]--;
                        if (map[l] == 0) {
                            queue.add(l);
                            res[index--] = l;
                        }
                    }
                }
            }
            return index != -1 ? new int[0] : res;
        }
    }
