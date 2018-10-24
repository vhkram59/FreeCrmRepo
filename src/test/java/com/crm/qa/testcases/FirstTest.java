package com.crm.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class FirstTest extends TestBase{
	FirstTest firsttest;
	
	@BeforeMethod
	public void firsttest(){
		System.out.println("HELLO WORLD");
	}
		
	@Test	
	public void firsttestmethod(){
		driver.get("url");
		System.out.println("Opened the Website");
					
	}
	@AfterMethod
	public void Tear(){
		driver.quit();
	}
}
