package com.actitime.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestClass {
	@Test
public void demoTestMethod() {
	Reporter.log("welcome to testNG",true);
}

}
