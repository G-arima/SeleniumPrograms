package testng_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Pgm28_Fetch_un_pwd_from_excel {
	
	@Test
	public void fetchData() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\garim\\eclipse-workspace\\MKTSeleniumProject\\DataFetching\\Garimadatasheet.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String un=w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		String pwd=w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(un);
		System.out.println(pwd);
	}

}
