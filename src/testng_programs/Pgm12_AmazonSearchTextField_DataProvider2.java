package testng_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pgm12_AmazonSearchTextField_DataProvider2 {
	WebDriver driver;
	@Test(dataProvider="inputs")
	public void amazonsearch(String input)
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	WebElement a1=driver.findElement(By.id("twotabsearchtextbox"));
	a1.sendKeys(input+Keys.ENTER);
	
	}
	@DataProvider(name="inputs")
	public Object[][] data2() {
		return new Object[][] {{"makeup"},{"duracellbattery"},{"Happy Birthday Decor"},{"Shoes"},{"Face Pack"},{"Hydroboost Watergel"},{"FaceSerum"},{"Watch"},{"Iphone 16 pro max"},{"Pens"}};
	}

}
