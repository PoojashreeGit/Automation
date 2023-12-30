package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupCancel {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        
        Alert a = driver.switchTo().alert();
        a.dismiss();
        boolean cancel = driver.findElement(By.id("demo")).isDisplayed();
       
        if(cancel) {
        	System.out.println("text is displyed :  "+driver.findElement(By.id("demo")).getText());
        }
        else
        {
        
        	System.out.println("text is not displyed");
        }
        driver.quit();
	}
}





