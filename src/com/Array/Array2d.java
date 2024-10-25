package com.Array;


import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] Array = new int[10];

        for(int i = 0; i < Array.length; i++){
            Array[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(Array));

    }
}
