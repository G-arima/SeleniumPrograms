package testng_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pgm32_Fetch_numericun_from_excelsheet {
	WebDriver driver;
	@Test
	public void login_to_amazon() throws EncryptedDocumentException, IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		FileInputStream f1=new FileInputStream("C:\\Users\\garim\\eclipse-workspace\\MKTSeleniumProject\\DataFetching\\Garimadatasheet.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String un=NumberToTextConverter.toText(w1.getSheet("Login").getRow(1).getCell(0).getNumericCellValue());
		String pw=w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys(un);
		WebElement cnt_button=driver.findElement(By.className("a-button-input"));
		cnt_button.click();
		WebElement pwd=driver.findElement(By.id("ap_password"));
		pwd.sendKeys(pw);
		WebElement sign_in=driver.findElement(By.id("signInSubmit"));
		sign_in.click();
		
	}


}
