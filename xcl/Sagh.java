package xcl;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sagh {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File xyz = new File("D:\\selenium\\ExcelReading EX 1.xlsx");
        Workbook book = WorkbookFactory.create(xyz);
        Sheet sheet = book.getSheet("sheet1");
       Row row = sheet.getRow(0);
       Cell cell = row.getCell(0);
       CellType type = cell.getCellType();
       System.out.println(type);
       
	}

}
