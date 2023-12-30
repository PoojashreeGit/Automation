package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodCalling {

	public static void main(String[] args) throws IOException {
	PropertyFileInMethod op=new PropertyFileInMethod();
	String url = op.getPropertyFile("url");
	String un = op.getPropertyFile("un");
	String pwd = op.getPropertyFile("pwd");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	

	}

}
