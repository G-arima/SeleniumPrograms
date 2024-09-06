package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment101 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.xpath("//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
		w1.click();
		WebElement e1=driver.findElement(By.id("searchProduct"));
		e1.sendKeys("pcm");
		Thread.sleep(3000);
		WebElement w2=driver.findElement(By.xpath("(//button[.='Add'])[4]"));
		w2.click();
		

	}

}
