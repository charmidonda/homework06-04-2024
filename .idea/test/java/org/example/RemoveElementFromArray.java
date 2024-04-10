//6. WAP to remove specific element from an array

package org.example;
public class RemoveElementFromArray
{

    public static void main(String[] args)
    {
        // Sample array (you can replace this with your own array)
        int[] array = {10, 20, 30, 40, 50};

        // Element to be removed
        int elementToRemove = 30;

        // Find the index of the element to be removed
        int indexToRemove = -1;
        int i = 0;
        do {
            if (array[i] == elementToRemove)
            {
                indexToRemove = i;
                break;
            }
            i++;
        }
        while (i < array.length);

        // If the element is found, remove it
        if (indexToRemove != -1)
        {
            int newSize = array.length - 1;
            int[] newArray = new int[newSize];
            int j = 0;
            i = 0;
            do
            {
                if (i != indexToRemove)
                {
                    newArray[j] = array[i];
                    j++;
                }
                i++;
            }
            while (i < array.length);

            // Display the updated array
            System.out.println("Array after removing " + elementToRemove + ":");
            for (int value : newArray)
            {
                System.out.print(value + " ");
            }
        }
        else
        {
            System.out.println("Element " + elementToRemove + " not found in the array.");
        }
    }
}