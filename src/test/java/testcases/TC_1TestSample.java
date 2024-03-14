package testcases;

import org.testng.annotations.Test;

import generics.BaseTest;
import pages.LoginPage;

public class TC_1TestSample extends BaseTest
{
	@Test
	public void logintest() throws Exception 
	{
		LoginPage login = new LoginPage(driver);
		login.logininsuryammethod();
		login.newitdevelopmenttabmethod();
		login.alltaskpagemethod();
		
	}
	


}
