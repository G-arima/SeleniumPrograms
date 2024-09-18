package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pgm21_LogoutfromAmazonusingassert4_testNg {
	WebDriver driver;
	@Test
	public void method1() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("9872129519");
		WebElement cnt_button=driver.findElement(By.className("a-button-input"));
		cnt_button.click();
		WebElement pwd=driver.findElement(By.id("ap_password"));
																																					pwd.sendKeys("Capgemini@2024");
		WebElement sign_in=driver.findElement(By.id("signInSubmit"));
		sign_in.click();
		WebElement e1=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement sign_out=driver.findElement(By.xpath("//span[text()='Sign Out']"));
		sign_out.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Amazon Sign", "Exception and actual are not equals");
		
	}

}
