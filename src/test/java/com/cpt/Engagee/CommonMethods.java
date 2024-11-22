package com.cpt.Engagee;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseTest {
	

	Actions action;
	String name;
	String pass;
	WebDriver webDriverWait;

	public static WebDriverWait wait;
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

	public void EnterSignin(String username) throws IOException {

//		FileInputStream file = new FileInputStream("D:\\Project\\Engage-3.0\\src\\test\\resources\\cucumber.properties");
//		Properties p = new Properties();
//		p.load(file);
//		
//		 name = p.getProperty("username");
//		 pass = p.getProperty("password");

		action = new Actions(driver);
		action.sendKeys(username).perform();

	}

	public void ClickNext() {

		WebElement element = driver.findElement(Next);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

	}

	public void EnterPassword(String Password) throws InterruptedException {

		WebElement element = driver.findElement(EnterPassword);
		action.sendKeys(Password).perform();
		WaitAction();

	}

	public void LoginClick() throws InterruptedException {

		WebElement login = driver.findElement(Login);
		// WebElement element = driver.findElement(Log_In);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", login);

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

		action.doubleClick(Webelement).perform();

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

	public void clearText(By element) {

		WebElement textClear = driver.findElement(element);
		textClear.clear();
	}

	public void ScrollDown() {

		action = new Actions(driver);

		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.END).build().perform();

	}

	public void ScrollUp() {

		action = new Actions(driver);

		action.sendKeys(Keys.PAGE_UP).build().perform();
		WaitAction();

	}

	public void fileUpload() throws AWTException, InterruptedException {

		String filelocation = "C:\\Users\\sasidaran.s\\Downloads\\Uploadattachment.pdf";

		StringSelection selection = new StringSelection(filelocation);
		Thread.sleep(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Thread.sleep(4000);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

		// Thread.sleep(2000);

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
		Duration timeout = Duration.ofSeconds(30);
		driver.manage().timeouts().implicitlyWait(timeout);
	}



	public void closeBrowser() {

		driver.quit();

	}

	public void fileUploadInvalid() throws AWTException, InterruptedException {

		String filelocation = "C:\\Users\\sasidaran.s\\Downloads\\Overall_Issues.xlsx";

		StringSelection selection = new StringSelection(filelocation);
		Thread.sleep(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Thread.sleep(8000);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

	}

	public void clear(WebElement ref) {
		ref.clear();
	}

	public void WaitForElementVisibility(By element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
	}

	public void WaitForElementTobeClickable(By element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void ScrollDown(By element) {
		WebElement ls = driver.findElement(element);
		ls.sendKeys(Keys.PAGE_DOWN);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void Scrollup(By element) {
		WebElement ls = driver.findElement(element);
		ls.sendKeys(Keys.PAGE_UP);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> getData() throws IOException {

		ArrayList<String> a = new ArrayList<String>();
		FileInputStream file = new FileInputStream("C:\\Users\\sasidaran.s\\Desktop\\Book1.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		int numberOfSheets = workbook.getNumberOfSheets();

		for (int i = 0; i < numberOfSheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("Test")) {

				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> cell = firstrow.cellIterator();

				int k = 0;
				int coloumn = 0;

				// System.out.println(coloumn);

				while (rows.hasNext()) {

					Row row = rows.next();
					if (row.getCell(coloumn).getStringCellValue().equalsIgnoreCase("Southern Europe")) {

						Iterator<Cell> cell2 = row.cellIterator();
						while (cell2.hasNext()) {

							a.add(cell2.next().getStringCellValue());

						}

					}

				}

			}

		}
		return a;

	}

	public void takeScreenshot() {

		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {

			File destinationFile = new File("D:\\Project\\Engage-3.0\\ScreenShot.png");

			FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println("Screenshot saved successfully!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Failed to save screenshot: " + e.getMessage());

		}

	}

	public void downloadLetter(By element) {
		WebElement download = driver.findElement(element);

	}

	public void getExcelSheet() throws FileNotFoundException {

		FileInputStream fin = new FileInputStream(name);
		FileOutputStream fo = new FileOutputStream(name);

		Workbook book = new XSSFWorkbook();

		Sheet sheet = book.getSheet(name);

		Row row = sheet.getRow(0);

		row.getCell(0);
		row.getPhysicalNumberOfCells();

	}
	
	

}
