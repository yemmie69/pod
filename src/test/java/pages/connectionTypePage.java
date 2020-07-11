package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class connectionTypePage extends TestBase{
	JavascriptExecutor executor;


	@FindBy(xpath="//div[contains(@class,'grid__col grid__col-md-8') and contains(.,'Universal Socket')]")
	WebElement universalSocket;
	
	public connectionTypePage() {
		PageFactory.initElements(driver, this);

	}
public void clickUniversalSocket() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", universalSocket);
}

}
