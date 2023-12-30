package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
	FileInputStream fis= new FileInputStream("./data/commandata.property");
	Properties p = new Properties();
	p.load(fis);
	String url = p.getProperty("url");
	String un = p.getProperty("un");
	String pwd = p.getProperty("pwd");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	Thread.sleep(3000);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();

	}

}
