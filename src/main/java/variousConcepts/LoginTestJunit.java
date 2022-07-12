package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {

    WebDriver driver;

   
    @Before
	public  void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Judge\\Selenium_eclipse\\crm\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public  void loginTest() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Bank & Cash")).click();
		driver.findElement(By.partialLinkText("New Account")).click();
		driver.findElement(By.xpath("//*[@id=\"account\"]")).sendKeys("habijabi Account");
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("tomar Account");
		driver.findElement(By.xpath("//*[@id=\"balance\"]")).sendKeys("11000");
		driver.findElement(By.xpath("//*[@id=\"account_number\"]")).sendKeys("00000100000");
		driver.findElement(By.xpath("//*[@id=\"contact_person\"]")).sendKeys("Honolulu");
		driver.findElement(By.xpath("//*[@id=\"contact_phone\"]")).sendKeys("211190002046041353");
		driver.findElement(By.xpath("//*[@id=\"ib_url\"]")).sendKeys("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")).submit();
		
		Thread.sleep(7000);
	}
	
	@After
	public  void tearDown(){

		driver.close();
		driver.quit();
	}
}



