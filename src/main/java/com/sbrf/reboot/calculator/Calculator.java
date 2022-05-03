package com.sbrf.reboot.calculator;

public class Calculator {

    public static double division(double a, double b){
        return a/b;
    }

    public static double addition(double a, double b){
        return a+b;
    }

    public static double subtraction(double a, double b) {
        return a-b;
    }

    public static double multiplication(double a, double b){
        return a*b;
    }

    public static double remainderOfTheDivision(double a, double b){
        return a % b;
    }

    public static double squares(double a){
        return a*a;
    }

    public static double exponentiation(double a, double b){
        double result = a;
        for (int i = 1; i < b; i++) {
            result = result * a;
        }
        return result;
    }
}
