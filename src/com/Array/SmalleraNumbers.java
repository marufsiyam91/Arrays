package com.Array;

public class SmalleraNumbers {
    public static void main(String[] args) {
        int[] array = new int[] {5, 2, 8, 4, 1}; // Initializing the array
        int[] result = SmallerNumbers(array); // Store the result

        // Print the result
        System.out.print("Smaller numbers than current: ");
        for (int count : result) {
            System.out.print(count + " ");
        }
    }

    static int[] SmallerNumbers(int[] array) {
        int[] ans = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int CountSmallerNumbers = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < array[i]) {
                    CountSmallerNumbers += 1;
                }
            }
            ans[i] = CountSmallerNumbers; // Store the count for the current index
        }

        return ans; // Return the array of counts
    }
}
