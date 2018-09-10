package com.daisy;

public class GameofLife {
    public static void gameOfLife(int[][] board){
        int m = board.length;
        int n = board[0].length;
        for(int r = 0; r<m; r++){
            for(int c = 0; c < n; c++){
                int count = countNeighbors(board, r, c);
                if(count == 3 || (count == 2 && board[r][c] == 1)){
                    board[r][c] += 10;
                }
            }
        }

        for(int r=0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                board[r][c] /= 10;
            }
        }
    }


    public static int countNeighbors(int[][] board, int r, int c){
        int count = 0;
        int m = board.length;
        int n = board[0].length;
        for(int row = Math.max(r - 1, 0); row <= Math.min(r+1,m - 1); row++){
            for(int col = Math.max(c - 1, 0); col <= Math.min(c + 1, n - 1); col++){
                if(row!= r || col != c){
                    count += board[row][col] % 10;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[][] nums = {{0,1,0} , {0,0,1}, {1,1,1}, {0,0,0}};
        gameOfLife(nums);

        for(int[] n : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
