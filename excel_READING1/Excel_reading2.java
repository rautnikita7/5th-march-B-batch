package excel_READING1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_reading2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\selenium\\ExcelReading EX 1.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
        //reading for whole row
		
		//for(int i=0; i<=2; i++)// statice coading
		//{
		//	String value = mysheet.getRow(0).getCell(i).getStringCellValue();
			
		//	System.out.println(value);
		//}
		
		int lastrownum = mysheet.getLastRowNum();
	    int totalrowcount = lastrownum;
	
	    short lastcellnum = mysheet.getRow(0).getLastCellNum();
	    int totalcellcount = lastcellnum-1;
	
	    System.out.println(totalrowcount);
	    System.out.println(totalcellcount);
	
	     for(int i=0; i<=totalcellcount; i++)//dynamic study
	     {
	    	String value = mysheet.getRow(0).getCell(i).getStringCellValue();
	    	System.out.println(value);
	     }
	
	
	
	
	}

}
