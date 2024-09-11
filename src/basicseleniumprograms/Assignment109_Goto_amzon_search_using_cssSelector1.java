package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment109_Goto_amzon_search_using_cssSelector1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement e1=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		e1.sendKeys("Shoe" + Keys.ENTER);
		

	}

}
