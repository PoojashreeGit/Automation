package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUpsendkeys {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
        Alert alertwindow = driver.switchTo().alert();
	    String text = alertwindow.getText();
		System.out.println(text);
		
		alertwindow.sendKeys("selenium");
		WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait1.until(ExpectedConditions.alertIsPresent());
		alertwindow.accept();
		
		boolean text1 = driver.findElement(By.id("demo1")).isDisplayed();
		
		  if(text1) 
		    {
	        	System.out.println("text is displyed:  "+driver.findElement(By.id("demo1")).getText());
	        	
	        }
	        else
	        {
	        
	        	System.out.println("text is not displyed");
	       }
	        driver.quit();
		}
	}
