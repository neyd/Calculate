package com.neyd.Calculate;

/**
 * Created by Женя on 06.10.2015.
 */
public class CalculateTaelor {
    public static void main(String[] args) {
        double x = 2;
        double result = 1;
        long factorial = 1;
        double nominator = 1;

        for (int i = 1; i < 20; i++) {
            factorial = factorial * i;
            nominator = nominator * x;
            result = result + nominator / factorial;
        }
        System.out.println(result);
        System.out.println(result - Math.E * Math.E);
    }
}
