package org.example;

import java.util.HashSet;

public class Duplicate{

    // Function to check if the array contains duplicates
    static boolean containsDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Traverse the array
        for (int num : nums) {
            // If the element is already in the set, return true for duplicate
            if (!set.add(num)) {
                return true;
            }
        }

        // No duplicates found
        return false;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Example 1 Output: " + containsDuplicates(nums1));  // Output: true

        // Example 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Example 2 Output: " + containsDuplicates(nums2));  // Output: false

        // Example 3
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Example 3 Output: " + containsDuplicates(nums3));  // Output: true
    }
}
