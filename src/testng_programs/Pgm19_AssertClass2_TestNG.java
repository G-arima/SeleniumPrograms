package testng_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pgm19_AssertClass2_TestNG {
	WebDriver driver;
	@Test
	public void datamethod1() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shoes" + Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> w1=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		System.out.println(w1.size());
		Assert.assertTrue(w1.size()>1);
		
	}

}
