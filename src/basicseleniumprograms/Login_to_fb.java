package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_to_fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement un=driver.findElement(By.xpath("(//input)[3]"));
		un.sendKeys("garima.lekhi@gmail.com");
		WebElement pwd=driver.findElement(By.xpath("(//input)[4]"));
		pwd.sendKeys("Mp***&&&&@1134");
		WebElement btn=driver.findElement(By.xpath("//button"));
		btn.click();
		//driver.close();
	}

}
