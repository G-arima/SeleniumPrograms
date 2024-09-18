package testng_programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pgm13_DataProvider3 {
@Test(dataProvider="data")
public void method1(int data)
{
System.out.println(data);	
}
@DataProvider(name="data")
public Object[][] data1(){
	return new Object[][] {{14},{32},{80},{88},{94},{77}};
	
}
}
