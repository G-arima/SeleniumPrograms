package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_flipkart_click_on_Mobiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//span[text()='Mobiles']"));
		//Thread.sleep(5000);
		e1.click();
		
		

	}

}
