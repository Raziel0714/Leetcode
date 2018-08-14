package com.daisy;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0 || matrix == null) return res;
        int x = matrix.length; int y = matrix[0].length;
        int u = 0, d = x - 1, l = 0, r = y - 1;
        while(true){
            //up
            for (int col = l; col <= r; col++) res.add(matrix[u][col]);
            if (++u > d) break;
            // right
            for(int row = u; row <= d; row++) res.add(matrix[row][r]);
            if(--r < l) break;
            //down
            for(int col = r; col >= l; col--) res.add(matrix[d][col]);
            if(--d < u) break;
            //left
            for(int row = d; row >= u; row--) res.add(matrix[row][l]);
            if(++l > r) break;

        }
        return res;

    }

    public static void main(String[] args){
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
        List<Integer> a = new ArrayList<>();

    }
}
