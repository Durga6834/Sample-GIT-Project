package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	
	public WebDriver driver;
	 public POM(WebDriver rdriver) {
		 driver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
@FindBy(id="email")
@CacheLookup
WebElement email;

@FindBy(id="pass")
@CacheLookup
WebElement pass;

@FindBy(name="login")
@CacheLookup
WebElement login;
	 public void setemail() {
		 email.clear();
		 email.sendKeys("kdurgarao13@gmail.com");
	 }
	 public void Setpwd() {
		 pass.clear();
		 pass.sendKeys("7989356834");
	 }
	 
	 
public void loginbutton() {
	login.click();
	
}
	 
}
