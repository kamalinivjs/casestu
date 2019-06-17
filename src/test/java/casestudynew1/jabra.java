package casestudynew1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class jabra {
	WebDriver  driver;

	@Given("I want to login")
	public void i_want_to_login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		   driver =new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("SignIn")).click();
			driver.findElement(By.name("userName")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("password456");
			driver.findElement(By.name("Login")).submit();
	}

	@Given("I want to select Category name {string}")
	public void i_want_to_select_Category_name(String string) {
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
		Actions act= new Actions(driver);
		  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
		  act.sendKeys(string).sendKeys(Keys.ENTER).build().perform();
	}

	@Given("I want to select subcategory name {string}")
	public void i_want_to_select_subcategory_name(String string) {
		Actions acttt=new Actions(driver);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
		  acttt.sendKeys(string).sendKeys(Keys.ENTER).build().perform();
	}

	@Then("I want to enter productname {string}")
	public void i_want_to_enter_productname(String string) {
		driver.findElement(By.xpath("//*[@id=\"prodid\"]")).sendKeys(string);
	}

	@Then("I want to enter price {string}")
	public void i_want_to_enter_price(String string) {
		driver.findElement(By.xpath("//*[@id=\"priceid\"]")).sendKeys(string);
	}

	@Then("I want to enter Quantity {string}")
	public void i_want_to_enter_Quantity(String string) {
		driver.findElement(By.xpath("//*[@id=\"quantityid\"]")).sendKeys(string);
	}

	@Then("I want to enter brand {string}")
	public void i_want_to_enter_brand(String string) {
		driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys(string);
	}

	@Then("I want to enter description {string}")
	public void i_want_to_enter_description(String string) {
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys(string);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
		driver.close();
	}
}
