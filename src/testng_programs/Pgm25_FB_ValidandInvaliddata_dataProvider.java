package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pgm25_FB_ValidandInvaliddata_dataProvider {
    WebDriver driver;
    @Test(dataProvider="data1")
	public void method1(String un,String pw)
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys(un);
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys(pw);
		WebElement Login=driver.findElement(By.name("login"));
		Login.click();
		
	}
    @DataProvider(name="data1")
    public Object[][] dataMethod2()
    {
    	Object[][] d1=new Object[2][2];
    	d1[0][0]="garima.lekhi1994@gmail.com";
    	d1[0][1]="Bholenath@2024";
    	d1[1][0]="shubham.mahindru9415@gmail.com";
    	d1[1][1]="Admin@123";
		return d1;
    }
	
}
