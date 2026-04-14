package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	    WebDriver driver;
	    WebDriverWait wait;

	    private By adminMenu = By.xpath("//span[text()='Admin']");
	    private By pimMenu = By.xpath("//span[text()='PIM']");
	    private By logoutMenu = By.xpath("//p[text()='Logout']");

	    public DashboardPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	    }

	    public void goToAdmin() {
	     wait.until(ExpectedConditions.visibilityOfElementLocated(adminMenu));
	    driver.findElement(adminMenu).click();
	    }

	    public void goToPIM() {
	        driver.findElement(pimMenu).click();
	    }

	    public void logout() {
	        driver.findElement(logoutMenu).click();
	    }
	}


