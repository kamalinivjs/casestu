package casestudynew2;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class volley {
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
	public void i_want_to_select_subcategory_name(String string, io.cucumber.datatable.DataTable dt) {
		Actions acttt=new Actions(driver);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
		  acttt.sendKeys(string).sendKeys(Keys.ENTER).build().perform();
		  List<Map<String,String>> list=dt.asMaps(String.class, String.class);
		  for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).get("productname"));
				System.out.println(list.get(i).get("price"));
				System.out.println(list.get(i).get("Quantity"));
				System.out.println(list.get(i).get("brand"));
			}
			    
		  
		  
		  
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}

	@Given("I want to enter description {string}")
	public void i_want_to_enter_description(String string) {
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys(string);
		
	}

	@Then("I click on add product")
	public void i_click_on_add_product() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
		driver.close();
	}

}
