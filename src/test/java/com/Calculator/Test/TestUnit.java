package com.Calculator.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.Calculator.Calculator;

public class TestUnit {
	
	@Test
	public void Test()
	{
		Integer x = 1;
		Integer y = 2;
		Integer result = x+y;
		assertEquals(result,Calculator.sum(x,y));
	
	}

	@Test
	public void Test1()
	{
		Integer x = 1;
		Integer y = 2;
		Integer result = x+y;
		assertEquals(result, Calculator.sum(x,y));
	}

	@Test
	public void Test2()
	{
		Integer x = 1;
		Integer y = 2;
		Integer result = x+y;
		assertEquals(result, Calculator.sum(x,y));
	}

	@Test
	public void Test3()
	{
		Integer x = 1;
		Integer y = 2;
		Integer result = x+y;
		assertEquals(result, Calculator.sum(x,y));
	}

}
