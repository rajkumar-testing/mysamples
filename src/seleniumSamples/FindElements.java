package seleniumSamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://192.168.100.59");
		
		List<WebElement> ll = driver.findElements(By.tagName("a"));
		
		int linkCount= ll.size();
		
		System.out.println("No of Links in url is : " +linkCount);
		
		for (int i=0;i<linkCount;i++){
			System.out.println(ll.get(i).getText());
		}
		
		
	}

}
