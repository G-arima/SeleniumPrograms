package assignment120;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase2 extends LaunchandQuit{
	
	@Test
	public void searchandclick() {
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("scented candles" +Keys.ENTER);
		WebElement e2=driver.findElement(By.partialLinkText("Iris Home"));
		e2.click();
	}

}