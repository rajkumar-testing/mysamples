package seleniumSamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		// testcase is a reproduce steps with validation to actual and expected result.
		// steps to reproduce is the opening browser and entering the url.
		// Validation with Actual and expected result completes the automation testing. 
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium webdrivers\\chromedriver.exe"); //loading the driver
		driver=new ChromeDriver(); //launching the driver
		
		driver.get("http://www.google.com"); // entering the url
		
		String expectedPageTitle="Google";
		
		String currentPageTitle=driver.getTitle(); // getting the current page title from launched site.
		
		System.out.println(currentPageTitle);
		
		//Validating the Actual Vs Expected page Title
		if(expectedPageTitle.equals(currentPageTitle)){
			System.out.println("Testcase Passed...Correct Title displayed");
		}else{
			System.out.println("Testcase Failed... Incorrect Title");
		}
		
		String currentPageURL = driver.getCurrentUrl(); // to get current url
		
		System.out.println(currentPageURL);
		
		System.out.println(driver.getPageSource());
		
		// Quitting the browser
		driver.quit();
		
		//System.setProperty("webdriver.gecko.driver", "D:\\selenium webdrivers\\geckodriver.exe"); //
		//driver=new FirefoxDriver();
		
		//driver.get("http://naukri.com");

	}

}
