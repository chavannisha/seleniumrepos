package first_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("nisha@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("nisha@123");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		
		}

	}

