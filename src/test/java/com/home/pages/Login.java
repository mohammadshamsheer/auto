package com.home.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.home.tests.Base;

public class Login {
	
	public WebDriver ldriver;
	public WebElement fromTextBox, toTextBox, datePicker, searchButton, busButton;
	
	
	public Login(WebDriver driver) {
		ldriver = driver;
		fromTextBox = driver.findElement(By.id(Base.object_repo.get("fromTextBox")));
		
	}
	
	

}
