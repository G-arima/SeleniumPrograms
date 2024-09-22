package testng_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Pgm26_FetchthevalueusingExcelsheet {
	
	@Test
	public void method3() throws EncryptedDocumentException, IOException
	{
	FileInputStream c1=new FileInputStream("C:\\Users\\garim\\eclipse-workspace\\MKTSeleniumProject\\DataFetching\\Garimadatasheet.xlsx");
	Workbook w1=WorkbookFactory.create(c1);//Open the workbook
    Sheet s1=	w1.getSheet("Login");	//Get the sheet where the credentials are kept
    Row r1=s1.getRow(1);// Get the Row value
    Cell c=r1.getCell(0);// Get the column value
    String username=c.getStringCellValue();// Fetch the cell using the method
    System.out.println(username);//Print cell
	}
}
