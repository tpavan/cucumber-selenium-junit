package step_definitions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MetaSuiteBase {
	
	
	@Then("^check application is running$")
	public void check_application_is_running() throws Throwable {
	    System.out.println("Yes it is ruuning");
	}
	
	@Then("^\"(.*?)\" and \"(.*?)\" for account is$")
	public void and_for_account_is(String username1, String password2) throws Throwable {
	    System.out.println("Username is "+username1+" and password is "+password2  );
	}
	
	@Given("^User enters Password and Username$")
	public void user_enters_UserName_and_Password(DataTable table) throws Throwable {
		System.out.println("Username: " +table.cells(1));
		List<Map<String, String>> tab= table.asMaps(String.class, String.class);
		Iterator<Map<String, String>> it= tab.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	@Then("^open application$")
	public void openApp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
	}
	 
	@When("^data read from  example table with \"(.*?)\"$")
	public void data_read_from_example_table_with_username(String username) throws Throwable {
	   System.out.println("Username: "+ username);
	}
	
	@Before("@BeforeFeature")
	public void before(){
		System.out.println("BEFORE");
	}
	
	@After("@AfterFeature")
	public void after(){
		System.out.println("AFTER");
	}
	
	@After
	public void afterEachScenario(){
		System.out.println("AFTER EACH SCENARIO");
	}
}
