package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch_google_double_click_gmail {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions a1=new Actions(driver);
		a1.doubleClick(we).perform();
		
		
	}

}
