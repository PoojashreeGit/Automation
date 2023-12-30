package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebFileUpload {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/PRUTHVI%20R/Desktop/nuakari.html");
	Thread.sleep(2000);
	File f= new File("./data/CURRICULUM VITAE pooja.docx");
	String abpath= f.getAbsolutePath();
	driver.findElement(By.id("cv")).sendKeys(abpath);

	}

}
