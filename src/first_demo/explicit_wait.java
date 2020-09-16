package first_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 WebDriverWait wait=new WebDriverWait(driver,5);
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 driver.findElement(By.id("divpaxinfo")).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_mainContent_ddl_Adult")));;
		 Select dropdown=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		 dropdown.selectByIndex(3);
		 

	}

}
