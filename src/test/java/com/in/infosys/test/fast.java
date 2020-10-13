package com.in.infosys.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fast {
	
    WebDriver driver;
	
    @BeforeTest
	public void Setup()
	{	
	System.setProperty("webdriver.chrome.driver", "E:\\all browser for selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.rediff.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
    @Test
    public void VerifyCreate()
    {
    	driver.findElement(By.xpath("//a[text()='Create Account']")).click();
    }
		
    @AfterTest
	public void Teardown()
	{
		driver.close();
	}

 }



