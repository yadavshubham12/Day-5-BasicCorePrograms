package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class QuadraticEquation {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter value of a: ");
                double a = sc.nextDouble();
                System.out.print("Enter value of b: ");
                double b = sc.nextDouble();
                System.out.print("Enter value of c: ");
                double c = sc.nextDouble();

                double delta = b*b - 4*a*c;
                double root1 = (-b + Math.sqrt(delta)) / (2*a);
                double root2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            }
        }
