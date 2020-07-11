package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import pages.compatibleExtrasPage;
import pages.connectionTypePage;
import pages.powerRatingPage;
import pages.selectCarPage;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static selectCarPage SelectCarPage;
	public static connectionTypePage ConnectionTypePage;
	public static powerRatingPage PowerRatingPage;
	public static compatibleExtrasPage CompatibleExtrasPage;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"/Users/yemioluv/eclipse-workspace/PodPoint/src/test/java/config/config.properties");

			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();

		}

	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver 6");
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browserName.equals("FF")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			
		} else if (browserName.equals("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

}