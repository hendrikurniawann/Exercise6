package org.example;

public class ReverseString {

    // Function to reverse a string without using built-in methods
    static String reverseString(String str) {
        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Initialize two pointers: one at the start and one at the end
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters until the pointers meet in the middle
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }

        // Convert the char array back to a string and return it
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "Halo Malang";

        // Reverse the string
        String reversedStr = reverseString(str);

        // Print the reversed string
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}

