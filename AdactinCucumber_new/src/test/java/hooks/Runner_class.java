package hooks;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Base_class.Regular_methods;

public class Runner_class extends Regular_methods {
	public static void main(String[] args) throws IOException, AWTException {
		Browser_launch("ChromeDriver");
		get_app("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I Phones");
		WebElement element2 = driver.findElement(By.id("nav-search-submit-button"));
		clickelement(element2);
		WebElement element3 = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions("movetoelement", element3);
		Actions("Contextclick", element3);
		Robotclass();
		windowhandles();
		navigateto("https://letcode.in/test");
		scrollup_down("bypointsup","200");
		WebElement button = driver.findElement(By.xpath("//a[text()='Toggle']"));
		text(button);
		clickelement(button);
		WebElement radio = driver.findElement(By.name("nobug"));
		radiobutton(radio);
		selected(radio);
		displayed(radio);
		currenturl();
		attribute(radio);
		title();
		navigate("back");
		navigateto("https://letcode.in/dropdowns");
		WebElement drop = driver.findElement(By.id("fruits"));
		multiple(drop);
		dropdown(drop, "selectbyindex","1");
		alloptions(drop);
		WebElement drops = driver.findElement(By.id("superheros"));
		multiple(drops);
		dropdown(drops, "selectbyvalue", "am");
		dropdown(drops, "selectbyvisibletext", "Incredible Hulk");
		firstselect(drops);
		allselected(drops);
	screenshot("C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\ScreenShot\\method.png");
	navigate("back");
	WebElement element31 = driver.findElement(By.xpath("//a[text()='Dialog']"));
	clickelement(element31);
	WebElement alert1 = driver.findElement(By.id("prompt"));
	alert(alert1, "promptalert", "Lohith");
	WebElement alert2 = driver.findElement(By.id("accept"));
	alert(alert2, "simplealert", null);
	text(alert2);
	text(alert1);
	navigateto("https://letcode.in/dropable");
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop1 = driver.findElement(By.id("droppable"));
	draganddrop( drag, drop1);
	Actions("clickandhold", drag);
	navigateto("https://letcode.in/frame");
	WebElement element4 = driver.findElement(By.id("firstFr"));
	frames("element", element4);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Lohith");
	close();
	quit();}

}
