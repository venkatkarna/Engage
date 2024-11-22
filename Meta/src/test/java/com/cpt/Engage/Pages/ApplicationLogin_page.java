package com.cpt.Engage.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cpt.Engagee.BaseTest;

public class ApplicationLogin_page extends BaseTest {


	
	Actions a;
	
	
	
	
	By Userannotheraccount = By.xpath("//div[text()='Use another account']");
	By EnterSignin = By.xpath("//input[@type='email']");
	By Next = By.xpath("//input[@type='submit']");
	By EnterPassword = By.xpath("//input[@type='password']");
	By Signin = By.xpath("//input[@type='submit']");
	By Login = By.xpath("//input[@id='idSIButton9']");
	By No = By.xpath("//input[@value='No']");
	By Profile = By.xpath("//button//img");
	By Logout = By.xpath("//div//button[@class='btn p-btn ms-2']");
	By SearchFilter = By.xpath("//span[text()='Search or Filter']");
	By ClickIDdropdown = By.xpath("(//div[@class='ng-value-container'])[1]");
	By SelectIDValue = By.xpath("(//ng-dropdown-panel//div[@class='ng-option ng-star-inserted'])[1]");
	By Search = By.xpath("//div//button[text()='Search']");
	By Clear = By.xpath("//div//button[text()='Clear']");
	By ValidateID = By.xpath("//tr//td[text()='2']");
	By Clicklettername = By.xpath("(//div[@class='ng-value-container'])[2]");
	By Selectlettername = By.xpath("//span[text()='2023 BRIAN FRENCH & ANN MARIE HARMON FRENCH Trust Tax Eng Letter']");
	By ValidateLettername = By.xpath("(//tr//td[text()='2023 BRIAN FRENCH & ANN MARIE HARMON FRENCH Trust Tax Eng Letter']) [1]");
	By Clickoffice = By.xpath("(//div[@class='ng-value-container'])[3]");
	By Selectoffice = By.xpath("(//ng-dropdown-panel//div[@class='ng-option ng-star-inserted'])[1]");
	By ValidateOffice = By.xpath("//div[@class='engagement-letter bg-white px-4 py-3 rounded']//div[@class='p-datatable-scrollable-view']//div[@class='p-datatable-scrollable-body ng-star-inserted']//tr[1]//td[4]");
	By Clicktaxyear = By.xpath("(//div[@class='ng-value-container'])[4]");
	By Selecttaxyear = By.xpath("//ng-dropdown-panel//span[text()='2023']");
	By Validatetaxyear = By.xpath("//tbody//tr//td[text()='2023 ']");
	By Clicktemplatename = By.xpath("(//div[@class='ng-value-container'])[5]");
	By Selecttemplatename = By.xpath("//ng-dropdown-panel//div//span[text()='Trust Tax Eng Letter']");
	By Validatetemplatename = By.xpath("(//tbody//tr//td[text()='Trust Tax Eng Letter'])[1]");
	By Clickclientid = By.xpath("(//div[@class='ng-input'])[6]//input");
	By Selectclientid = By.xpath("//div//span[text()='23446 - Kamma Olesen']");
	By Validateclientid = By.xpath("//tr//td[text()='Kamma Olesen']");
	By Clickpartner = By.xpath("(//div[@class='ng-value-container'])[7]");
	By Selectpartner = By.xpath("//ng-dropdown-panel//div//span[text()='Albert, Eric']");
	By Validatepartner = By.xpath("//tbody//tr//td[text()='Albert, Eric']");
	By Clickdepartment = By.xpath("(//ng-select//div[@class='ng-value-container'])[8]");
	By Selectdepartment = By.xpath("//ng-dropdown-panel//div//span[text()='Tax']");
	By Clicktype = By.xpath("(//ng-select//div[@class='ng-value-container'])[9]");
	By Selecttype = By.xpath("//ng-dropdown-panel//div//span[text()='Trust']");
	By Clickadmin = By.xpath("(//ng-select//div[@class='ng-value-container'])[10]");
	By Selectadmin = By.xpath("//span[text()='HariVignesh']");
	By Validateadmin = By.xpath("//tbody//tr//td[text()='HariVignesh']");
	By Clickstatus = By.xpath("//ng-select[@formcontrolname='Status']");
	By Selectstatus = By.xpath("//ng-dropdown-panel//div//span[text()='Completed']");
	By Validatestatus = By.xpath("//div[@class='engagement-letter bg-white px-4 py-3 rounded']//div[@class='p-datatable-scrollable-view']//div[@class='p-datatable-scrollable-body ng-star-inserted']//tr[1]//td[10]");
	By AllLetters = By.xpath("//ul[@id='pills-tab']//li[2]//button");
	By SortBatchID = By.xpath("(//thead[@class='p-datatable-thead']) [1] //th[text()='Batch ID']");
	By SortLetterID = By.xpath("//thead//th[text()='Letter ID']");
	By SortLetterName = By.xpath("//thead//th[text()='Letter Name']");
	By SortOffice = By.xpath("//thead//th[text()='Office']");
	By SortYear = By.xpath("//thead//th[text()='Year']");
	By SortTemplateName = By.xpath("//thead//th[text()='Template Name']");
	By SortClientName = By.xpath("//thead//th[text()='Client Name']");
	By SortPartner = By.xpath("//thead//th[text()='Partner (PIC)']"); //thead//th[text()=' Partner (PIC)']
	By SortAdmin = By.xpath("//thead//th[text()='Admin']");
	By SortStatus = By.xpath("//thead//th[text()='Status']");
	By ExportDashboard = By.xpath("//div[@class='d-flex align-items-center justify-content-between flex-wrap excel-btn']//button");
	By NextPage = By.xpath("//span[@class='p-paginator-icon pi pi-angle-right']");
	By LastPage = By.xpath("//span[@class='p-paginator-icon pi pi-angle-double-right']");
	By PreviousPage = By.xpath("//span[@class='p-paginator-icon pi pi-angle-left']");
	By ClickMyLetter = By.xpath("//button[text()='My Letters']");
	By BulkBatchID = By.xpath("(//input[@class='p-column-filter p-inputtext p-component']) [1]");
	By BulkLetterGeneration = By.xpath("(//ul[@id='pills-tab']//button)[3]");
	By BulkAdmin = By.xpath("(//tr[@class='ng-star-inserted']//th//input)[2]");
	By Hamburger = By.xpath("//a[@class='toggle-sidebar']");
	By BulkPartner = By.xpath("(//tr[@class='ng-star-inserted']//th//input)[3]");
	By BulkTemplateName = By.xpath("(//tr[@class='ng-star-inserted']//th//input)[4]");
	By BulkNoofLetters = By.xpath("(//tr[@class='ng-star-inserted']//th//input)[5]");
	By BulkStatus = By.xpath("(//tr[@class='ng-star-inserted']//th//input)[7]");
	//By SortBatchID = By.xpath("(//thead[@class='p-datatable-thead']) [1] //th[text()='Batch ID ']");
	By SortNoofLetters = By.xpath("(//thead[@class='p-datatable-thead']) [1] //th[text()='No of Letters']");
	By SortLastUpdated = By.xpath("(//thead[@class='p-datatable-thead']) [1] //th[text()='Last Updated On']");
	
	
	
	
	public void LaunchUrl(String url) {
		driver.get(url);
	}

