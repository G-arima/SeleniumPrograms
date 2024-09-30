package testng_programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Pgm27_Skiptestcase1 
{
	@Test
	public void login()
	{
		Assert.assertEquals(0, 10);
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		
	}
	}
