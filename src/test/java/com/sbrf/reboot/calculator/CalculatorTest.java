package com.sbrf.reboot.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void divisionSuccess() {
        Assertions.assertEquals(5, Calculator.division(25, 5));
    }

    @Test
    void additionSuccess() {
        Assertions.assertEquals(15, Calculator.addition(10, 5));
    }

    @Test
    void subtractionSuccess() {
        Assertions.assertEquals(5, Calculator.subtraction(10, 5));
    }

    @Test
    void multiplicationSuccess() {
        Assertions.assertEquals(10, Calculator.multiplication(10, 10));
    }

    @Test
    void remainderOfTheDivisionSuccess() {
        Assertions.assertEquals(2, Calculator.remainderOfTheDivision(27, 5));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4})
    void squaresSuccess(int a) {
        int square = (int) Calculator.squares(a);
        switch (a){
            case 2:
                Assertions.assertEquals(4, square);
                break;
            case 3:
                Assertions.assertEquals(9, square);
                break;
            case 4:
                Assertions.assertEquals(16, square);
                break;
        }
    }

    @Test
    void exponentiationSuccess() {
        Assertions.assertEquals(4, Calculator.exponentiation(2, 2));
        Assertions.assertEquals(144, Calculator.exponentiation(12, 2));
    }
}