package Automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_store {
	public static WebDriver driver;
	
	@FindBy(xpath = "//img[@title='Blouse']")
	private WebElement image;
	
	@FindBy(xpath = "(//a[@title='Add to cart'])[2]")
	private WebElement tocart;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed;

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getTocart() {
		return tocart;
	}

	public My_store(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getImage() {
		return image;
	}
	
	

}
