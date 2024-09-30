package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pgm35_TimeOut_testNg_concept1 {
	WebDriver driver;
	@Test(timeOut=3000)
	public void logintoAmazon()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("9872129519");
		WebElement cnt_button=driver.findElement(By.className("a-button-input"));
		cnt_button.click();
		WebElement pwd=driver.findElement(By.id("ap_password"));
																																					pwd.sendKeys("Seltos@123");
		WebElement sign_in=driver.findElement(By.id("signInSubmit"));
		sign_in.click();
	}

}
