package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Pgm44_Assignment155_FileUpload1 {
	WebDriver driver;
	@Test
	public void registration() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement firstname=driver.findElement(By.id("fname"));
		firstname.sendKeys("Gaurika");
		WebElement lastname=driver.findElement(By.id("lname"));
		lastname.sendKeys("Mahindru");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("garima.mahindru@yahoo.abc");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("hfg###111!!");
		WebElement radio=driver.findElement(By.id("Female"));
		radio.click();
		WebElement drop=driver.findElement(By.id("Skills"));
		Select s1=new Select(drop);
		s1.selectByValue("select1");
		WebElement Country1=driver.findElement(By.id("Country"));
		Select s2=new Select(Country1);
		s2.selectByValue("India");
		WebElement present_address=driver.findElement(By.id("Present-Address"));
		present_address.sendKeys("132,SBS Nagar");
		WebElement permanaent_add=driver.findElement(By.id("Permanent-Address"));
		permanaent_add.sendKeys("132,SBS Nagar");
		WebElement Pin1=driver.findElement(By.id("Pincode"));
		Pin1.sendKeys("144401");
		WebElement relegion1=driver.findElement(By.id("Relegion"));
		Select s3=new Select(relegion1);
		s3.selectByIndex(1);
		WebElement fileUpload1=driver.findElement(By.id("file"));
		fileUpload1.sendKeys("C:\\Users\\garim\\Downloads\\Garima.pdf");
		WebElement checkbox1=driver.findElement(By.id("relocate"));
		checkbox1.click();
	WebElement btn2=	driver.findElement(By.name("Submit"));
	btn2.click();
	String a=driver.switchTo().alert().getText();
	System.out.println(a);
	driver.switchTo().alert().accept();
	}

}
