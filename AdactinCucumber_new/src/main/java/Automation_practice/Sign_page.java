package Automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_page {
	
	public static WebDriver driver;
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "passwd")
	private WebElement password;
	@FindBy(id = "SubmitLogin")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getPassword() {
		return password;
	}

	public Sign_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

}
