package fb_test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fb_src.Fb_LoginPage;

public class Login_to_Facebook extends LaunchandQuit
{

	@Test
	public void login_with_correct_cred()
	{
	/*WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();*/
	Fb_LoginPage loginpage=new Fb_LoginPage(driver);
	loginpage.un();
	loginpage.pwd();
	loginpage.login();
	
		
	}
	
	
}
