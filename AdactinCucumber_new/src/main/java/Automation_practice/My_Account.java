package Automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account {
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement Myaccount;
	
	 public My_Account(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		}

	public WebElement getMyaccount() {
		return Myaccount;
	}

}
