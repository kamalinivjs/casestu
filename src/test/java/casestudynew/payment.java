package casestudynew;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class payment {
	WebDriver  driver;

	@Given("Alex wants to login as admin")
	public void alex_wants_to_login_as_admin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		   driver =new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("SignIn")).click();
			driver.findElement(By.name("userName")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("password456");
			driver.findElement(By.name("Login")).submit();
	}

	@And("he wants to add new product")
	public void he_wants_to_add_new_product() {
		 driver.findElement(By.cssSelector("body > main > div > div > div > div:nth-child(1) > button")).click();
		 Actions act= new Actions(driver);
		  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
		  act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
		  act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		    driver.findElement(By.name("prodname")).sendKeys("HP Laptop");
		    driver.findElement(By.name("pricename")).sendKeys("27000");
		    driver.findElement(By.name("Quantity")).sendKeys("10");
		    driver.findElement(By.name("Brand")).sendKeys("HP");
		    driver.findElement(By.name("description")).sendKeys("good quality");
			driver.findElement(By.name("Add Product")).click();
			driver.findElement(By.linkText("SignOut")).click();
	}

	@Then("successful payment of user")
	public void successful_payment_of_user() {
		 WebDriverWait wait=new WebDriverWait(driver,50);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#header > div:nth-child(1) > div > div > div.col-sm-8 > div > ul > li:nth-child(1) > a")));
		 driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.name("userName")).sendKeys("Lalitha");
		 driver.findElement(By.name("password")).sendKeys("password123");
		 driver.findElement(By.name("Login")).submit();
		 WebElement search=driver.findElement(By.name("products"));
			search.sendKeys("HeadPhone");
			driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
			driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
			driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")).click();
			driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
			driver.findElement(By.cssSelector("body > b > div > div > div.col-lg-6.col-md-6.col-sm-6.col-xs-12.col-md-push-6.col-sm-push-6 > div > div.panel-body > div:nth-child(4) > div > form:nth-child(2) > input")).click();
			  WebDriverWait wa=new WebDriverWait(driver,50);
				 wa.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#btn")));
				 driver.findElement(By.cssSelector("#swit > div:nth-child(2) > div > label > i")).click();
				 driver.findElement(By.id("btn")).click();
					driver.findElement(By.name("username")).sendKeys("Lalitha");
					 driver.findElement(By.name("password")).sendKeys("password123");
					 driver.findElement(By.cssSelector("input[type='submit']")).submit();
					 driver.close();
	}
}
