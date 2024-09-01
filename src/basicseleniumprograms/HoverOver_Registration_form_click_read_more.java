package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Registration_form_click_read_more {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/automate-me/");
	driver.manage().window().maximize();
	WebElement w1=driver.findElement(By.xpath("(//h3[@class='elementor-flip-box__layer__title'])[1]"));
	Actions a=new Actions(driver);
	a.moveToElement(w1).perform();
	WebElement w2=driver.findElement(By.xpath("(//a[@class='elementor-flip-box__button elementor-button elementor-size-sm'])[1]"));
	w2.click();
}
}
