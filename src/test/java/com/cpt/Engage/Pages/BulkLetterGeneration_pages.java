package com.cpt.Engage.Pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cpt.DataContext.DataContext;
import com.cpt.Engagee.BaseTest;
import com.cpt.Engagee.CommonMethods;

public class BulkLetterGeneration_pages extends BaseTest {



	By BulkLetterGeneration = By
			.xpath("//div[@class='tab']//ul[@id='pills-tab']//button[text()='Bulk Letter Generation']");
	By CreateBulkLettersBatch = By
			.xpath("//div[@class='text-md-end mb-32']//button[text()='Create Bulk Letters in Batch']");
	By PartnerPIC = By.xpath("//div//span[@class='dropdown-btn']");
	By SelectPartner1 = By.xpath("//li//div[text()='Avnet, Erin']");
	By SelectDifferentPartner = By.xpath("//li//div[text()='Barrett, Popi']");

	By Templatedropdown = By.xpath(
			"//div[@class='bg-white px-4 py-3 rounded mb-2 mb-md-4']//div[@id='collapseOne']//div[@class='ng-select-container']//input");
	By SelectTemplate = By.xpath(
			"//ng-dropdown-panel[@class='ng-dropdown-panel ng-star-inserted ng-select-bottom']//div[@class='ng-option ng-star-inserted']//span[text()='Trust Tax Eng Letter']");
	By SelectTemplateWithFee = By.xpath(
			"//ng-dropdown-panel[@class='ng-dropdown-panel ng-star-inserted ng-select-bottom']//div[@class='ng-option ng-star-inserted']//span[text()='Trust Tax Eng Letter With Fee']");
	By ReturnCode = By.xpath(
			"(//div[@class='col-12 col-md-6 col-lg-2']) [2]//div[@class='multiselect-dropdown']//span[@class='dropdown-btn']");
	By SelectReturnCode = By.xpath("(//div[@class='dropdown-list']) [2]//ul[@class='item2']//li[1]");

	By Click = By.xpath("//div[@class='col-12 col-lg-6 d-flex justify-content-end gap-3 flex-wrap']");
	By FetchClientDetails = By.xpath("//div[@id='collapseOne']//button[text()=' Load Client Details '] [1]");
	By FetchClientDetailsClientFlow = By
			.xpath("//div[@id='collapseAccordianOne']//button[text()=' Load Client Details ']");
	By LoadClientDetails = By.xpath(
			"//div[@class='accordion-item']//div[@id='collapseOne']//div[@class='d-flex justify-content-lg-end gap-3 flex-wrap']//button[text()='Load Client Details']");
	By WarningOk = By.xpath("(//div[@id='warning']) [2]//button[text()='Ok']");
	By SaveDraft = By.xpath(
			"//div[@class='d-flex justify-content-end flex-wrap gap-3 mt-2 mt-lg-3']//button[text()='Save as Draft']");
	By YesSaveDraft = By.xpath("//div[@id='saveDraftModal']//button[text()='Yes']");
	By OkButton = By.xpath("//div[@id='saveDraftSuccessModal']//button[@id='saveDraftOk']");
	By Action = By.xpath(
			"((//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']//tbody[@class='p-datatable-tbody']) [2]//i) [1]");

