package com.abc.magento;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magento {

	public static void main(String[] args) throws IOException {
	FileInputStream fis	= new FileInputStream("C:\\Users\\HP ENVY\\Desktop\\Feb\\DataDrivenFramework\\src\\com\\abc\\utilities\\DataDriven.properties");
    Properties p = new Properties();
    p.load(fis);
    
    String nurl = p.getProperty("url");    
    String nemail = p.getProperty("email");
    String npass = p.getProperty("pass");
    
   ChromeDriver driver= new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   driver.get(nurl);
   
   driver.findElement(By.linkText("My Account")).click();
   driver.findElement(By.id("email")).sendKeys(nemail);
   driver.findElement(By.id("pass")).sendKeys(npass);
   driver.findElement(By.id("send2")).click();
   driver.findElement(By.linkText("Log Out")).click();
   driver.quit();
    
    
    
	}

}
