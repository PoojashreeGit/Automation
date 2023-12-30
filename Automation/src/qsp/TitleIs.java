package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TitleIs {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.findElement(By.id("idcta-username")).click();
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("BBC – Sign in"));
		String title =driver.getTitle();
		System.out.println(title);
driver.quit();		

	}

}
