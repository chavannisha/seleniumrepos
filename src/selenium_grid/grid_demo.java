package selenium_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid_demo {

		//protected ThreadLocal<RemoteWebDriver> threadDriver = null;
		public static void main(String[] args) throws MalformedURLException {
			
		WebDriver driver;
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
	
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		
		
		
		}
}	
		
		
		
		
		
		
		
		
		
		/*java
		-Dwebdrive.chrome.driver="C:\\Users\\Amit\\Desktop\\seide\\abc\\chromedriver.exe"
		-jar selenium-server-standalone-3.141.59.jar -role webdriver -hub
		http://localhost:4444/grid/register -port 5566*/


	
