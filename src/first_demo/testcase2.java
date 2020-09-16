package first_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.google.com/");
		// Click on the search text box and send value
		driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");
		Thread.sleep(6000);
		// Click on the search button
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getCurrentUrl());

	}

}
