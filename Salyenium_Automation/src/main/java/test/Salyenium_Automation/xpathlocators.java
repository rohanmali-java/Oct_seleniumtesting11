package test.Salyenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocators {
	public static void main(String args[]) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/register");
		
		//1.xpath://tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rohan");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Mali");
		
		//2.xpath://parenttagname/childtagname
		//driver.findElement(By.xpath("//div/input")).sendKeys("Rohan@4005");
		
		//3.xpath://tagname[@attribute='value' and @attribute='value']
		driver.findElement(By.xpath("//input[@type='text' and @id='userName']")).sendKeys("Rohan11");
		
		driver.findElement(By.xpath("//input[@type='password' and @id='password']")).sendKeys("Rohan@4005");
		
		driver.findElement(By.xpath("//button[@type='button' and @id='register']")).click();
	}

}
