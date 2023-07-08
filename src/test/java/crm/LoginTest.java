package crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		//set System Property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj_s\\Selenium\\crm\\driver\\chromedriver.exe");
		//Chrome Object
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://techfios.com/billing/?ng=admin/");
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
		driver.close();
	}
}
