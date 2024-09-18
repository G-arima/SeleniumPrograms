package testng_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pgm23_Assignment132_getwindowHandles2 {
WebDriver driver;
	@Test
	public void method1() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMIha6IpKHKiAMVXx-DAx0h2hI8EAAYASAAEgLQH_D_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//span[text()='Google']"));
		e1.click();
		//driver.close();This will close the Parent window
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> it=s1.iterator();
		String s2=it.next();//Parent Window id
		String s3=it.next();//Child Window id
		System.out.println(s2);
		System.out.println(s3);
		driver.switchTo().window(s3);
		WebElement w1=driver.findElement(By.name("identifier"));
		Assert.assertEquals(w1.isDisplayed() && w1.isEnabled(), true);
		Thread.sleep(1000);
		driver.close();//This will close the child window
		
	}
}
