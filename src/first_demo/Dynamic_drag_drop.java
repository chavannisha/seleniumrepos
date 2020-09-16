package first_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_drag_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/"); //URL in the browser
		driver.findElement(By.name("ctl00$mainContent$ddl_originStation1")).click();
		Thread.sleep(8000);
		driver.findElement(By.name("ctl00$mainContent$ddl_originStation1")).sendKeys("chennai");
		Thread.sleep(8000);
		driver.findElement(By.name("ctl00$mainContent$ddl_destinationStation1")).click();
		Thread.sleep(8000);
		driver.findElement(By.name("ctl00$mainContent$ddl_destinationStation1")).sendKeys("bhopal");
		((WebElement) driver).sendKeys(Keys.ENTER);
		driver.getTitle();	}
}