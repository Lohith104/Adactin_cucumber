package Automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	public static WebDriver driver;
	
	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement check;
	
	@FindBy(name = "processAddress")
	private WebElement Procheck;

	public WebElement getProcheck() {
		return Procheck;
	}

	public Address(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheck() {
		return check;
	}

}
