package first_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/radiobutton.html");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("age2")).click();

	}

}
