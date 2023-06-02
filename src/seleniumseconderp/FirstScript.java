package seleniumseconderp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Vasyerp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		    driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("nmk");    
		    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		    
	}

}