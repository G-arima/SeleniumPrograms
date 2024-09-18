package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class pgm15_Grotechmind_AutomateMe_DataPro5 {
	WebDriver driver;
	
	
	@Test(dataProvider="data")
	public void AutomateMe(String firstname, String lastname, String emailid, String password,String PresentAddress,String PermanentAddress,String PinCode1)
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement fn=driver.findElement(By.xpath("//input[@id='fname']"));
		fn.sendKeys(firstname);
		WebElement ln=driver.findElement(By.id("lname"));
		ln.sendKeys(lastname);
		WebElement em=driver.findElement(By.name("email"));
		em.sendKeys(emailid);
		WebElement pw=driver.findElement(By.id("password"));
		pw.sendKeys(password);
		WebElement pa=driver.findElement(By.name("Present-Address"));
		pa.sendKeys(PresentAddress);
		WebElement pad=driver.findElement(By.id("Permanent-Address"));
		pad.sendKeys(PermanentAddress);
		WebElement pc=driver.findElement(By.name("Pincode"));
		pc.sendKeys(PinCode1);
		
		
		
	}
	
	@DataProvider(name="data")
	public Object[][] method1()
	{

		Object[][] o1=new Object[5][7];
		//1stRow
		try {
		o1[0][0]="Garima";
		o1[0][1]="Mahindru";
		o1[0][2]="garima.mahindru@abc.com";
		o1[0][3]="Admin@123";
		o1[0][4]="407,Sector 22 B";
		o1[0][5]="132, Plahi Road, SBS Nagar";
		o1[0][6]="144401";
		}
		catch(Exception ArrayIndexOutOfBoundsException) {
			System.out.println("Handled");
		}
		//2nd Row
		try {
		o1[1][0]="Shubhu";
		o1[1][1]="Mahindru";
		o1[1][2]="shubhu.mahindru@abc.com";
		o1[1][3]="Admin@123";
		o1[1][4]="407,Sector 22 B";
		o1[1][5]="132, Plahi Road, SBS Nagar";
		o1[1][6]="144401";
		}
		catch(Exception ArrayIndexOutOfBoundsException) {
			System.out.println("Handled");
		}
		//3rd Row
		try {
		o1[2][0]="Sarita";
		o1[2][1]="Mahindru";
		o1[2][2]="sarita.mahindru@abc.com";
		o1[2][3]="Admin@123";
		o1[2][4]="132, Plahi Road, SBS Nagar";
		o1[2][5]="132, Plahi Road, SBS Nagar";
		o1[2][6]="144401";
		}
		catch(Exception ArrayIndexOutOfBoundsException) {
			System.out.println("Handled");
		}
		//4rth Row
		try {
		o1[3][0]="Shakti";
		o1[3][1]="Mahindru";
		o1[3][2]="shakti.mahindru@abc.com";
		o1[3][3]="Admin@123";
		o1[3][4]="132, Plahi Road, SBS Nagar";
		o1[3][5]="132, Plahi Road, SBS Nagar";
		o1[3][6]="144401";
		}
		catch(Exception ArrayIndexOutOfBoundsException) {
			System.out.println("Handled");
		}
		//5th Row
		try {
		o1[4][0]="Shadi Lal";
		o1[4][1]="Mahindru";
		o1[4][2]="shadilal.mahindru@abc.com";
		o1[4][3]="Admin@123";
		o1[4][4]="132, Plahi Road, SBS Nagar";
		o1[4][5]="132, Plahi Road, SBS Nagar";
		o1[4][6]="144401";
		}
		catch(Exception ArrayIndexOutOfBoundsException) {
			System.out.println("Handled");
		}
		return o1;
		}
			
	}
	
	


