package com.daisy;

public class NumberofIslands {

    public static int numIslands(char[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    res++;
                    searchRange(grid, i, j);
                }
            }
        }
        return res;
    }


    public static void searchRange(char[][] grid, int i, int j){
        int m = grid.length;
        int n = grid[0].length;

        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] != '1') return;

        grid[i][j] = '2';

        searchRange(grid, i+1, j);
        searchRange(grid, i-1, j);
        searchRange(grid, i, j+1);
        searchRange(grid, i, j-1);

    }

    public static void main(String[] args){
        char[] a = {'1', '1', '1','1','0'};
        char[] b = {'1', '1', '0','1','0'};
        char[] c = {'1', '1', '0','0','0'};
        char[] d = {'0', '0', '0','0','0'};

        char[][] grid = {a, b, c, d};

        System.out.println(numIslands(grid));
    }

}
