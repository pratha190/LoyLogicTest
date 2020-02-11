package basic.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * @author Pratha
 */

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements
	@FindBy(how = How.XPATH, using = "//input[@id='ap_email']")
	WebElement emailTextBox;

	@FindBy(how = How.XPATH, using = "//span[@id='continue']")
	WebElement continueButton;

	@FindBy(how = How.XPATH, using = "//input[@id='ap_password']")
	WebElement passwordTextBox;

	@FindBy(how = How.XPATH, using = "//input[@id='signInSubmit']")
	WebElement signInButton;

	// This method is to enter text in the Email text box
	public void setTextInEmailTextBox(String strEmail) {
		emailTextBox.sendKeys(strEmail);
	}

	// This method to click on Continue Button
	public void clickOnContinueButton() {
		continueButton.click();
	}

	// This method is to enter text in the password text box
	public void setTextInPasswordTextBox(String strPass) {
		passwordTextBox.sendKeys(strPass);
	}

	// This method to click on SignIn/Login Button
	public void clickOnSignInButton() {
		signInButton.click();
	}

}
