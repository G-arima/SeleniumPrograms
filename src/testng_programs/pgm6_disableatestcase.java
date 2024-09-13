package testng_programs;

import org.testng.annotations.Test;

public class pgm6_disableatestcase {
	@Test(invocationCount=11)
	public void testcase1()
	{
		System.out.println("1");
	}
	@Test(enabled=false)
	public void testcase2()
	{
		System.out.println("2");
	}

}
