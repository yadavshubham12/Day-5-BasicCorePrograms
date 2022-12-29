package com.bridgelabz.functionalprograms;

public class SumOfThree {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, -4, -5, 15, -4};

        for (int i = 0; i < arr.length; i++) {
            int firstNumber = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int secondNumber = arr[j];
                for (int k = j + 1; k < arr.length; k++) {
                    int thirdNumber = arr[k];
                    int sum = firstNumber + secondNumber + thirdNumber;
                    if (sum == 0) {
                        System.out.print(firstNumber + "," + secondNumber + "," + thirdNumber);
                    }
                }
                System.out.println();
            }
        }
    }
}