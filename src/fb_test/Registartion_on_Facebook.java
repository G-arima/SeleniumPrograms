package fb_test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fb_src.Fb_LoginPage;
import fb_src.Fb_RegisterPage;

public class Registartion_on_Facebook extends LaunchandQuit
{
	

//registration page-
	
	@Test
	public void register_on_fb()
	{
		Fb_LoginPage loginpage=new Fb_LoginPage(driver);
		loginpage.cna();
		Fb_RegisterPage f1=new Fb_RegisterPage(driver);
		//f1.cna();
		f1.fn();
		f1.ln();
		f1.EmailEnter();
		f1.Enterpass();
		f1.dy();
		f1.mn();
		f1.yr();
		f1.gn();
		f1.signup();
	}
	
	
}
