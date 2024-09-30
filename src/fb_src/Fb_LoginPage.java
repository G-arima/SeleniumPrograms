package fb_src;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Fb_LoginPage 
{
	WebDriver driver;
	//step 1
	
	
	
	@FindBy(id="email") 
	WebElement Username;
	
	@FindBy(name="pass") 
	WebElement Password;
	
	@FindBy(xpath="//button[@name='login']") 
	WebElement login_button;
	
	@FindBy(xpath="(//a[@role='button'])[2]") 
	WebElement createnewaccount;
	
	//step 2
	
	public void un()
	{
		Username.sendKeys("garima.lekhi1994@outlook.com");
	}
	
	public void pwd()
	{
		Password.sendKeys("TestAdmin@123");
	}
	public void login()
	{
		login_button.click();
	}
	
	public void cna()
	{
		createnewaccount.click();
	}
	
	//step 3
	public Fb_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
