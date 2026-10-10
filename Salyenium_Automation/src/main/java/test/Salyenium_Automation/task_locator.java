package test.Salyenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_locator {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Rohan Dipak Mali");
		driver.findElement(By.xpath("//input[@placeholder='Enter EMail' and @type='text']")).sendKeys("tejasmali4005@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Phone' or @id='phone']")).sendKeys("9028194005");
		driver.findElement(By.xpath("//textarea[contains(@class,'form-control')]")).sendKeys("pune,shivajinagar");
		driver.findElement(By.xpath("//input[@name='gender' and @value='male']")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
