package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.WaitUtils;

public class AdminPage {
	
	    WebDriver driver;
	    WebDriverWait wait;

	    private By editFirstUser = By.xpath("(//i[contains(@class, 'bi-pencil-fill')])[5]");
	    private By cancelButton = By.xpath("//button[normalize-space()='Cancel']");

	    public AdminPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    }

	    public void scrollToUserTable() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	        WaitUtils.pause(1000);
	    }

	    public void clickEditOnFirstUser() {
	        wait.until(ExpectedConditions.elementToBeClickable(editFirstUser)).click();
	    }

	    public void clickCancelButton() {
	        wait.until(ExpectedConditions.elementToBeClickable(cancelButton)).click();
	    }
	}


