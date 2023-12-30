package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandTabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Actimind Inc.")).click();
		Thread.sleep(5000);
		
		//String pwh=driver.getTitle();
		Set<String> allWh = driver.getWindowHandles();
		
		int count=allWh.size();
		System.out.println(count);		
		
		for(String wh: allWh)
		{
			Thread.sleep(5000);
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			System.out.println(title);
			driver.close();
		}
	

	}

}
