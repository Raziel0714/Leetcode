package com.daisy;

public class KthSmallestElement {
    public static int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length; int n = matrix[0].length;
        int left = matrix[0][0];
        int right = matrix[m-1][n-1];

        while(left < right){
            int mid = left + (right - left)/2;
            int count = count(matrix, mid);
            if(count < k){
                left = mid+1;
            }else{
                right = mid;
            }

            System.out.println(mid + " : "+ count + " : " + left + " : " + right);
        }
        return right;
    }

    private static int count(int[][] matrix, int target){
        int m = matrix.length;
        int i = m-1, j = 0, con = 0;
        while(i >= 0 && j<m){
            if(matrix[i][j] <= target){
                con += i+1;
                j++;
            }else{
                i--;
            }
        }
        return con;
    }

    public static void main(String[] args){
        int[][] matrix = {{0,5,9},{10,11,13},{12,13,16}};
        kthSmallest(matrix, 8);
    }
}
