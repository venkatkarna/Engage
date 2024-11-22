package com.cpt.Engagee;
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseTest {
		
		protected static WebDriver driver;
		
		public void LaunchBrowser() {
			
			switch ("chrome") {
			case "chrome":
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "edge":
				
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			}
		}
		
		
		
		
			
		}



