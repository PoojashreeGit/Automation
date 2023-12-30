package com.actitime.TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScreenShot {
	@Test
public void testScreenShot() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/ss.png");
		FileUtils.copyFile(src, dest);
		driver.quit();	
}
}
