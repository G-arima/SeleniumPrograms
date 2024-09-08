package basicseleniumprograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment108_Verifybrokenlinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		ListIterator<WebElement> LIt=li.listIterator();
		while(LIt.hasNext()==true)
		{
			WebElement e=LIt.next();
			String url=e.getAttribute("href");
			System.out.println(url);
			verify_broken_link(url);
			
		}
	}
	static void verify_broken_link(String url) throws IOException
	{
		try {
		URL u1=new URL(url);
		HttpURLConnection u2=(HttpURLConnection) u1.openConnection();
		if(u2.getResponseCode()==200)
		{
			System.out.println("Link is valid" +" "+ u2.getResponseMessage() +" "+ u2.getResponseCode());
		}
		else {
			System.out.println("Invalid Link" +" "+ u2.getResponseMessage() +" "+ u2.getResponseCode());
		}
		}
		catch(MalformedURLException m1) {
			System.out.println("Handled the Exception");
		}
	}

}
