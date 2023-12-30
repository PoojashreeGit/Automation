package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPrintPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/download");
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		for(int i=0;i<4;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_2);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_M);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
	
		
		
		



