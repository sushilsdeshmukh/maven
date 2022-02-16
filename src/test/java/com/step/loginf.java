
package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class  loginf {
 public static WebDriver d;

@Given("^user navigate to facebook page$")
public void user_navigate_to_facebook_page() throws Throwable {
      WebDriverManager.chromedriver().setup(); 
      d= new ChromeDriver();
      d.manage().window().maximize();
      d.get("https://www.facebook.com/");
     
}

@When("^user entered valid username$")
public void user_entered_valid_username() throws Throwable {
	WebElement user_id=d.findElement(By.id("email"));
	user_id.sendKeys("abcd12@gmail.com");
	Thread.sleep(4000); 
}

@When("^user entered valid password$")
public void user_entered_valid_password() throws Throwable {
	WebElement password=d.findElement(By.id("pass"));
	password.sendKeys("abcd12345");
	Thread.sleep(4000); 
    
}

@Then("^click on login page$")
public void click_on_login_page() throws Throwable {
	WebElement loginb=d.findElement(By.xpath("//button[@value='1']"));
	loginb.click();
	Thread.sleep(4000); 
    
}
@When("^user entered  username  \"([^\"]*)\"$")
public void user_entered_username(String uname) throws Throwable {
	WebElement user_id=d.findElement(By.id("email"));
	user_id.sendKeys(uname);
	Thread.sleep(4000); 
}

@When("^user entered  password  \"([^\"]*)\"$")
public void user_entered_password(String pass) throws Throwable {
	WebElement password=d.findElement(By.id("pass"));
	password.sendKeys("pass");
	Thread.sleep(4000); 
}

}
