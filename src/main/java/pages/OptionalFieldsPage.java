package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class OptionalFieldsPage extends BaseTest{
	 private WebDriver driver;

	    private By toggleButton = By.xpath("//span[contains(@class, 'oxd-switch-input')]");
	    private By saveButton = By.xpath("//button[normalize-space()='Save']");

	    public OptionalFieldsPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void toggleOffThenOn() throws InterruptedException {
	        WebElement toggle = driver.findElement(toggleButton);

	        // Only if it's already ON (selected)
	        if (toggle.isSelected()) {
	            toggle.click(); // OFF
	            try { Thread.sleep(500); } catch (InterruptedException e) {}
	            toggle.click(); // ON
	        } else {
	            toggle.click(); // ON
	            try { Thread.sleep(500); } catch (InterruptedException e) {}
	            toggle.click(); // OFF → ON
	        }
	    }

	    public void clickSave() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("oxd-form-loader")));
	        
	        driver.findElement(saveButton).click();
	    }
	}


