package testng_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pgm24_Assignment133_getwindowHandles3 {
	WebDriver driver;
	@Test
	public void method2() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement w1=driver.findElement(By.xpath("//input[@id='search']"));
		//Thread.sleep(2000);
		w1.sendKeys("grotechminds"+Keys.ENTER);
		/*WebElement w2=driver.findElement(By.xpath("//a[@class='yt-spec-button-shape-next yt-spec-button-shape-next--filled yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m']"));
		w2.click();*/
		
		
	}

}
