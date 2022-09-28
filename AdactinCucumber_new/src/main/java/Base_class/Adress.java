package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adress {
	public static WebDriver driver;
	
	@FindBy(name="processAddress")
	private WebElement Adress;
	
	
	@FindBy(name="processCarrier")
	private WebElement checkout;
	
	@FindBy(id="cgv")
	private WebElement Checkbox;
	

	public WebElement getCheckbox() {
		return Checkbox;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public Adress(WebDriver driver1) {
		this.driver =driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdress() {
		return Adress;
	}

}
