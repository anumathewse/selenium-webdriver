package com.am.seleniumbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIndro 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","/Users/cijojose/_Workspace/chromedriver");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}
}