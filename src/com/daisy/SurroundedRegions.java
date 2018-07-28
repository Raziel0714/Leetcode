package com.daisy;

public class SurroundedRegions {
    public static void solve(char[][] board) {
        if(board.length == 0) return;
        int m = board.length; int n = board[0].length;
        for(int i=0; i<n; i++){
            if(board[0][i] == 'O') check(board, 0, i);
            if(board[m-1][i] == 'O') check(board, m-1, i);
        }
        for(int i=1; i<m-1; i++){
            if(board[i][0] == 'O') check(board, i, 0);
            if(board[i][n-1] == 'O') check(board, i, n-1);
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == '1'){
                    board[i][j] = 'O';
                }else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }
    public static void check(char[][] board, int i, int j){
        board[i][j] = '1';
        if(i+1 < board.length && board[i+1][j] == 'O') check(board, i+1, j);
        if(i-1 > 0 && board[i-1][j] == 'O') check(board, i-1, j);
        if(j-1 > 0 && board[i][j-1] == 'O') check(board, i, j-1);
        if(j+1 < board[0].length && board[i][j+1] == 'O') check(board, i, j+1);
    }

    public static void main(String[] args) {
        char[][] board = new char[4][4];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 'X';
            }
        }
        board[1][1] = 'O';
        board[1][2] = 'O';
        board[2][2] = 'O';
        board[3][1] = 'O';
        solve(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
