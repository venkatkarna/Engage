package com.cpt.Engage.Pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.cpt.Engagee.BaseTest;
import com.cpt.Engagee.CommonMethods;


public class ApplicationLogin_page extends BaseTest {

	Actions a;
	
	
	
	CommonMethods common = new CommonMethods();

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
	// By SelectIDValue = By.cssSelector("div.scrollable-content div span");
	By SelectIDValue = By.xpath("(//div[@class='ng-input'])[1]//input");

	By Search = By.xpath("//div[@class='text-md-end mt-2 mt-md-4']//button[text()='Search']");
	By Clear = By.xpath(
			"//div[@class='my-letter mb-4 px-4 py-3 bg-white rounded']//div[@class='text-md-end mt-2 mt-md-4']//button[text()='Clear']");
	By ValidateID = By.xpath("//table//tr/td[position()=2]");
	By Clicklettername = By.xpath("(//div[@class='ng-value-container'])[2]");
	By Selectlettername = By.xpath("(//div[@class='ng-input'])[2]//input");
	By ValidateLettername = By.xpath("//table//tr/td[position()=3]");
	By Clickoffice = By.xpath("(//div[@class='ng-value-container'])[3]");
	By Selectoffice = By.xpath("(//div[@class='ng-input'])[3]//input");
	By ValidateOffice = By.xpath("//table//tr/td[position()=4]");
	// "//div[@class='engagement-letter bg-white px-4 py-3
	// rounded']//div[@class='p-datatable-scrollable-view']//div[@class='p-datatable-scrollable-body
	// ng-star-inserted']//tr[1]//td[4]");
	By Clicktaxyear = By.xpath("(//div[@class='ng-value-container'])[4]");
	By Selecttaxyear = By.xpath("(//div[@class='ng-input'])[4]//input");
	By Validatetaxyear = By.xpath("//table//tr/td[position()=5]");
	By ListtemplateDropdown = By
			.xpath("//div[@class='ng-dropdown-panel-items scroll-host']//div[@class='scrollable-content']//div");

