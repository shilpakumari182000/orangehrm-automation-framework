package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AdminPage;
import pages.DashboardPage;
import pages.LoginPage;
import utils.WaitUtils;

public class AdminTest extends BaseTest {

	    @Test
	    public void testEditUserAndCancel() throws InterruptedException {
	    	LoginPage loginPage = new LoginPage(driver);
	        loginPage.enterusername("Admin");
	        loginPage.enterpassword("admin123");
	        loginPage.clickLogin();

	        DashboardPage dashboardPage = new DashboardPage(driver);
	        dashboardPage.goToAdmin();

	        AdminPage adminPage = new AdminPage(driver);
	        adminPage.scrollToUserTable();
	        WaitUtils.pause(1000);
	        adminPage.clickEditOnFirstUser();
	        WaitUtils.pause(1000);
	        adminPage.clickCancelButton();
	        WaitUtils.pause(1000);
	        System.out.println("Successfully navigated to Admin, opened user edit, then canceled.");
	    	 dashboardPage.goToPIM();
	         System.out.println("Navigated to PIM section.");
	         WaitUtils.pause(3000);	             

	        
	    }
	}

