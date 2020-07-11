package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class powerRatingPage extends TestBase{
	JavascriptExecutor executor;

	@FindBy(xpath="//label[@for=\"model-S7\"]")
	WebElement sevenkW;
	
	public powerRatingPage() {
		PageFactory.initElements(driver, this);
		

	}
	
	public void click7KW() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", sevenkW);
	}

}
