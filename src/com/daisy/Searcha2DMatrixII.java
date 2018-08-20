package com.daisy;

public class Searcha2DMatrixII {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;

        if(target<matrix[0][0] || target>matrix[m-1][n-1]) return false;

        for(int i=0; i<m; i++){
            if(target>=matrix[i][0] && target<=matrix[i][n-1]){
                for(int j=0; j<n; j++){
                    if(target == matrix[i][j]) return true;
                }
            }
        }

        for(int i=0; i<n; i++){
            if(target>=matrix[0][i] && target<=matrix[m-1][i]){
                for(int j=0; j<m; j++){
                    if(target == matrix[j][i]) return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args){
        int[][] matrix = new int[0][0];
        System.out.println(searchMatrix(matrix,0));
    }
}
