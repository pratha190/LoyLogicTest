package basic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Pratha
 */

public class AddressPage {
	WebDriver driver;

	public AddressPage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements
	@FindBy(how = How.XPATH, using = "//span[@class='a-button-inner']")
	WebElement deliverToThisAddressButton;

	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	WebElement continueButton;

	// This method to click on Deliver To This Address Button
	public void clickOnDeliverToThisAddressButton() {
		deliverToThisAddressButton.click();
	}

	// This method to click on Continue Button
	public void clickOnContinueButton() {
		continueButton.click();
	}

}
