package testng_programs;

import org.testng.annotations.Test;

public class pgm7_invocationCount_priority_together {
	@Test(invocationCount=10,priority=-1)
	public void testcase1() {
		System.out.println("1");
	}
	@Test(priority=3)
	public void testcase2() {
		System.out.println("2");
	}
	@Test
	public void testcase3() {
		System.out.println("3");
	}
	@Test(priority=2)
	public void testcase4() {
		System.out.println("4");
	}
	@Test(priority=1)
	public void testcase5() {
		System.out.println("5");
	}
}
