package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	//To select the web browser
	public static WebDriver getBrowser(String browser) {
		try {
			if(browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if(browser.equals("ie")){
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
			else if(browser.equals("firefox")){
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			else if (browser.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			return driver;


		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}


	//To get the Url
	public static void getUrl(String url) {
		try {

			driver.get(url);

		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	//Click Operation
	public static void clickOnWebElement(WebElement element) {
		try {
			if(elementIsDisplayed(element)) {
				element.click(); 
			}
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	// Confrom the visible of element in webpage
	public static boolean elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;

	}

	//Wait for webelemt visiblity

	public static void waitForElementVisibility(WebElement element) {
		try {

			WebDriverWait wb = new WebDriverWait(driver, 60);
			wb.until(ExpectedConditions.visibilityOf(element));
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void inputValueUseToElment(WebElement element, String data) {
		try {
			waitForElementVisibility(element);
			if(elementIsDisplayed(element)) {
				element.sendKeys(data);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
