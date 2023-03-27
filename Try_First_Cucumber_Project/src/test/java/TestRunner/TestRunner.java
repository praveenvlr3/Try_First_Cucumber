package TestRunner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;
import Helper.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\Smoke.feature",
glue="StepDefinition",
dryRun=false,
monochrome=true,
tags="@GmailLogin")
 
public class TestRunner {
	static WebDriver driver;
	public TestRunner(WebDriver driver) {
		this.driver=driver;
	}
	
	@BeforeClass
	public static void setUp() throws Throwable{

		String browser = FileReaderManager.getIntance().getCr().getBrowser();
		driver = BaseClass.getBrowser(browser);


	}
}