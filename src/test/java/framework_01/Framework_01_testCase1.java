package framework_01;

import org.testng.annotations.Test;

public class Framework_01_testCase1 extends Framework_1_BaseTest {

	@Test
	public void FillForm() throws InterruptedException {

		Framework_01_FormPage formPage = new Framework_01_FormPage(driver);
		formPage.setNameField("name");
		formPage.setGender("female");
		formPage.setCountrySelection("Argentina");
		formPage.submitForm();
		// driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rahul
		// Shetty");
		// driver.hideKeyboard();
		// driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		// driver.findElement(By.id("android:id/text1")).click();
		// driver.findElement(
		// AppiumBy.androidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		// driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		// driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		// driver.findElement(AppiumBy
		// .androidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
		//
		// int productCount =
		// driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		//
		// for (int i = 0; i < productCount; i++) {
		// String productName =
		// driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i)
		// .getText();
		//
		// if (productName.equalsIgnoreCase("Jordan 6 Rings")) {
		// driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
		// }
		// }
		// driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		//
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		// wait.until(ExpectedConditions.attributeContains(
		// driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),
		// "text", "Cart"));
		//
		// String lastPageProduct =
		// driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		// Assert.assertEquals(lastPageProduct, "Jordan 6 Rings");

	}
}
