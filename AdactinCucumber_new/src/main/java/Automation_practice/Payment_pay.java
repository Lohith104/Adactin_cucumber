package Automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_pay {
	public static WebDriver driver;
	
	@FindBy(className = "cheque")
	private WebElement payment;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confrim;

	public WebElement getConfrim() {
		return confrim;
	}

	public Payment_pay(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getPayment() {
		return payment;
	}

}