	By Delete = By.xpath("//span[text()='Delete']");
	By YesDelete = By.xpath("(//div[@class='modal-footer']//button[@class='btn p-btn ms-2']) [3]");
	By OkDelete = By.xpath("(//div[@class='modal-body text-center']) [5] //button");
	By Editbutton = By.xpath("(//tr//td//button[@class='bg-transparent mx-1']) [1]");
	By Closeicon = By.xpath("(//div//button[@aria-label='Close']) [9]");
	By EditField = By.xpath("//li//a//span[@class='p-menuitem-icon edit-feild-icon ng-star-inserted']");
	By Fees = By.xpath("//input[@id='240']");
	By Zip = By.xpath("//input[@id='233']");
	By Address = By.xpath("//input[@id='230']");
	By SignatoryTitle = By.xpath("//input[@id='229']");
	By SignatoryLastName = By.xpath("//input[@id='228']");
	By SignatoryFirstName = By.xpath("//input[@id='227']");
	By Update = By.xpath("//div//button[text()='Update']");
	By Ok_Button = By.xpath("(//div[@class='modal-body text-center']) [12]//button");
	By Preview = By.xpath("//span[text()='Preview letter']");
	By Close = By.xpath("(//div//button[@class='btn-close mx-3 mt-2 shadow-none']) [1]");
	By AddClient = By.xpath("//div//button[text()='Add Client']");
	By ClientID = By.xpath("(//input[@name='ClientID']) [2]");
	By Signatory_Email_ID = By.xpath("(//input[@name='SignatoryEmailId']) [2]");
	By ClientName = By.xpath("//input[@id='226']");
	By State = By.xpath("//input[@id='232']");
	By City = By.xpath("//input[@id='231']");
	By ChildEntities = By.xpath("(//input[@id='ChildEntities']) [2]");
	By ChildEntitiesRemove = By.xpath("(//input[@id='ChildEntities']) [1]");
	By AddChildEntities = By.xpath("(//button[text()='Add']) [2]");
	By AddChildEntities1 = By.xpath("(//button[text()='Add']) [1]");
	By PartnerName = By
			.xpath("(//div[@id='officeadddetails']//div[@class='col-12 col-md-6 col-lg-3']) [2]//ng-select//div[2]");
	By SelectPartnerName = By.xpath(
			"//ng-dropdown-panel[@class='ng-dropdown-panel ng-star-inserted ng-select-bottom']//div[@class='ng-option ng-option-marked ng-star-inserted']//span");
	By NoRadio = By.xpath("//input[@id='inlineRadio8']");
	By AddButton = By.xpath("(//button[text()='Add'])[3]");
	By AddEmailAttachment = By.xpath("(//div[@class='position-relative file-upload']) [1]//input");
	By Add = By.xpath("((//div[@id='add-attachment']) [2]//div[@class='position-relative file-upload']) [1] //input");
	By ok = By.xpath("(//button[text()='Ok'])[3]");
	By EditAttachment = By
			.xpath("//div[@class='p-datatable-header ng-star-inserted']//button[text()=' Edit Attachments']");
	By PreviewAttachment = By.xpath("//a[text()='Preview']");
	By SubmitAttachment = By.xpath("//button[text()='Submit']");
	By CloseAttachment = By.xpath("(//div//button[@class='btn-close mx-3 mt-2 shadow-none']) [2]");
	By Createbulkletter = By.xpath(
			"//div[@class='d-flex justify-content-end flex-wrap gap-3 mt-2 mt-lg-3']//button[text()='Create Bulk letter']");
	By Okay = By.xpath("(//button[@class='success-btn']) [2]");
	By OkaySuccess = By.xpath("(//div[@class='modal-body text-center']) [8] //button");
	By BasicDetails = By.xpath("//h2[@class='accordion-header']//button");
	By RemovePartner = By.xpath("//div[@class='selected-item ng-star-inserted']//a");
	By PartnerDropdown = By.xpath("(//div[@class='multiselect-dropdown']) [1]//span[text()='Select Partner']");
	By NewPartner = By.xpath(
			"((//ul[@class='item2']) [1]//li[@class='multiselect-item-checkbox ng-star-inserted'])//div[text()='Bagoff, Gary N.']");
	By InfoIcon = By.xpath("(//td//button//img[@alt='Eye-icon']) [1]");
	By PopupVerify = By.xpath("(//tbody[@class='p-datatable-tbody']) [4]//tr[@class='ng-star-inserted'] [1]//td[1]");
	By BatchIDVerify = By.xpath("(//tbody[@class='p-datatable-tbody']) [2]//tr[@class='ng-star-inserted'] [1]//td[1]");
	By ActionVerify = By.xpath("//span[@class='p-menuitem-text ng-star-inserted']");
	By AddClientReturnCode = By.xpath("((//div[@class='row']) [12]//div[@class='col-12 col-md-6 col-lg-3']) [2]");
	By SelectAddClinetReturnCode = By.xpath(
			"//ng-dropdown-panel[@class='ng-dropdown-panel ng-star-inserted ng-select-bottom']//div[@class='ng-dropdown-panel-items scroll-host']");
	By Ok_button_AddClient = By.xpath("(//div[@class='modal-body text-center']) [8]// button");
	By AllLetterCheckbox = By.xpath("(//div[@class='p-datatable-scrollable-header']//table//colgroup//col) [1]");
	By BulkLetterCheckbox = By.xpath("(//tbody[@class='p-datatable-tbody']) [2]//tr[1]//td[1]//input");
	By Removeclient = By.xpath(
			"(//div[@class='p-datatable-header ng-star-inserted']//div[@class='table-header d-flex justify-content-between align-items-center ng-star-inserted']//button ) [1]");
	By YesRemoveClient = By
			.xpath("(//div[@class='modal-content']) [10]//div[@class='modal-footer']//button[text()='Yes']");
	By OkRemoveClient = By.xpath("((//div[@class='modal-content']) [13]//button) [2]");
	By NewPartnerName = By.xpath("(//div[@class='multiselect-dropdown']) [1]//div[text()=' Bagoff, Gary N. ']");
	By VerifyNewPartner = By.xpath("(//div[@class='p-datatable-scrollable-body ng-star-inserted']//tr[1]//td)[4]");
	By RemoveAttachment = By.xpath("//div[@class='files-list py-3']//div[@class='row']//a[text()='Remove']");
	By ListInfo = By.xpath(
			"//div[@class='modal-content p-4']//div[@class='p-datatable-scrollable-view']//div[@class='p-datatable-scrollable-header']");

