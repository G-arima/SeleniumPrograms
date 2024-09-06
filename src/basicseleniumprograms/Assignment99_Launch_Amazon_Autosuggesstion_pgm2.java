package basicseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment99_Launch_Amazon_Autosuggesstion_pgm2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.name("field-keywords"));
		w1.sendKeys("shoe");
		Thread.sleep(1000);
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		l1.get(3).click();

	}

}
