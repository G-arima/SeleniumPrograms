package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_google_type_india_choose_fifth_option {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		w1.sendKeys("India");
		w1.sendKeys(Keys.ARROW_DOWN);
		w1.sendKeys(Keys.ARROW_DOWN);
		w1.sendKeys(Keys.ARROW_DOWN);
		w1.sendKeys(Keys.ARROW_DOWN);
		w1.sendKeys(Keys.ARROW_DOWN);
		w1.sendKeys(Keys.ENTER);
		

	}

}
