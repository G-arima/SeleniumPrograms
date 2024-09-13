package testng_programs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Pgm9_Assignment121 {

	WebDriver driver;
	@Test
	public void launchbrowser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 1 for Chrome");
		System.out.println("Please enter 2 for Edge");
		System.out.println("Please enter 3 for Firefox");
		int a=sc.nextInt();
		if(a==1)
		{
			driver=new ChromeDriver();
		}
		if(a==2)
		{
			driver=new EdgeDriver();
		}
		if(a==3)
		{
			driver=new FirefoxDriver();
		}
		sc.close();
		
		
	}
}
