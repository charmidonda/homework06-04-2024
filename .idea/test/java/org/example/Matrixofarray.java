
//8. WAP to transpose matrix of 2-D array

package org.example;
public class Matrixofarray
{
    public static void main(String[] args)
    {
        // Sample 2D matrix (you can replace this with your own matrix)
        int[][] matrix =
        {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Get the dimensions of the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpose the matrix
        int[][] transposedMatrix = new int[cols][rows];
        int i = 0;
        do
        {
            int j = 0;
            do
            {
                transposedMatrix[j][i] = matrix[i][j];
                j++;
            }
            while (j < cols);
            i++;
        }
        while (i < rows);

        // Print the transposed matrix
        System.out.println("Transposed matrix:");
        for (int[] row : transposedMatrix)
        {
            for (int value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}