	By VerifyTextPopup = By.xpath("(//div[@class='modal-body text-center']) [12]//p");
	By SaveDraftSuccess = By.xpath(
			"//div[@id='saveDraftSuccessModal']//p[text()='Bulk letters batch saved as draft successfully']");
	By SearchColoumValues = By.xpath("//span[@class='p-input-icon-left']//input");
	By ValueID = By.xpath(
			"(//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']//div[@class='p-datatable-scrollable-body ng-star-inserted']//tbody//tr//td)[2]");
	By ValueClientName = By.xpath(
			"(//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']//div[@class='p-datatable-scrollable-body ng-star-inserted']//tbody//tr//td)[3]");
	By ValuePartner = By.xpath(
			"(//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']//div[@class='p-datatable-scrollable-body ng-star-inserted']//tbody//tr//td)[4]");
	By ValueOffice = By.xpath(
			"(//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']//div[@class='p-datatable-scrollable-body ng-star-inserted']//tbody//tr//td)[5]");
	By ValueReturnCode = By.xpath(
			"(//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']//div[@class='p-datatable-scrollable-body ng-star-inserted']//tbody//tr//td)[6]");
	By ValueSignatoryFirstName = By.xpath(
			"(//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']//div[@class='p-datatable-scrollable-body ng-star-inserted']//tbody//tr//td)[7]");
	By ValueSignatoryEmail = By.xpath(
			"(//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']//div[@class='p-datatable-scrollable-body ng-star-inserted']//tbody//tr//td)[8]");
	By ListViewGrid = By.xpath(
			"(//div[@class='bg-white px-4 py-3 rounded']//p-table[@datakey='id']//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']//table[@class='p-datatable-scrollable-header-table']//thead//tr[@class='ng-star-inserted']) [1]");
	By YesCreateLetter = By
			.xpath("(//div[@id='createBulkletterConfirmPopup']) [2]//div[@class='modal-footer']//button[text()='Yes']");
	By OkCreateLetter = By.xpath("(//div[@class='modal-content']) [12]//div[@class='modal-body text-center']//button");
	By BackToDashboard = By
			.xpath("//div[@class='d-flex justify-content-lg-end gap-3 flex-wrap']//button[text()='Back To Dashboard']");
	By Yesbutton = By.xpath("(//div[@id='backToDashboard']) [2]//div[@class='modal-footer']//button[text()='Yes']");
	By DownloadAboveDetailsExcel = By.xpath(
			"//div[@class='table-responsive position-relative']//button[text()='Download the above details as excel']");
	By OKButton = By.xpath("//button[text()='Ok']");
	By WarningOkButton = By.xpath("(//div[@id='warning'])[2]//button[text()='Ok']");
	By ErrorOkButton = By.xpath("(//div[@id='error'])[2]//button[text()='Ok']");
	By DeleteAllLettersWarning = By
			.xpath("//p[contains(text(),'Minimum one letter should be available in bulk letter generation batch.')]");
	By VerifyWarningPopupBeforeCreate = By.xpath(
			"//p[contains(text(),'Please provide inputs for all the below client letters and then try again.')]");
	By VerifyAddButtonEntitiesLimit = By.xpath("//button[@class='btn p-btn mb-2 mb-md-0 disabled']");
	By ClickRemovePartner = By.xpath("//div[@class='selected-item ng-star-inserted']//a");
	By PartnerDropdownAfterRemoveButton = By
			.xpath("(//span[@class='dropdown-btn']) [1]//span[text()='Select Partner']");
	By ClickRemoveReturnTypeCode = By.xpath("//div[@class='selected-item ng-star-inserted']//a");
	By ReturnTypeDropDownRemoveButton = By.xpath("(//span[@class='dropdown-btn']) [2]//span[text()='Select Code']");
	By BatchIDDisable = By.xpath("//label[text()='Batch ID ']/following-sibling::*");
	By AdminDisable = By.xpath("(//div[@class='mb-2 mb-md-3 mb-lg-4']) [2]//input");
	By DownArrow = By.xpath("//form[@id='bulkletterform']//button[text()=' Basic Details ']");
	By VerifyTemplateDropdown = By.xpath("//ng-select//div[@class='ng-value ng-star-inserted']//span[1]");
	By TemplateDropdownSearch = By.xpath("(//div[@class='ng-select-container']) [1]//input");
	By CloseIconEditFieldsPopup = By.xpath(
			"(//div[@class='modal-content p-4']) [1]//div[@class='modal-header border-0 p-0']//button[@class='btn-close shadow-none']");
	By CloseButtonEditFieldsPopup = By
			.xpath("(//div[@class='mt-3 mt-md-3 text-end sticky-bottom bg-white']) [1]//button[text()='Close']");
	By NoCheckBoxEsigning = By.xpath("((//div[@class='row']) [6]//div[@class='response_question']//input) [2]");
	By YesCheckBoxEsigning = By.xpath("((//div[@class='row']) [6]//div[@class='response_question']//input) [1]");
	By WarningPopupAlphabeticValueFee = By
			.xpath("(//div[@id='fielderror']) [2]//span[text()='Please provide valid numeric input to Fee column']");
	By RemoveChildEntities = By.xpath(
			"(//div[@class='col-lg-8']) [1]//div[@class='response_tag_wrapper ng-star-inserted']//p//a//i[@class='fa fa-times']");
	By UploadBulkLetterButton = By.xpath("//input[@id='file']");
	By NoCreateLetter = By
			.xpath("(//div[@id='createBulkletterConfirmPopup']) [2]//div[@class='modal-footer']//button[text()='No']");
	By VerifyEditFieldsSuccessPopup = By
			.xpath("//div[@id='success']//p[contains(text(), 'Field details has been updated successfully')]");
	By UpdateSucessOkay = By.xpath("(//div[@id='success']) [4]//button[text()='Ok']");
	By XbuttonCreatePopup = By
			.xpath("(//div[@id='createBulkletterConfirmPopup']) [2]//button[@class='btn-close shadow-none']");

	DataContext data = new DataContext();

	CommonMethods common = new CommonMethods();

	public String partnerName;

	public void ClickBulkLetterButton() {

		WebElement clkBulkLetButton = driver.findElement(BulkLetterGeneration);
		clkBulkLetButton.click();
		common.WaitAction();
	}

	public void ClickCreateBulkLettersBatch() {

		WebElement clkCreateBulkLetters = driver.findElement(CreateBulkLettersBatch);
		clkCreateBulkLetters.click();
		common.WaitAction();

	}

	public void SelectPartner(String partnerName) {

		WebElement clkDropdown = driver.findElement(PartnerPIC);
		clkDropdown.click();

		List<WebElement> partnerList = driver.findElements(By.cssSelector(".dropdown-list .ng-star-inserted div"));

		for (WebElement partner : partnerList) {

			if (partner.getText().trim().equalsIgnoreCase(partnerName)) {
				partner.click();
				break;

			}
		}
	}

