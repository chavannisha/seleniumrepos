package first_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
	String month="March";
	String year="2012";
	String date="4";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 Thread.sleep(8000);
		 driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		 Thread.sleep(8000);
		String text=driver.findElement(By.xpath("//*[@id='ui-datepicker-title']div/div")).getText();
		System.out.println(text);
		 

	}

}
