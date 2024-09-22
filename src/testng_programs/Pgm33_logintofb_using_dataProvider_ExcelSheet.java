package testng_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pgm33_logintofb_using_dataProvider_ExcelSheet {
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
		Assert.assertEquals(driver.getTitle(), "(20+) Facebook","Sorry");
		
	}
    @DataProvider(name="data1")
    public Object[][] dataMethod2() throws EncryptedDocumentException, IOException
    {
    	FileInputStream f1=new FileInputStream("C:\\Users\\garim\\eclipse-workspace\\MKTSeleniumProject\\DataFetching\\Garimadatasheet.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String un1=w1.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
		String pw1=w1.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
		String un2=w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		String pw2=w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
    	Object[][] d1=new Object[2][2];
    	d1[0][0]=un1;
    	d1[0][1]=pw1;
    	d1[1][0]=un2;
    	d1[1][1]=pw2;
		return d1;
    }
	


}
