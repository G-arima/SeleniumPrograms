package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment115_CN_TN_CssSelector7 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement q1=driver.findElement(By.cssSelector("textarea.gLFyf"));
		q1.sendKeys("Grotechminds"+Keys.ENTER);

	}

}
