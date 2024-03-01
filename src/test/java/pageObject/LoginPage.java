package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	public void enterUserName(String user) {
		username.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin(){
		loginButton.click();
	}
	
	public String textVerify() {
		return driver.getTitle();
	}
}
