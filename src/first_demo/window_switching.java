package first_demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_switching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// Load the website
		driver.get("https://accounts.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
		Set<String>s=driver.getWindowHandles();
		// Now iterate using Iterator
		java.util.Iterator<String> I1= s.iterator();
		String parent_window=I1.next();
		String child_window=I1.next();
		System.out.println(driver.switchTo().window(child_window).getTitle());
		System.out.println(driver.switchTo().window(parent_window).getTitle());
	}

}
