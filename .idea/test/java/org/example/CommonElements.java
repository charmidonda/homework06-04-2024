//5. Write a Java program to find the common elements between two arrays (string values).

package org.example;
public class CommonElements
{
    public static void main(String[] args)
    {
        // Sample arrays (you can replace these with your own arrays)
        String[] array1 = {"apple", "banana", "orange", "grape"};
        String[] array2 = {"banana", "grape", "kiwi", "pear"};

        // Find common elements
        int i = 0;
        do
        {
            int j = 0;
            do
            {
                if (array1[i].equals(array2[j]))
                {
                    System.out.println("Common element: " + array1[i]);
                    break; // Found a common element, no need to continue inner loop
                }
                j++;
            }
            while (j < array2.length);
            i++;
        }
        while (i < array1.length);
    }
}
