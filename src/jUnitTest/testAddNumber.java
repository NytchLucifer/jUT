package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitTestPackage1.JUnitFunction1;

public class testAddNumber {

	@Test
	public void test() {
		jUnitFunction junit=new jUnitFunction();
		int result = junit.AddNumber1(100,200);
		assertEquals(300,result);
		
	}

}
