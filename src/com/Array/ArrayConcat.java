package com.Array;


import java.util.Arrays;

public class ArrayConcat {
    public static void main(String[] args) {
        int[] array = new int[4];

        array = new int[]{2, 1, 2, 3};

        System.out.print(Arrays.toString(ConcatArray(array)));
    }

    static int[] ConcatArray(int[] arr){

        int[] ans = new int[arr.length * 2];

        for(int i = 0; i < arr.length; i++){
            ans[i] = arr[i];
        }

        for(int i = arr.length; i < arr.length * 2; i++){
            ans[i] = arr[i - arr.length];
        }
        return ans;
    }
}
