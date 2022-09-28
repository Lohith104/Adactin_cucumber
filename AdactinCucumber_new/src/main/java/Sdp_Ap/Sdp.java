package Sdp_Ap;

import org.openqa.selenium.WebDriver;

import Automation_practice.Address;
import Automation_practice.My_Account;
import Automation_practice.My_store;
import Automation_practice.Payment_pay;
import Automation_practice.Shipping;
import Automation_practice.Sign_page;
import Automation_practice.Summary;
import Base_class.Payment;

public class Sdp {
	public WebDriver driver;
	
	private Sign_page lp;
	private My_Account ac;
	private My_store store;
	private Summary sum;
	private Address adres;
	private Shipping ship;
	private Payment_pay pay;

	public Payment_pay getPay() {
		pay=new Payment_pay(driver);
		return pay;
	}
	public Shipping getShip() {
		ship=new Shipping(driver);
		return ship;
	}
	public Address getAdres() {
		adres=new Address(driver);
		return adres;
	}
	public Summary getSum() {
		sum=new Summary(driver);
		return sum;
	}
	public My_store getStore() {
		store=new My_store(driver);
		return store;
	}
	public My_Account getAc() {
		 ac=new My_Account(driver);
		return ac;
	}
	public Sdp(WebDriver driver2) {
		this. driver=driver2;
	}
	public Sign_page getLp() {
		 lp=new Sign_page(driver);
		return lp;
	}

}
