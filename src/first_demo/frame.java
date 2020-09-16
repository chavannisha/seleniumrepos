package first_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		Thread.sleep(8000);
		driver.switchTo().frame(0);
		driver.findElement(By.className("demo-frame")).click();
		
		WebElement from = driver.findElement(By.id("draggable"));
		Thread.sleep(8000);
		WebElement to = driver.findElement(By.id("droppable"));
		Thread.sleep(8000);
		
		//Creating object of Actions class to build composite actions
		Actions act = new Actions(driver);
		//Performing the drag and drop action
		act.dragAndDrop(from,to).build().perform();
		System.out.println("successfull");
		
		driver.switchTo().defaultContent();
		
	}

}
