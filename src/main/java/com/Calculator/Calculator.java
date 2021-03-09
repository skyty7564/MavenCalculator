package com.Calculator;

public class Calculator {
	
	
	public static Integer Sum (Integer x, Integer y)
	{
		if(x == null || y ==null)
		{
		
			return null;
		}
		
		return x+y;
		
	}
	
	public static Integer Difference (Integer x, Integer y)
	{
		if(x == null || y ==null)
		{
			
			return null;
		}
		
		return x-y;
		
	}
	public static Integer Multiplication (Integer x, Integer y)
	{
		if(x == null || y ==null)
		{
			
			return null;
		}
		
		return x*y;
		
	}
	public static Integer Division (Integer x, Integer y)
	{
		if(x == null || y ==null)
		{
		
			return null;
		}
		
		return x/y;
		
	}
}
