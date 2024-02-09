package kaka_baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kaka_base_class {

	public  static WebDriver driver;
	public Properties prop;
	
	public void browserlaunch() throws IOException {
		
		FileInputStream input=new FileInputStream("src\\resources\\Properties\\kaka.properties");
		prop =new Properties();
		prop.load(input);
		
		if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		else if( prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			   
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		   }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	public void teardown() {
		driver.close();
		driver.quit();
		
	}
	
	
}