	By Clicktemplatename = By.xpath("(//div[@class='ng-value-container'])[5]");
	By Selecttemplatename = By.xpath("(//div[@class='ng-input'])[5]//input");
//	By Selecttemplatename = By.xpath("//ng-dropdown-panel//div//span[text()='Trust Tax Eng Letter']");
	By Validatetemplatename = By.xpath("//table//tr/td[position()=6]");
	By Clickclientid = By.xpath("(//div[@class='ng-input'])[6]//input");
	By Selectclientid = By.xpath("(//div[@class='ng-input'])[6]//input");
	By Validateclientid = By.xpath("//table//tr/td[position()=7]");
	By Clickpartner = By.xpath("(//div[@class='ng-value-container'])[7]");
	By Selectpartner = By.xpath("(//div[@class='ng-input'])[7]//input");
	By Validatepartner = By.xpath("//table//tr/td[position()=8]");
	By Clickdepartment = By.xpath("(//ng-select//div[@class='ng-value-container'])[8]");
	By Selectdepartment = By.xpath("(//div[@class='ng-input'])[8]//input");
	By Clicktype = By.xpath("(//ng-select//div[@class='ng-value-container'])[9]");
	By Selecttype = By.xpath("(//div[@class='ng-input'])[9]//input");
	By Clickadmin = By.xpath("(//ng-select//div[@class='ng-value-container'])[10]");
	By Selectadmin = By.xpath("(//div[@class='ng-input'])[10]//input");
	// "//ng-dropdown-panel[@class='ng-dropdown-panel ng-star-inserted
	// ng-select-bottom']//span[text()='HariVignesh']");
	By Validateadmin = By.xpath("//table//tr/td[position()=9]");
	By Clickstatus = By.xpath("(//div[@class='ng-value-container']) [11]");
	By Selectstatus = By.xpath("(//div[@class='ng-input'])[11]//input");
	By Validatestatus = By.xpath(
			"//div[@class='engagement-letter bg-white px-4 py-3 rounded']//div[@class='p-datatable-scrollable-view']//div[@class='p-datatable-scrollable-body ng-star-inserted']//tr[1]//td[10]");
	By AllLetters = By.xpath("//ul[@id='pills-tab']//li[2]//button");
	By SortBatchID = By.xpath(
			"((//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']) [1]//div[@class='p-datatable-scrollable-header']//thead//th) [1]");
	By SortLetterID = By.xpath("//thead//th[text()='Letter ID']");
	By SortLetterName = By.xpath("//thead//th[text()='Letter Name']");
	By SortOffice = By.xpath("//thead//th[text()='Office']");
	By SortYear = By.xpath("//thead//th[text()='Year']");
	By SortTemplateName = By.xpath("//thead//th[text()='Template Name']");
	By SortClientName = By.xpath("//thead//th[text()='Client Name']");
	By SortPartner = By.xpath("//thead//th[text()='Partner (PIC)']"); // thead//th[text()=' Partner (PIC)']
	By SortAdmin = By.xpath("//thead//th[text()='Admin']");
	By SortStatus = By.xpath(
			"//div[@class='engagement-letter bg-white px-4 py-3 rounded']//table[@class='p-datatable-scrollable-header-table']//colgroup//col [10]");
	By SortStatusBulkScreen = By
			.xpath("((//div[@class='bg-white px-4 py-3 rounded']//thead[@class='p-datatable-thead']//tr) [1]//th) [7]");
	By ExportDashboard = By.xpath(
			"//div[@class='engagement-letter bg-white px-4 py-3 rounded']//div[@class='d-flex align-items-center justify-content-between flex-wrap excel-btn']//button[text()='Export above table ']");
	By NextPage = By.xpath("//span[@class='p-paginator-icon pi pi-angle-right']");
	By LastPage = By.xpath("//span[@class='p-paginator-icon pi pi-angle-double-right']");
	By PreviousPage = By.xpath("//span[@class='p-paginator-icon pi pi-angle-left']");
	By ClickMyLetter = By.xpath("//button[text()='My Letters']");
	By BulkBatchID = By.xpath("(//input[@class='p-column-filter p-inputtext p-component']) [1]");
	By BulkLetterGeneration = By.xpath("//div[@class='tab']//ul//button[text()='Bulk Letter Generation']");
	By BulkAdmin = By.xpath("(//tr[@class='ng-star-inserted']//th//input)[2]");
	By Hamburger = By.xpath("//a[@class='toggle-sidebar']");
	By BulkPartner = By.xpath("(//tr[@class='ng-star-inserted']//th//input)[3]");
	By BulkTemplateName = By.xpath("(//tr[@class='ng-star-inserted']//th//input)[4]");
	By BulkNoofLetters = By.xpath("(//tr[@class='ng-star-inserted']//th//input)[5]");
	By BulkStatus = By.xpath("(//tr[@class='ng-star-inserted']//th//input)[7]");
	// By SortBatchID = By.xpath("(//thead[@class='p-datatable-thead']) [1]
	// //th[text()='Batch ID ']");
	By SortNoofLetters = By.xpath("(//thead[@class='p-datatable-thead']) [1] //th[text()='No of Letters']");
	By SortLastUpdated = By.xpath("(//thead[@class='p-datatable-thead']) [1] //th[text()='Last Updated On']");
	By StatusEsigning = By.xpath(
			"//ng-dropdown-panel[@class='ng-dropdown-panel ng-star-inserted ng-select-bottom']//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='With Client For E-Signing']");
	By VerifyStatus = By.xpath(
			"//div[@class='table-responsive position-relative engagedash-table']//p-table//div[@class='p-datatable-scrollable-body ng-star-inserted']//tbody//tr[1]//td[10]//span");
	// By VerifyCompleted = By.xpath("(//div[@class='table-responsive
	// position-relative
	// engagedash-table']//p-table//div[@class='p-datatable-scrollable-body
	// ng-star-inserted']//colgroup//col) [10]");
	By StatusManualSigning = By.xpath(
			"//ng-dropdown-panel[@class='ng-dropdown-panel ng-star-inserted ng-select-bottom']//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='With Client For Manual Signing']");
	By StatusAdminReview = By.xpath(
			"//ng-dropdown-panel[@class='ng-dropdown-panel ng-star-inserted ng-select-bottom']//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='With Admin for Review']");
	By Action = By.xpath(
			"(//div[@class='p-datatable-scrollable-body ng-star-inserted']//tbody[@class='p-datatable-tbody']//td[@class='text-center align-middle']) [1]//i");
	By ActionList = By.xpath("(//div[contains(@class,'ng-star-inserted')]) [4]//span[2]");
	By ListMenuAdmin = By.xpath(
			"//div[@class='d-flex flex-column h-100']//ul[@class='nav nav-pills flex-column mb-auto align-items-center align-items-sm-start d-grid gap-2 menu']//li");
	By HistoryLog = By.xpath("(//div[contains(@class,'ng-star-inserted')]) [3]//span[text()='History Log']");
	By HistoryLogHeader = By
			.xpath("//div[@class='modal-content px-4 py-3']//div[@class='table-responsive history-log']//thead//tr");
	By HistoryLogPreview = By.xpath("//div[@class='modal-content px-4 py-3']//a[text()='Preview']");
	By HistoryLogDownload = By.xpath("//div[@class='modal-content px-4 py-3']//a[text()='Download']");
	By HistoryLogInfo = By.xpath(
			"(//div[@class='modal-content px-4 py-3']//div[@class='p-datatable-wrapper ng-star-inserted']//tbody//tr//td) [5]//a[text()='Info']");
	By InfoPopupHeader = By.xpath(
			"(//div[@class='modal-content p-4']) [3]//div[@class='p-datatable-scrollable-header-box']//thead//tr//th");
	By Refresh = By.xpath("(//div[contains(@class,'ng-star-inserted')]) [3]//span[text()='Refresh']");
	By UploadLetter = By.xpath("(//div[contains(@class,'ng-star-inserted')]) [3]//span[text()='Upload Letter']");
	By UploadBrowse = By.xpath("//input[@id='file-input']");
	By UploadSubmit = By.xpath(
			"(//div[@class='modal-content']) [5]//div[@class='d-flex align-items-center p-3 mt-3 rounded ng-star-inserted']//button[text()='Submit']");
	By CancelSigning = By.xpath("(//div[contains(@class,'ng-star-inserted')]) [3]//span[text()='Cancel Signing']");
	By YesCancelSigning = By
			.xpath("//div[@id='cancelSigningModal']//button[text()='Yes']");
	By OkCancelSigning = By.xpath("(//div[@id='success'])[2]//button[text()='Ok']");
	// By EditFieldsDashboard = By.xpath("//span[text()='Edit Fields']");
	By EditFieldsDashboard = By.xpath("(//div[contains(@class,'ng-star-inserted')]) [3]//span[text()='Edit Fields']");
	By DeleteLetter = By.xpath("(//div[contains(@class,'ng-star-inserted')]) [3]//span[text()='Delete']");
	By YesDeletePopup = By.xpath("((//div[@class='modal-content']) [3]//div[@class='modal-footer']//button) [2]");
//	By OkDeletePopup = By.xpath("(//div[@class='modal-content']) [9]//div[@class='modal-body text-center']//button[text()='Ok']");

