package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
private WebDriver driver;
private By username=By.name("username");
private By password= By.name("password");
private By loginButton = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

public LoginPage(WebDriver driver)
{
	this.driver=driver;
}
public void enterusername(String Username){
	driver.findElement(username).clear();
	driver.findElement(username).sendKeys(Username);
	}
public void enterpassword(String Password){
	driver.findElement(password).clear();
	driver.findElement(password).sendKeys(Password);
	}
public void clickLogin() {
	driver.findElement(loginButton).click();
}
}
