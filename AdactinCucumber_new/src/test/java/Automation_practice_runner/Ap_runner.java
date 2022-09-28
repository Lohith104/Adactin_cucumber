package Automation_practice_runner;

import java.io.IOException;

import javax.swing.Scrollable;

import org.openqa.selenium.WebDriver;

import Automation_practice.Sign_page;
import Base_class.Regular_methods;
import Base_class.Signin_page;
import Sdp_Ap.Sdp;

public class Ap_runner extends Regular_methods {
	public static WebDriver driver=Regular_methods.Browser_launch("chromedriver");
	public static Sdp lohith=new Sdp(driver);
	public static void main(String[] args) throws IOException {
		Wait();
		get_app("http://automationpractice.com/index.php?controller=authentication&back=my-account");	
	String email = readData("C:\\Users\\Lohith\\Documents\\datadriven1.xlsx", 2, 0, 0);
	title();
		Sendkeys(email, lohith.getLp().getEmail());//loginpage
		String password = readData("C:\\Users\\Lohith\\Documents\\datadriven1.xlsx", 2, 0, 1);
		Sendkeys(password, lohith.getLp().getPassword());
		scrollup_down("up","window.scrollBy(0,300)");
		clickelement(lohith.getLp().getSubmit());
		title();
		clickelement(lohith.getAc().getMyaccount());//myaccount page
		scrollup_down("up", "window.scrollBy(0,1000)");
		title();
		Actions("movetoelement",lohith.getStore().getImage());//store
		waituntilElementVisibility(lohith.getStore().getTocart());
		clickelement(lohith.getStore().getTocart());
		clickelement(lohith.getStore().getProceed());
		for (int i = 0; i <2; i++) {	int a=i;	
		clickelement(lohith.getSum().getAdd());}
		title();//cart
		scrollup_down("up", "window.scrollBy(0,700)");
		waituntilElementVisibility(lohith.getSum().getCheckout());
		clickelement(lohith.getSum().getCheckout());
		scrollup_down("up", "window.scrollBy(0,700)");//address
		Sendkeys("hi i'm lohith", lohith.getAdres().getCheck());
		clickelement(lohith.getAdres().getProcheck());
		scrollup_down("up", "window.scrollBy(0,500)");//shipment
		clickelement(lohith.getShip().getBox());
		clickelement(lohith.getShip().getProceed());
		scrollup_down("up", "window.scrollBy(0,500)");
		clickelement(lohith.getPay().getPayment());
		scrollup_down("up", "window.scrollBy(0,500)");
		clickelement(lohith.getPay().getConfrim());//order confirmation
		scrollup_down("up", "window.scrollBy(0,500)");
		screenshot("C:\\Users\\Lohith\\eclipse-workspace\\AdactinCucumber_new\\Driver\\ScreenShot//lohith.png");
		title();
		quit();
		
		
		
		
		
		
		
		
		
		
	}

}
