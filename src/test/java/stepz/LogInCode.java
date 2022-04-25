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
	public void the_user_is_on_the_logIn_page() throws Exception {
		System.out.println("This is a test");
		System.setProperty(chromeDriver, driverLocation);
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
	}

	@Given("provides valid userID")
	public void provides_valid_userID() throws Exception {
		driver.findElement(loginIdXpath).sendKeys("Admin");
		Thread.sleep(1000);

	}
	
	@Given("user maximize the window")
	public void user_maximize_the_window() {
	    driver.manage().window().maximize();
	}

	@Given("provides valid password")
	public void provides_valid_password() throws Exception {
		driver.findElement(logInpsXpath).sendKeys("admin123");
		Thread.sleep(1000);


	}

	@Given("clicks on LogIn button")
	public void clicks_on_LogIn_button() throws Exception {
		driver.findElement(loginBtnXpath).click();
		Thread.sleep(3000);


	}

	@Then("user closes the browser")
	public void user_closes_the_browser() {
	   driver.close();
	}

}
