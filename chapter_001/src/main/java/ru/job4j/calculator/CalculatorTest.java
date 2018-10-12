package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	@Test
	public void whenAddShouldSummateIt() {
		final Calculator calc = new Calculator();
		calc.add(1, 1);
		final double result = calc.result();
		assertThat(result, is(2d));
	}
	
}