	public void TemplateDropdown(String tempName) {

		WebElement clkTemplate = driver.findElement(Templatedropdown);
		common.WaitForElementTobeClickable(Templatedropdown);
		clkTemplate.click();
		common.WaitImp();
		clkTemplate.sendKeys(tempName);

		List<WebElement> tempList = driver
				.findElements(By.cssSelector(".scroll-host .ng-option.ng-star-inserted .ng-option-label"));

		for (WebElement temp : tempList) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			if (temp.getText().equalsIgnoreCase(tempName)) {
				temp.click();
				break;
			}
		}
	}

	public void FetchClientDetails() {

		WebElement clkFetchDetails = driver.findElement(FetchClientDetails);
		clkFetchDetails.click();
		common.WaitAction();

	}

	public void SaveDraft() {

		WebElement clkSaveDraft = driver.findElement(SaveDraft);
		clkSaveDraft.click();
		common.WaitAction();

	}

	public void YesButtonSaveDraft() {

		WebElement clkYes = driver.findElement(YesSaveDraft);
		clkYes.click();
		common.WaitAction();
	}

	public void OkSaveDraft() {

		WebElement clkOk = driver.findElement(OkButton);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clkOk);

		common.WaitAction();

	}

	public void ActionButton() {

		common.WaitAction();
		WebElement btnAction = driver.findElement(Action);
		common.ScrollDown();
		common.WaitAction();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btnAction);
		

	}

	public void DeleteButton() {

		WebElement btnDelete = driver.findElement(Delete);
		btnDelete.click();
		common.WaitAction();

	}

	public void YesDeleteButton() {

		WebElement btnYes = driver.findElement(YesDelete);
		btnYes.click();
		common.WaitAction();
	}

	public void OkDeleteButton() {

		WebElement btnOk = driver.findElement(OkDelete);
		btnOk.click();
		common.WaitAction();
	}

	public void OkWarning() {

		WebElement btnOk = driver.findElement(WarningOk);
		btnOk.click();
		common.WaitAction();
	}

	public void Editbutton() {

		WebElement btnEdit = driver.findElement(Editbutton);
		btnEdit.click();
		common.WaitAction();

	}

	public void CloseIcon() {

		WebElement iconClose = driver.findElement(Closeicon);
		iconClose.click();
		common.WaitAction();
	}

	public void ClickEditFields() {

		WebElement btnEditField = driver.findElement(EditField);
		btnEditField.click();
		common.WaitAction();
	}

	public void ValuesFees(String fee) {

		WebElement valueFees = driver.findElement(Fees);
		valueFees.click();
		valueFees.clear();
		valueFees.sendKeys(fee);
		common.WaitAction();
	}

	public void ValuesZip(String zip) {

		WebElement valueZip = driver.findElement(Zip);

		valueZip.click();
		valueZip.clear();
		valueZip.sendKeys(zip);
		common.WaitAction();
	}

	public void ValueAddress(String address) {

		WebElement Valuesaddress = driver.findElement(Address);
		Valuesaddress.click();
		Valuesaddress.clear();
		Valuesaddress.sendKeys(address);
		common.WaitAction();

	}

	public void ValuesSignatoryTitle(String stitle) {

		WebElement valueSignatoryTitle = driver.findElement(SignatoryTitle);
		valueSignatoryTitle.click();
		valueSignatoryTitle.clear();
		valueSignatoryTitle.sendKeys(stitle);
		common.WaitAction();
	}

	public void ValuesSignatoryLastName(String lastname) {

		WebElement ValuesSignatoryLastName = driver.findElement(SignatoryLastName);
		ValuesSignatoryLastName.click();
		ValuesSignatoryLastName.clear();
		ValuesSignatoryLastName.sendKeys(lastname);
		common.WaitAction();

	}

	public void ValuesSignatoryFirstName(String firstname) {

		WebElement ValuesSignatoryFirstName = driver.findElement(SignatoryFirstName);
		ValuesSignatoryFirstName.click();
		ValuesSignatoryFirstName.clear();
		ValuesSignatoryFirstName.sendKeys(firstname);
		common.WaitAction();

	}

	public void ButtonUpdate() {

		WebElement btnUpdate = driver.findElement(Update);
		btnUpdate.click();
		common.WaitAction();

	}

	public void ButtonOkay() {

		WebElement btnOkay = driver.findElement(Ok_Button);
		btnOkay.click();
		common.WaitAction();

	}

	public void ButtonPreview() {

		WebElement btnPreview = driver.findElement(Preview);
		btnPreview.click();
		common.WaitMore();

	}

	public void buttonClose() {

		WebElement btnClose = driver.findElement(Close);
		btnClose.click();
		common.WaitAction();
	}

	public void buttonAddClient() {

		WebElement btnAddClient = driver.findElement(AddClient);
		btnAddClient.click();
		common.WaitAction();

	}

	public void enterClientID() {

		WebElement enterClientID = driver.findElement(ClientID);
		enterClientID.sendKeys("10496");
		common.WaitAction();

	}

	public void enterSignatoryEmail() {

		WebElement enterSignatoryEmail = driver.findElement(Signatory_Email_ID);
		enterSignatoryEmail.sendKeys("testengage83@gmail.com");
		common.WaitAction();
	}

	public void enterClientName(String clientname) {

		WebElement enterClientName = driver.findElement(ClientName);
		enterClientName.sendKeys(clientname);
		common.WaitAction();

	}

	public void enterState(String state) {

		WebElement enterState = driver.findElement(State);
		enterState.sendKeys(state);
		common.WaitAction();

	}

	public void enterCity(String city) {

		WebElement enterCity = driver.findElement(City);
		enterCity.sendKeys(city);
		common.WaitAction();

	}

	public void enterChildEntities() {

		common.WaitImp();
		WebElement enterChildEntities = driver.findElement(ChildEntities);
		enterChildEntities.sendKeys("V3 child entities");
		common.WaitAction();
	}

	public void AddChildEntities() throws InterruptedException {

		WebElement enterChildEntities = driver.findElement(AddChildEntities);
		// Actions a = new Actions(driver);
		common.ScrollDown(AddChildEntities);
		enterChildEntities.click();
		common.WaitAction();
	}

	public void enterPartnerName() {

		WebElement enterPartnerName = driver.findElement(PartnerName);
		enterPartnerName.click();
		common.WaitAction();

	}

	public void selectPartnerName() {

		WebElement selectPartnerName = driver.findElement(SelectPartnerName);
		selectPartnerName.click();
		common.WaitAction();

	}

	public void selectNoRadioButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");

		WebElement elementToClick = driver.findElement(NoRadio);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", elementToClick);
		common.WaitAction();

	}

	public void AddClientFinal() throws InterruptedException {

		WebElement elementToClick = driver.findElement(AddButton);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", elementToClick);
		common.WaitAction();

	}

	public void addAttachment() {

		WebElement addfile = driver.findElement(Add);
		common.WaitAction();
		addfile.sendKeys("D:\\New folder (2)\\DocumentUpload\\Uploadattachment.pdf");

		// addfile.click();
		// WaitAction();

	}

	public void clickEditAttachment() {
		WebElement clkEditAttachment = driver.findElement(EditAttachment);
		clkEditAttachment.click();
		common.WaitAction();

	}

	public void previewAttachment() {

		WebElement preview = driver.findElement(PreviewAttachment);
		preview.click();

	}

	public void submitAttachment() {

		WebElement submit = driver.findElement(SubmitAttachment);
		submit.click();
	}

	public void closeAttachment() {

		WebElement close = driver.findElement(CloseAttachment);
		close.click();
	}

	public void clickCreatrebulkletter() {

		WebElement clkBulkletter = driver.findElement(Createbulkletter);
		clkBulkletter.click();

	}

	public void createLetterOkay() {

		WebElement clkOkay = driver.findElement(Okay);
		clkOkay.click();
	}

	public void okaySuccess() {

		WebElement clkOkay = driver.findElement(OkaySuccess);
		clkOkay.click();

	}

	public void clickBasicDetail() {

		WebElement clkBasicDetails = driver.findElement(BasicDetails);
		clkBasicDetails.click();
	}

	public void removePartner() {

		WebElement clkRemove = driver.findElement(RemovePartner);
		clkRemove.click();
	}

	public void clickPartnerDropdown() {

		WebElement clkDropdown = driver.findElement(PartnerPIC);
		clkDropdown.click();

		// WebElement clkPartnerDropdown = driver.findElement(PartnerDropdown);
		// clkPartnerDropdown.click();
	}

	public void selectNewPartner(String partnername) {

		WebElement clkDropdown = driver.findElement(PartnerPIC);
		clkDropdown.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<WebElement> partnerList = driver.findElements(By.cssSelector(".dropdown-list .ng-star-inserted div"));

		for (WebElement partner : partnerList) {

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (partner.getText().trim().equalsIgnoreCase(partnerName)) {
				// common.WaitForElementTobeClickable((By)(partner));

				// JavascriptExecutor executor = (JavascriptExecutor) driver;
				// executor.executeScript("arguments[0].click();", partner);
				partner.click();
				break;

			}
		}
	}