	By VerifyEditFieldsSuccessPopup = By.xpath("//p[contains(text(), 'Field details has been updated successfully')]");
	By OkButton = By.xpath("//button[text()='Ok']");
	By SuccessOkay = By.xpath("(//div[@id='success']) [2]//button[text()='Ok']");
	By UpdateSuccessOkay = By.xpath("(//div[@id='success']) [2]//button[text()='Ok']");
	By Resendbutton = By.xpath("(//div[contains(@class,'ng-star-inserted')]) [3]//span[text()='Resend']");
	By ManualCheckBox = By.xpath("(//div[@id='ClientIfovalues']) [2]//input[@type='radio'] [2]");
	By SubmitButton1 = By.cssSelector("button#clientSignature1");
	By SubmitButton2 = By.xpath("button#clientSignature2");
	By SuccessManualSigning = By.xpath("//p[contains(text(),'Engagement letter has been submitted successfully for manual signing, please download the letter from History log and send it to client for manual signing')]");
	By SignatureFirstName = By.xpath("//div[@id='ContentDisable']//input[@id='SignatoryFirstName']");
	By SpouseFirstName = By.xpath("//div[@id='ContentDisable']//input[@id='SpouseFirstName']");

	By LetterDashboardButton = By.xpath("(//ul[@id='menu']//li[@class='nav-item']) [1]//a");
	By BatchDashboardButton = By.xpath("(//ul[@id='menu']//li[@class='nav-item']) [2]//a");
	By NoCheckBoxEsigning = By.xpath("((//div[@class='row']) [5]//div[@class='response_question']//input) [2]");
	By YesCheckBoxEsigning = By.xpath("((//div[@class='row']) [5]//div[@class='response_question']//input) [1]");
	By ValidateStatus = By.xpath("//table//tr/td[position()=10]");
	By Dropdown = By.xpath("//div[@class='scrollable-content']//div//span");
	By Signer1 = By.xpath("//div[@id='ContentDisable']//label[text()='Signatory First Name']");
	By Signer2 = By.xpath("//div[@id='ContentDisable']//label[text()='Spouse First Name']");
	By Submit1 = By.xpath("//button[@id='clientSignature1']");
	By Submit2 = By.xpath("//button[@id='clientSignature2']");
	
//	By VerifyEditFieldsSuccessPopup = By.xpath("//p[contains(text(), 'Field details has been updated successfully')]");
//	By NoESigining = By.xpath("")

//	WebElement signer1 = driver
//			.findElement(By.xpath("//div[@id='ContentDisable']//label[text()='Signatory First Name']"));
//		WebElement signer2 = driver
//			.findElement(By.xpath("//div[@id='ContentDisable']//label[text()='Spouse First Name']"));

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

	//	WebElement element = driver.findElement(EnterPassword);
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

		WebElement btnProfile = driver.findElement(Profile);
		common.WaitForElementTobeClickable(Profile);
		btnProfile.click();

	}

	public void ClickYes() throws InterruptedException {

		WebElement btnYes = driver.findElement(Logout);
		common.WaitForElementTobeClickable(Logout);
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

	public void ClickIdValue(String letterID) {

		WebElement enterValue = driver.findElement(SelectIDValue);

		enterValue.sendKeys(letterID);

	}

	public void selectID(String letterID) {

		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='scrollable-content']//div//span"));

		for (WebElement dropdown : findElements) {
			if (dropdown.getText().equals(letterID)) {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				dropdown.click();
			}

			// System.out.println(dropdown.getText());
		}

	}

	/*
	 * for (WebElement id : idValue) { System.out.println(id); if
	 * (id.getText().equals(letterID)) { id.click(); break; } } }
	 */

	public void ClickSearch() {

		WebElement btnSearch = driver.findElement(Search);
		btnSearch.click();

	}

	public void ClickClear() {

		WebElement btnClear = driver.findElement(Clear);
		btnClear.click();

	}

	public void ClickLetterName() {

		WebElement letterName = driver.findElement(Clicklettername);
		letterName.click();

	}

	public void ClickLetterName(String lettername) {

		WebElement enterLetterName = driver.findElement(Selectlettername);
		enterLetterName.sendKeys(lettername);
	}

	public void SelectLetterName(String lettername) {

		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='scrollable-content']//div//span"));

		for (WebElement dropdown : findElements) {

//			System.out.println(dropdown.getText());
//			System.out.println(lettername);
			if (dropdown.getText().trim().equalsIgnoreCase(lettername)) {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				dropdown.click();
			}

		}

		// System.out.println("conditionFalse");
	}

	public void ValidateLetterName(String lettername) {

		List<WebElement> letterNames = driver.findElements(ValidateLettername);

		int count = 0;

		// List<WebElement> values =
		// driver.findElements(By.xpath("//table//tr/td[position()=3]"));

		for (WebElement letter : letterNames) {
			if (letter.getText().equals(lettername)) {
				count++;
			}
		}

		System.out.println(count);
	}

	public void ClickOffice() {

		WebElement clickOffice = driver.findElement(Clickoffice);
		clickOffice.click();

	}

	public void ClickOffice(String officename) {

		WebElement selectOffice = driver.findElement(Selectoffice);
		selectOffice.sendKeys(officename);

	}

	public void SelectOffice(String officename) {

		List<WebElement> findElements = driver.findElements(Dropdown);

		for (WebElement dropdown : findElements) {

			if (dropdown.getText().trim().equalsIgnoreCase(officename)) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				dropdown.click();
			}
		}
	}

	public void ValidateOffice(String officename) {

		List<WebElement> valueID = driver.findElements(ValidateOffice);

		int count = 0;

		for (WebElement listofID : valueID) {

			if (listofID.getText().equals(officename))
				count++;
			{

			}
		}

		System.out.println(count);

	}

