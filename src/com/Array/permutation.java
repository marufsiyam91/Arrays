package com.Array;

import java.util.Arrays;

public class permutation {
    public static void main(String[] args) {
        int[] Array = new int[5];

        Array = new int[]{0, 2, 1, 5, 3, 4};

        System.out.print(Arrays.toString(ArrayPermutatior(Array)));


    }
    static int[] ArrayPermutatior(int[] arr){

        int[] ans = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            ans[i] = arr[arr[i]];
        }

        return ans;
    }
}
