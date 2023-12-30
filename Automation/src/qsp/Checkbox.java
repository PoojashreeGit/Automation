package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		driver.findElement(By.xpath("//label[.='Keep me signed in']")).click();
		Thread.sleep(2000);
	boolean logo= driver.findElement(By.id("filled-in-box")).isSelected();
		if(logo==true)
		{
			System.out.println("checkbox is selected and pass");
		}
		else
		{
			System.out.println("checkbox is not selected and fail");
		}
driver.quit();
	}

	

}
 