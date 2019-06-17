package cucumber7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testttt {
	 WebDriver  driver;
	@Given("I want to open chrome")
	public void i_want_to_open_chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	   driver =new ChromeDriver();
	}

	@Given("I want to enter url")
	public void i_want_to_enter_url() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
	}

	@Given("I want to click signIn link")
	public void i_want_to_click_signIn_link() {
		 driver.findElement(By.linkText("SignIn")).click();
		 
	}

	@Given("I want to enter username")
	public void i_want_to_enter_username() {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
	}

	@And("I want to enter password")
	public void i_want_to_enter_password() {
		driver.findElement(By.name("password")).sendKeys("password123");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		  driver.findElement(By.name("Login")).submit();
	}

	@Then("the Home page is displayed")
	public void the_Home_page_is_displayed() {
	   driver.getTitle();
	}

	@Given("I want to enter productname")
	public void i_want_to_enter_productname() {
		WebElement search=driver.findElement(By.name("products"));
		search.sendKeys("HeadPhone");
	}

	@Then("I click on Find details button")
	public void i_click_on_Find_details_button() {
		driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
	}

	@Then("the search page is displayed")
	public void the_search_page_is_displayed() {
		 driver.getTitle();
	}

	@Then("I click on Add to cart button")
	public void i_click_on_Add_to_cart_button() {
		driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
	}

	@Given("I want to cart{int} link")
	public void i_want_to_cart_link(Integer int1) {
		driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")).click();
		
	}

	@Then("the view cart page is displayed")
	public void the_view_cart_page_is_displayed() {
		 driver.getTitle();
	}

	@Then("I click on checkout button")
	public void i_click_on_checkout_button() {
		driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
	}

	@Then("the cart checkout page is displayed")
	public void the_cart_checkout_page_is_displayed() {
		 driver.getTitle();
	}

	@Then("I click on proceed to pay button")
	public void i_click_on_proceed_to_pay_button() {
		driver.findElement(By.cssSelector("body > b > div > div > div.col-lg-6.col-md-6.col-sm-6.col-xs-12.col-md-push-6.col-sm-push-6 > div > div.panel-body > div:nth-child(4) > div > form:nth-child(2) > input")).click();
		  WebDriverWait wait=new WebDriverWait(driver,50);
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#btn")));
	
	}

	@Then("Payment gateway page is displayed")
	public void payment_gateway_page_is_displayed() {
		 driver.getTitle();
	}

	@Given("I want to select bank option")
	public void i_want_to_select_bank_option() {
		driver.findElement(By.cssSelector("#swit > div:nth-child(10) > div > label > i"));
	}

	@Then("I click on continue")
	public void i_click_on_continue() {
		driver.findElement(By.id("btn")).click();
		driver.findElement(By.name("username")).sendKeys("Lalitha");
		 driver.findElement(By.name("password")).sendKeys("password123");
		 driver.findElement(By.cssSelector("input[type='submit']")).submit();
		 
	}
	
	@Then("I want to close the chrome")
	public void i_want_to_close_the_chrome() {
	   driver.close();
	}

}
