package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Firstcry_and_click_on_Partial_linktext_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.partialLinkText("GIRL"));
		e1.click();

	}

}
