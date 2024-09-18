package testng_programs;

import org.testng.Assert;
import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pgm17_AssertClass_TestNG 
{
	WebDriver driver;
	@Test
	public void method1()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shoes" + Keys.ENTER);
		Assert.assertTrue(false);
	}

}
