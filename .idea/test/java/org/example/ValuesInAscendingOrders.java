//3. WAP to enter any String and count total number of 'a' in that String.

package org.example;
import java.util.Scanner;
import java.util.Arrays;

public class ValuesInAscendingOrders
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the array elements
        double[] array = new double[size];
        int i = 0;
        while (i < size)
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
            i++;
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        // Display the sorted array
        System.out.println("Sorted array in ascending order:");
        for (double value : array)
        {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}
