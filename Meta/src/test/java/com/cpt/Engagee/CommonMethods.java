package com.cpt.Engagee;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.awt.*;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.SocketException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseTest {

	Actions a;
	WebDriver webDriverWait;
	By Userannotheraccount = By.xpath("//div[text()='Use another account']");
	By EnterSignin = By.xpath("//input[@type='email']");
	By Next = By.xpath("//input[@type='submit']");
	By EnterPassword = By.xpath("//input[@type='password']");
	By Signin = By.xpath("//input[@type='submit']");
	By Login = By.xpath("//input[@id='idSIButton9']");
	By No = By.xpath("(//div[@class='inline-block button-item ext-button-item'])[1]//input");
	// By DisplayName = By.xpath("//div//input[@name='DisplayName'] [1]");

	public void LaunchUrl(String url) {
		driver.get(url);
	}

	public void maxWindow() {

		driver.manage().window().maximize();
	}

	public void WaitAction() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void WaitMore() {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void EnterSignin(String string) {

		a = new Actions(driver);
		a.sendKeys(string).perform();
	}

	public void ClickNext() {

		WebElement element = driver.findElement(Next);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

	}

	public void EnterPassword(String Password) throws InterruptedException {

		WebElement element = driver.findElement(EnterPassword);
		a.sendKeys(Password).perform();
		WaitAction();

	}

	public void LoginClick() throws InterruptedException {

		WebElement login = driver.findElement(Login);
		// WebElement element = driver.findElement(Log_In);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", login);
		WaitAction();

	}

	public void ClickNo() {
		WebElement clickNo = driver.findElement(No);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clickNo);

	}

	public void UseAnotherAccount() {
		WebElement clickanotheracc = driver.findElement(Userannotheraccount);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clickanotheracc);

	}

	public void click(WebElement Webelement) {

		a.doubleClick().perform();

	}

	public void EraseText() {

		Robot r;
		try {
			r = new Robot();

			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_DELETE);
			r.keyRelease(KeyEvent.VK_DELETE);
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

	public void ScrollDown() {

		Actions actions = new Actions(driver);

		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		actions.sendKeys(Keys.END).build().perform();

	}

	public void ScrollUp() {

		Actions actions = new Actions(driver);

		actions.sendKeys(Keys.PAGE_UP).build().perform();
		WaitAction();

	}

	public void fileUpload() throws AWTException, InterruptedException {

		String filelocation = "C:\\Users\\sasidaran.s\\Downloads\\Uploadattachment.pdf";

		StringSelection selection = new StringSelection(filelocation);
		Thread.sleep(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Thread.sleep(8000);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

	}

	public void ReloadBrowser() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_F5);

	}

	public void WaitImp() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	public WebElement waitForElementToBeVisibleAndClickable(By webElement, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));

		return element;
	}
	
	public void closeBrowser() {
		
		driver.close();

	}

}
