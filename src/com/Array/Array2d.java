package com.Array;


import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        int[] Array = new int[10];
        int[][] Array2d = new int[3][3];

//        for(int i = 0; i < Array.length; i++){
//            Array[i] = input.nextInt();
//        }

        for(int rows = 0; rows < Array2d.length; rows++){
            for(int values = 0; values < Array2d[rows].length; values++){
                Array2d[rows][values] = input.nextInt();
            }
        }

//        System.out.println(Arrays.toString(Array));
        System.out.println(Arrays.toString(Array2d[2]));

    }
}
