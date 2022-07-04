package excel_READING1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_ex3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
       File myfile = new File("D:\\selenium\\Book1.xlsx");
	   Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
	   
	  //I want to read one column
	 //static coding
	 // for(int i=0;i<=3;i++)
	 // {
	 // String value = mySheet.getRow(i).getCell(2).getStringCellValue();
	 // System.out.println(value);
	 // }
	 //
	      //Dynamic coding
	      int lastRowNum = mysheet.getLastRowNum();
	      int totalRowCount = lastRowNum;
	       System.out.println(totalRowCount);
	       
	  for(int i=0;i<=totalRowCount-1;i++)
	    {
	        String value = mysheet.getRow(i).getCell(2).getStringCellValue();
	        System.out.println(value);
	    }
       
	}

}
