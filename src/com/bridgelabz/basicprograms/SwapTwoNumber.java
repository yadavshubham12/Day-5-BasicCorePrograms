package com.bridgelabz.basicprograms;

public class SwapTwoNumber {
    public static void main(String[] args) {
      int a = 20;
      int b = 30;
        System.out.println("Swap two numbers");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a =" +a);
        System.out.println("b =" +b);
    }
}
