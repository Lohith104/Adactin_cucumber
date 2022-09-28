package com.adactin.stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.adactin.runner.Ap_cucumPOM;

import Base_class.Adress;
import Base_class.Home_page;
import Base_class.Payment;
import Base_class.Regular_methods;
import Base_class.Signin_page;
import Base_class.Women_dress;
import Base_class.Womens_button;
import Base_class.cart_summary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ap_CucumPOM extends Regular_methods{

	public static WebDriver driver=Ap_cucumPOM.driver;
	JavascriptExecutor l=(JavascriptExecutor)driver;
	@Given("^Lunch the url of Automation Practice$")
	public void lunch_the_url_of_Automation_Practice() throws Throwable {
	    //get_app("http://automationpractice.com/index.php");
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");	
	}

@Then("^user click the signin nutton$")
public void user_click_the_signin_nutton() throws Throwable {
	Home_page l=new Home_page(driver);
    l.getSignin().click();
}
	@When("^User Enter The Valid User name$")
	public void user_Enter_The_Valid_User_name() throws Throwable {
		PageFactory.initElements(driver, Signin_page.class);
		Signin_page.username.sendKeys("kmlohith503@gmail.com");  
	}

	@When("^User Enter The Valid Password$")
	public void user_Enter_The_Valid_Password() throws Throwable {
Signin_page.password.sendKeys("Lohith@104");
	}

	@Then("^User Click The SignIn Button And Page Navigat's To My Account Page$")
	public void user_Click_The_SignIn_Button_And_Page_Navigat_s_To_My_Account_Page() throws Throwable {	
		l.executeScript("arguments[0].scrollIntoView();",Signin_page.submit);
		Signin_page.submit.click(); 
	}
	@Then("^User Click on Women and Page Navigate to Womens page$")
	public void user_Click_on_Women_and_Page_Navigate_to_Womens_page() throws Throwable {
	    Womens_button w=new Womens_button(driver);
	    w.getWomen().click();
	}
	@When("^Choose a Dress And Move over$")
	public void choose_a_Dress_And_Move_over() throws Throwable {
		Women_dress w=new 	Women_dress(driver);
		l.executeScript("window.scrollBy(0,1000)");
		Actions act =new Actions(driver);
		act.moveToElement(w.getImage()).perform();
		Thread.sleep(4000);
	}

	@Then("^Click On Add To cart Button And Page Navigate to Successfully added page$")
	public void click_On_Add_To_cart_Button_And_Page_Navigate_to_Successfully_added_page() throws Throwable {
		Women_dress w=new 	Women_dress(driver);
		w.getAddtocart().click();
		Thread.sleep(5000);
	}

	@Then("^User Click on the Checkout Button And Page Navigate Cart Summary$")
	public void user_Click_on_the_Checkout_Button_And_Page_Navigate_Cart_Summary() throws Throwable {
		Women_dress w=new 	Women_dress(driver);
		w.getProceed().click();
		
	}

	@When("^User Click the Add Button For Quantity$")
	public void user_Click_the_Add_Button_For_Quantity() throws Throwable {
		PageFactory.initElements(driver, cart_summary.class);
	  cart_summary.cart_add.click();
	  l.executeScript("window.scrollBy(0,800)");
	}

	@Then("^User Click the Checkout Button and Page Navigate to Address$")
	public void user_Click_the_Checkout_Button_and_Page_Navigate_to_Address() throws Throwable {
		PageFactory.initElements(driver, cart_summary.class);
		cart_summary.checkout.click();
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Then("^user click the checkout Button and Navigates to Shipping Page$")
	public void user_click_the_checkout_Button_and_Navigates_to_Shipping_Page() throws Throwable {
	  l.executeScript("window.scrollBy(0,400)"); 
		Adress a=new Adress(driver);
	    a.getAdress().click();
	}

	@When("^User Click The Terms Of Service Check Button$")
	public void user_Click_The_Terms_Of_Service_Check_Button() throws Throwable {
				Adress a=new Adress(driver);
	    a.getCheckbox().click();}

	@Then("^User Click the Checkout Button and Page Navigate to Payement Page$")
	public void user_Click_the_Checkout_Button_and_Page_Navigate_to_Payement_Page() throws Throwable { 
		Adress a=new Adress(driver);
	    a.getCheckout().click();
	}

	@Then("^User Click The Pay by Check and Page Navigate to Order Summary Page$")
	public void user_Click_The_Pay_by_Check_and_Page_Navigate_to_Order_Summary_Page() throws Throwable {
	   PageFactory.initElements(driver, Payment.class);
	   Payment.modeof.click();
	}

	@Then("^User Click the confrim  Button and page navigate to Order confirmation and message is displayed$")
	public void user_Click_the_confrim_Button_and_page_navigate_to_Order_confirmation_and_message_is_displayed() throws Throwable {
	    Payment.confrim.click();
	    System.out.println(driver.getTitle());
	}


}
