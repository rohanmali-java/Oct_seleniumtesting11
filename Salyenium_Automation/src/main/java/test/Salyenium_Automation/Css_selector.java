package test.Salyenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Css_selector {
	public static void main(String args[]) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//1.cssSelector=tagname[attribute='value']
		driver.findElement(By.cssSelector("input[placeholder='Enter Name']")).sendKeys("Rohan Dipak Mali");
		
		//2.cssSelector=tagname#idvalue
		driver.findElement(By.cssSelector("input#email")).sendKeys("tejasmali4005@gmail.com");
		
		//3.tagname.classname
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("near jm road, shivaji nagar,pune.");
		
		//4.
//		driver.findElement(By.xpath("//textarea[contains(@class,'form-control')]")).sendKeys("pune,shivajinagar");
//		driver.findElement(By.xpath("//input[@name='gender' and @value='male']")).click();
		
		Select sel=new Select(driver.findElement(By.id("country")));
	    
		sel.selectByIndex(3);
		
		Thread.sleep(2000);
		driver.close();
	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

}
