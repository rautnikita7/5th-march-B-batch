package kiteUitility_Listeners_study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility 
{
	public static String readDataFormExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		
	    File MyFile=new File("D:\\selenium\\Book2 xlsheet.xlsx");
	    Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
	    String myValue = 
	    mySheet.getRow(row).getCell(cell).getStringCellValue();
	    return myValue;
	
	}
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String random=RandomString.make(3);
	  File dest= new File("D:\\SCREENSHOT prctice\\SS2"+random+".png");
	  FileHandler.copy(src, dest);
	  
	}

}
