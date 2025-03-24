package tech.badprogrammer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void test_add_001() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void test_add_002() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void test_subtract_001() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(0, calculator.subtract(1, 1));
    }

    @Test
    void test_subtract_002() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(1, calculator.subtract(2, 1));
    }

    @Test
    void test_multiply_001() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(1, calculator.multiply(1, 1));
    }

    @Test
    void test_multiply_002() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(2, calculator.multiply(1, 2));
    }
}
