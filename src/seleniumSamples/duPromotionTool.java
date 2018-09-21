package seleniumSamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class duPromotionTool {

	//Elements can be fetched with different methods like id,name,classname
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium webdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String promoURL="http://192.168.100.128:7070/view";
		
		driver.get(promoURL);
		
		driver.findElement(By.id("username")).sendKeys("du");
		driver.findElement(By.name("password")).sendKeys("du!@#");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//driver.findElement(By.id(u))
		
		driver.findElement(By.xpath("//td[@width='95%']//a[6]")).click();
		
		driver.findElement(By.xpath("//input[@value='Add Flash Promotion']")).click();
		
		//Use select classs to invoke a dropdown box
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='typeid']")));
		
		select.selectByVisibleText("Promotion");
		
		//driver.findElement(By.xpath("//select[@id='typeid']")).s

	}

}
