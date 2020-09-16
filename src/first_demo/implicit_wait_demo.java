package first_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class implicit_wait_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 driver.findElement(By.id("divpaxinfo")).click();
		 Select dropdown=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		 dropdown.selectByIndex(3);
			 

	}

}
