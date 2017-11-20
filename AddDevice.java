package robotemptestcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AddDevice
{
	  AndroidDriver driver;
	  Dimension size;
	@BeforeTest
	 public void setUp() throws MalformedURLException 		 
	 {					
	    DesiredCapabilities capabilities = new DesiredCapabilities();	
		  capabilities.setCapability("deviceName","Vivo Y51L");	  
		  capabilities.setCapability(CapabilityType.BROWSER_NAME,  "Android");	  
		  capabilities.setCapability(CapabilityType.VERSION, "5.0.2");	  
		  capabilities.setCapability("platformName", "Android");
		  capabilities.setCapability("appPackage", "com.unify.robo");	 
		  capabilities.setCapability("appActivity", "com.unify.robo.activities.SplashScreen");
		  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);	    
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 }
	 @Test
	 public void signin() throws InterruptedException	 
	 {
		 
			driver.findElement(By.id("com.unify.robo:id/btnContinue")).click();
			driver.findElement(By.id("com.unify.robo:id/et_usertxt")).sendKeys("Dass@gmail.com");//jn,das@gmail.com
			//driver.navigate().back();
			driver.findElement(By.id("com.unify.robo:id/et_pwd")).sendKeys("Jogi@123");
			driver.navigate().back();
			driver.findElement(By.id("com.unify.robo:id/signin_btn")).click();
			driver.findElement(By.id("com.unify.robo:id/linearLayoutBar2")).click();
			driver.findElement(By.id("com.unify.robo:id/add_txt")).click();
			//driver.findElement(By.id("com.unify.robo:id/add_device")).click();
			driver.findElement(By.id("com.unify.robo:id/skip_txt")).click();
			driver.findElement(By.id("com.unify.robo:id/et_product_code")).sendKeys(" ");//18420909035820
			driver.findElement(By.id("com.unify.robo:id/et_nameof_device")).sendKeys("mydevice");
			driver.navigate().back();
			driver.findElement(By.id("com.unify.robo:id/configure")).click();
			size = driver.manage().window().getSize();
			  System.out.println(size);
			  int starty = (int) (size.height * 0.50);
			  int endy = (int) (size.height * 0.50);
			  int startx = size.width / 2;
			  System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
			  driver.swipe(startx, starty, startx, endy, 3000);				  			 
			  driver.findElement(By.id("com.unify.robo:id/done")).click();
			 
			
			
			

}
}


