package fb_src;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_HomePage {
WebDriver driver;
	//step1
	
	@FindBy(xpath="//input[@type='search']")
	WebElement searchfriend;
	
    /*@FindBy(xpath="//div[@class='x78zum5 xdt5ytf x1iyjqo2 x1n2onr6']/div/ul/li")
	List<WebElement> clickonfriendprofile;*/
	
	@FindBy(xpath="//a[text()='Garima Lekhi Mahindru']")
	WebElement clickonfriendprofile;
	
	//step2
	
	public void sf()
	{
		searchfriend.sendKeys("Garima"+Keys.ENTER);
	}
	
	/*public void click1()
	{
		int sizeoflist=clickonfriendprofile.size();
		clickonfriendprofile.get(sizeoflist-7).click();
	}*/
	
	public void click1()
	{
		clickonfriendprofile.click();	
	}
	
	//step3
	
	public Fb_HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
}
