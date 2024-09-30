package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pgm38_HeadlessBrowser3 {
	WebDriver driver;
	
	@Test(dataProvider="inputs")
	public void hb(String input) {
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--headless");
		driver=new EdgeDriver();
		driver.get("https://www.google.co.in/");
		WebElement w1=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		w1.sendKeys(input+Keys.ENTER);
		Reporter.log("Pass");
		}
	@DataProvider(name="inputs")
	public Object[][] data1(){
		return new Object[][] {{"How i can keep my skill set upto date in IT field?"},{"How can i do Multitasking?"},{"How to avoid Overeating"}};
	}

}
