package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("login-google-button")).click();
		
		driver.findElement(By.id("apple-signin-button")).click();
		
		String pwh=driver.getTitle();
		Set<String> allWh = driver.getWindowHandles();
		
		int count=allWh.size();
		System.out.println(count);
		
		for(String wh: allWh)
		{
			driver.switchTo().window(wh);
			Thread.sleep(2000);
			String title=driver.getTitle();
			if(!(pwh.equalsIgnoreCase(title)))
			{
			  //System.out.println(title);
			  driver.close();
			}
		}
	}

}
