package cibilproject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cibilscore.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src//test//java//com//cibilscore",
	glue="stepdefinition",	
     monochrome=true,dryRun=false,
	strict=true,
	tags = ("@SmokeTest"),
	plugin = {"html:Report/HTML_Report",
	"pretty",
	"json:Report/CucumberJSON_Report.json",
	"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport"})
	public class Test_Runner {
		
		public static WebDriver driver;
		
		@BeforeClass
		public static  void set_Up() throws Throwable {
			
			
			driver=Base_Class.browserLaunch("chrome");

		}

		@AfterClass
		public static void tear_Down() {
			
		//driver.close();

		
		}
	}



