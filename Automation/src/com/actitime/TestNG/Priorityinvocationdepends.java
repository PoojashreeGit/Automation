package com.actitime.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priorityinvocationdepends {
	@Test(priority=1,invocationCount=3)
	public void creatCustomer() {
		Reporter.log("createcustomer",true);
	}
	@Test(priority=2,dependsOnMethods="creatCustomer")
	public void modifyCustomer() {
		Reporter.log("modifycustomer",true);
	}
	@Test(priority=3,dependsOnMethods={"creatCustomer","modifyCustomer"})
	public void deleteCustomer() {
		Reporter.log("deletecustomer",true);
	}}