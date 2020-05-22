package psd.pj.may;

import junit.framework.*;

public class TestRPN extends TestCase {
	
	public void testCase1()
	{
		String expr = "2,2,+";
		RPNCalc rPNCalc = new RPNCalc();
		assertEquals(4, rPNCalc.calculate(expr));
	}
	public void testCase2()
	{
		String expr = "2,3,+";
		RPNCalc rPNCalc = new RPNCalc();
		assertEquals(5, rPNCalc.calculate(expr));
	}
}
