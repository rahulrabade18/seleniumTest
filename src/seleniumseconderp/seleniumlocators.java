package seleniumseconderp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumlocators {

	public static void main(String[] args) {
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Vasyerp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
		    driver.get("https://rahulshettyacademy.com/locatorspractice/");
		    driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		    driver.findElement(By.name("inputPassword")).sendKeys("Vasy@123");
		    driver.findElement(By.className("signInBtn")).click();
		    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		    driver.findElement(By.linkText("Forgot your password?")).click();
		    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ram");
		    driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("8999456765");
		    //driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("8999456765");
		    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("testing45@gmail.com");
		    driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		    //driver.findElement(By.cssSelector("//input[@type='text'][2]")).clear();
		    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("testing@vasyerp.com");
		    
		    
	}
}
