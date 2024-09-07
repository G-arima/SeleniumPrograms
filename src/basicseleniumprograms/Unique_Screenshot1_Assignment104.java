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

public class Unique_Screenshot1_Assignment104 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("book");
		Thread.sleep(3000);
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
		int sizeofList=l1.size();
		System.out.println(sizeofList);
        l1.get(4).click();
        //Upcast driver to TakesScreenshot Interface
        TakesScreenshot t1=driver;
        File source=t1.getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Users\\garim\\OneDrive\\Documents\\AB44_Screenshots\\ram"+Math.random()+".png");
        FileHandler.copy(source, destination);
        
	}

}
