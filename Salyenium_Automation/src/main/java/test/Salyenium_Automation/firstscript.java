package test.Salyenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstscript {
	public static void main(String args []) throws Throwable {
		//1.set the properties of webdriver 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Salyenium_Automation\\Driverresorces\\chromedriver.exe");
		System.out.println("1.webdriver configuration done!");
		
		//2.Create the object of chromedriver/intialize chromedriver
		ChromeDriver driver=new ChromeDriver();
		System.out.println("2.Initialize ChromeDriver");

	driver.get("https://www.bmw.in/en/index.html");
	Thread.sleep(1000);
	
	//navigate webapp
	driver.navigate().to("https://www.ferrari.com/en-IN");
	Thread.sleep(1000);
	
	//navigate back
	driver.navigate().back();
	Thread.sleep(1000);
	
	//navigate forward
	driver.navigate().forward();
	Thread.sleep(1000);
	
	//refresh page
	driver.navigate().refresh();
	Thread.sleep(1000);
	
	
	driver.close();
	
}
}
