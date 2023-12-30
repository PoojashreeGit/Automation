package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	WebElement day=driver.findElement(By.id("day"));
	Select s=new Select( day);
	s.selectByIndex(27);
	Thread.sleep(2000);
	WebElement month=driver.findElement(By.id("month"));
	Select s1 =new Select(month );
	s1.selectByValue("2");
	Thread.sleep(2000);
	WebElement year=driver.findElement(By.id("year"));
	Select s2 =new Select(year);
	s2.selectByVisibleText("1994");
	 
	driver.quit();
	
	
	
		
		

	}

}
