package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoImplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chat.qspiders.com/");
		driver.findElement(By.name("username")).sendKeys("raghuramposina9@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Raghuram@9");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//button[text()='logout']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();

	}

}
