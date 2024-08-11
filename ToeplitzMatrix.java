package com.anand;

/**
 * Given a mxn matrix, I want to find whether it is Toeplitz Matrix or not.
 */

public class ToeplitzMatrix
{
    public boolean isToeplitzMatrix(int[][] matrix)
    {
        for(int row = 0; row < matrix.length -1; row++)
        {
            for(int col = 0; col < matrix[row].length-1; col++)
            {
                if(matrix[row][col] != matrix[row + 1][col + 1])
                {
                    return false;
                }
            }

        }
        return true;
    }
    private static void Print2DMatrix(int[][] matrix){
        System.out.println("Test Matrix");
        for(int[] row : matrix)
        {
            for (int val : row) 
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();

        int[][] testCase1 = {{1,2,3},{4,5,6},{7,8,9}};
        Print2DMatrix(testCase1);
        System.out.println("Is Testcase1 matrix a Toeplitz : " + toeplitzMatrix.isToeplitzMatrix(testCase1));

        int[][] testCase2 = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        Print2DMatrix(testCase2);
        System.out.println("Is Testcase2 matrix a Toeplitz : " + toeplitzMatrix.isToeplitzMatrix(testCase2));

        int[][] testCase3 = {{1,1,2,3},{2,1,1,2},{3,2,1,1}};
        Print2DMatrix(testCase3);
        System.out.println("Is Testcase3  matrix a Toeplitz : " + toeplitzMatrix.isToeplitzMatrix(testCase3));

    }
}
