package de.metro.demo.decorator;

/**
 * Created by LaurentiuM on 2019-08-07.
 */
public class Taxes {
    public static double generalTax(double salary) {
        return salary * 0.8;
    }

    public static double regionalTax(double salary) {
        return salary * 0.95;
    }

    public static double healthInsurance(double salary) {
        return salary - 200.0;
    }
}
