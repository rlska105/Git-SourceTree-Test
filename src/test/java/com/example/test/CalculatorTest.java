package com.example.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    public void add() {
        int result = cal.add(2,1);
        assertEquals(3,result);
    }

    @Test
    public void subtract() {
        int result = cal.subtract(2,1);
        assertEquals(1,result);
    }

    @Test
    public void divide() {
        int result = cal.divide(2,1);
        assertEquals(1,result);
    }
}