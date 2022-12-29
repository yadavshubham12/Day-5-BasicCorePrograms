package com.bridgelabz.functionalprograms;

public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        if (Math.abs(t) > 50 || v < 3 || v > 120) {
            System.out.println("Invalid input: t must be within (-50, 50) and v must be within (3, 120)");
            return;
        }
        double w = (35.74 + 0.6215) * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("WindChill = " + w);
    }
}
