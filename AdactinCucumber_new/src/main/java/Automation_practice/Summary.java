package Automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	public static WebDriver driver;
	
	@FindBy(xpath = "(//a[@rel='nofollow'])[8]")
	private WebElement add;
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}

	public Summary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return add;
	}

}
