package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();// will call the super class constructor -
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 0)
	public void validateLoginPage() {
		String title = loginPage.validateloginpagetitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");

	}

	@Test(priority = 1)
	public void logotest() {
		boolean flag = loginPage.validateimage();
		Assert.assertTrue(flag);

	}

	@Test(priority = 2)
	public void LoginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