//		WebElement valueOffice = driver.findElement(ValidateOffice);
//		String office = valueOffice.getText();
//		System.out.println(office);
//
//		if (office.equals(valueOffice.getText())) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}
//
//	}

	public void ClickTaxYear() {

		WebElement taxYear = driver.findElement(Clicktaxyear);
		taxYear.click();
	}

	public void EnterTaxYear(String year) {

		WebElement selectTaxYear = driver.findElement(Selecttaxyear);
		selectTaxYear.sendKeys(year);
	}

	public void selectTaxYear(String year) {

		List<WebElement> findElements = driver.findElements(Dropdown);

		for (WebElement value : findElements) {

			if (value.getText().trim().equalsIgnoreCase(year)) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				value.click();
			}
		}

	}

	public void ValidateTaxYear(String year) {

		List<WebElement> valueID = driver.findElements(ValidateOffice);
		int count = 0;

		for (WebElement listofID : valueID) {
			if (listofID.getText().equals(year))
				count++;
			{

			}
		}

		System.out.println(count);

	}

//		WebElement validateTaxYear = driver.findElement(Validatetaxyear);
//		String taxYear = validateTaxYear.getText();
//		System.out.println(taxYear);
//
//		if (taxYear.equals(validateTaxYear.getText())) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}
//	}

	public void ClickTemplateName() throws InterruptedException {

		WebElement templateName = driver.findElement(Clicktemplatename);
		templateName.click();

	}

	public void enterTemplateName(String tempName) {

		WebElement sltTemplateName = driver.findElement(Selecttemplatename);
		sltTemplateName.sendKeys(tempName);
	}

	public void selectTemplateName(String tempName) {

		List<WebElement> findElements = driver.findElements(Dropdown);

		for (WebElement value : findElements) {
			// System.out.println(value.getText());
			// System.out.println(tempName);

			if (value.getText().trim().equalsIgnoreCase(tempName)) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				value.click();
				break;
			}
		}
	}

	public void validateTemplateName(String tempName) {

		List<WebElement> valueID = driver.findElements(Validatetemplatename);
		int count = 0;

		for (WebElement listofID : valueID) {
			if (listofID.getText().equals(tempName))
				count++;
			{

			}
		}

		System.out.println(count);

	}

//
//		WebElement validateTemplateName = driver.findElement(Validatetemplatename);
//		String templateName = validateTemplateName.getText();
//		System.out.println(templateName);
//
//		if (templateName.equals(validateTemplateName.getText())) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}
//
//	}

	public void ClickClientId() {

		WebElement clickClientID = driver.findElement(Clickclientid);
		clickClientID.click();

	}

	public void enterClientId(String clientIDName) {

		WebElement selectClientId = driver.findElement(Selectclientid);
		selectClientId.sendKeys(clientIDName);

	}

	public void selectClientID(String clientIDName) {

		List<WebElement> list = driver.findElements(Dropdown);

		for (WebElement value : list) {

			if (value.getText().trim().equalsIgnoreCase(clientIDName)) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				value.click();
				break;
			}

		}
	}

	public void ValidateClientId(String clientIDName) {

		List<WebElement> valueID = driver.findElements(Validatetemplatename);
		int count = 0;

		for (WebElement listofID : valueID) {
			if (listofID.getText().equals(clientIDName))
				count++;
			{

			}
		}

		System.out.println(count);

	}

