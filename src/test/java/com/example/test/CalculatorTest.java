package com.example.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator cal = new Calculator();
        int result = cal.add(2,1);
        assertEquals(3,result);

    }
}