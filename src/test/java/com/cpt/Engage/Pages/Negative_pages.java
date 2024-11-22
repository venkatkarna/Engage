package com.cpt.Engage.Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.cpt.Engagee.BaseTest;
import com.cpt.Engagee.CommonMethods;

public class Negative_pages extends BaseTest {
	

	

	CommonMethods common = new CommonMethods();

	Actions a;

	By InvalidUsername = By.xpath("//div[@id='usernameError']");
	By InvalidPasswowrd = By.xpath("//div[@id='passwordError']");
	By VerifySelectedCombination = By.xpath("//p[contains(text(), 'Selected combination doesn')]");
	By OkButton = By.xpath("//button[text()='Ok']");
	By DisbaleLoadClient = By.xpath(
			"//div[@class='accordion-item']//div[@id='collapseOne']//div[@class='d-flex justify-content-lg-end gap-3 flex-wrap']//button[text()='Load Client Details']");
	By DisableRemove = By.xpath(
			"(//div[@class='p-datatable-header ng-star-inserted']//div[@class='table-header d-flex justify-content-between align-items-center ng-star-inserted']//button )");
	By ExsistingClientID = By.xpath("(//input[@name='ClientID']) [2]");
	By VerifyExsistingClientID = By.xpath(
			"//p[contains(text(), 'Already same Client details are available in this batch, please provide new client details and then submit')]");
	
	By EnterInvalidEmail = By.xpath("(//input[@name='SignatoryEmailId']) [2]");
	By VerifyInvalidEmailLabel = By.xpath("(//div[@class='modal-content p-4']) [2]//div[@class='errorvl ng-star-inserted']//label");
	By ErrorInvalidFileFormat = By.xpath("//p[contains(text(), ' Please upload only valid PDF file.')]");
	
	By ClearZip = By.xpath("//input[@id='233']");
	By ClearAddress = By.xpath("//input[@id='230']");
	By ClearState = By.xpath("//input[@id='232']");
	By ClearCity = By.xpath("//input[@id='231']");
	By verifyWithoutMandatory = By.xpath("//span[contains(text(), 'Please provide input to mandatory field(s) - ')]");
	By Templatedropdown = By.xpath("//div[@class='bg-white px-4 py-3 rounded mb-2 mb-md-4']//div[@id='collapseOne']//div[@class='ng-select-container']");
	By SelectIndividualTemplate = By.xpath("//ng-dropdown-panel[@class='ng-dropdown-panel ng-star-inserted ng-select-bottom']//div[@class='ng-option ng-star-inserted']//span[text()='Individual Tax Eng Letter']");
	By EnterSpouseEmailId = By.xpath("(//input[@id='SpouseEmailId']) [2]");
	By SpouseFirstName = By.xpath("//input[@id='237']");
	By SpouseLastName = By.xpath("//input[@id='239']");
	By ErrorSameEmail = By.xpath("//span[contains(text(), 'Please provide different Email ID for Signatory Email ID and Spouse Email ID')]");
	By TemplateDropdownDisable = By.xpath("(//div[@class='ng-value-container']) [1]");
	By WarningOkButton = By.xpath("(//div[@id='clienterror'])[2]//button[text()='Ok']");
	By Add = By.xpath("(//input[@id='upload-btn']) [1]");
	 
	public void ErrorToastInvalidUserName() {

		WebElement errorToast = driver.findElement(InvalidUsername);
		String text = errorToast.getText();
		System.out.println(text);

		// assertEquals(text, "The phone number you entered isn't valid. Your phone
		// number can contain numbers, spaces, and these special characters: ( ) [ ] . -
		// # * /");

		common.WaitAction();
		assertEquals(text,
				"The phone number you entered isn't valid. Your phone number can contain numbers, spaces, and these special characters: ( ) [ ] . - # * /",
				"ErrorToast is not matched");
		System.out.println("ErrorToast is showing when user enter invalid username");

	}

	public void ErrorToastInvalidPassword() {

		WebElement errorToast = driver.findElement(InvalidPasswowrd);
		String text = errorToast.getText();
		System.out.println(text);

		assertEquals(text, "Your account or password is incorrect. If you don't remember your password, reset it now.",
				"ErrorToast is not matched");
		System.out.println("ErrorToast is showing when user enter invalid password");

	}

	public void VerifySearchFilterWarningPopup() {

		WebElement verify = driver.findElement(VerifySelectedCombination);
		String text = verify.getText();
		System.out.println(text);

		assertEquals(text,
				"Selected combination doesn't have any letters, please select valid combination and try again",
				"ErrorToast is not matched");
		System.out.println("ErrorToast is showing when user selected invalid combination in search or filter");

		common.WaitAction();
		driver.findElement(OkButton).click();

	}

	public void VerifyDisableLoadClientButton() {

		WebElement button = driver.findElement(DisbaleLoadClient);

		if (button.isEnabled()) {
			System.out.println("Button is enabled.");
		} else {
			System.out.println("Load client details Button is disabled by default.");
		}

	}

