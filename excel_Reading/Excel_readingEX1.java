package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_readingEX1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
          File MyFile = new File ("D:\\selenium\\excelreadingex2.xlsx");
		
		String Name1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(Name1);
		
		String Name2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(Name2);
		 
		String Name3 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(Name3);
		
		String Name4 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		System.out.println(Name4);
		
		 boolean Name5 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(4).getCell(1).getBooleanCellValue();
		System.out.println(Name5);
		 
		 boolean Name6 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(4).getCell(2).getBooleanCellValue();
		System.out.println(Name6);
		
		 double Name7 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(5).getCell(1).getNumericCellValue();
		System.out.println(Name7);
		
		 double Name8 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(5).getCell(2).getNumericCellValue();
		System.out.println(Name8);
	}

	

}
