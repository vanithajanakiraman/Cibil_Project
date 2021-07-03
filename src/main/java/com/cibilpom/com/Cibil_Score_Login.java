package com.cibilpom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cibil_Score_Login {
	public static WebDriver driver;

	@FindBy(xpath="//a[@class='btn tui-orange-btn shadow hidden-xs hidden-sm']")
	private WebElement cibilscore;
	
	@FindBy(xpath="//a[contains(text(),'Get 1 Month')]")
	private WebElement basic_Clk;
	
	public Cibil_Score_Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCibilscore() {
		return cibilscore;
	}

	public WebElement getBasic_Clk() {
		return basic_Clk;
	}

	
}