	public void VerifyDisbaleRemoveButton() {

		WebElement button = driver.findElement(DisableRemove);

		if (button.isEnabled()) {
			System.out.println("Button is enabled.");
		} else {
			System.out.println("Remove clients Button is disabled by default.");
		}
	}

	public void EnterExsistingClientID() {

		WebElement enterClientID = driver.findElement(ExsistingClientID);
		enterClientID.sendKeys("129628");

	}

	public void VerifyExsistingClientIDError() {
		
		WebElement verifyPopup = driver.findElement(VerifyExsistingClientID);
		String text = verifyPopup.getText();
		System.out.println(text);
		
		assertEquals(text, "Already same Client details are available in this batch, please provide new client details and then submit", "ErrorToast is not matched");
		System.out.println("ErrorToast is showing when user entered the exsisting client ID when adding new client");
		
		common.WaitAction();
		
		WebElement clkOk =  driver.findElement(WarningOkButton);
		clkOk.click();
		
	//	JavascriptExecutor executor = (JavascriptExecutor) driver;
	//	executor.executeScript("arguments[0].click();", clkOk);
		
	 }
		public void EnterInvalidEmailAddClient() {
			
			WebElement verifyEmail = driver.findElement(EnterInvalidEmail);
			verifyEmail.sendKeys("test");
			
		}
		
		public void VerifyInvalidEmailLabel() {

			WebElement verifyLabel = driver.findElement(VerifyInvalidEmailLabel);
			String text = verifyLabel.getText();
			System.out.println(text);
			
			assertEquals(text, "Signatory E-mail ID is not valid", "ErrorToast is not matched");
			System.out.println("ErrorToast is showing when user entered the invalid Email in add new client screen");
			
		}
		
		public void VerifyInvalidFileFormatPopup() {
			
			WebElement verifyFileFormat = driver.findElement(ErrorInvalidFileFormat);
			String text = verifyFileFormat.getText();
			System.out.println(text);
			
			assertEquals(text, "Please upload only valid PDF file.", "ErrorToast is not matched");
			System.out.println("ErrorToast is showing when user uploading invalid file format");
			
			WebElement clkOk =  driver.findElement(OkButton);
			
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clkOk);
		}
		
		public void ClearZipValue() {
			
			WebElement clearZip = driver.findElement(ClearZip);
			clearZip.clear();
		}
		
		public void ClearStateValue() {
			
			WebElement stateValue = driver.findElement(ClearState);
			stateValue.clear();
		
		}
		
		public void ClearCityValue() {
			
			WebElement cityValue = driver.findElement(ClearCity);
			cityValue.clear();
			
		}
		
		public void ClearAddressValue() {
			
			WebElement addressValue = driver.findElement(ClearAddress);
			addressValue.clear();

		}
		
		public void VerifyMandatoryErrorPopup() {
			
			WebElement verify = driver.findElement(verifyWithoutMandatory);
			String text = verify.getText();
			System.out.println(text);
			
			Assert.assertTrue(text.contains("Please provide input to mandatory field(s)"), "Error warning up is showing when user try to update wihtout providing mandatory fields");

		}
		
		public void SelectInvidualTemplate() {
			
			WebElement clkDropdown = driver.findElement(Templatedropdown);
			clkDropdown.click();
			common.WaitImp();
			WebElement sltTemplate = driver.findElement(SelectIndividualTemplate);
			sltTemplate.click();
			common.WaitImp();
			
		}
		
		public void EnterSpouseEmail() {
			
			WebElement enterEmail = driver.findElement(EnterSpouseEmailId);
			enterEmail.sendKeys("testengage83@gmail.com");
			
		}
		
		public void EnterSpouseFirstName(String spouseFirstName) {
			
			WebElement enterFirstName = driver.findElement(SpouseFirstName);
			enterFirstName.sendKeys(spouseFirstName);

		}
		
		public void EnterSpouseLastName(String spouseLastName) {
			
			WebElement enterLastName = driver.findElement(SpouseLastName);
			enterLastName.sendKeys(spouseLastName);
			
		}
		
		public void VerifySameEmailErrorPopup() {
			
			WebElement verification = driver.findElement(ErrorSameEmail);
			String text = verification.getText();
			System.out.println(text);
			
			assertEquals(text, "Please provide different Email ID for Signatory Email ID and Spouse Email ID", "ErrorToast is not matched");
			System.out.println("ErrorToast is showing when user providing same email in signatory & spouse email fields");
			
			common.WaitAction();
			WebElement clkOk = driver.findElement(OkButton);
			
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clkOk);
			
		}
		
		public void VerifyTemplateDropdownDisable() {
			
			
		      Boolean dropdown =driver.findElement(By.xpath("(//input[@role='combobox']) [1]")).isEnabled();
		      if(dropdown) {
		            System.out.println("Dropdown is enabled");
		      }
		      else {
		            System.out.println("Dropdown is disabled");
		      }
				
		}
		
		public void uploadInvalidFile() {
			
			WebElement clkAdd = driver.findElement(Add);
			clkAdd.sendKeys("C:\\\\Users\\\\sasidaran.s\\\\Downloads\\\\Overall_Issues.xlsx");

		}	
	
}

