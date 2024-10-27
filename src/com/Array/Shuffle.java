package com.Array;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        int n = array.length / 2;

        System.out.print(Arrays.toString(ShuffleArray(array, n)));
    }

    static int[] ShuffleArray(int[] arr, int n) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = arr[i];
            ans[2 * i + 1] = arr[n + i];
        }

        return ans;
    }
}





