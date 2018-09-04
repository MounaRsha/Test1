package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil
{
 public static String getCellValue(String filePath, String sheet, int r, int c) 
	{	
		String v="";
try
{
	File f = new File(filePath);
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(f);
	 v = wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
		System.out.println(v);	
		
		}
catch(Exception e)
	{
	
	}
return v;
		
	
}

	public static Object[][]  getExcelCount(String filePath, int index) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		System.out.println("inside getExcelCount");
		
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheetAt(index);
		int row = s.getLastRowNum();
		Object[][] data = new Object[row][2];
	
		for(int i=0; i<row; i++){
			data[i][0] = s.getRow(i).getCell(0).getStringCellValue();
			data[i][1] = s.getRow(i).getCell(1).getStringCellValue();
		}

		return data;
	}
}
