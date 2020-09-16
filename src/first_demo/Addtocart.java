package first_demo;



import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Addtocart {
public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 String[] itemneed= {"Beans - 1 Kg","Tomato - 1 Kg","Beetroot - 1 Kg"};
driver.get("https://rahulshettyacademy.com/seleniumPractise/");
Thread.sleep(3000);
int i=1;
List<WebElement> product=driver.findElements(By.xpath("//h4[@class='product-name']"));
for( i=1;i<product.size();i++)
{
String name=product.get(i).getText();
List itemsNeededList = Arrays.asList(itemneed);
int j=1;
if(itemsNeededList.contains(name))
{
j++;
driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
}
if(j==itemneed.length) {
break;
}
}
}
}


