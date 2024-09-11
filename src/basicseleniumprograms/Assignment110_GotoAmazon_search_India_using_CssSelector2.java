package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment110_GotoAmazon_search_India_using_CssSelector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement e1=driver.findElement(By.cssSelector(".gLFyf"));
		e1.sendKeys("India"+Keys.ENTER);
		

		

	}

}
