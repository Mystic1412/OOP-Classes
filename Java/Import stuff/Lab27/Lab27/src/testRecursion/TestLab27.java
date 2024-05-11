package testRecursion;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import recursion.Lab27;


public class TestLab27 extends TestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSumDigits() {
		assertEquals(Lab27.sumDigits(234), 9);
	}

	@Test
	public void testReverseString() {
		assertEquals(Lab27.reverseString("hello"), "olleh");
	}

	@Test
	public void testSumIntegers() {
		assertEquals(Lab27.sumIntegers(5), 15);
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
	
	

	private static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(TestLab27.class);
		return suite;
	}

}
