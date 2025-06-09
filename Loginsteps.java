package Stepdef;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps extends utilities.common_methods {
	@Given("Login page is displayed")
	public void login_page_is_displayed () {
		launch_chrome("https://demowebshop.tricentis.com/");
		   System.out.println("The login page is displayed");		 
	}

	@When("enter valid username and password")
	public void enter_valid_username_and_password() {
		dr.findElement(By.xpath("//a[@href='/login']")).click();
		dr.findElement(By.id("Email")).sendKeys("nivix@gmail.com");
        dr.findElement(By.id("Password")).sendKeys("nivi@123");	
	    System.out.println("details entered");   
	}

	@When("enter login button")
	public void enter_login_button() {
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		System.out.println("logged in"); 
		  }

	@Then("Product page is displayed")
	public void product_page_is_displayed() {
		dr.findElement(By.xpath("//ul[@class='list']//a[@href='/books']")).click();
		System.out.println("login page is entered");
		
		dr.findElement(By.xpath("//div[@class='details']//a[@href='/fiction']")).click();
		
		dr.findElement(By.xpath("//input[@id='add-to-cart-button-45']")).click();

		dr.findElement(By.xpath("//a[@href='/cart']//span[@class='cart-label']")).click();
		dr.findElement(By.xpath("//div[@class='terms-of-service']//input[@id=\"termsofservice\"]")).click();
		
		dr.findElement(By.xpath("//button[@id='checkout']")).click();
	}
}
