package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("123");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s= new Select(month);
		s.selectByIndex(1);
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1= new Select(year);
		s1.selectByValue("1994");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='28']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9845098450");
		Thread.sleep(2000);
		driver.findElement(By.id("renew_policy_submit")).click();
		Thread.sleep(2000);
		boolean res = driver.findElement(By.xpath("(//span[@class='help-block'])[1]")).isDisplayed();
		
		 if(res) {
	        	System.out.println("text is displyed   "+driver.findElement(By.xpath("(//span[@class='help-block'])[1]")).getText() );
	        }
	        else
	        {
	        
	        	System.out.println("text is not displyed");
	        }
	        driver.quit();
	}
	
		
		
		
		
	}


