package basic.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basic.pages.AddressPage;
import basic.pages.AmazonHomePage;
import basic.pages.LoginPage;
import basic.pages.ProductDetailPage;

/**
 * @author Pratha
 */

public class AmazonTest extends TestBase {

	@Test
	public void init() throws Exception {

		AmazonHomePage homepage = PageFactory.initElements(driver, AmazonHomePage.class);
		homepage.setTextInSearchBox("xbox");
		homepage.clickOnSearchButton();
		homepage.clickOnFirstSearchResult();

		ProductDetailPage detailPage = PageFactory.initElements(driver, ProductDetailPage.class);
		detailPage.HandelProductDetailWindow();
		detailPage.clickOnAddToCartButton();
		detailPage.clickOnProceedToBuy();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.setTextInEmailTextBox("8237100793");
		loginPage.clickOnContinueButton();
		loginPage.setTextInPasswordTextBox("pratha02");
		loginPage.clickOnSignInButton();

		AddressPage addressPage = PageFactory.initElements(driver, AddressPage.class);
		addressPage.clickOnDeliverToThisAddressButton();
		addressPage.clickOnContinueButton();
	}
}
