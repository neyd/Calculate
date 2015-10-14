package com.neyd.Calculate.Taelor.Cos;

/**
 * Created by Женя on 14.10.2015.
 */
public class Cos {
    public static double cos(double x) {
        double cost;
        double stx;
        double e = 0.0001;
        int z = -1;
        int i = 1;
        int factorial = 2;

        stx = x*x;
        cost = 1;

        while (stx / factorial >= e) {
            cost = cost + z * stx / factorial;
            i += 2;
            stx = stx * x * x;
            factorial = factorial * (i - 1) * i;
            z = z * (-1);
        }
        return cost;
    }
}
