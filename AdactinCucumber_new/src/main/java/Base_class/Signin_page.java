package Base_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signin_page {
	@FindBy(id = "email")
	public static WebElement username;
	@FindBy(id="passwd")
	public static WebElement password;
	@FindBy(id="SubmitLogin")
	public static WebElement submit;
	
	
}
