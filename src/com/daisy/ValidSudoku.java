package com.daisy;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board){

        int[] count, countV, countC;

        for(int i=0; i< 9; i++){
            count = new int[9]; countV = new int[9];
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    count[Character.getNumericValue(board[i][j])-1]++;
                }
                if(board[j][i] != '.'){
                    countV[Character.getNumericValue(board[j][i])-1]++;
                }

            }
            for(int k = 0; k < 9; k++){
                if(count[k] > 1 || countV[k] > 1){
                    return false;
                }
            }
        }

      /*  for(int i=0; i< 9; i++){
            countV = new int[9];
            for(int j = 0; j < 9; j++){
                if(board[j][i] != '.'){
                    countV[Character.getNumericValue(board[j][i])-1]++;
                }
            }
            for(int k = 0; k < 9; k++){
                if(countV[k]>1){
                    return false;
                }
            }
        }*/




        for(int r=0; r<=6; r+=3){
            for(int c = 0; c <=6; c+=3){

                countC = new int[9];

                for(int i = 0; i<3; i++){
                    for(int j=0; j< 3; j++){
                        if(board[i+r][j+c] != '.'){
                            countC[Character.getNumericValue(board[i+r][j+c])-1]++;
                        }
                    }
                }
                for(int k = 0; k < 9; k++){
                    if(countC[k] > 1){
                        return false;
                    }
                }

            }
        }

        return true;
    }

    public static void main(String[] args){
        char[][] sudoku =new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'},
        };
        System.out.println(isValidSudoku(sudoku));
    }
}
