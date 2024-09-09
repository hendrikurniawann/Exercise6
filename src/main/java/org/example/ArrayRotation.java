package org.example;

import java.util.Arrays;

public class ArrayRotation {

    // Function to rotate the array to the left by d positions
    static void rotateArray(int[] arr, int d) {
        int n = arr.length;

        // Edge case where d >= n
        d = d % n;

        // Create a temporary array to store the first d elements
        int[] temp = new int[d];

        // Copy the first d elements to temp
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements of arr[] to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy the d elements from temp[] to the end of arr[]
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        System.out.println("Original array: " + Arrays.toString(arr));

        // Rotate the array
        rotateArray(arr, d);

        // Print the rotated array
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}

