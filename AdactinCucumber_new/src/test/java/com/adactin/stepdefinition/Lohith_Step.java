package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.runner.Lohith_runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class Lohith_Step {
	public static WebDriver lohith = Lohith_runner.lohith;
		
	@Given("^User Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
	   lohith.get("https://adactinhotelapp.com/"); 
	}

	@When("^User Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
	    WebElement hi = lohith.findElement(By.id("username"));
	    hi.sendKeys("Lohith09");
	}

	@When("^User Enter The User Password in Password Field$")
	public void user_Enter_The_User_Password_in_Password_Field() throws Throwable {
		lohith.findElement(By.id("password")).sendKeys("Lohith@104");
	    
	}

	@Then("^User Click the Login Button And Page Navigate's To Search Hotel Page$")
	public void user_Click_the_Login_Button_And_Page_Navigate_s_To_Search_Hotel_Page() throws Throwable {
	    
	}

	

	}




