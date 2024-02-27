package jenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement nom = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	WebElement motPass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	nom.sendKeys("Admin");
	motPass.sendKeys("admin123");
	//btn.click();
	
	}
}
