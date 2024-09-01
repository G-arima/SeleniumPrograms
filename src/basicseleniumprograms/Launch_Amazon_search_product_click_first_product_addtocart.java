package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Amazon_search_product_click_first_product_addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement we=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		we.sendKeys("iphone 13 pro"+Keys.ENTER);
		WebElement w1=driver.findElement(By.xpath("(//button[@class='a-button-text'])[1]"));
		w1.click();
		

	}

}
