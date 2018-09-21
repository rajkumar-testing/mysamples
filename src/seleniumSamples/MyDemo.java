package seleniumSamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyDemo {

		public static WebDriver driver;
		
		@Test
		public static void MyDemoCheck() throws InterruptedException 
		{
		System.setProperty ("webdriver.chrome.driver","D:\\selenium webdrivers\\chromedriver.exe" );
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		driver = new ChromeDriver();
		// launch Chrome and redirect it to the Base URL
		driver.get("http://192.168.100.59" );
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		//get the actual value of the title
		aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
			}
		}
}

