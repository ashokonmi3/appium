package framework_02;

import org.testng.annotations.Test;

public class Framework_01_testCase1 extends Framework_1_BaseTest {

	@Test
	public void FillForm() throws InterruptedException {

		Framework_01_FormPage formPage = new Framework_01_FormPage(driver);
		formPage.setNameField("name");
		formPage.setGender("female");
		formPage.setCountrySelection("Argentina");
		ProductCatalogue productCatalogue = formPage.submitForm();
		productCatalogue.addItemToCartByIndex(0);
		productCatalogue.addItemToCartByIndex(0);

	}
}
