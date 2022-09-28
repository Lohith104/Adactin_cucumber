package com.adactin.runner;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;





  @RunWith(Cucumber.class)
  @CucumberOptions(features = "src//test//java//com//adactin//feature//",
  glue = "com.adactin.stepdefinition")//instead of"//"    "."can also be used

public class Lohith_runner {
	
	public static WebDriver lohith;
	@BeforeClass
	public static void setUp() {//always use public static
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\AdactinCucumber_new\\Driver\\chromedriver_win32\\chromedriver.exe");
		 lohith =new ChromeDriver();
		
		 lohith.manage().window().maximize();
	}
	@AfterClass
	public static void tear() {
		lohith.close();

	}
	

}
