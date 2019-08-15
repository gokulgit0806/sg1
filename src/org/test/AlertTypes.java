package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTypes {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravinkumar\\eclipse-workspace\\Alert\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	driver.findElement(By.id("Textbox")).click();
	
//switching the alert 
	Thread.sleep(5000);
	Alert a = driver.switchTo().alert();
	
//simple alert
	//To print the text
	//String s = a.getText();
	//System.out.println(s);
	//ok button
	a.sendKeys("No");
	Thread.sleep(3000);
	a.dismiss();
	
	}
}