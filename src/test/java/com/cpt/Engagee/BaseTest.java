package com.cpt.Engagee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cpt.Engage.Pages.ApplicationLogin_page;

public class BaseTest {

	protected static WebDriver driver;

	public void LaunchBrowser() {
		switch ("chrome") {

		case "chrome":
			driver = new ChromeDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		}
	}

}
