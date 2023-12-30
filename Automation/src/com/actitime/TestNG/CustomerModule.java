package com.actitime.TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass1;

@Listeners(com.actitime.generic.Listeners.class)

public class CustomerModule extends BaseClass1{
	@Test
	public void creatCustomer() {
		Reporter.log("createcustomer",true);
		Assert.fail();
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
