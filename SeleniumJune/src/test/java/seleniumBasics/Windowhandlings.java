package seleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandlings {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=Mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F04 (Opal Green, 64 GB)']"));
		
		String parentwindow=driver.getWindowHandle();
		ele.click();

		Set<String> allwindow=driver.getWindowHandles();
		
	System.out.println(allwindow);
		for(String Childwindow:allwindow )
		{
			
			driver.switchTo().window(Childwindow);

		}
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		
	}

}
