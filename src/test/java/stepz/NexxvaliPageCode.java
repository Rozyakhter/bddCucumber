package stepz;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NexxvaliPageCode {


	WebDriver driver;
	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "C:\\Users\\Rozy Kabir\\Desktop\\rozy\\chromedriver.exe";
	static String url = "https://nexxvali.com/";
	By Aboutus = By.xpath("//*[@id=\'menu-item-570\']/a");
	
@Given(": I open nexxvali website")
public void i_open_nexxvali_website() throws InterruptedException {
	System.setProperty(chromeDriver, driverLocation);
	driver = new ChromeDriver();
	driver.get(url);
	Thread.sleep(3000);
}
@Given(": I want to meximize the window")
public void i_want_to_meximize_the_window() {
	driver.manage().window().maximize();
}


@Given(": I verify homepage title")
public void i_verify_homepage_title() {
 String actTitle = driver.getTitle();
 String expTitle = "Nexxvali – QA Consultancy Services";
Assert.assertEquals(expTitle, actTitle);
}

@Given(": I click on aboutus button")
public void i_click_on_aboutus_button() {
 driver.findElement(Aboutus).click();
}

@Then(": I close the page")
public void i_close_the_page() {
   driver.close();


}
}
