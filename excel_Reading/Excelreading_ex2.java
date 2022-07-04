package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelreading_ex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\selenium\\excel3.xlsx");
		
        for(int i=0; i<=16; i++)
        {
          String colum1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
          System.out.println(colum1);
        
        }
		
}}
