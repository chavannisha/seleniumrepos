package first_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/droppable");
		 //WebElement on which drag and drop operation needs to be performed
		 WebElement from =driver.findElement(By.id("draggable"));
		 //WebElement to which the above object is dropped
		 WebElement to = driver.findElement(By.id("droppable"));
		 //Creating object of Actions class to build composite actions
		 Actions act = new Actions(driver);
		 //Performing the drag and drop action
		 act.dragAndDrop(from,to).build().perform();
		 System.out.println("successfull");


	}

}
