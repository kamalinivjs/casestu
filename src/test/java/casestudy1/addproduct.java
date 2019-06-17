package casestudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addproduct {
	WebDriver  driver;

@Given("Alex wants to open chrome")
public void alex_wants_to_open_chrome() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	   driver =new ChromeDriver();
}

@Given("he wants to enter url")
public void he_wants_to_enter_url() {
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.manage().window().maximize();
}

@Given("he wants to click SignIn link")
public void he_wants_to_click_SignIn_link() {
	 driver.findElement(By.linkText("SignIn")).click();
}

@Given("he wants to enter his username")
public void he_wants_to_enter_his_username1() {
	driver.findElement(By.name("userName")).sendKeys("Admin");
}

@Given("he wants to enter his password")
public void he_wants_to_enter_his_password1() {
	driver.findElement(By.name("password")).sendKeys("password456");
}
@When("he clicks on login button")
public void he_clicks_on_login_button1() {
	driver.findElement(By.name("Login")).submit();
}

@Then("the Admin Home page is displayed")
public void the_Admin_Home_page_is_displayed() {
    driver.getTitle();
}

@Then("he clicks on Add new product")
public void he_clicks_on_Add_new_product() {
    driver.findElement(By.cssSelector("body > main > div > div > div > div:nth-child(1) > button > h4")).click();
}

@Then("he fill all the mandatory details")
public void he_fill_all_the_mandatory_details() {
    driver.findElement(By.cssSelector("#categorydropid")).click();
    driver.findElement(By.cssSelector("#subcategorydropid")).click();
    driver.findElement(By.name("prodname")).sendKeys("HP Laptop");
    driver.findElement(By.name("pricename")).sendKeys("27000");
    driver.findElement(By.name("Quantity")).sendKeys("10");
    driver.findElement(By.name("Brand")).sendKeys("HP");
    driver.findElement(By.name("description")).sendKeys("good quality");
    
}

@Then("he clicks on Add product button")
public void he_clicks_on_Add_product_button() {
	driver.findElement(By.name("Add Product")).click();
	driver.findElement(By.cssSelector("body > header > div > b > c:if > a:nth-child(2)")).click();
}

@Given("Larry wants to enter his username")
public void larry_wants_to_enter_his_username() {
	driver.findElement(By.linkText("SignIn")).click();
	driver.findElement(By.name("userName")).sendKeys("Lalitha");
	driver.findElement(By.name("password")).sendKeys("password123");
	driver.findElement(By.name("Login")).submit();
}

@Then("he wants to enter productname")
public void he_wants_to_enter_productname() {
	WebElement search=driver.findElement(By.name("products"));
	search.sendKeys("HeadPhone");
}

@Then("he clicks on find details button")
public void he_clicks_on_find_details_button() {
	driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
}

@Then("he clicks on add to cart button")
public void he_clicks_on_add_to_cart_button() {
	driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
}

@Then("he clicks cart{int} link")
public void he_clicks_cart_link(Integer int1) {
	driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")).click();
}

@Then("he clicks on checkout button")
public void he_clicks_on_checkout_button() {
	driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
}

@Then("he clicks on proceed to pay button")
public void he_clicks_on_proceed_to_pay_button() {
	driver.findElement(By.cssSelector("body > b > div > div > div.col-lg-6.col-md-6.col-sm-6.col-xs-12.col-md-push-6.col-sm-push-6 > div > div.panel-body > div:nth-child(4) > div > form:nth-child(2) > input")).click();
	  WebDriverWait wait=new WebDriverWait(driver,50);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#btn")));
}

@Then("he wants to select bank option")
public void he_wants_to_select_bank_option() {
    driver.findElement(By.cssSelector("#swit > div:nth-child(2) > div > label > i")).click();
}

@Then("he wants to enter his username")
public void he_wants_to_enter_his_username() {
	driver.findElement(By.id("btn")).click();
	driver.findElement(By.name("username")).sendKeys("Lalitha");
	
	 
}

@Then("he wants to enter his password")
public void he_wants_to_enter_his_password() {
	 driver.findElement(By.name("password")).sendKeys("password123");
}

@Then("he clicks on login button")
public void he_clicks_on_login_button() {
	driver.findElement(By.cssSelector("input[type='submit']")).submit();
}


}
