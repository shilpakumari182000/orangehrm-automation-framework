package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	@Test
	public void testvoidLogin() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.enterusername("Admin");
		loginpage.enterpassword("admin123");
		loginpage.clickLogin();
		
   DashboardPage dashboardPage = new DashboardPage(driver);
   
       dashboardPage.goToAdmin();
        System.out.println("Navigated to Admin section.");

        dashboardPage.goToPIM();
        System.out.println("Navigated to PIM section.");
        Thread.sleep(2000);
        

	}
}
      
	
	
	


