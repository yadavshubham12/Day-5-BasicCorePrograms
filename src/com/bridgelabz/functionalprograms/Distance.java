package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.println("Print Distance between x and y");
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x");
        x = scanner.nextDouble();
        System.out.println("Enter the value of y");
        y = scanner.nextDouble();
        double distance = Math.sqrt(Math.pow(x , x) + Math.pow(y , y));
        System.out.println("Distance between x and y = " + distance);
        }

    }
