package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Number is even " + num);
        }else {
            System.out.println("Number is odd " + num);
        }
    }
}
