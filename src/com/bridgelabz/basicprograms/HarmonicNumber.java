package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double n = 0;
        double i = 1;
        n = scanner.nextDouble();
            for( i=1;i<=n;i++)
            {
                sum=sum + (1/i);
            }
            System.out.println("Harmonic value = "+ sum);
        }
    }
