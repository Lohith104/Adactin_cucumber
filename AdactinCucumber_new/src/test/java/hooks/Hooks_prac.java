package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks_prac {
	@Before ("@Schooling")
	public void beforesenario() {
		System.out.println("student cleared 8th");

}
	@After("@Schooling")
	public void beforehighschool() {
		System.out.println("Enjoing public holidays");

	}
	@Before("@College")
	public void beforecollege() {
		System.out.println("Enjoying 12th holidays");

	}
	@After("@College")
	public void aftersenario() {
		System.out.println("Completed education");
	}
	
	//@Before(order = 1)





}
