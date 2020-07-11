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

public class productStep extends TestBase{
	
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
		SelectCarPage.selectMake("14");
		SelectCarPage.selectModel("1");
	    
	}

	@Given("user check the box ‘I am NOT eligible to claim the dealership discount as I did not come through a dedicated dealership’")
	public void user_check_the_box_i_am_not_eligible_to_claim_the_dealership_discount_as_i_did_not_come_through_a_dedicated_dealership() {
		SelectCarPage.clickOptOut();
	}

	@When("user select the ‘Universal Socket’ option")
	public void user_select_the_universal_socket_option() {
		ConnectionTypePage.clickUniversalSocket();
	}

	@When("user select power rating")
	public void user_select_power_rating() throws InterruptedException {
		PowerRatingPage.click7KW();
		
		//check the prices for the 7kw unit displayed match Full Price – £879 
		String ExpectedFullPrice = "£879.00";
		String ActualFullPrice = driver.findElement(By.xpath("//span[contains(@class,'h3') and contains(., '£879.00')]")).getText();
		Assert.assertEquals(ExpectedFullPrice, ActualFullPrice);
		System.out.println(ActualFullPrice);
		
		//check the prices for the 7kw unit displayed match With OLEV Grant - £529
		String ExpectedOLEV_Grant = "£529.00";
		String ActualOLEV_Grant = driver.findElement(By.xpath("//span[contains(@class,'h3 colour-primary') and contains(., '£529.00')]")).getText();
		Assert.assertEquals(ExpectedOLEV_Grant, ActualOLEV_Grant);
		System.out.println(ActualOLEV_Grant);
		
		Thread.sleep(5000);
	}

	@When("user select a random compatible extra")
	public void user_select_a_random_compatible_extra() {
		
		// Click cokkies
		CompatibleExtrasPage.clickCookieButton();
		
		
		// get all products whose quanity >0
	    List<WebElement> productElems = driver.findElements(By.xpath("//div[@class=\"grid__col grid__col-md-4 grid__col-lg-4\"]"));
	    
	    // get the len of productElems
	    int maxProducts = productElems.size();

	    // get random number
	    Random random = new Random();
	    int randomProduct = random.nextInt(maxProducts);

	    // Select the list item
	    productElems.get(randomProduct).click();
	    
	   String product= productElems.get(randomProduct).getText();
	   
	   
	    
	    System.out.println(product);
	    
	    String randomPrice = driver.findElement(By.xpath("//p[@class=\"h4\"]")).getText();
	    System.out.println(randomPrice);
	    
	    
	    }

	@Then("the total price at the bottom right of the screen should correctly match the 7kw unit price + the compatible extra price")
	public void the_total_price_at_the_bottom_right_of_the_screen_should_correctly_match_the_7kw_unit_price_the_compatible_extra_price() {
		
		
	
	}


	@Then("^the total price at the bottom right of the screen should correctly match the (\\d+)kw unit price \\+ the compatible extra price$")
	public void the_total_price_at_the_bottom_right_of_the_screen_should_correctly_match_the_kw_unit_price_the_compatible_extra_price(int arg1) throws Throwable {
	    Thread.sleep(5000);
		
		driver.quit();
	}

}
