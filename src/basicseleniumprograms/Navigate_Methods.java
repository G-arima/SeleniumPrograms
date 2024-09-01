package basicseleniumprograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Navigate back
		driver.navigate().back();
		Thread.sleep(2000);
		//Navigate forward
		driver.navigate().forward();
		Thread.sleep(2000);
		//Refresh
		driver.navigate().refresh();
		Thread.sleep(2000);
		//Navigate to
		driver.navigate().to("https://grotechminds.com/registeration-form/");
		
		
		

	}

}
