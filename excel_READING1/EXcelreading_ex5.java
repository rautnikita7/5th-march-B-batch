package excel_READING1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXcelreading_ex5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\selenium\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("sheet1");
        
     	 int totalrowcount = sheet.getLastRowNum();
     	 int totalcellcount = sheet.getRow(totalrowcount).getLastCellNum();
     	 
     	        for(int i=0; i<=totalrowcount; i++)
     	        { 
     		    for(int j=0; j<=totalcellcount; j++)
     		    {
     			 Cell cell = sheet.getRow(i).getCell(j);
     			 CellType type = cell.getCellType();
     			 
     			
				if(type==CellType.STRING)
					
				{
					System.out.println(cell.getStringCellValue()+"");
				}
				else if(type==CellType.BOOLEAN)
				{
				System.out.println(cell.getBooleanCellValue()+"");	
				}
				else if(type==CellType.NUMERIC)
				{
					System.out.println(cell.getNumericCellValue());
				}
				System.out.println();
     		 }
     		 
     	 }
	}

}
