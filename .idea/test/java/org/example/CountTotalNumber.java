
package org.example;
import java.util.Scanner;

public class CountTotalNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to lowercase for case-insensitive comparison
        inputString = inputString.toLowerCase();

        // Initialize a counter for 'a'
        int countA = 0;

        // Iterate through each character in the string
        int i = 0;
        while (i < inputString.length())
        {
            char currentChar = inputString.charAt(i);
            if (currentChar == 'a')
            {
                countA++;
            }
            i++;
        }

        // Display the result
        System.out.println("Total occurrences of 'a': " + countA);

        scanner.close();
    }
}
