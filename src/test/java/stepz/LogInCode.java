package stepz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LogInCode {
	
	WebDriver driver;
	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "C:\\Users\\Rozy Kabir\\Desktop\\rozy\\chromedriver.exe";
	static String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
	By loginIdXpath = By.xpath("//input[@id='txtUsername']");
	By logInpsXpath = By.xpath("//input[@id='txtPassword']");
	By loginBtnXpath = By.xpath("//input[@id='btnLogin']");


	@Given("The user is on the logIn page")
	public void the_user_is_on_the_logIn_page() {
		System.out.println("This is a test");
		System.setProperty(chromeDriver, driverLocation);
		driver = new ChromeDriver();
		driver.get(url);
	}

	@Given("provides valid userID")
	public void provides_valid_userID() {

	}

	@Given("provides valid password")
	public void provides_valid_password() {

	}

	@Given("clicks on LogIn button")
	public void clicks_on_LogIn_button() {

	}

	@Then("user should be able to logIn")
	public void user_should_be_able_to_logIn() {

	}

}
