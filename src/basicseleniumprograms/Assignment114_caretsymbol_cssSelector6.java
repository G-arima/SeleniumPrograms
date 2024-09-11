package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment114_caretsymbol_cssSelector6 {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement e1=driver.findElement(By.cssSelector("input[id^='twotab']"));
	e1.sendKeys("saree"+Keys.ENTER);
	
	

	}

}
