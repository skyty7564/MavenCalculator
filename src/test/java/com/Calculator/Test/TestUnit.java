package com.Calculator.Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Calculator.Calculator;

public class TestUnit {

	@BeforeSuite
	public static void runOnce() {
		System.out.println("Test Will Start");

	}

	@BeforeMethod
	public void runMessage1() {
		System.out.println("Adding method");

	}

	@Test
	public void Test() {
		Integer x = 1;
		Integer y = 2;
		Integer result = x + y;
		Assert.assertEquals(result, Calculator.Sum(x, y));

	}

	@BeforeClass
	public static void runOnceClass() {
		System.out.println("Before method running");

	}

	@Test
	public void TestFalse() {
		Integer x = 1;
		Integer y = null;

		Assert.assertNull(Calculator.Sum(x, y));
		Assert.assertEquals(null, Calculator.Sum(x, y));

	}

	@Parameters({ "nullvalue1", "nullvalue" })
	@Test
	public void Testnull(@Optional()Integer x, @Optional() Integer y) {

		Integer result = null;

		Assert.assertNull(Calculator.Sum(x, y));
		Assert.assertEquals(result, Calculator.Sum(x, y));

	}

	@BeforeMethod
	public void runMessage2() {
		System.out.println("Subtract Method");

	}

	@Parameters({ "value1", "value2" })
	@Test
	public void Test1(int x, int y) {
		Integer result = x - y;
		Assert.assertEquals(result, Calculator.Difference(x, y));
	}

	@BeforeMethod
	public void runMessage3() {
		System.out.println("Mulitplication Method");

	}

	@Test
	public void Test2() {
		Integer x = 1;
		Integer y = 2;
		Integer result = x * y;
		Assert.assertEquals(result, Calculator.Multiplication(x, y));

	}

	@BeforeMethod
	public void runMessage4() {
		System.out.println("Division Method");

	}

	@Test
	public void Test3() {
		Integer x = 1;
		Integer y = 1;
		Integer result = x / y;
		Assert.assertEquals(result, Calculator.Division(x, y));
	}

	@AfterSuite
	public static void runLast() {
		System.out.println("Finish");

	}

}