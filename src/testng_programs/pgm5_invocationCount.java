package testng_programs;

import org.testng.annotations.Test;

public class pgm5_invocationCount {
	@Test(invocationCount=10)
	public void testcase1() {
		System.out.println("Run this test case multiple times");
	}
	@Test
	public void testcase2() {
		System.out.println("Run this test case one time please");
	}

}
