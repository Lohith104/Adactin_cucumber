package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Womens_button {
public static WebDriver driver;

@FindBy(xpath = "//a[@title='Women']")
   private   WebElement Women;

public Womens_button(WebDriver driver2) {
	this.driver =driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getWomen() {
	return Women;
}


}
