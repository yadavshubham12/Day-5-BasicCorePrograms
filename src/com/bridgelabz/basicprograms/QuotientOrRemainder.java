package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class QuotientOrRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Dividend = scanner.nextInt();
        int Divisor = scanner.nextInt();

        int Quotient = Dividend / Divisor;
        int Remainder = Dividend % Divisor;

        System.out.println("The Quotient is " + Quotient);
        System.out.println("The Remainder is " + Remainder);
    }
}
