package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonfb {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	int y1=driver.findElement(By.xpath("//label[text()='Female']")).getLocation().getY();
	int y2=driver.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
	int y3=driver.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();
	if(y1==y2 && y2==y3)
	{
		System.out.println("username and password is alligned properly");
	}
	else
	{
		System.out.println("username and password is  not alligned properly");
	}
	driver.quit();

	}
}

