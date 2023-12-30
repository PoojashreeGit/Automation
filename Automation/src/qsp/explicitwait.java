package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://chat.qspiders.com/");
		driver.findElement(By.name("username")).sendKeys("raghuramposina9@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Raghuram@9");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='logout']")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='logout']")));
		driver.quit();
	}

}
