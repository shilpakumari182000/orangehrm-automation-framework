package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;
import pages.OptionalFieldsPage;
import pages.PimPage;

public class PimOptionalFieldsTest extends BaseTest {

	  @Test
	    public void testToggleOptionalFields() throws InterruptedException {

	        LoginPage login = new LoginPage(driver);
	        login.enterusername("Admin");
	        login.enterpassword("admin123");
	        login.clickLogin();

	        DashboardPage dash = new DashboardPage(driver);
	        dash.goToPIM();
	        Thread.sleep(2000);

	        PimPage pim = new PimPage(driver);
	        pim.goToOptionalFields();
	        Thread.sleep(2000);


	        OptionalFieldsPage optPage = new OptionalFieldsPage(driver);
	        optPage.toggleOffThenOn();
	        Thread.sleep(10);
	        optPage.clickSave();
	        Thread.sleep(2000);

	        System.out.println("Toggle OFF-ON and Save successful");
	    }
	}
	
	


