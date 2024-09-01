package basicseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WAP_to_automate_grotechminds_webpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://grotechminds.com/registeration-form/");
       driver.manage().window().maximize();
      WebElement fn= driver.findElement(By.name("firstName"));
      fn.sendKeys("Raju");
      WebElement ln=driver.findElement(By.name("lastName"));
      ln.sendKeys("Krishnan");
      WebElement em=driver.findElement(By.id("email"));
      em.sendKeys("raju.krishna@gmail.abc");
      WebElement ph=driver.findElement(By.id("phone"));
      ph.sendKeys("9873120990");
      WebElement ge=driver.findElement(By.id("gender"));
      Select s1=new Select(ge);
      s1.selectByValue("female");
      WebElement st=driver.findElement(By.name("state"));
      Select s2=new Select(st);
      s2.selectByVisibleText("Punjab");
      WebElement aa=driver.findElement(By.name("aadhaar"));
      aa.sendKeys("2145500000010988");
      WebElement pn=driver.findElement(By.id("pan"));
      pn.sendKeys("ALAPO1944U");
      WebElement te=driver.findElement(By.id("terms"));
      if(te.isSelected())
      {
    	  System.out.println("Terms and Conditions is selected");
      }else {
    	  System.out.println("Please go and select the t&c if, same is not selected");
    	  te.click();
      }
      WebElement btn=driver.findElement(By.name("Submit"));
      btn.click();
      
      
       
	}

}
