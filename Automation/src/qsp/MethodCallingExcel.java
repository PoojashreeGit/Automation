package qsp;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.FileLib;

public class MethodCallingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileLib f = new FileLib();
	//ex.setExcelFile("createcustomer", 1, 0, "http://localhost/login.do");
	String url =f.getExcelFile("createcustomer", 1, 0);
	String un = f.getExcelFile("createcustomer", 1, 1);
	String pwd = f.getExcelFile("createcustomer", 1, 2);
	WebDriver driver =new ChromeDriver();
	driver.get(url);
	
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys(un);

	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(pwd);

	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	}

}
