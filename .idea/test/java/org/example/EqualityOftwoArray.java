//1. Write a Java program to test the equality of two arrays.


package org.example;

import java.util.Arrays;

public class EqualityOftwoArray
{
    public static void main(String[] args)
    {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean areEqual = Arrays.equals(array1, array2);

        if (areEqual)
        {
            System.out.println("The arrays are equal.");
        }
        else
        {
            System.out.println("The arrays are not equal.");
        }
    }
}






