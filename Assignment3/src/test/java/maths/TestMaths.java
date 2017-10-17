package maths;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMaths {

	Maths obj;
	double t;
	double z;
	
	@Before
	public void setUp() throws Exception {
		obj = new Maths();
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		t = 0.0;
		z = 0.0;
	}

	@Test
	public void testSubtracting() {
		long testAns = 40 - 20;
		assertEquals(testAns, obj.subtracting(40, 20));
	}
	
	@Test
	public void testAdding() {
		long testAns = 20 + 10;
		assertEquals(testAns, obj.adding(20, 10));
	}
	

}