//		WebElement validateClientID = driver.findElement(Validateclientid);
//		String clientID = validateClientID.getText();
//		System.out.println(clientID);
//
//		if (clientID.equals(validateClientID.getText())) {
//			System.out.println("True");
//
//		} else {
//			System.out.println("False");
//
//		}
//
//	}

	public void ClickPartner() {

		WebElement partnerClick = driver.findElement(Clickpartner);
		partnerClick.click();
	}

	public void enterPartner(String partner) {

		WebElement sltPartner = driver.findElement(Selectpartner);
		sltPartner.sendKeys(partner);
	}

	public void selectPartner(String partner) {

		List<WebElement> findElements = driver.findElements(Dropdown);

		for (WebElement value : findElements) {

			if (value.getText().trim().equalsIgnoreCase(partner)) {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				value.click();

			}
		}
	}

	public void ValidatePartner(String partner) {

		List<WebElement> valueID = driver.findElements(Validatetemplatename);
		int count = 0;

		for (WebElement listofID : valueID) {
			if (listofID.getText().equals(partner))
				count++;
			{

			}
		}

		System.out.println(count);

	}

//		WebElement validatePartner = driver.findElement(Validatepartner);
//		String partnerName = validatePartner.getText();
//		System.out.println(partnerName);
//
//		if (partnerName.equals(validatePartner.getText())) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//
//		}
//	}

	public void ClickDepartment() {

		WebElement clickDepartment = driver.findElement(Clickdepartment);
		clickDepartment.click();
	}

	public void enterDepartment(String department) {

		WebElement sltDepartment = driver.findElement(Selectdepartment);
		sltDepartment.sendKeys(department);

	}

	public void selectDepartment(String department) {

		List<WebElement> findElements = driver.findElements(Dropdown);

		for (WebElement value : findElements) {
			if (value.getText().trim().equalsIgnoreCase(department)) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				value.click();
			}
		}
	}

	public void ClickType() {

		WebElement clickType = driver.findElement(Clicktype);
		clickType.click();

	}

	public void enterType(String type) {

		WebElement sltType = driver.findElement(Selecttype);
		sltType.sendKeys(type);
	}

	public void selectType(String type) {

		List<WebElement> findElements = driver.findElements(Dropdown);

		for (WebElement value : findElements) {
			if (value.getText().trim().equalsIgnoreCase(type)) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				value.click();
			}
		}

	}

	public void ClickAdmin() {

		WebElement clkAdmin = driver.findElement(Clickadmin);
		clkAdmin.click();
	}

	public void enterAdmin(String admin) {
		// Actions a = new Actions(driver);

		WebElement sltAdmin = driver.findElement(Selectadmin);
		sltAdmin.sendKeys(admin);

	}

	public void selectAdmin(String admin) {

		List<WebElement> findElements = driver.findElements(Dropdown);
		for (WebElement value : findElements) {

			// System.out.println(value.getText());
			// System.out.println(admin);
			if (value.getText().equals(admin)) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				value.click();
			}
		}
	}

	public void ValidateAdmin(String admin) {

		List<WebElement> valueID = driver.findElements(Validatetemplatename);
		int count = 0;

		for (WebElement listofID : valueID) {
			if (listofID.getText().equals(admin))
				count++;
			{

			}
		}

		System.out.println(count);

	}

