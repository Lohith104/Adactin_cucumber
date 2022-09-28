package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base_class.Regular_methods;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature//",
glue = "com.adactin.stepdefinition",monochrome = true,
plugin = {"html:Report/Cucumber_report","pretty",
		"json:Report/cucumber_reports.jason",
		
	"com.cucumber.listener.ExtentCucumberFormatter:Report/Extendreport.html"	}
)


public class Ap_cucumPOM extends Regular_methods  {
	
	public static WebDriver driver;
@BeforeClass

public static  void browserlaunch() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\AdactinCucumber_new\\Driver\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
	driver =new ChromeDriver(); 
	driver.manage().window().maximize();
}
@AfterClass
public static void project_close() {
driver.close();

}
	
	
	
//"com.cucumber.listener.ExtentCucumberFormatter:Extentreport.html"
}
