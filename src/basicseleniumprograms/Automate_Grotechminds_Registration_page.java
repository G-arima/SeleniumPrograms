package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate_Grotechminds_Registration_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://grotechminds.com/registration/");
      WebElement fn=driver.findElement(By.id("fname"));
      fn.sendKeys("Nikita");
      WebElement ln=driver.findElement(By.name("lname"));
      ln.sendKeys("Kaur");
      WebElement em=driver.findElement(By.id("email"));
      em.sendKeys("nikital.kaur@gmail.abc");
      WebElement pwd=driver.findElement(By.id("password"));
      pwd.sendKeys("Admin@2024");
      WebElement sk=driver.findElement(By.xpath("//select[@id='Skills']"));
      Select s1=new Select(sk);
      s1.selectByValue("select1");
      WebElement w3=driver.findElement(By.id("Country"));
      Select s2=new Select(w3);
      s2.selectByVisibleText("India");
      WebElement pa=driver.findElement(By.name("Present-Address"));
      pa.sendKeys("H.No. 407, Sector 22B");
      WebElement add=driver.findElement(By.id("Permanent-Address"));
      add.sendKeys("H.No. 407, Sector 22B");
      WebElement pin=driver.findElement(By.id("Pincode"));
      pin.sendKeys("1334009");
      WebElement re=driver.findElement(By.name("Relegion"));
      Select s3=new Select(re);
      s3.selectByIndex(3);
      WebElement btn=driver.findElement(By.name("Submit"));
      btn.click();
      
      
      
      
      
      
      
	}

}