//		WebElement selectNewPartner = driver.findElement(NewPartner);
//		String partnerName = selectNewPartner.getText();
//		DataContext.setJsonBody(partnerName);
//		System.out.println(partnerName);
//		WaitAction();
//		selectNewPartner.click();
//	}

	public void clickInfo() {

		WebElement clkInfo = driver.findElement(InfoIcon);
		clkInfo.click();
		common.WaitAction();

		WebElement valueBatchID = driver.findElement(BatchIDVerify);
		String value = valueBatchID.getText();
		System.out.println(value);

		WebElement popup = driver.findElement(PopupVerify);
		String list = popup.getText();
		System.out.println(list);

		common.WaitAction();
		assertEquals(value, list, "BatchID is not matched");
		System.out.println("BatchID is matched successfully in info popup");
	}

	public void verifyActionList() {

		List<WebElement> actionList = driver.findElements(ActionVerify);

		for (int i = 0; i < actionList.size(); i++) {
			String text = actionList.get(i).getText();
			System.out.println(text);

		}
	}

	public void clickReturnCode(String ReturnTypeCode) {

		WebElement clkReturnCode = driver.findElement(ReturnCode);
		common.WaitAction();
		clkReturnCode.click();

		List<WebElement> returnCodeList = driver
				.findElements(By.xpath("(//div[@class='dropdown-list']) [2]//ul[@class='item2']//li"));

		for (WebElement Code : returnCodeList) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (Code.getText().trim().equalsIgnoreCase(ReturnTypeCode)) {

				Code.click();
				break;
			}
		}

	}

	public void dropDownClose() {

		WebElement clkClose = driver.findElement(Click);
		common.WaitImp();
		clkClose.click();
	}

	public void SelectReturnCode() {

		WebElement sltReturnCode = driver.findElement(SelectReturnCode);
		sltReturnCode.click();

	}

	public void sltAddClientReturnType() {

		WebElement clkReturnType = driver.findElement(AddClientReturnCode);
		clkReturnType.click();

		WebElement sltReturnType = driver.findElement(SelectAddClinetReturnCode);
		sltReturnType.click();

	}

	public void btnOkAddClient() {

		WebElement btnOkay = driver.findElement(Ok_button_AddClient);
		btnOkay.click();

	}

	public void sltBulkLetterCheckbox() {

		WebElement sltCheckbox = driver.findElement(BulkLetterCheckbox);
		sltCheckbox.click();

	}

	public void clkRemoveClient() {

		WebElement clkRemoveClient = driver.findElement(Removeclient);
		clkRemoveClient.click();

	}

	public void btnYesRemoveClient() {

		WebElement btnYes = driver.findElement(YesRemoveClient);
		btnYes.click();

	}

	public void btnOkayRemoveClient() {

		WebElement btnOkay = driver.findElement(OkRemoveClient);
		btnOkay.click();

	}

	public void verifyPartnerChanged(String partnername) {

		// WebElement newPartner = driver.findElement(NewPartnerName);
		// String newPartnerName = newPartner.getText();
		// System.out.println(newPartnerName);
		// String jsonBody = DataContext.getJsonBody();
		// System.out.println(jsonBody);

		WebElement partnerName = driver.findElement(VerifyNewPartner);
		String verifyPartnerName = partnerName.getText();
		System.out.println(verifyPartnerName);

		common.WaitAction();

		assertEquals(partnername, verifyPartnerName, "Partner Name is not changed");
		System.out.println("Partner Name is changed successfully");

	}

	public void clkRemoveAttachment() {

		WebElement clkRemove = driver.findElement(RemoveAttachment);
		clkRemove.click();

	}

	public void listInfo() {

		WebElement listInfoPopup = driver.findElement(ListInfo);
		String text = listInfoPopup.getText();
		System.out.println(text);

	}

	public void verifyEditSuccessText() {

		WebElement textPopup = driver.findElement(VerifyTextPopup);
		String text = textPopup.getText();
		System.out.println(text);

		common.WaitAction();

		assertEquals(text, "Field details has been updated successfully", "Text is not matched in edit success popup");
		System.out.println("Text is matched in edit success popup");

	}

	public void verifySaveDraftPopup() {

		WebElement verifyPopup = driver.findElement(SaveDraftSuccess);
		String text = verifyPopup.getText();
		System.out.println(text);

		common.WaitAction();

		assertEquals(text, "Bulk letters batch saved as draft successfully",
				"Text is not matched in save draft success popup");
		System.out.println("Text is matched in save draft success popup");

	}

	public void btnLoadClientDetails() {

		WebElement btnLoadClientDetails = driver.findElement(LoadClientDetails);
		btnLoadClientDetails.click();
	}

	public void clkSearchByValues() {

		WebElement clkSearch = driver.findElement(SearchColoumValues);
		clkSearch.click();

	}

	public void searchByClientID(String empid) {

		WebElement search = driver.findElement(SearchColoumValues);
		search.sendKeys(empid);

		WebElement valueID = driver.findElement(ValueID);
		String ID = valueID.getText();
		// System.out.println(ID);

		assertEquals(ID, empid, "Search by values is not working as expected");
		System.out.println("Search by Client ID is displaying");

		common.clearText(SearchColoumValues);
	}

	public void searchByClientName(String clientname) {

		WebElement search = driver.findElement(SearchColoumValues);
		search.sendKeys(clientname);

		WebElement valueClientName = driver.findElement(ValueClientName);
		String clientName = valueClientName.getText();
		// System.out.println(clientName);

		assertEquals(clientName, clientname, "Search by values is not working as expected");
		System.out.println("Search by client name is displaying the result");

		common.clearText(SearchColoumValues);
	}

	public void searchByPartner(String partnername) {

		WebElement search = driver.findElement(SearchColoumValues);
		search.sendKeys(partnername);

		WebElement partnerName = driver.findElement(ValuePartner);
		String ValuePartnerName = partnerName.getText();
		// System.out.println(text);

		assertEquals(ValuePartnerName, partnername, "Search by values is not working as expected");
		System.out.println("Search by Partner Name is displaying the result");

		common.clearText(SearchColoumValues);
	}

	public void searchByOffice(String officename) {

		WebElement search = driver.findElement(SearchColoumValues);
		search.sendKeys(officename);

		WebElement officeName = driver.findElement(ValueOffice);
		String ValueOfficeName = officeName.getText();
		// System.out.println(text);

		assertEquals(ValueOfficeName, officename, "Search by values is not working as expected");
		System.out.println("Search by Office is displaying the result");

		common.clearText(SearchColoumValues);
	}

	public void searchByReturnCode(String code) {

		WebElement search = driver.findElement(SearchColoumValues);
		search.sendKeys(code);

		WebElement returnCode = driver.findElement(ValueReturnCode);
		String ValueReturncode = returnCode.getText();
		// System.out.println(text);

		assertEquals(ValueReturncode, code, "Search by values is not working as expected");
		System.out.println("Search by ReturnCode is displaying the result");

		common.clearText(SearchColoumValues);
	}

	public void searchBySignatoryFirstName(String firstname) {

		WebElement search = driver.findElement(SearchColoumValues);
		search.sendKeys(firstname);

		WebElement firstName = driver.findElement(ValueSignatoryFirstName);
		String ValueFirstName = firstName.getText();
		// System.out.println(text);

		assertEquals(ValueFirstName, firstname, "Search by values is not working as expected");
		System.out.println("Search by SignatoryFirstName is displaying the result");

		common.clearText(SearchColoumValues);
	}

	public void searchBySignatoryEmail(String emailaddress) {

		WebElement search = driver.findElement(SearchColoumValues);
		search.sendKeys(emailaddress);

		WebElement firstName = driver.findElement(ValueSignatoryEmail);
		String ValueSignatoryEmail = firstName.getText();
		// System.out.println(text);

		assertEquals(ValueSignatoryEmail, emailaddress, "Search by values is not working as expected");
		System.out.println("Search by SignatoryEmail is displaying the result");

	}

	public void listViewGrid() {

		WebElement viewGrid = driver.findElement(ListViewGrid);
		String text = viewGrid.getText();
		System.out.println(text);

	}

	public void clickAllLetterCheckbox() {

		Actions a = new Actions(driver);

		WebElement clkAllLetter = driver.findElement(AllLetterCheckbox);
		a.click(clkAllLetter).perform();

	}

	public void clickYesCreateLetterConformation() {

		WebElement clickYes = driver.findElement(YesCreateLetter);
		clickYes.click();

	}

	public void clickOkayCreateLetterSuccess() {

		WebElement clickOk = driver.findElement(OkCreateLetter);
		clickOk.click();
	}

	public void ClickBacktoDashboard() {

		WebElement button = driver.findElement(BackToDashboard);
		button.click();

	}

	public void ClickYesBacktoDashboard() {

		WebElement button = driver.findElement(Yesbutton);
		button.click();
	}

	public void ClickDownloadAboveDetails() {

		WebElement downloadDetails = driver.findElement(DownloadAboveDetailsExcel);
		downloadDetails.click();
	}

	public void VerifyDeleteAllLetterWarningPopup() {

		WebElement verify = driver.findElement(DeleteAllLettersWarning);
		String text = verify.getText();
		System.out.println(text);

		assertEquals(text, "Minimum one letter should be available in bulk letter generation batch.",
				"ErrorToast is not matched");
		System.out.println("Warning popup is showing when user try to delete all the letters in a batch");
		common.WaitAction();
		WebElement clkOkay = driver.findElement(WarningOkButton);
		clkOkay.click();

	}

	public void Enter200ChildEntities() {

		// WebElement enterChildEntities = driver.findElement(ChildEntities);
		// enterChildEntities.sendKeys("V3 child entities");

		common.ScrollDown(AddChildEntities);

		for (int i = 0; i <= 199; i++) {

			WebElement enterChildEntities = driver.findElement(ChildEntities);
			enterChildEntities.sendKeys("V3 child entities");
			WebElement btnclick = driver.findElement(AddChildEntities);
			btnclick.click();

		}

	}

	public void verifyAddButtonAfter200Entities() {

		WebElement addButton = driver.findElement(By.xpath("(//button[text()='Add'])[1]"));
		common.WaitAction();
		boolean isDisabled = addButton.isEnabled();

		if (isDisabled) {
			System.out.println("Button is disabled.");
		} else {
			System.out.println("Button is enabled.");
		}

	}

