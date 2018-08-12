package com.daisy;

public class RotateImage {
    public static void rotate(int[][] matrix){
        int d = matrix.length;
        int temp;

        for(int i = 0; i<d; i++){
            for(int j = 0; j<d; j++){
                System.out.println(i+" " +j+" a "+ matrix[i][j] +" "+matrix[j][i]);
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                System.out.println("b "+matrix[i][j]+" "+matrix[j][i]);
            }
        }
    }

    public static void main(String[] args){

        int[][] matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        rotate(matrix);
    }
}
