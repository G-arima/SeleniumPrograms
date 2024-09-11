package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment113_cssSelector5 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement q1=driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
		q1.sendKeys("Bangalore"+Keys.ENTER);

	}

}
