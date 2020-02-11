package basic.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * @author Pratha
 */

public class AmazonHomePage {
	WebDriver driver;

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements
	@FindBy(how = How.XPATH, using = "//input[@id='twotabsearchtextbox']")
	WebElement searchBox;

	@FindBy(how = How.XPATH, using = "//div//input[@type='submit']")
	WebElement searchButton;

	@FindBy(how = How.XPATH, using = "//div//img[@class='s-image']")
	WebElement firstSearchResult;

	// Defining all the user actions (Methods) that can be performed in the
	// Amazon home page

	// This method is to enter text in the Search text box
	public void setTextInSearchBox(String strText) {
		searchBox.sendKeys(strText);
	}

	// This method to click on SearchButton
	public void clickOnSearchButton() {
		searchButton.click();
	}

	// This method to click on First search result
	public void clickOnFirstSearchResult() {
		firstSearchResult.click();
	}
}
