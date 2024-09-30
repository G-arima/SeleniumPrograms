package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pgm37_HeadlessBrowser2 {
WebDriver driver;
@Test(dataProvider="inputs")
	public void method2(String input) {
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless");
		driver=new FirefoxDriver(options);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement w2=driver.findElement(By.id("APjFqb"));
		w2.sendKeys(input+Keys.ENTER);
		
	}
	@DataProvider(name="inputs")
	public Object[][] testdata() {
		
		return new Object[][]{{"How to become an Automation Test Engineer using Java with Selenium"},{"how to avoid eating more?"},{"How to wake up at 4 am"}};
		
	}
}
