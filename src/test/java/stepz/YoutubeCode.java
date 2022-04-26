package stepz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class YoutubeCode {

	WebDriver driver;
	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "C:\\Users\\Rozy Kabir\\Desktop\\rozy\\chromedriver.exe";
	static String url = "https://www.youtube.com/";
	By Search = By.xpath("//input[@id='search']");
	By SearchClickXpath = By.xpath("//button[@id='search-icon-legacy']");
	
@Given("I want to opan YouTube")
public void i_want_to_opan_YouTube() throws InterruptedException {
System.setProperty(chromeDriver, driverLocation);
driver = new ChromeDriver();
driver.get(url);
Thread.sleep(1000);
}

@Given("I want to maximize window")
public void i_want_to_maximize_window() {
	driver.manage().window().maximize();
}


@Given("I want to search a video")
public void i_want_to_search_a_video() {
 driver.findElement(Search).sendKeys("nexxvali");
}

@Given("I click search button")
public void i_click_search_button() {
  driver.findElement(SearchClickXpath).click();
}

@Then("I close the browser")
public void i_close_the_browser() {
   driver.close();
}



}
