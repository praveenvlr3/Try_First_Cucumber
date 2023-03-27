package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Gmail']")
	private WebElement gmailPage;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement enterUserName;


	@FindBy(xpath="//span[text()='Next']")
	private WebElement userAfterNext;

	public WebElement getgmailPage() {
		return gmailPage;	
	}
	public WebElement getenterUserName() {
		return enterUserName;	
	}
	public WebElement userAfterNext() {
		return userAfterNext;
	}


}
