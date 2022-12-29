package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows; ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of column; ");
        int column = scanner.nextInt();
        int[][] array = new int[rows][column];
        System.out.println("Enter the array values");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("THe array is;");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}