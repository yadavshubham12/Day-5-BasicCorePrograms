package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year is leap or not");
        Scanner scanner = new Scanner(System.in);
        int year;
            year = scanner.nextInt();
        if ((( year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Year is leap year");
        } else {
            System.out.println("year is not a leap year");
        }
    }
}
