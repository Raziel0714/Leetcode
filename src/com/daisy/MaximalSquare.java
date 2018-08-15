package com.daisy;

public class MaximalSquare {
    public static int maximalSquare(char[][] matrix){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println(n+ " "+ m);

        int[][] d = new int[n][m];
        int max = 0;
        System.out.println();
        System.out.println(d[0][0] +" "+ d[0][1]);
        System.out.println(d[1][0] +" "+ d[1][1]);


        for(int i=0; i<n; i++){
            if(matrix[i][m-1] == '1'){
                d[i][m-1] = 1;
                max = 1;
            }
        }

        for(int j=0; j<m; j++){
            if(matrix[n-1][j] == '1'){
                d[n-1][j] = 1;
                max = 1;
            }
        }

        System.out.println();
        System.out.println(d[0][0] +" "+ d[0][1]);
        System.out.println(d[1][0] +" "+ d[1][1]);

        for(int i=n-2; i>=0; i--){
            for(int j=m-2; j>=0; j--){
                if(matrix[i][j] == '1'){
                    d[i][j] = Math.min(Math.min(d[i+1][j], d[i][j+1]),d[i+1][j+1]) + 1;
                }
                else{
                    d[i][j] = 0;
                }
                max = Math.max(max, d[i][j]);
            }
        }
        return max*max;
    }

    public static void main(String[] args){
        char[] c1 = {'1' , '1'};
        char[] c2 = {'1' , '1'};
        char[][] c = {c1, c2};

        System.out.println(maximalSquare(c));
    }

}
