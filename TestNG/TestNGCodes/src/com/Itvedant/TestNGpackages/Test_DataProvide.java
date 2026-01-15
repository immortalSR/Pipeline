package com.Itvedant.TestNGpackages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Test_DataProvide {

	WebDriver driver;
	 
	 
	 @BeforeTest
	    public void beforeTest() {
	    	driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    }

	    
	    @DataProvider
	    public Object[][] getLoginData() {

	        return new Object[][] {
	        	
	            new Object[] {"adven", "adven123"},
	            new Object[] {"bryan", "bryan123"},
	            new Object[] {"charles", "charles123"},
	            new Object[] {"dolly", "dolly123"},
	            new Object[]  {"Admin", "admin123"}
	        };
	    }
	    
	    
	    @Test(dataProvider = "getLoginData")
	    public void login(String un, String ps) throws InterruptedException {

	        driver.findElement(By.name("username")).sendKeys(un);
	        driver.findElement(By.name("password")).sendKeys(ps);
	        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	Thread.sleep(3000);
	    }

	    
	    @AfterMethod
	    public void logout() {
	        if (driver.getCurrentUrl().contains("dashboard")) {

	         
	        	
	            System.out.println("Test case pass");
	        }
	        else {
	            System.out.println("Test case fail");
	        }
	    }
	    
	    
	 @AfterTest
	 public void afterTest() {
		 driver.close();
	 }
	    
	    
	   
	    
	}

	
