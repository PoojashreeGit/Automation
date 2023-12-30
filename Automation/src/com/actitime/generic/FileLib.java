package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this is a generic class for data driven testing
 * @author pooja
 */
public class FileLib {
	/**
	 * this is a generic method for reading the data from property file
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public String getPropertyData(String key) throws Exception
	{
		FileInputStream fis=new FileInputStream("./data/commandata.property");
		Properties p=new Properties();
		p.load(fis);
		return key;
		
	}
	/**
	 * this is a generic method for reading the data from excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelFile(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	/**
	 * this is a generic method for writing the data to excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelFile(String sheetname,int row,int cell,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	 wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
	 FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	 wb.write(fos);

}
}
