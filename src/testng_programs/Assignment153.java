package testng_programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment153 {
	WebDriver driver;
	@Test(dataProvider="inputs")
	public void method3(String Username, String Password) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement w1=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).perform();
		WebElement w2=driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		w2.click();
		WebElement Us=driver.findElement(By.id("ap_email"));
		Us.sendKeys(Username);
		WebElement cnt=driver.findElement(By.id("continue"));
		cnt.click();
		WebElement ps=driver.findElement(By.id("ap_password"));
		ps.sendKeys(Password);
		WebDriverWait wd=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wd.until(ExpectedConditions.titleContains("Amazon"));
		wd.until(ExpectedConditions.titleIs("Amazon Sign In"));
		WebElement sgn=driver.findElement(By.id("signInSubmit"));
		sgn.click();
		
		
	}

	@DataProvider(name="inputs")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		FileInputStream fs=new FileInputStream("C:\\Users\\garim\\eclipse-workspace\\MKTSeleniumProject\\DataFetching\\Amazontestdata.xlsx");
		Workbook w1=WorkbookFactory.create(fs);
		String user=NumberToTextConverter.toText(w1.getSheet("TestData_Amazon").getRow(1).getCell(1).getNumericCellValue());
		String pass=w1.getSheet("TestData_Amazon").getRow(1).getCell(2).getStringCellValue();
		Object[][] d1=new Object[1][2];
		d1[0][0]=user;
		d1[0][1]=pass;
		return d1;
	}
}
