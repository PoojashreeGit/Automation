package qsp;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@class='flex items-center']")).click();
		File f= new File("./data/CURRICULUM VITAE pooja.docx");
		String path=f.getAbsolutePath();
		driver.findElement(By.id("fileInput")).sendKeys(path);
		Thread.sleep(2000);
		driver.quit();
 

	}

}
