package com.ujuezeoke;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void canAdd() {
        double result = Calculator
                .start()
                .number(5)
                .operation(Operation.ADD)
                .number(15)
                .result();

        assertEquals(20, result, 0);
    }

    //This test passes
    //but will it will fail the mutation check as this is a very bad test
    @Test
    public void canSubtract() {
        double result = Calculator
                .start()
                .number(0)
                .operation(Operation.MINUS)
                .number(0)
                .result();

        assertEquals(0, result, 0);
    }
}