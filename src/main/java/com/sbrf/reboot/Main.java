package com.sbrf.reboot;

import com.sbrf.reboot.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.addition(11, 3));
        System.out.println(Calculator.subtraction(11, 3));
        System.out.println(Calculator.multiplication(11, 3));
        System.out.println(Calculator.division(9, 3));
        System.out.println(Calculator.remainderOfTheDivision(10, 3));
        System.out.println(Calculator.squares(9));
        System.out.println(Calculator.exponentiation(3, 3));
    }
}
