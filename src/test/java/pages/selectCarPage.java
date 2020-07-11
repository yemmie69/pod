package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.TestBase;

public class selectCarPage extends TestBase{
	JavascriptExecutor executor;


	@FindBy(xpath="//select[@id=\"vehicleBrand\"]")
	WebElement make;

	@FindBy(xpath="//select[@name=\"vehicleId\"]")
	WebElement model;
	
	@FindBy(xpath = "//input[@id=\"optOut\"]")
	WebElement optOut;

	public selectCarPage() {
		PageFactory.initElements(driver, this);

	}

	public void selectMake(String Make) {
		Select makeDropDown = new Select(make);
		makeDropDown.selectByIndex(14);

	}
	public void selectModel(String Mode) {
		Select modelDropDown = new Select(model);
		modelDropDown.selectByIndex(1);
		
	}
	
	public void clickOptOut() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", optOut);
	}
}
