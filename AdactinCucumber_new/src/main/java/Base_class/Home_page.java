package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public static WebDriver driver;
	
	@FindBy(className = "login")
	private WebElement Signin;

	public Home_page(WebDriver abc) {
		this.driver=abc;
		PageFactory.initElements(driver, this);// TODO Auto-generated constructor stub
	}

	public WebElement getSignin() {
		return Signin;
	}
	

}
