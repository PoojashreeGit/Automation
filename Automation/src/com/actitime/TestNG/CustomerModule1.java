package com.actitime.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule1 {
	@Test(groups={"smoke test","regression test"})
	public void creatCustomer() {
		Reporter.log("createcustomer",true);
	}
	@Test(groups="regression test")
	public void modifyCustomer() {
		Reporter.log("modifycustomer",true);
	}
	@Test(groups="regression test")
	public void deleteCustomer() {
		Reporter.log("deletecustomer",true);
	}


}
