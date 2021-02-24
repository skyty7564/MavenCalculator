package com.Calculator.Test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.Calculator.Calculator;

public class TestUnit {
	
	@BeforeClass
	public static void runOnce()
	{
		System.out.println("Test Will Start");
		
	}
	
	@Before
	public  void runMessage1()
	{
		System.out.println("Adding");
		
	}
	@Test
	public void Test()
	{
		Integer x = 1;
		Integer y = 2;
		Integer result = x+y;
		assertEquals(result,Calculator.Sum(x,y));
	
	}
	@Before
	public  void runMessage2()
	{
		System.out.println("Subtract");
		
	}

	@Test
	public void Test1()
	{
		Integer x = 1;
		Integer y = 2;
		Integer result = x-y;
		assertEquals(result, Calculator.Difference(x, y));
	}
	@Before
	public  void runMessage3()
	{
		System.out.println("Mulitplication");
		
	}
	@Test
	public void Test2()
	{
		Integer x = 1;
		Integer y = 2;
		Integer result = x*y;
		assertEquals(result, Calculator.Multiplication(x, y));
		
	}
	@Before
	public  void runMessage4()
	{
		System.out.println("Division");
		
	}

	@Test
	public void Test3()
	{
		Integer x = 1;
		Integer y = 2;
		Integer result = x /y;
		assertEquals(result, Calculator.Division(x, y));
	}
	
	@AfterClass
	public static void runLast()
	{
		System.out.println("Finish");
		
	}
	

}