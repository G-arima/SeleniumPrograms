package basicseleniumprograms;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment107_Printtextofalllinksofwebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		ListIterator<WebElement> LIt=li.listIterator();
		while(LIt.hasNext()==true)
		{
			WebElement e=LIt.next();
			String url=e.getAttribute("href");
			System.out.println(url);
			String text=e.getText();
			System.out.println(text);
		}
		
		/*int countofLinks=li.size();
		System.out.println(countofLinks);
		for(int i=0;i<countofLinks;i++)
		{
			WebElement e=li.get(i);
		   String url= e.getAttribute("href");
		   String text=e.getText();
		   System.out.println(url);
		   System.out.println(text);
		}*/
		
		

	}

}
