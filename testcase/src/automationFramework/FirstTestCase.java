package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	
		 
		public static void main(String[] args) throws InterruptedException {
			String exePath = "C:\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			
			// Create a new instance of the Chrome driver
			WebDriver driver = new ChromeDriver();
			
	        //Launch the Online Store Website
			driver.get("http://www.egiants.com");
	 
	        // Print a Log In message to the screen
	        System.out.println("Successfully opened the website www.Store.Demoqa.com");
	        driver.manage().window().maximize();
	 
			//Wait for 5 Sec
			Thread.sleep(5000);
			
	        // Close the driver
	        driver.quit();
	    }
	}



