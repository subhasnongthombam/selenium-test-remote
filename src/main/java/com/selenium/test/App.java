package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\snongtho\\software\\chromedriver-win64\\chromedriver.exe");
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        System.out.println("Script Executing...");
        	driver.get("https://www.facebook.com/");
        	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	driver.findElement(By.id("email")).sendKeys("subhasnongthombam@yahoo.co.in");
        	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	driver.findElement(By.id("pass")).sendKeys("Av9glp#ibm");
        	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	driver.findElement(By.className("_42ft")).click();
        	
        	 driver.quit();
        	 
        	 System.out.println("Script Execution Completed...");
        
        //1.Open the browser and get to the url
//        driver.get("http://3.23.64.85:8080/addressbook-2.0/");
//        
//        //Enable wait of 2 seconds
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        
//        //Click	on new Contact button
//        driver.findElement(By.className("v-button")).click();
//        
//        //Locate First Name and enter
//        driver.findElement(By.id("gwt-uid-5")).sendKeys("Subhas");
//        
//        Thread.sleep(1000);
//        //Locate Last Name and enter
//        driver.findElement(By.id("gwt-uid-7")).sendKeys("Nongthombam");
//        Thread.sleep(1000);
//        
//        //Locate Phone and enter
//        driver.findElement(By.id("gwt-uid-9")).sendKeys("123456789");
//        Thread.sleep(1000);
//        
//        //Locate Email and enter
//        driver.findElement(By.id("gwt-uid-11")).sendKeys("test@test.com");
//        Thread.sleep(1000);
//        
//        //Locate Birth Date and enter
//        driver.findElement(By.id("gwt-uid-13")).sendKeys("2/8/24,");
//        Thread.sleep(1000);
//        
//        //Click save button and click
//        driver.findElement(By.className("v-button-primary")).click();
//        Thread.sleep(1000);
//        
//        driver.quit();
    }
    
}
