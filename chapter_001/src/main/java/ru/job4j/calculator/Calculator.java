package ru.job4j.calculate;

/**
 * Calculate
 *
 * @author Mufazalov Ernst
 * @version $Id$
 * @since 0.1
 */
 
 public class Calculator {
	private double result;
	
	public void add(double first, double second) {
		this.result = first + second;
	}
	
	public double getResult() {
		return this.result;
	}
 }