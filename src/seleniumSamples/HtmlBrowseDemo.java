package seleniumSamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlBrowseDemo {

	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://html.com/input-type-file/");
		
		Alert alert=driver.switchTo().alert();
		
		alert.dismiss();
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\rajkumar\\Desktop\\Robi E1s.xlsx");
		
		
		
		
	}

}
