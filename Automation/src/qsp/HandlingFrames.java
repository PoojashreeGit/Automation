package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/PRUTHVI%20R/Desktop/page1.html");
		driver.findElement(By.id("t1")).sendKeys("abc");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("def");
		
	}

}
