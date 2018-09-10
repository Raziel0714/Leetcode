package com.daisy;

public class RangeSumQuery2D {
    private int[][] matrix1;
    public RangeSumQuery2D(int[][] matrix) {
        if(matrix==null || matrix.length==0||matrix[0].length==0)
            return;
        int m = matrix.length;
        int n = matrix[0].length;
        matrix1 = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix1[i][j] = matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = 0;
        for(int i = row1; i<=row2; i++){
            for(int j= col1; j<=col2; j++){
                res += matrix1[i][j];
            }
        }
        return res;
    }
}