	public void WaitAction() throws InterruptedException {
		Thread.sleep(5000);

	}

	public void WaitMore() throws InterruptedException {
		Thread.sleep(15000);
	}

	public void EnterSignin(String EnterSignin) throws InterruptedException {
		a = new Actions(driver);
		a.sendKeys(EnterSignin).perform();
		WaitAction();
	}

	public void ClickNext() throws InterruptedException {

		WebElement btnNext = driver.findElement(Next);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnNext);
		WaitAction();

	}

	public void EnterPassword(String Password) throws InterruptedException {

		WebElement element = driver.findElement(EnterPassword);
		a.sendKeys(Password).perform();
		WaitAction();

	}

	public void LoginClick() throws InterruptedException {

		WebElement btnlogin = driver.findElement(Login);
		// WebElement element = driver.findElement(Log_In);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnlogin);
		WaitAction();

	}

	public void ClickNo() throws InterruptedException {
		WebElement btnNo = driver.findElement(No);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnNo);
		WaitAction();

	}

	public void UseAnotherAccount() throws InterruptedException {
		WebElement clickanotheracc = driver.findElement(Userannotheraccount);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clickanotheracc);
		WaitAction();
	}

	public void ClickProfile() throws InterruptedException {

		WaitAction();
		WebElement btnProfile = driver.findElement(Profile);
		btnProfile.click();

	}

	public void ClickYes() throws InterruptedException {

		WaitAction();
		WebElement btnYes = driver.findElement(Logout);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnYes);

	}

	public void clickSearchFilter() throws InterruptedException {

		WaitAction();
		WebElement clickSearch = driver.findElement(SearchFilter);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clickSearch);

	}

	public void verifyDashboard() {

		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		if (Url.contains("engagementletterdashboard")) {
			System.out.println("user landed on dashboard page");
		} else {
			System.out.println("User not in dashboard page");

		}

	}

	public void ClickIDdropdown() throws InterruptedException {

		WaitAction();
		WebElement IdDropdown = driver.findElement(ClickIDdropdown);
		IdDropdown.click();
	}

	public void ClickIdValue() throws InterruptedException {

		WaitAction();
		WebElement idValue = driver.findElement(SelectIDValue);
		idValue.click();

	}

	public void ClickSearch() {

		WebElement btnSearch = driver.findElement(Search);
		btnSearch.click();

	}

	public void ClickClear() {

		WebElement btnClear = driver.findElement(Clear);
		btnClear.click();

	}

	public void validationID() {

		WebElement valueID = driver.findElement(ValidateID);
		String id = valueID.getText();
		System.out.println(id);

		if (id.equals(valueID.getText())) {

			System.out.println("True");
		} else {
			System.out.println("False");

		}
	}

	public void ClickLetterName() {

		WebElement letterName = driver.findElement(Clicklettername);
		letterName.click();

	}

	public void SelectLetterName() {

		WebElement selectLetter = driver.findElement(Selectlettername);
		selectLetter.click();

	}

	public void ValidateLetterName() {

		WebElement valueLetterName = driver.findElement(ValidateLettername);
		String name = valueLetterName.getText();
		System.out.println(name);

		if (name.endsWith(valueLetterName.getText())) {

			System.out.println("True");
		} else {
			System.out.println("False");

		}
	}

	public void ClickOffice() {

		WebElement clickOffice = driver.findElement(Clickoffice);
		clickOffice.click();

	}

	public void SelectOffice() {

		WebElement selectOffice = driver.findElement(Selectoffice);
		selectOffice.click();

	}

	public void ValidateOffice() {

		WebElement valueOffice = driver.findElement(ValidateOffice);
		String office = valueOffice.getText();
		System.out.println(office);

		if (office.equals(valueOffice.getText())) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public void ClickTaxYear() {

		WebElement taxYear = driver.findElement(Clicktaxyear);
		taxYear.click();
	}

	public void SelectTaxYear() {

		WebElement selectTaxYear = driver.findElement(Selecttaxyear);
		selectTaxYear.click();
	}

	public void ValidateTaxYear() {

		WebElement validateTaxYear = driver.findElement(Validatetaxyear);
		String taxYear = validateTaxYear.getText();
		System.out.println(taxYear);

		if (taxYear.equals(validateTaxYear.getText())) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public void ClickTemplateName() {

		WebElement templateName = driver.findElement(Clicktemplatename);
		templateName.click();

	}

	public void SelectTemplateName() {

		WebElement selectTemplate = driver.findElement(Selecttemplatename);
		selectTemplate.click();
	}

	public void validateTemplateName() {

		WebElement validateTemplateName = driver.findElement(Validatetemplatename);
		String templateName = validateTemplateName.getText();
		System.out.println(templateName);

		if (templateName.equals(validateTemplateName.getText())) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public void ClickClientId() {

		WebElement clickClientID = driver.findElement(Clickclientid);
		clickClientID.click();
		try {
			WaitAction();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clickClientID.sendKeys("kamma");
		
	}

	public void SelectClientId() {

		WebElement selectClientId = driver.findElement(Selectclientid);
		selectClientId.click();
	
	}
	

	public void ValidateClientId() {

		WebElement validateClientID = driver.findElement(Validateclientid);
		String clientID = validateClientID.getText();
		System.out.println(clientID);

		if (clientID.equals(validateClientID.getText())) {
			System.out.println("True");

		} else {
			System.out.println("False");

		}

	}

	public void ClickPartner() {

		WebElement partnerClick = driver.findElement(Clickpartner);
		partnerClick.click();
	}

	public void SelectPartner() {

		WebElement sltPartner = driver.findElement(Selectpartner);
		sltPartner.click();
	}

	public void ValidatePartner() {

		WebElement validatePartner = driver.findElement(Validatepartner);
		String partnerName = validatePartner.getText();
		System.out.println(partnerName);

		if (partnerName.equals(validatePartner.getText())) {
			System.out.println("True");
		} else {
			System.out.println("False");

		}
	}

	public void ClickDepartment() {

		WebElement clickDepartment = driver.findElement(Clickdepartment);
		clickDepartment.click();
	}

	public void SelectDepartment() {

		WebElement sltDepartment = driver.findElement(Selectdepartment);
		sltDepartment.click();

	}

	public void ClickType() {

		WebElement clickType = driver.findElement(Clicktype);
		clickType.click();

	}

	public void SelectType() {

		WebElement sltType = driver.findElement(Selecttype);
		sltType.click();
	}

	public void ClickAdmin() {

		WebElement clkAdmin = driver.findElement(Clickadmin);
		clkAdmin.click();
	}

	public void SelectAdmin() {

		WebElement sltAdmin = driver.findElement(Selectadmin);
		sltAdmin.click();

	}

	public void ValidateAdmin() {

		WebElement valAdmin = driver.findElement(Validateadmin);
		String valueAdmin = valAdmin.getText();
		System.out.println(valueAdmin);

		if (valueAdmin.equals(valAdmin.getText())) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}

	}

	public void ClickStatus() {

		WebElement clkStatus = driver.findElement(Clickstatus);
		clkStatus.click();
	}

	public void SelectStatus() {

		WebElement sltStatus = driver.findElement(Selectstatus);
		sltStatus.click();

	}

	public void ValidateStatus() {

		WebElement valStatus = driver.findElement(Validatestatus);
		String valueStatus = valStatus.getText();
		System.out.println(valueStatus);

		if (valueStatus.equals(valStatus.getText())) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public void ClickAllLetters() {

		WebElement clkAllletters = driver.findElement(AllLetters);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clkAllletters);
		
		try {
			WaitAction();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void ClickSortBatchID() {

		WebElement clkSort = driver.findElement(SortBatchID);
		clkSort.click();
		try {
			WaitAction();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void ClickSortLetterID() {

		WebElement clkSort = driver.findElement(SortLetterID);
		clkSort.click();
		try {
			WaitAction();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void ClickSortLetterName() {

		WebElement clkSort = driver.findElement(SortLetterName);
		clkSort.click();

	}

	public void ClickSortOffice() {

		WebElement clkSort = driver.findElement(SortOffice);
		clkSort.click();
	}

	public void ClickSortYear() {

		WebElement clkSort = driver.findElement(SortYear);
		clkSort.click();

	}

	public void ClickSortTemplateName() {

		WebElement clkSort = driver.findElement(SortTemplateName);
		clkSort.click();

	}

	public void ClickSortClientName() {

		WebElement clkSort = driver.findElement(SortClientName);
		clkSort.click();

	}

	public void ClickSortPartner() {

		WebElement clkSort = driver.findElement(SortPartner);
		clkSort.click();

	}

	public void ClickSortAdmin() {

		WebElement clkSort = driver.findElement(SortAdmin);
		clkSort.click();

	}

	public void ClickSortStatus() {

		WebElement clkSort = driver.findElement(SortStatus);
		clkSort.click();

	}

	public void ClickExportDashboard() {

		WebElement clkExport = driver.findElement(ExportDashboard);
		clkExport.click();

	}

	public void ClickNextPage() {

		WebElement clkNextPage = driver.findElement(NextPage);
		clkNextPage.click();

	}

	public void ClickLastPage() {

		WebElement clkLastPage = driver.findElement(LastPage);
		clkLastPage.click();

	}

	public void navigateAllLetters() {

		WebElement clkAllLetters = driver.findElement(AllLetters);
		clkAllLetters.click();

	}

	public void previousPage() {

		WebElement clkPrevious = driver.findElement(PreviousPage);
		clkPrevious.click();
	}

	public void clickMyLetters() {

		WebElement clkMyLetter = driver.findElement(ClickMyLetter);
		clkMyLetter.click();

	}

	public void clickHamburger() {

		WebElement clkHamburger = driver.findElement(Hamburger);
		clkHamburger.click();
	}

	public void clickBulkLetterGeneration() {

		WebElement clkBulkLetterGen = driver.findElement(BulkLetterGeneration);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clkBulkLetterGen);
	}

	public void SearchBatchID() {

		

		WebElement blkBatchID = driver.findElement(BulkBatchID);
		try {
			WaitAction();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		blkBatchID.sendKeys("310");
		try {
			WaitAction();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        Actions a= new Actions(driver);
		a.doubleClick(blkBatchID).perform();

		try {
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DELETE);

			r.keyRelease(KeyEvent.VK_DELETE);

		} catch (AWTException e) {

			e.printStackTrace();
		}

	}

	public void SearchAdmin()  {

		WebElement blkAdmin = driver.findElement(BulkAdmin);
		try {
			WaitAction();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		blkAdmin.sendKeys("HariVignesh");
		try {
			WaitAction();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Actions a= new Actions(driver);
		a.doubleClick(blkAdmin).perform();

		Robot r;
		try {
			r = new Robot();
			
			r.keyPress(KeyEvent.VK_DELETE);

			r.keyRelease(KeyEvent.VK_DELETE);
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
		
	}

	public void SearchPartner() {
		
		WebElement blkPartner = driver.findElement(BulkPartner);
		blkPartner.sendKeys("Albert, Eric");
	
	}

	public void SearchTemplateName() {
		
		WebElement blkTemplateName = driver.findElement(BulkTemplateName);
		blkTemplateName.sendKeys("Trust Tax Eng Letter");
	}
	
	public void SearchNoofLetters() {
		
		WebElement blkNoofLetters = driver.findElement(BulkNoofLetters);
		blkNoofLetters.sendKeys("10");
	}
	
	public void SearchStatus() {
		
		WebElement blkStatus = driver.findElement(BulkStatus);
		blkStatus.sendKeys("Completed");
	}
	
	public void ClickSortNoofLetters() {
		
		WebElement clkNoofLetters = driver.findElement(SortNoofLetters);
		clkNoofLetters.click();
	}
	
	public void ClickSortLastUpdated() {
		
		WebElement clkLastUpdated = driver.findElement(SortLastUpdated);
		clkLastUpdated.click();
	}
	
	
}
