package com.actitime.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAssertion {
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String etitle="Soogle";
		String atitle=driver.getTitle();
		if(etitle.equals(atitle)) {
			Reporter.log("title is matching and pass",true);
		}
		else {
			Reporter.log("title is not matching and fail",true);
		}
		driver.quit();		
		
	}

}