//		WebElement valAdmin = driver.findElement(Validateadmin);
//		String valueAdmin = valAdmin.getText();
//		System.out.println(valueAdmin);
//
//		if (valueAdmin.equals(valAdmin.getText())) {
//			System.out.println("true");
//		} else {
//			System.out.println("False");
//		}
//
//	}

	public void ClickStatus() {

		WebElement clkStatus = driver.findElement(Clickstatus);

		clkStatus.click();
	}

	public void enterStatus(String status) {

		WebElement enterStatus = driver.findElement(Selectstatus);
		enterStatus.sendKeys(status);

	}

	public void SelectStatus(String status) {

		List<WebElement> findElements = driver.findElements(Dropdown);
		for (WebElement value : findElements) {

			if (value.getText().equals(status)) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				value.click();
			}
		}
	}


	public void ValidateStatus(String status) {

		List<WebElement> valueID = driver.findElements(ValidateStatus);
		int count = 0;

		for (WebElement listofID : valueID) {
			if (listofID.getText().equals(status))
				count++;
			{

			}
		}

		System.out.println(count);

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

		Actions a = new Actions((driver));

		WebElement clkSort = driver.findElement(SortStatus);
		a.click(clkSort).perform();

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
		common.WaitAction();
		blkBatchID.sendKeys("310");
		common.WaitAction();
		blkBatchID.sendKeys(Keys.CONTROL + "a");
		blkBatchID.sendKeys(Keys.DELETE);

		// blkBatchID.sendKeys(Keys.DELETE);

		/*
		 * try { WaitAction(); } catch (InterruptedException e1) { e1.printStackTrace();
		 * }
		 * 
		 * blkBatchID.sendKeys("310"); try { WaitAction(); } catch (InterruptedException
		 * e) { e.printStackTrace(); } Actions a = new Actions(driver);
		 * a.doubleClick(blkBatchID).perform();
		 * 
		 * try {
		 * 
		 * Robot r = new Robot(); r.keyPress(KeyEvent.VK_DELETE);
		 * 
		 * r.keyRelease(KeyEvent.VK_DELETE);
		 * 
		 * } catch (AWTException e) {
		 * 
		 * e.printStackTrace(); }
		 */

	}

	public void SearchAdmin() {

		WebElement blkAdmin = driver.findElement(BulkAdmin);
		blkAdmin.sendKeys("HariVignesh");
		common.WaitAction();
		blkAdmin.sendKeys(Keys.CONTROL + "a");
		blkAdmin.sendKeys(Keys.DELETE);

	}

	public void SearchPartner() {

		WebElement blkPartner = driver.findElement(BulkPartner);
		blkPartner.sendKeys("Albert, Eric");
		common.WaitAction();
		blkPartner.sendKeys(Keys.CONTROL + "a");
		blkPartner.sendKeys(Keys.DELETE);

	}

	public void SearchTemplateName() {

		WebElement blkTemplateName = driver.findElement(BulkTemplateName);
		blkTemplateName.sendKeys("Trust Tax Eng Letter");
		common.WaitAction();
		blkTemplateName.sendKeys(Keys.CONTROL + "a");
		blkTemplateName.sendKeys(Keys.DELETE);
	}

	public void SearchNoofLetters() {

		WebElement blkNoofLetters = driver.findElement(BulkNoofLetters);
		blkNoofLetters.sendKeys("10");
		common.WaitAction();
		blkNoofLetters.sendKeys(Keys.CONTROL + "a");
		blkNoofLetters.sendKeys(Keys.DELETE);
	}

	public void SearchStatus() {

		WebElement blkStatus = driver.findElement(BulkStatus);
		blkStatus.sendKeys("Completed");
		common.WaitAction();
		blkStatus.sendKeys(Keys.CONTROL + "a");
		blkStatus.sendKeys(Keys.DELETE);
	}

	public void ClickSortNoofLetters() {

		WebElement clkNoofLetters = driver.findElement(SortNoofLetters);
		clkNoofLetters.click();
	}

	public void ClickSortLastUpdated() {

		WebElement clkLastUpdated = driver.findElement(SortLastUpdated);
		clkLastUpdated.click();
	}

	public void clickWithEsigningStatus() {

		WebElement clkEsigning = driver.findElement(StatusEsigning);
		clkEsigning.click();

	}

	public void verifyCompletedStatus() {

		WebElement verify = driver.findElement(VerifyStatus);
		String text = verify.getText();
		System.out.println(text);

		assertEquals(text, "Completed", "Status in not showing correctly");
		System.out.println("Completed status letters are displaying");

	}

	public void verifyWithEsigningStatus() {

		WebElement verify = driver.findElement(VerifyStatus);
		String text = verify.getText();
		System.out.println(text);

		assertEquals(text, "With Client For E-Signing", "Status in not showing correctly");
		System.out.println("With Client For E-Signing status letters are displaying");
	}

	public void clickWithManualSigning() {

		WebElement clkManualSigning = driver.findElement(StatusManualSigning);
		clkManualSigning.click();

	}

	public void verifyWithManualSigning() {

		WebElement verify = driver.findElement(VerifyStatus);
		String text = verify.getText();
		System.out.println(text);

		assertEquals(text, "With Client For Manual Signing", "Status in not showing correctly");
		System.out.println("With Client For Manual Signing status letters are displaying");

	}

	public void clickWithAdminReview() {

		WebElement clkAdminReview = driver.findElement(StatusAdminReview);
		clkAdminReview.click();

	}

	public void verifyAdminReviewStatus() {

		WebElement verify = driver.findElement(VerifyStatus);
		String text = verify.getText();
		System.out.println(text);

		assertEquals(text, "With Admin for Review", "Status in not showing correctly");
		System.out.println("With Admin for Review status letters are displaying");

	}

	public void clkActionDashboard() {

		WebElement clkAction = driver.findElement(Action);
		clkAction.click();
		try {
			WaitAction();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		String text = clkAction.getText();
		System.out.println(text);

	}

	public void listActionForCompletedStatus() {

		// WebElement list = driver.findElement(ActionList);
		// String text = list.getText();
		// System.out.println(text);

		List<WebElement> actionList = driver.findElements(ActionList);
		String[] stringsArray = { "History Log"};

		for (int i = 0; i < actionList.size(); i++) {
			String text = actionList.get(i).getText();
			System.out.println(text);

			for (String expectedText : stringsArray) {
				if (text.equals(expectedText)) {
					System.out.println("Match found: " + text);
				}
			}
		}
	}


	public void listActionForESigningStatus() {

		// WebElement list = driver.findElement(ActionList);
		// String text = list.getText();
		// System.out.println(text);

		List<WebElement> actionList = driver.findElements(ActionList);
		String[] stringsArray = { "History Log", "Refresh", "Upload Letter", "Cancel Signing", "Delete" };

		for (int i = 0; i < actionList.size(); i++) {
			String text = actionList.get(i).getText();
			System.out.println(text);

			for (String expectedText : stringsArray) {
				if (text.equals(expectedText)) {
					System.out.println("Match found: " + text);

				}
			}
		}
	}


	public void listActionForManualSigningStatus() {

		// WebElement list = driver.findElement(ActionList);
		// String text = list.getText();
		// System.out.println(text);

		List<WebElement> actionList = driver.findElements(ActionList);
		String[] stringsArray = { "History Log", "Upload Letter", "Cancel Signing", "Delete" };

		for (int i = 0; i < actionList.size(); i++) {
			String text = actionList.get(i).getText();
			System.out.println(text);

			for (String expectedText : stringsArray) {
				if (text.equals(expectedText)) {
					System.out.println("Match found: " + text);
				}
			}
		}
	}

	public void listActionForAdminReviewStatus() {

		// WebElement list = driver.findElement(ActionList);
		// String text = list.getText();
		// System.out.println(text);

		List<WebElement> actionList = driver.findElements(ActionList);
		String[] stringsArray = { "History Log", "Resend", "Cancel Signing", "Delete" };

		for (int i = 0; i < actionList.size(); i++) {
			String text = actionList.get(i).getText();
			System.out.println(text);

			for (String expectedText : stringsArray) {
				if (text.equals(expectedText)) {
					System.out.println("Match found: " + text);
				}
			}
		}
	}

	public void verifyListMenuAdmin() {

		// WebElement menuList = driver.findElement(ListMenuAdmin);
		// String text = menuList.getText();
		// System.out.println(text);

		List<WebElement> menuList = driver.findElements(ListMenuAdmin);

		for (int i = 0; i < menuList.size(); i++) {
			String text = menuList.get(i).getText();
			System.out.println(text);

		}

	}

	public void clickHistoryLogPopup() {

		WebElement clickHistoryLog = driver.findElement(HistoryLog);
		clickHistoryLog.click();

	}

	public void verifyHistoryLogPopup() {

		// WebElement headerHistoryLog = driver.findElement(HistoryLogHeader);

		List<WebElement> historylogList = driver.findElements(HistoryLogHeader);

		for (int i = 0; i < historylogList.size(); i++) {
			String text = historylogList.get(i).getText();
			System.out.println(text);

		}

	}

	public void clickHistoryLogPreview() {

		WebElement preview = driver.findElement(HistoryLogPreview);
		preview.click();

	}

	public void clickHistoryLogDownload() {

		WebElement download = driver.findElement(HistoryLogDownload);
		download.click();

	}

	public void clickInfo() {

		WebElement Info = driver.findElement(HistoryLogInfo);
		Info.click();

	}

	public void verifyInfoPopup() {

		List<WebElement> infoList = driver.findElements(InfoPopupHeader);

		for (int i = 0; i < infoList.size(); i++) {
			String text = infoList.get(i).getText();
			System.out.println(text);

		}

	}

	public void clickRefresh() {

		WebElement clkRefresh = driver.findElement(Refresh);
		clkRefresh.click();

	}

	public void clickUploadLetter() {

		WebElement clkUploadLetter = driver.findElement(UploadLetter);
		clkUploadLetter.click();

	}

	public void clickBrowseButton() {

//	String filelocation = "C:\\Users\\sasidaran.s\\Downloads\\Uploadattachment.pdf";

		/*
		 * WebElement fileUploadButton =
		 * driver.findElement(By.xpath("//button[text()='Browse']")); JavascriptExecutor
		 * jsExecutor = (JavascriptExecutor) driver;
		 * jsExecutor.executeScript("arguments[0].style.display='block';",
		 * fileUploadButton); fileUploadButton.sendKeys(filelocation);
		 */

		WebElement btnBrowse = driver.findElement(UploadBrowse);
		
		btnBrowse.sendKeys("D:\\New folder (2)\\DocumentUpload\\Uploadattachment.pdf");

		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		// executor.executeScript("arguments[0].click();", btnBrowse);
	}

	public void clickSubmitAfterUpload() {

		WebElement clkSubmit = driver.findElement(UploadSubmit);
		clkSubmit.click();

	}

	public void clickCancelSigning() {

		WebElement clkCancelSigning = driver.findElement(CancelSigning);
		clkCancelSigning.click();

	}

	public void clickYesCancelSigning() {

		WebElement clkYes = driver.findElement(YesCancelSigning);
		clkYes.click();
	}

	public void clickOkayCancelSigningPopup() {

		WebElement clkOkay = driver.findElement(OkCancelSigning);
		clkOkay.click();

	}

	public void clickEditFieldsDashboard() {

		WebElement clkEditFields = driver.findElement(EditFieldsDashboard);

		clkEditFields.click();

		// Actions a = new Actions(driver);

		// a.click(clkEditFields).perform();

	}

	public void clickDeleteLetterDashboard() {

		WebElement clkDelete = driver.findElement(DeleteLetter);
		clkDelete.click();

	}

	public void clickYesDeleteLetter() {

		WebElement clkYes = driver.findElement(YesDeletePopup);
		clkYes.click();

	}

	public void clickOkayDeleteSuccess() {

		WebElement clickOk = driver.findElement(SuccessOkay);
		clickOk.click();

	}

	public void clickSortStatusBulkLetterScreen() {

		WebElement sortStatus = driver.findElement(SortStatusBulkScreen);
		sortStatus.click();

	}

	public void verifyEditFeildsSuccessPopup() {

		WebElement verifyPopup = driver.findElement(VerifyEditFieldsSuccessPopup);
		String text = verifyPopup.getText();
		System.out.println(text);

		common.WaitAction();

		assertEquals(text, "Field details has been updated successfully", "ErrorToast is not matched");
		System.out.println("Success toast is showing when user edit and update the fields value");

		WebElement clickOkay = driver.findElement(UpdateSuccessOkay);
		clickOkay.click();

		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		// executor.executeScript("arguments[0].click();", clickOkay);

	}

	
	
	public void clickResendButton() {

		WebElement clkResend = driver.findElement(Resendbutton);
		clkResend.click();

	}

	public void clickManualCheckbox() {

		WebElement clkManualCheckbox = driver.findElement(ManualCheckBox);
		clkManualCheckbox.click();

	}

	public void clickSubmitButton() {

		WebElement signer1 = driver.findElement(Signer1);
		WebElement signer2 = driver.findElement(Signer2);

		// WebElement btnSubmit1 = driver.findElement(Submit1);
		// WebElement btnSubmit2 = driver.findElement(Submit2);

		String text1 = signer1.getText();
		String text2 = signer2.getText();

		String replace1 = text1.replaceAll("[^a-zA-Z0-9\\s]", "");
		String replace2 = text2.replaceAll("[^a-zA-Z0-9\\s]", "");

		System.out.println(replace1);
		System.out.println(replace2);

		if (replace1.replaceAll("[^a-zA-Z0-9\\s]", "").equals("Signatory First Name")) {

			// System.out.println("In 2");
			if (replace2.replaceAll("[^a-zA-Z0-9\\s]", "").equals("Spouse First Name")) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// System.out.println("3");

				driver.findElement(Submit2).click();

			} else if (replace1.replaceAll("[^a-zA-Z0-9\\s]", "").equals("Signatory First Name")) {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				driver.findElement(Submit1).click();
			}

		}
	}

	public void verifyManualSigningSuccessPopupText() {

		WebElement verifyPopup = driver.findElement(SuccessManualSigning);
		String text = verifyPopup.getText();
		System.out.println(text);

		assertEquals(text,
				"Engagement letter has been submitted successfully for manual signing, please download the letter from History log and send it to client for manual signing",
				"ErrorToast is not matched");
		System.out.println("Success toast is showing when user cancel E signing and resend for Manual signing");
		
		WebElement btnOk = driver.findElement(SuccessOkay);
		btnOk.click();
	}

	public void clickBatchDashboardButton() {

		WebElement clkButton = driver.findElement(BatchDashboardButton);
		clkButton.click();
	}

	public void clickLetterDashboardButton() {

		WebElement clkButton = driver.findElement(LetterDashboardButton);
		clkButton.click();
	}

	public void verifyBatchDashboardScreen() {

		String url = driver.getCurrentUrl();
		System.out.println(url);

		Assert.assertTrue(url.contains("bulkletterdashboard"), "URL does not contain bulkletterdashboard");
		System.out.println("User landed on Batch dashboard screen successfully");

		/*
		 * if (url.contains("bulkletterdashboard")) {
		 * System.out.println("User able to land on Batch Dashboard screen"); } else {
		 * System.out.println("User not able to land on Batch Dashboard screen"); }
		 */
	}

	public void verifyLetterDashboardScreen() {

		String url = driver.getCurrentUrl();
		System.out.println(url);

		Assert.assertTrue(url.contains("engagementletterdashboard"), "URL does not contain bulkletterdashboard");
		System.out.println("User landed on Letter dashboard screen successfully");
	}

	public void clickNoCheckBoxESigning() {

		WebElement clkNo = driver.findElement(NoCheckBoxEsigning);
		common.ScrollDown(NoCheckBoxEsigning);
		clkNo.click();
		System.out.println("user able to select no checkbox in e-signing?");
	}

	public void clickYesCheckBoxESigning() {

		WebElement clkYes = driver.findElement(YesCheckBoxEsigning);
		common.ScrollDown(NoCheckBoxEsigning);
		common.WaitForElementTobeClickable(YesCheckBoxEsigning);
		clkYes.click();
		System.out.println("user able to select yes checkbox in e-signing?");
	}

	public void validateLetterName() {

		String valueName = "2023 Ahimsa Foundation  Trust Tax Eng Letter";

		int count = 0;

		List<WebElement> values = driver.findElements(By.xpath("//table//tr/td[position()=3]"));

		for (WebElement value : values) {
			if (value.getText().equals(valueName)) {
				count++;
			}
		}

		System.out.println("Count value---->" + count);
	}

	public void validationID(String letterID) {

		List<WebElement> valueID = driver.findElements(ValidateID);

		int count = 0;

		for (WebElement listofID : valueID) {

			if (listofID.getText().equals(valueID))
				count++;
			{

			}
		}
		System.out.println(count);

	}
	
	public void noCheckBoxESigning() {
		
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		common.WaitAction();	
		WebElement btnNo = driver.findElement(NoCheckBoxEsigning);
		btnNo.click();

	}
	
//	public void verifyFieldSuccessPopupDashboardScreen() {
//
//		WebElement verifyPopup = driver.findElement(VerifyEditFieldsSuccessPopup);
//		String text = verifyPopup.getText();
//		System.out.println(text);
//
//		common.WaitAction();
//
//		assertEquals(text, "Field details has been updated successfully", "ErrorToast is not matched");
//		System.out.println("Success toast is showing when user edit and update the fields value");
//
//		WebElement clickOkay = driver.findElement(UpdateSucessOkay);
//		clickOkay.click();
//	}
}
