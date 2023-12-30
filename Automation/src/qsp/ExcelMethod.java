package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMethod {
	public void setExcelFile(String sheetname,int row,int cell,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	 wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
	 FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	 wb.write(fos);
	}
	public String getExcelFile(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	

}
