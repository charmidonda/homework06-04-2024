//4. Printing multiplication table using do while loop
//1 2 3
//2 4 6
//3 6 9

package org.example;
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        int row = 3; // Number of rows
        int col = 3; // Number of columns

        int[][] table = new int[row][col];

        // Fill the multiplication table
        for (int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= col; j++)
            {
                table[i - 1][j - 1] = i * j;
            }
        }

        // Print the multiplication table
        int i = 0;
        do
        {
            int j = 0;
            do
            {
                System.out.print(table[i][j] + " ");
                j++;
            } while (j < col);

            System.out.println();
            i++;
        }
        while (i < row);
    }
}

