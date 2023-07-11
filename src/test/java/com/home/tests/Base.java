package com.home.tests;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.home.webutil.CalenderUtil;
import com.home.webutil.FileUtil;

public class Base {

	public ExtentReports test_report;
	public ExtentSparkReporter report;
	
	public static HashMap<String,String> object_repo;
	
	
	@BeforeSuite
	public void preSetup() {
		try {
			test_report = new ExtentReports();
			report = new ExtentSparkReporter(new File(System.getProperty("user.dir")+"\\reports\\report_"+CalenderUtil.getSystemDateTimeFormatted("dd/MMM/yy")));
			report.config().setTheme(Theme.DARK);
			report.config().setReportName("Automation Execution Results");
			test_report.attachReporter(report);
			FileUtil.readObjectRepository();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
