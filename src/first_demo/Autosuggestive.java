package first_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser
				Thread.sleep(2000);
				WebElement source=driver.findElement(By.id("autosuggest"));
				Thread.sleep(2000);
				source.clear();
				source.sendKeys("ind");
				
				
				Thread.sleep(2000);
				source.sendKeys(Keys.ARROW_DOWN);
				source.sendKeys(Keys.ARROW_DOWN);
				source.sendKeys(Keys.ENTER);
	}

}
