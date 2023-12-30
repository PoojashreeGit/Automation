package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/PRUTHVI%20R/Desktop/Qsp.html");
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		int count=alllink.size();
		System.out.println(count);
		WebElement link = alllink.get(0);
		String text=link.getText();
		System.out.println(text);
		driver.quit();

	}

}
