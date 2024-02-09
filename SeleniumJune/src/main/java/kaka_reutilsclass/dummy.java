package kaka_reutilsclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import kaka_baseclass.Kaka_base_class;

public class dummy extends Kaka_base_class {
	public static Kaka_reutils_class call;

	public dummy(WebDriver driver) {
		this.driver = driver;
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		call = new Kaka_reutils_class(driver);

		call.browserlaunch();
		Thread.sleep(3000);
		WebElement usernameelement = driver.findElement(By.name("username"));
		call.Values(usernameelement, "Admin");
		WebElement passwordelement = driver.findElement(By.name("password"));
		call.Values(passwordelement, "admin123");
		call.screenshot();
		WebElement loginclickelement = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		call.doclick(loginclickelement);
		Thread.sleep(3000);
		WebElement scrolltoelement = driver.findElement(By.xpath("//span[text()='New York Sales Office']"));
		call.scrolldown(scrolltoelement);
		Thread.sleep(3000);
		
		call.teardown();

	}
}
