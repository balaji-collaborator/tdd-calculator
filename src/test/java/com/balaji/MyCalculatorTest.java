package com.balaji;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by balaji on 1/1/18.
 */
public class MyCalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new MyCalculator();
    }

    @Test
    public void addTwoPositiveNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void addTwoMorePositiveNumbers() {
        assertEquals(67, calculator.add(22, 45));
    }

    @Test
    public void addPositiveAndNegativeNumbers() {
        assertEquals(-55, calculator.add(-100, 45));
    }

    @Test
    public void addWithZeroFristNumber() {
        assertEquals(400, calculator.add(0, 400));
    }

    @Test
    public void addWithZeroSecondNumber() {
        assertEquals(2, calculator.add(2, 0));
    }

    @Test
    public void addTwoBigPositiveNumbers() {
        assertEquals(Long.valueOf("4294947294").longValue(), calculator.add(2147473647, 2147473647));
    }

    @Test
    public void addTwoBigNegativeNumbers() {
        assertEquals(Long.valueOf("-4294947296").longValue(), calculator.add(-2147473648, -2147473648));
    }

}
