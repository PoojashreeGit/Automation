package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--incognito","--start-maximized","--disable-notifications");
	WebDriver driver= new ChromeDriver(opt);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/browserNot");
	driver.findElement(By.id("browNotButton")).click();

	}

}
