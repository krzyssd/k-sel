package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com/");
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(6);
		s.selectByVisibleText("5 Adults");
		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//WebElement a = driver.findElement(By.xpath("//a[@value = 'GOI']"));
		//a.click();
		//driver.findElement(By.xpath("(//a[@value = 'DEL'])[2]")).click();
		// isSelected  
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
		
		driver.close();
		
		
		
	}

}
