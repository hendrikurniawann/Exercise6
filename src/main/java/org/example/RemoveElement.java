package org.example;

import java.util.Arrays;

public class RemoveElement {

    // Function to remove all occurrences of a given element from an array
    static int[] removeElement(int[] arr, int elem) {
        // Count the occurrences of the element to determine the new array size
        int count = 0;
        for (int num : arr) {
            if (num != elem) {
                count++;
            }
        }

        // Create a new array with the size excluding the removed elements
        int[] result = new int[count];
        int index = 0;

        // Copy the elements that are not equal to the given element
        for (int num : arr) {
            if (num != elem) {
                result[index++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int elementToRemove = 2;

        // Remove all occurrences of elementToRemove
        int[] result = removeElement(arr, elementToRemove);

        // Print the result
        System.out.println("Array after removing all occurrences of " + elementToRemove + ": " + Arrays.toString(result));
    }
}
