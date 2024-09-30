package fb_src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Fb_RegisterPage {
	WebDriver driver;
	//step 1
	//Registration Page Assignment
	/*@FindBy(xpath="//a[text()='Create new account']") 
	WebElement createnewaccount;*/
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement Firstname;
	
	@FindBy(name="lastname")
	WebElement Surname;
	
	@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")
	WebElement email;
	
	@FindBy(id="password_step_input")
	WebElement newpassword;
	
	@FindBy(id="day")
	WebElement Day;
	
	@FindBy(id="month")
	WebElement Month;
	
	@FindBy(name="birthday_year")
	WebElement Year;
	
	@FindBy(xpath="(//input[@id='sex'])[1]")
	WebElement Gender;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	WebElement SignUp;
	
	//step2
	
	public void fn()
	{
		Firstname.sendKeys("Gauri");
	}
	public void ln()
	{
		Surname.sendKeys("Mahindru");
	}
	public void EmailEnter() {
		email.sendKeys("gauri.mahindru@gmail.com");
	}
	public void Enterpass()
	{
		newpassword.sendKeys("Admin@123");
	}
	public void dy()
	{
		Select s1=new Select(Day);
		s1.selectByValue("5");
	}
	public void mn()
	{
		Select s2=new Select(Month);
		s2.selectByVisibleText("May");
	}
	public void yr()
	{
		Select s3=new Select(Year);
		s3.selectByValue("1994");
	}
	
	public void gn()
	{
		Gender.click();
	}
	public void signup()
	{
		SignUp.click();
	}
	//step 3
		public Fb_RegisterPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
}
