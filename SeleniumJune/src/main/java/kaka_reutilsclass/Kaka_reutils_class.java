package kaka_reutilsclass;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import kaka_baseclass.Kaka_base_class;

public class Kaka_reutils_class extends Kaka_base_class{
		
	
	public Kaka_reutils_class(WebDriver driver) {
		this.driver=driver;
	}
	
	//takesscreenshot interface, getscreenshotas method
	//file class
	//file utils, class copyfile method
	
	public void screenshot() throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target=new File("src\\resources\\screenshots\\file1.png");
		FileUtils.copyFile(source, target);

	}
	
	public void scrolldown(WebElement Element) {
		 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
}
	public void Values(WebElement element, String password) {
		
		element.sendKeys(password);
	}
	public void doclick(WebElement element) {
		
		element.click();;
	}
	
}
