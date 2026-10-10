package test.Salyenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin_test {
	public static void main(String args[]) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://secure.facebook.com/login.php/");
		
		//findout the email textbox
		driver.findElement(By.id("email")).sendKeys("tej@gmail.com");
		
		//Enter password
		driver.findElement(By.id("password")).sendKeys("tejmana4005");
		
		//to click login button
		driver.findElement(By.id("login")).click();
	}

}
