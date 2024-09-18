package testng_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pgm22_Assignment130_getwindowhandles {
	WebDriver driver;
	@Test
	public void method1() throws InterruptedException
	{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	WebElement email=driver.findElement(By.id("ap_email"));
	email.sendKeys("9872129519");
	WebElement btn=driver.findElement(By.className("a-button-input"));
	btn.click();
	WebElement pwd=driver.findElement(By.id("ap_password"));
	pwd.sendKeys("Capgemini@2024");
	WebElement btn1=driver.findElement(By.id("signInSubmit"));
	btn1.click();
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("Apple Watch"+Keys.ENTER);
	WebElement first_prod=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	first_prod.click();
	Set<String> s1=driver.getWindowHandles();
	System.out.println(s1);
	Iterator<String> it=s1.iterator();
	String s2=it.next();
	String s3=it.next();
	System.out.println(s2);//will print the id of the parent
	System.out.println(s3);//with print the id of the child
	driver.switchTo().window(s3);
	WebElement btn2=driver.findElement(By.id("submit.buy-now"));
	btn2.click();
	Thread.sleep(2000);
	WebElement btn3=driver.findElement(By.xpath("(//span[@class='a-button-inner'])[10]"));
	Assert.assertEquals(btn3.isDisplayed() && btn3.isEnabled(), true);
	//Assert.assertEquals(driver.getTitle(), "Select a delivery address");
	
	
	
	}

}
