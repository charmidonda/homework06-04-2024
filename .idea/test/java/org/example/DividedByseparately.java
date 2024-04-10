//10.WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

package org.example;

public class DividedByseparately
{
    public static void main(String[] args)
    {
        // Initialize an array to store divisible numbers
        int[] divisibleBy3 = new int[100];
        int[] divisibleBy5 = new int[100];
        int index3 = 0;
        int index5 = 0;

        // Find numbers divisible by 3 and 5
        int num = 1;
        do
        {
            if (num % 3 == 0)
            {
                divisibleBy3[index3] = num;
                index3++;
            }
            if (num % 5 == 0)
            {
                divisibleBy5[index5] = num;
                index5++;
            }
            num++;
        }
        while (num <= 100);

        // Print divisible numbers
        System.out.println("Numbers divisible by 3:");
        for (int i = 0; i < index3; i++)
        {
            System.out.print(divisibleBy3[i] + " ");
        }
        System.out.println("\nNumbers divisible by 5:");
        for (int i = 0; i < index5; i++)
        {
            System.out.print(divisibleBy5[i] + " ");
        }
    }
}
