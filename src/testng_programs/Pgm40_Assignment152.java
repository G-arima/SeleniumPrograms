package testng_programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pgm40_Assignment152 {
WebDriver driver;
	@Test(dataProvider="inputs")
	public void login_to_fb(String username,String password) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e1=driver.findElement(By.id("email"));
		e1.sendKeys(username);
		WebElement e2=driver.findElement(By.id("pass"));
		e2.sendKeys(password);
		WebElement e3=driver.findElement(By.xpath("//button[@type='submit']"));
		e3.click();
		Assert.assertEquals(driver.getTitle(), "Log in");
		Reporter.log("The test case is failed");
		
		
	}
	@DataProvider(name="inputs")
	public Object[][] testdata() throws EncryptedDocumentException, IOException{
		FileInputStream f1=new FileInputStream("C:\\Users\\garim\\eclipse-workspace\\MKTSeleniumProject\\DataFetching\\fbtestdata.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String user=w1.getSheet("FbData").getRow(0).getCell(0).getStringCellValue();
		String pass=w1.getSheet("FbData").getRow(0).getCell(1).getStringCellValue();
		Object[][] d1=new Object[1][2];
		d1[0][0]=user;
		d1[0][1]=pass;
		return d1;
		
	}
}
