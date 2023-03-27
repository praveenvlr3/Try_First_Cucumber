package StepDefinition;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;
import Helper.FileReaderManager;
import POM.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	static WebDriver driver;
	LoginPage lp  = new LoginPage(driver);
	
	
	@Given("^To lanuch the browser$")
	public void to_lanuch_the_browser() throws Throwable {
		
	}

	@When("^To lanuch the Url$")
	public void to_lanuch_the_Url() throws Throwable {
		String lanuchUrl = FileReaderManager.getIntance().getCr().getUrl();
		getUrl(lanuchUrl);
	}

	@When("^To click the Gmail and Navigate to gmail page$")
	public void to_click_the_Gmail_and_Navigate_to_gmail_page() throws Throwable {
		clickOnWebElement(lp.getgmailPage());
	}

	@When("^To enter the user name of the login$")
	public void to_enter_the_user_name_of_the_login() throws Throwable {
		inputValueUseToElment(lp.getenterUserName(), "Praveenvlr3");
	}
	
	@Then("^Click Next button$")
	public void click_Next_button() throws Throwable {
	    clickOnWebElement(lp.userAfterNext());
	}
}
