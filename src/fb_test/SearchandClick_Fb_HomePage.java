package fb_test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fb_src.Fb_HomePage;
import fb_src.Fb_LoginPage;

public class SearchandClick_Fb_HomePage extends LaunchandQuit{
	
	@Test
	public void search_friend_click() throws InterruptedException
	{
		Fb_LoginPage loginpage=new Fb_LoginPage(driver);
		loginpage.un();
		loginpage.pwd();
		loginpage.login();
		Thread.sleep(5000);
		Fb_HomePage homescreen=new Fb_HomePage(driver);
		homescreen.sf();
		homescreen.click1();
	}

}
