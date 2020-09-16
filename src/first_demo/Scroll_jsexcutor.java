package first_demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_jsexcutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://quickyes.in/");
		 //Scroll down the webpage by 4500 pixels
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 //js.executeScript("scrollBy(0, 4500)");
		 js.executeScript("scrollBy(4500, 0)");
	}

}
