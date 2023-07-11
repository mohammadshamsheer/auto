package com.home.tests;


import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Booking extends Base{

	public WebDriver driver;
		
	@BeforeTest
	public void setup(ITestResult result) {
		ExtentTest test = test_report.createTest(result.getMethod().getMethodName());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	
	@Test
	public void checkAvailability() {
		
		
	}
}
