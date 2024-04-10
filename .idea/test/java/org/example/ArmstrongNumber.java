//11. WAP to input any number and find out if its Armstrong number or not?

package org.example;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        // Sample number (you can replace this with your own number)
        int number = 153;

        if (isArmstrongNumber(number))
        {
            System.out.println(number + " is an Armstrong number.");
        }
        else
        {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Method to check if a number is an Armstrong number
    static boolean isArmstrongNumber(int num)
    {
        int originalNumber = num;
        int sum = 0;
        int numDigits = String.valueOf(num).length();

        do
        {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        } while (num > 0);

        return sum == originalNumber;
    }
}
