package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment112_cssSelector4 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement w1=driver.findElement(By.cssSelector("input[id='email']"));
		w1.sendKeys("garima.lekhi1994@gmail.com"+Keys.ENTER);
		
	}

}
