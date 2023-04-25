package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.POM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MercuryLogin 
{
	 POM p1; 
	
	public WebDriver driver ;
	@Given("Initilize browser")
	public void initilize_browser() {
	  driver= new ChromeDriver();
	  driver.get("http://facebook.com");
	  driver.manage().window().maximize();
	  p1=new POM(driver);
	}

	@When("user login")
	public void user_login() {
	// driver.findElement(By.id("email")).sendKeys("kdurgarao13@gmail.com");
	 //driver.findElement(By.id("pass")).sendKeys("7989356834");
	 p1.setemail();
	 p1.Setpwd();
	}

	@Then("successful login")
	public void successful_login() {
	  // driver.findElement(By.name("login")).click();
		p1.loginbutton();
	}
	
	

}
