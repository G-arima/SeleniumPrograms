package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WAP_to_Automate_any_banking_app_where_right_click_is_disabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		WebElement a1=driver.findElement(By.linkText("NetBanking"));
		a1.click();
	}

}
