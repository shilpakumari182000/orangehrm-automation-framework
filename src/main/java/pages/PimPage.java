package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PimPage {
	  private WebDriver driver;
	    private WebDriverWait wait;

	    // Locators
	    private By configMenu = By.xpath("//span[@class='oxd-topbar-body-nav-tab-item' and contains(text(), 'Configuration')]");
	    private By optionalFields = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and normalize-space()='Optional Fields']");

	    public PimPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    public void goToOptionalFields() throws InterruptedException {
	        WebElement configElement = wait.until(ExpectedConditions.visibilityOfElementLocated(configMenu));
	        configElement.click();
	        Thread.sleep(2000);

	        WebElement optionalFieldsElement = wait.until(ExpectedConditions.elementToBeClickable(optionalFields));
	        optionalFieldsElement.click();
	        Thread.sleep(2000);
	    }
	}
