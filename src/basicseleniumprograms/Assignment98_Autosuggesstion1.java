package basicseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment98_Autosuggesstion1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys("Bangalore");
		Thread.sleep(1000);
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	     int sizeOfList=l1.size();
	     System.out.println(sizeOfList);
	     l1.get(sizeOfList-10).click();

	}

}
