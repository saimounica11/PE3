package com.stackroute.PE3;

public class MatrixAddition {
    public int[][] checkSum(int rows, int colums, int M1[][], int M2[][]) {
        int sum[][] = new int[rows][colums];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                sum[i][j] = M1[i][j] + M2[i][j];
            }
        }
        return sum;
    }
}
