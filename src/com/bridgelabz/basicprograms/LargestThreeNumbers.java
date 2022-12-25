package com.bridgelabz.basicprograms;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        int a = 40;
        int b = 80;
        int c = 30;
        if ( a>=b && a>=c ){
            System.out.println("largest number is a " +a);
        }else if (b>=a && b>=c){
            System.out.println("Largest number is b " +b);
        }
        else {
            System.out.println("Largest number is c " +c);
        }
    }
}
