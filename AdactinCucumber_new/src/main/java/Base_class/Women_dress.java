package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_dress {
	public static WebDriver driver ;
	
	@FindBy(xpath = "//img[@title='Blouse']")
	private WebElement Image;
	
	@FindBy(xpath = "(//span[contains(text(),'Add to cart')])[2]")
	private WebElement Addtocart;
	
	@FindBy(xpath =  "//a[@title='Proceed to checkout']")
	private WebElement proceed;
	
	
	public WebElement getProceed() {
		return proceed;
	}

	public Women_dress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getImage() {
		return Image;
	}

	public WebElement getAddtocart() {
		return Addtocart;
	}
	
	
}
