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
}
