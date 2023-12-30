package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllSuggLast {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 15 pro max");
		Thread.sleep(3000);

		List<WebElement> res = driver.findElements(By.xpath("//span[contains(text(),'iphone 15 pro max')]/.."));
		Thread.sleep(2000);
		int count= res.size();
		System.out.println(count);

		for( int i=0;i<count;i++)
		{
			String text = res.get(i).getText();
			System.out.println(text);
		}

		res.get(count-1).click();
	}
}




