package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class Steps {
	 static WebDriver driver;
	@Given("the user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\sreenivasan\\eclipse-workspace\\POM\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom");
	driver.findElement(By.xpath("(//a[text()=\"Add Customer\"])[1]")).click();
	}
	@When("the user fill in valid customer details")
	public void the_user_fill_in_valid_customer_details(DataTable customerDetails) {
		List<String> custmerDetailsList = customerDetails.asList(String.class);
		System.out.println(custmerDetailsList);
		driver.findElement(By.xpath("//Label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(custmerDetailsList.get(0));
		driver.findElement(By.id("lname")).sendKeys(custmerDetailsList.get(1));
		driver.findElement(By.id("email")).sendKeys(custmerDetailsList.get(2));
		driver.findElement(By.name("addr")).sendKeys(custmerDetailsList.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(custmerDetailsList.get(4));
	    
	}

	
	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("the user should see the custmer ID generated")
	public void the_user_should_see_the_custmer_ID_generated() {
		Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	    
	}



}