//	boolean enabled = driver.findElement(By.xpath("(//button[text()='Add']) [1]"))
//			.isEnabled();System.out.println("  button status:::::"+enabled);if(enabled)
//	{
//		System.out.println("Button is enabled.");
//	}else
//	{
//		System.out.println("Button is disabled.");
//	}
//	}

	public void VerifyWarningPopupBeforeCreateLetter() {

		WebElement verify = driver.findElement(VerifyWarningPopupBeforeCreate);
		String text = verify.getText();
		System.out.println(text);

		assertEquals(text, "Please provide inputs for all the below client letters and then try again.",
				"ErrorToast is not matched");
		System.out.println(
				"Warning popup is showing when user try to create the letter without providing all mandatory fields");

		WebElement clkOk = driver.findElement(WarningOkButton);

		clkOk.click();

	}

	public void selectDifferentPartner() {

		WebElement clkDropdown = driver.findElement(PartnerPIC);
		clkDropdown.click();
		common.WaitAction();
		WebElement selectPartner = driver.findElement(SelectDifferentPartner);
		selectPartner.click();

	}

	public void clickRemoveButtonPartner() {

		WebElement clkRemove = driver.findElement(ClickRemovePartner);
		clkRemove.click();

	}

	public void verifyPartnerDropdownAfterRemoveButton() {

		WebElement verifyPartnerDropdown = driver.findElement(PartnerDropdownAfterRemoveButton);
		String text = verifyPartnerDropdown.getText();
		System.out.println(text);

		assertEquals(text, "Select Partner", "Select Partner are not removed");
		System.out.println("Selected partner is removed successfully after click on remove button");

	}

	public void clickRemoveReturnTypeCode() {

		WebElement clkRemove = driver.findElement(ClickRemoveReturnTypeCode);
		clkRemove.click();
	}

	public void verifyRemoveReturnTyepCodeAfterRemoveButton() {

		WebElement verifyReturnTypeDropdown = driver.findElement(ReturnTypeDropDownRemoveButton);
		String text = verifyReturnTypeDropdown.getText();
		System.out.println(text);

		assertEquals(text, "Select Code", "Select ReturnType code are not removed");
		System.out.println("Selected ReturnType code is removed successfully after click on remove button");

	}

	public void verifyBatchID() {

		WebElement verifyBatchID = driver.findElement(BatchIDDisable);

		String readOnlyField = verifyBatchID.getAttribute("readonly");

		// assertEquals(readOnlyField, "true");

		if (readOnlyField.equals("true")) {
			System.out.println("Field is readonly");
		} else {
			System.out.println("Field is not readonly");
		}
	}

	public void verifyAdmin() {

		WebElement verifyBatchID = driver.findElement(AdminDisable);

		String readOnlyField = verifyBatchID.getAttribute("readonly");

		// assertEquals(readOnlyField, "true");

		if (readOnlyField.equals("true")) {
			System.out.println("Field is readonly");
		} else {
			System.out.println("Field is not readonly");
		}

	}

	public void clickBasicDetails() {

		WebElement clkDownArrow = driver.findElement(DownArrow);
		clkDownArrow.click();
	}

	public void verifyTemplateDropdown() {

		WebElement verifyTemplate = driver.findElement(VerifyTemplateDropdown);

		String hidden = verifyTemplate.getAttribute("aria-hidden");
		System.out.println(hidden);
		if (hidden.equals("true")) {
			System.out.println("Dropdown is readonly");
		} else {
			System.out.println("Dropdown is not readonly");
		}
	}

	public void templateDropdownSearch(String templateName) {

		WebElement searchDropdown = driver.findElement(TemplateDropdownSearch);
		searchDropdown.sendKeys(templateName);
		System.out.println("user able to enter the template name in template dropdowns");
	}

	public void closeIconEditFieldPopup() {

		WebElement close = driver.findElement(CloseIconEditFieldsPopup);
		close.click();
	}

	public void closeButtonFieldPopup() {

		WebElement close = driver.findElement(CloseButtonEditFieldsPopup);
		close.click();

	}

	public void selectTemplateWithFee(String tempName) {

		List<WebElement> sltTemplate = driver.findElements(SelectTemplate);
		for (WebElement temp : sltTemplate) {
			if (temp.getText().equalsIgnoreCase(tempName)) {
				common.WaitForElementVisibility(SelectTemplateWithFee);
				temp.click();
			}

		}

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

	public void enterAlphabetInFee() {

		WebElement enterFee = driver.findElement(Fees);
		common.WaitForElementVisibility(Fees);
		enterFee.sendKeys("alpha");
	}

	public void verifyWarningAlphabeticFeeField() {

		WebElement verification = driver.findElement(WarningPopupAlphabeticValueFee);
		common.WaitForElementVisibility(WarningPopupAlphabeticValueFee);
		String text = verification.getText();
		System.out.println(text);

		assertEquals(text, "Please provide valid numeric input to Fee column",
				"Warning popup is not showing when user enter alphabetic in fee field");
		System.out.println("Warning popup is showing when user enter alphabetic in fee field");

	}

	public void removeChildEntities() {

		WebElement scrolldown = driver.findElement(SignatoryTitle);
		scrolldown.click();
		common.WaitImp();
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		common.WaitAction();

		WebElement btnRemove = driver.findElement(RemoveChildEntities);
		btnRemove.click();

		System.out.println("User remove child entity successfully");
	}

	public void verifyUploadBulkLetterErrorPopup() {

		WebElement clkButton = driver.findElement(UploadBulkLetterButton);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clkButton.sendKeys("D:\\New folder (2)\\DocumentUpload\\Uploadattachment.pdf");

		String errorText = driver.findElement(By.xpath("(//div[@id='error']) [2]//p")).getText();
		System.out.println(errorText);

		assertEquals(errorText, "Only excel file format(.xls or .xlsx) are allowed to upload!",
				"Warning popup is not showing when user upload invalid file");
		System.out.println("System is showing error popup when user upload invalid file");

		WebElement btnOk = driver.findElement(ErrorOkButton);
		btnOk.click();

	}

	public void clickNoCreateConformationPopup() {

		WebElement clkNo = driver.findElement(NoCreateLetter);
		common.WaitForElementVisibility(NoCreateLetter);
		common.WaitForElementTobeClickable(NoCreateLetter);
		clkNo.click();
	}

	public void clickXbuttonCreateConformationPopup() {

		WebElement clkIcon = driver.findElement(XbuttonCreatePopup);
		common.WaitForElementVisibility(XbuttonCreatePopup);
		common.WaitForElementTobeClickable(XbuttonCreatePopup);
		clkIcon.click();
	}

	public void enterChildEntityForRemove(String childname) {

		WebElement entervalue = driver.findElement(ChildEntitiesRemove);
		entervalue.sendKeys(childname);

	}

	public void clickAddChildEntities() {

		WebElement btnAdd = driver.findElement(AddChildEntities1);
		btnAdd.click();
	}

	public void verifyFieldSuccessPopupBulkLetterScreen() {

		WebElement verifyPopup = driver.findElement(VerifyEditFieldsSuccessPopup);
		String text = verifyPopup.getText();
		System.out.println(text);

		common.WaitAction();

		assertEquals(text, "Field details has been updated successfully", "ErrorToast is not matched");
		System.out.println("Success toast is showing when user edit and update the fields value");

		WebElement clickOkay = driver.findElement(UpdateSucessOkay);
		clickOkay.click();
	}

	public void addEmailAttachmentInBasicDetails() {

		WebElement addAttachment = driver.findElement(AddEmailAttachment);
		addAttachment.click();

	}

	public void clickLoadClientDetailsInClientFlow() {

		common.WaitImp();
		WebElement clkButton = driver.findElement(FetchClientDetailsClientFlow);
		clkButton.click();

	}

}
