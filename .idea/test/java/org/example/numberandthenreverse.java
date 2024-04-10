//9.WAP to input the 5 digit number and then reverse it

package org.example;
public class numberandthenreverse
{
    public static void main(String[] args)
    {
        // Sample 5-digit number (you can replace this with your own number)
        int number = 12345;

        // Validate if the number is 5 digits
        if (number >= 10000 && number <= 99999)
        {
            int[] digits = new int[5];
            int index = 0;

            // Extract individual digits and store them in an array
            do
            {
                digits[index] = number % 10;
                number /= 10;
                index++;
            }
            while (number > 0);

            // Reverse the digits
            int reversedNumber = 0;
            for (int i = 0; i < digits.length; i++)
            {
                reversedNumber = reversedNumber * 100 + digits[i];
            }

            System.out.println("Reversed number: " + reversedNumber);
        }
        else
        {
            System.out.println("Please enter a valid 5-digit number.");
        }
    }
}
