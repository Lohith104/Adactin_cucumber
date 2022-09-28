package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public static WebDriver driver;
	
	

	@FindBy(className = "cheque")
	public static WebElement modeof;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public static WebElement confrim;

}
