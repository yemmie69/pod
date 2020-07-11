package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class compatibleExtrasPage extends TestBase{
	JavascriptExecutor executor;

	
	
	//@FindBy(xpath="//div[contains(@class,'content-block') and contains(., 'Compatible extras')]")
	//WebElement extras;
	
	@FindBy(xpath="//*[@id=\"optionalExtras\"]/div/div")
	WebElement extras;
	
	

	@FindBy(xpath="//button[@class=\"cookie__btn\"]")
	WebElement cookieButton;



	public compatibleExtrasPage() {
		PageFactory.initElements(driver, this);


	}

	public void clickRandomExtras() {



		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", extras);
	}

	//cookie
	public void clickCookieButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cookieButton);
	}

}
