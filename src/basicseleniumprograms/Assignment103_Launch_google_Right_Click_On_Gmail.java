package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment103_Launch_google_Right_Click_On_Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement w3=driver.findElement(By.linkText("Gmail"));
		Actions a1=new Actions(driver);
		a1.contextClick(w3).perform();
		
		
		

	}

}
