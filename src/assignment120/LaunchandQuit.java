package assignment120;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandQuit {
	WebDriver driver;
	@BeforeMethod
	public void prerequisite() {
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
		
	}
	@AfterMethod
	public void postrequisite() throws InterruptedException, IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\garim\\OneDrive\\Documents\\AB44_Screenshots\\Amazon"+new LaunchandQuit().getClass()+".png");
		FileHandler.copy(source, destination);
	    WebElement w1=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions action=new Actions(driver);
		action.moveToElement(w1).perform();
		Thread.sleep(2000);
		WebElement w2=driver.findElement(By.xpath("//span[text()='Sign Out']"));
		w2.click();
		driver.quit();
		
	}

}
