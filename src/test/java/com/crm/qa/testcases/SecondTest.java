package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class SecondTest extends TestBase {
	
	@Test
	public void firsttestmethod(){
		
		
		driver.get("https://www.shopmytools.com/");
		System.out.println("Opened the Website");
		driver.quit();
			
	}
	@AfterMethod
	public void Teardown(){
		driver.quit();
	}
}

