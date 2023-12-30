package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/");
		
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
		driver.quit();
		

	}

}
