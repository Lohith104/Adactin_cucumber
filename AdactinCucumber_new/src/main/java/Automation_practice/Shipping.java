package Automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	public static WebDriver driver;
	
	@FindBy(name = "cgv")
	private WebElement box;
	
	@FindBy(name = "processCarrier")
	private WebElement proceed;

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getBox() {
		return box;
	}

	public Shipping(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}
	


}
