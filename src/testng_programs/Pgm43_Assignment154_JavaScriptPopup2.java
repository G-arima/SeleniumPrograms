package testng_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Pgm43_Assignment154_JavaScriptPopup2 {
	WebDriver driver;
	
	@Test
	public void method1() {
		driver=new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement w1=driver.findElement(By.xpath("(//h3[@class='elementor-flip-box__layer__title'])[5]"));
	    Actions a1=new Actions(driver);
		a1.moveToElement(w1).perform();
		WebElement w2=driver.findElement(By.xpath("(//a[@class='elementor-flip-box__button elementor-button elementor-size-sm'])[3]"));
		w2.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement w3=driver.findElement(By.xpath("(//button[text()='Alert1'])[1]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='Alert1'])[1]"))).click();
		//w3.click();
		String a=driver.switchTo().alert().getText();
		System.out.println(a);
		driver.switchTo().alert().accept();
		
		
		
	}

}
