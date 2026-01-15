package com.Itvedant.TestNGpackages;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfter2 {
	WebDriver driver;
	
	@BeforeMethod
	  public void beforetest() 
	{
		driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
 
  
  
  @Test (priority=1)
  public void firstcry() 
  {
		driver.get("https://www.firstcry.com/");
		//System.out.println("Title: "+driver.getTitle());
  }
  
  
  @Test (priority=2)
  public void amazon() 
  {
	  driver.get("https://www.amazon.in/");
	//  System.out.println("Title: "+driver.getTitle());
  }
 

  @Test (priority=3)
  public void bigbasket() 
  {
		driver.get("https://www.bigbasket.com/");
		//System.out.println("Title: "+driver.getTitle());

  }
  
  @Test (priority=4)
  public void mamaEarth() 
  {
		driver.get("https://www.mamaearth.in/");
	//	System.out.println("Title: "+driver.getTitle());
  }
  
  @AfterMethod
	 public void Afterprint() 
  {
	  System.out.println("Title: "+driver.getTitle());
	  
  }
  
  @AfterTest
	 public void closedriver() 
{
	 
	  driver.close();
}
  
}

