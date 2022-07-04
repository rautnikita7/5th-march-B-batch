package excel_READING1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_readingex4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
       File myfile = new File("D:\\selenium\\Book1.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
        //read total sheet using static coding
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{
				String totalcount = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(totalcount+" ");
			}
			System.out.println();
		}
	}

}
