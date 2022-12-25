package com.bridgelabz.basicprograms;

public class PowerOfTwo {
    public static void main(String[] args) {
            int n = 31;
            int i = 0;
            int powerofTwo = 1;
            while (i <= n) {
                System.out.println(i + " " + powerofTwo);
                powerofTwo = 2 * powerofTwo;
                i = i + 1;
            }
        }
    }
