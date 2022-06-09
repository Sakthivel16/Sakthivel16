package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.Webinar;

public class THwebinar {
	static WebDriver driver;
	public static Webinar web;
	
	@Given("User is on webinar page")
	public void user_is_on_webinar_page() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("https://www.engg.twinhealth.com/webinar/");
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    
	}
    
	@When("user enter valid name and mobile number")
	public void user_enter_valid_name_and_mobile_number() {
		
		
		web= new Webinar(driver);
		web.enterName("sakthivel");
		web.enterMobileNum("8610362115");
	
	}

	@And("clicks on Register for webinar button")
	public void clicks_on_register_for_webinar_button() throws InterruptedException {
	    web.clickRegisterButton();
	    Thread.sleep(4000);
	}
    
	@Then("user enter valid Email and Choose an online session")
	public void user_enter_valid_email_and_choose_an_online_session() {
	   web.enterEmail("sakthivel@codewave.com");
	   web.chooseOnlineSession("18 Nov,Wednesday -6 PM");
	}

	@Then("^user enter invalid (.+) and (.+)$")
	public void user_enter_invalid_email_and_choose_an_online_session(String Email, String session) {
	   web.enterEmail(Email);
	   web.chooseOnlineSession(session);
	}
	@Then("^user enter invalid2 (.+) and (.+)$")
	public void user_enter_invalid2_email_and_choose_an_online_session(String Email, String session) {
	   web.enterEmail(Email);
	   web.chooseOnlineSession(session);
	}
    
   @And("click on Confirm")
	public void click_on_confirm()  {
		web.ConfirmButton();
	    driver.close();
	    System.out.println("User is Successfully Registered for Webinar");  
	     
	}
   
   @When("^user enter Invalid (.+) and (.+)$")
	public void user_enter_Invalid_name_and_mobile_number(String name, String mobilenumber) {
		
		web= new Webinar(driver);
		web.enterName(name);
		web.enterMobileNum(mobilenumber);
	
	}
   
   @When("^user enter Invalid2 (.+) and (.+)$")
	public void user_enter_Invalid2_name_and_mobile_number(String name, String mobilenumber) {
		
		web= new Webinar(driver);
		web.enterName(name);
		web.enterMobileNum(mobilenumber);
	
	}
	
	 @Then("user checking page1 error message")
	    public void user_checking_page1_error_message() throws Throwable {
		 Thread.sleep(4000);
		 driver.close();
		 System.out.println("User is successfully see the page1 error message");
	 }
	 
	 @Then("user checking page2 error message")
	    public void user_checking_page2_error_message() throws Throwable {
		 Thread.sleep(4000);
		 driver.close();
		 System.out.println("User is successfully see the page2 error message");
	 }
   
      ////poorna git

}
