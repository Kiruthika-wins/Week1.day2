package week1.day2.HomeAssignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5, 6}; // Example array with a missing number
        Arrays.sort(arr); // Sort the array

        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing number: " + missingNumber);
    }

    // Method to find the missing number in a sorted array
    public static int findMissingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Expected number in the sequence starting from arr[0]
            int expectedNum = arr[0] + i;
            if (arr[i] != expectedNum) {
                // If there's a mismatch, the expected number is missing
                return expectedNum;
            }
        }
        // Return -1 if no missing number is found in the expected range
        return -1;
    }
}
