package practiceTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test2 {
	public static	WebDriver driver;
	@Test
	public static void youtube() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("Dj rathan calmdown");
		driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
		
	}
}
