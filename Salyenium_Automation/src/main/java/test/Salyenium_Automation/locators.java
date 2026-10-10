package test.Salyenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String args[]) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.className("btn")).click();
		
		//verify new page URL contains practicetestautomation.com/logged-in-successfully/
		System.out.println("URL after login:"+driver.getCurrentUrl());
		
		//Verify new page contains expected text ('Congratulations' or 'successfully logged in')
		WebElement greet_text=driver.findElement(By.tagName("strong"));
		
		//Verify button Log out is displayed on the new page
		WebElement islogout=driver.findElement(By.linkText("Log out"));
		System.out.println("logout text:"+islogout.getText());
		
		WebElement logout_btn=driver.findElement(By.partialLinkText("Log"));
		System.out.println("Text of logout:"+logout_btn.getText());
		
		
		
	}

}
