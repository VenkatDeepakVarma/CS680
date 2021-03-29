package edu.umb.cs680.hw02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class CalculatorTest {

	 
	    
	    @Test
	    public void multiplyMinus5AndMinus2() {
	        Calculator calculator = new Calculator();
	        float expected = 10;
	        float actual = calculator.multiply(-5, -2);
	        assertEquals(actual, expected);
	    }
	    
	    @Test
	    public void multiplyMinus5AndPositive2() {
	        Calculator calculator = new Calculator();
	        float expected = -10;
	        float actual = calculator.multiply(-5, 2);
	        assertEquals(actual, expected);
	    }


	    @Test
	    public void divide5by0ExceptionThrown()  {
	        Calculator calculator = new Calculator();
	        try {
	            calculator.divide(5,0);
	            fail("Division by zero");
	        } catch (IllegalArgumentException ex) {
	            assertEquals("Division by zero",ex.getMessage());
	          }
	    }
}