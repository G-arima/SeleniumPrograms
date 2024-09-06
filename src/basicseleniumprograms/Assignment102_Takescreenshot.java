package basicseleniumprograms;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment102_Takescreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.name("field-keywords"));
		w1.sendKeys("shoe");
		Thread.sleep(1000);
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		l1.get(3).click();
		TakesScreenshot t1= driver;
		File Source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\garim\\OneDrive\\Documents\\AB44_Screenshots\\ram.png");
		FileHandler.copy(Source, destination);

	}

}
