package com.actitime.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test
	public void creatCustomer() {
		Reporter.log("createcustomer",true);
	}
	@Test
	public void modifyCustomer() {
		Reporter.log("modifycustomer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("deletecustomer",true);
	}
}
