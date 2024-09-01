package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Amazon_search_for_shoe_and_check_if_search_textfield_isEnabled_isDisplayed {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		if(e1.isEnabled()&&e1.isDisplayed())
		{
			e1.sendKeys("Shoes"+Keys.ENTER);
		}

	}

}
