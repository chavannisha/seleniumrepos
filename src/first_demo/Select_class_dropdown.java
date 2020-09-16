package first_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
				//Using Select class for selecting value from dropdown
				Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
				//dropdown.selectByVisibleText("Database Testing");
				//dropdown.selectByIndex(2);
				dropdown.selectByValue("Performance");
				


	}

}
