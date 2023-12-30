package com.actitime.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ActiTime extends BaseClass {
@Test
public void creatCustomer() {
	Reporter.log("cc",true);
}
}
