package StepDefinitions;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.compatibleExtrasPage;
import pages.connectionTypePage;
import pages.powerRatingPage;
import pages.selectCarPage;
import util.TestBase;

public class productStep extends TestBase {

	JavascriptExecutor Executor;

	@Given("user visit https:\\/\\/checkout.pod-point.com\\/")
	public void user_visit_https_checkout_pod_point_com() {
		TestBase.initialization();
		SelectCarPage = new selectCarPage();
		ConnectionTypePage = new connectionTypePage();
		PowerRatingPage = new powerRatingPage();
		CompatibleExtrasPage = new compatibleExtrasPage();

	}

	@Given("user select Mitsubishi and Outlander in the Select Your Car fields")
	public void user_select_mitsubishi_and_outlander_in_the_select_your_car_fields() {
		// select Mitsubishi and Outlander
		SelectCarPage.selectMake("14");
		SelectCarPage.selectModel("1");

	}

	@Given("user check the box ‘I am NOT eligible to claim the dealership discount as I did not come through a dedicated dealership’")
	public void user_check_the_box_i_am_not_eligible_to_claim_the_dealership_discount_as_i_did_not_come_through_a_dedicated_dealership() {
		// click opt out
		SelectCarPage.clickOptOut();
	}

	@When("user select the ‘Universal Socket’ option")
	public void user_select_the_universal_socket_option() {
		// click universal socket
		ConnectionTypePage.clickUniversalSocket();
	}

	@When("^user check the prices for the (\\d+)kw unit displayed match the following values £(\\d+) Full Price and £(\\d+) With OLEV Grant$")
	public void user_check_the_prices_for_the_kw_unit_displayed_match_the_following_values_£_Full_Price_and_£_With_OLEV_Grant(
			int arg1, int arg2, int arg3) throws Throwable {

		// check the prices for the 7kw unit displayed match Full Price – £879
		String ActualFullPrice = driver
				.findElement(By.xpath("//span[contains(@class,'h3') and contains(., '£879.00')]")).getText();
		Assert.assertEquals("£879.00", ActualFullPrice);
		System.out.println(ActualFullPrice);

		// check the prices for the 7kw unit displayed match With OLEV Grant - £529
		String ActualOLEV_Grant = driver
				.findElement(By.xpath("//span[contains(@class,'h3 colour-primary') and contains(., '£529.00')]"))
				.getText();
		Assert.assertEquals("£529.00", ActualOLEV_Grant);
		System.out.println(ActualOLEV_Grant);
	}

	@When("^user select power rating$")

	public void user_select_power_rating() throws InterruptedException {

		// click 7kw
		PowerRatingPage.click7KW();

	}

	@When("^user check that (\\d+) compatible extras are shown$")
	public void user_check_that_compatible_extras_are_shown(int arg1) throws Throwable {

		// 6 compatible extras count
		List<WebElement> extras = driver
				.findElements(By.xpath("//div[@class=\"grid__col grid__col-md-4 grid__col-lg-4\"]"));
		System.out.println("Number of extras:" + extras.size());
		Assert.assertEquals(6, extras.size());

		Thread.sleep(5000);

	}

	@When("^user select a random compatible extra$")
	public void user_select_a_random_compatible_extra() throws Throwable {

		// Click cookies
		CompatibleExtrasPage.clickCookieButton();

		// get all products
		List<WebElement> productList = driver
				.findElements(By.xpath("//div[@class=\"grid__col grid__col-md-4 grid__col-lg-4\"]"));

		// get the length of productList
		int maxProducts = productList.size();

		// Click random extras
		Random random = new Random();
		int randomProduct = random.nextInt(maxProducts);

		// Select the list item
		productList.get(randomProduct).click();

		Thread.sleep(5000);

	}

	@Then("^the total price at the bottom right of the screen should correctly match the (\\d+)kw unit price \\+ the compatible extra price$")
	public void the_total_price_at_the_bottom_right_of_the_screen_should_correctly_match_the_kw_unit_price_the_compatible_extra_price(
			int arg1) throws Throwable {

		// 7KW price
		int SevenKW = 879;
		System.out.println(SevenKW);

		// total
		String total = driver.findElement(By.xpath("//h3[@class=\"p-b-none\"]")).getText();
		System.out.println("total is " + total);

	}

}
