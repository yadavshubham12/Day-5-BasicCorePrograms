package com.bridgelabz.basicprograms;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("No. of time flip coin");
        if (Math.random() < 0.5){
            System.out.println("Print Heads");
        }
        else{
            System.out.println("Print Tails");
        }
    }
}
