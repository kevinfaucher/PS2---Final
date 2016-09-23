package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void evenTestOne(){
		MyInteger a = new MyInteger(4);
		MyInteger b = new MyInteger(8);
		MyInteger c = new MyInteger(9);
		assertTrue(a.isEven());
		assertTrue(b.isEven());
		assertFalse(c.isEven());
	}
	
	@Test
	public void evenTestTwo(){
		MyInteger a = new MyInteger(8);
		MyInteger b = new MyInteger(15);
		MyInteger c = new MyInteger(22);
		assertTrue(MyInteger.isEven(a));
		assertFalse(MyInteger.isEven(b));
		assertTrue(MyInteger.isEven(c));
	}
	@Test
	public void evenTestThree(){
		assertTrue(MyInteger.isEven(10));
		assertTrue(MyInteger.isEven(18));
		assertFalse(MyInteger.isEven(83));
	}
	@Test
	public void evenTestFour(){
		assertFalse(MyInteger.isEven(11));
		assertTrue(MyInteger.isEven(22));
		assertFalse(MyInteger.isEven(51));
	}
	@Test
	public void oddTestOne(){
		MyInteger var1 = new MyInteger(9);
		MyInteger var2 = new MyInteger(3);
		MyInteger var3 = new MyInteger(1);
		assertTrue(var1.isOdd());
		assertTrue(var2.isOdd());
		assertTrue(var3.isOdd());
	}
	
	@Test
	public void oddTestTwo(){
		MyInteger var1 = new MyInteger(21);
		MyInteger var2 = new MyInteger(29);
		MyInteger var3 = new MyInteger(50);
		assertTrue(MyInteger.isOdd(var1));
		assertTrue(MyInteger.isOdd(var2));
		assertFalse(MyInteger.isOdd(var3));
	}
	@Test
	public void oddTestThree(){
		assertTrue(MyInteger.isOdd(59));
		assertFalse(MyInteger.isOdd(80));
		assertTrue(MyInteger.isOdd(37));
	}
	@Test
	public void oddTestFour(){
		assertFalse(MyInteger.isOdd(8));
		assertFalse(MyInteger.isOdd(90));
		assertTrue(MyInteger.isOdd(69));
	}
	@Test
	public void primeTestOne(){
		MyInteger var1 = new MyInteger(11);
		MyInteger var2 = new MyInteger(12);
		MyInteger var3 = new MyInteger(48);
		assertTrue(var1.isPrime());
		assertFalse(var2.isPrime());
		assertFalse(var3.isPrime());
	}

	@Test
	public void primeTestTwo(){
		MyInteger var1 = new MyInteger(0);
		MyInteger var2 = new MyInteger(2);
		MyInteger var3 = new MyInteger(284);
		assertFalse(MyInteger.isPrime(var1));
		assertTrue(MyInteger.isPrime(var2));
		assertFalse(MyInteger.isPrime(var3));
	}

	@Test
	public void primeTestThree(){
		assertTrue(MyInteger.isPrime(2));
		assertFalse(MyInteger.isPrime(4));
		assertTrue(MyInteger.isPrime(257));
	}
	@Test
	public void primeTestFour(){
		assertFalse(MyInteger.isPrime(164));
		assertTrue(MyInteger.isPrime(173));
		assertFalse(MyInteger.isPrime(450));
	}
	

	@Test
	public void equalValTestOne(){
		MyInteger var1 = new MyInteger(125);
		MyInteger var2 = new MyInteger(300);
		MyInteger var3 = new MyInteger(7);
		assertTrue(var1.equals(125));
		assertFalse(var2.equals(35));
		assertTrue(var3.equals(7));
	}
	@Test
	public void equalValTestTwo(){
		MyInteger var1 = new MyInteger(125);
		MyInteger var2 = new MyInteger(300);
		MyInteger var3 = new MyInteger(7);
		assertTrue(var1.equals(125));
		assertFalse(var2.equals(30));
		assertTrue(var3.equals(7));
	}
	@Test
	public void equalValTestwo(){
		MyInteger var1 = new MyInteger(10);
		MyInteger var2 = new MyInteger(20);
		MyInteger var3 = new MyInteger(20);
		assertTrue(var1.equals(var1));
		assertTrue(var2.equals(var2));
		assertFalse(var1.equals(var2));
		assertTrue(var3.equals(var2));
	}
}