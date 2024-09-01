package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate_Category_Dropdown_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement w1=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s1=new Select(w1);
		s1.selectByVisibleText("Under ₹500");
		
	}

}