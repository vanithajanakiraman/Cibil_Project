package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.cibilpom.com.Cibil_Score_Login;
import com.cibilscore.Base_Class;

import cibilproject.Test_Runner;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Step_Definition extends Base_Class{
	public static WebDriver driver=Test_Runner.driver;
	
	public static Cibil_Score_Login login=new Cibil_Score_Login(driver);
	
	
	@Given("^user Launch The Application Url$")
	public void user_Launch_The_Application_Url() throws Throwable {
		getUrl("https://www.cibil.com/");
	}

	
	@Given("^user Need To Click The Cibil Report And Score$")
	public void user_Need_To_Click_The_Cibil_Report_And_Score() throws Throwable {
		clickOnElement(login.getCibilscore());
		implicitWait(10);
	}

	@Before
	public  void before_Hooks(Scenario scenario) throws IOException{
		implicitWait(10);
		String status = scenario.getStatus();
		if(scenario.isFailed())
		{
			screenShot("C:\\Users\\ADMIN\\eclipse-workspace\\cibilscore\\ScreenShot\\fail_Test");;
		}
	}


	@Then("^user Either To Click The Options Premium Of One Year$")
	public void user_Either_To_Click_The_Options_Premium_Of_One_Year() throws Throwable {
	
		}

	@Then("^user Either To Click The Options Standard Of Six Month$")
	public void user_Either_To_Click_The_Options_Standard_Of_Six_Month() throws Throwable {
	}

	@Then("^user Either To Click The Options Basic Of One Month And Move To Create Account or Get Login$")
	public void user_Either_To_Click_The_Options_Basic_Of_One_Month_And_Move_To_Create_Account_or_Get_Login() throws Throwable {
     
		implicitWait(10);
		clickOnElement(login.getBasic_Clk());
	
	}


}
