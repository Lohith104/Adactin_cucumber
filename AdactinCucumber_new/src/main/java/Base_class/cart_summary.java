package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cart_summary {
	
	//public static WebDriver driver;
	
	@FindBy(className = "icon-plus")
	public static WebElement cart_add;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	public static WebElement checkout;

	
	

}
