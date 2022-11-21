package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitTestPackage1.JUnitFunction1;

public class testAddString {

	@Test
	public void test() {
		jUnitFunction junitstring=new jUnitFunction();
		String  result= junitstring.AddString1("Milind","Gupta");
		assertEquals("MilindGupta",result);
	}


}
