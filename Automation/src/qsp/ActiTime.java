package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
     driver.findElement(By.xpath("//div[text()='TASKS']")).click();
     driver.findElement(By.id("createTasksDiv")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
     driver.findElement(By.xpath("//div[text()='Cancel']")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("logoutLink")).click();
	}

}