package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Flight_Application_click_Read_More {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.xpath("(//div[@class='elementor-flip-box__layer__overlay'])[4]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(we).perform();
		WebElement w1=driver.findElement(By.xpath("(//a[@class='elementor-flip-box__button elementor-button elementor-size-sm'])[2]"));
		w1.click();
		

	}

}
