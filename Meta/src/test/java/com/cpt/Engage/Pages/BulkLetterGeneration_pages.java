package com.cpt.Engage.Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertListContainsObject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import com.cpt.Engagee.BaseTest;
import com.cpt.Engagee.CommonMethods;
import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Then;

public class BulkLetterGeneration_pages extends CommonMethods {

	By BulkLetterGeneration = By.xpath("//button[@class='btn p-btn mt-3 mt-md-0 ms-md-auto']");
	By CreateBulkLettersBatch = By.xpath("//div//button[text()='Create Bulk Letters in Batch']");
	By PartnerPIC = By.xpath("//div//span[@class='dropdown-btn']");
	By SelectPartner1 = By.xpath("//li//div[text()='Avnet, Erin']");

	
	By Templatedropdown = By.xpath("//div[@class='ng-value-container']");
	By SelectTemplate = By.xpath("//div//span[text()='Trust Tax Eng Letter']");
	By ReturnCode = By.xpath("(//div[@class='col-12 col-md-6 col-lg-3'])[3]//div[@class='multiselect-dropdown']");
	By SelectReturnCode = By.xpath("(//div[@class='dropdown-list']) [2]//ul[@class='item2']//li[1]");
	By Click = By.xpath("//div[@class='d-flex justify-content-lg-end gap-3 flex-wrap']");
	By FetchClientDetails = By.xpath("(//div[@class='d-flex justify-content-lg-end gap-3 flex-wrap']//button[text()='Load Client Details'])[1]");
	By WarningOk = By.xpath("(//div//button[text()='Ok']) [4]");
	By SaveDraft = By.xpath("//div//button[text()='Save as Draft']");
	By YesSaveDraft = By.xpath("(//div[@class='modal-footer']//button[text()='Yes']) [5]");
	By OkButton = By.xpath("(//div//button[@class='success-btn']) [4]");
	By Action = By.xpath("(//tbody//tr//td[@class='text-center align-middle']) [1]");
	By Delete = By.xpath("//span[text()='Delete']");
	By YesDelete = By.xpath("(//div[@class='modal-footer']//button[@class='btn p-btn ms-2']) [3]");
	By OkDelete = By.xpath("(//div[@class='modal-body text-center']) [5] //button");
	By Editbutton = By.xpath("(//tr//td//button[@class='bg-transparent mx-1']) [1]");
	By Closeicon = By.xpath("(//div//button[@aria-label='Close']) [5]");
	By EditField = By.xpath("//li//a//span[@class='p-menuitem-icon edit-feild-icon ng-star-inserted']");
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
	By AddChildEntities = By.xpath("(//button[text()='Add']) [2]");
	By PartnerName = By.xpath("//ng-select[@id='PartnerName']");
	By SelectPartnerName = By.xpath("//div[@role='option']");
	By NoRadio = By.xpath("//input[@id='inlineRadio8']");
	By AddButton = By.xpath("(//button[text()='Add'])[3]");
	By Add = By.xpath("//label[text()='Add ']");
	By ok = By.xpath("(//button[text()='Ok'])[3]");
	By EditAttachment = By.xpath("//div//button[text()=' Edit Attachments']");
	By PreviewAttachment = By.xpath("//a[text()='Preview']");
	By SubmitAttachment = By.xpath("//button[text()='Submit']");
	By CloseAttachment = By.xpath("(//div//button[@class='btn-close mx-3 mt-2 shadow-none']) [2]");
	By Createbulkletter = By.xpath("//div//button[text()='Create Bulk letter']");
	By Okay = By.xpath("(//button[@class='success-btn']) [2]");
	By OkaySuccess = By.xpath("(//div[@class='modal-body text-center']) [8] //button");
	By BasicDetails = By.xpath("//h2[@class='accordion-header']//button");
	By RemovePartner = By.xpath("//div[@class='selected-item ng-star-inserted']//a");
	By PartnerDropdown = By.xpath("//span[text()='Select Partner']");
	By NewPartner = By.xpath("((//ul[@class='item2']) [1]//li[@class='multiselect-item-checkbox ng-star-inserted']) [4]");
	By InfoIcon = By.xpath("(//td//button//img[@alt='Eye-icon']) [1]");
	By PopupVerify = By.xpath("(//tbody[@class='p-datatable-tbody']) [4]//tr[@class='ng-star-inserted'] [1]//td[1]");
	By BatchIDVerify = By.xpath("(//tbody[@class='p-datatable-tbody']) [2]//tr[@class='ng-star-inserted'] [1]//td[1]");
	By ActionVerify = By.xpath("//span[@class='p-menuitem-text ng-star-inserted']");
	By AddClientReturnCode = By.xpath("((//div[@class='row']) [12]//div[@class='col-12 col-md-6 col-lg-3']) [2]");
	By SelectAddClinetReturnCode = By.xpath("//ng-dropdown-panel[@class='ng-dropdown-panel ng-star-inserted ng-select-bottom']//div[@class='ng-dropdown-panel-items scroll-host']");
	By Ok_button_AddClient = By.xpath("(//div[@class='modal-body text-center']) [8]// button");
	By BulkLetterCheckbox = By.xpath("((//tbody[@class='p-datatable-tbody']) [2]//tr[1]//td) [1]");
	By Removeclient = By.xpath("(//div[@class='p-datatable-header ng-star-inserted']//div[@class='table-header d-flex justify-content-between align-items-center ng-star-inserted']//button ) [1]");
	By YesRemoveClient = By.xpath("((//div[@class='modal-content']) [9]//div[3]//button) [2]");
	By OkRemoveClient = By.xpath("((//div[@class='modal-content']) [12]//button) [2]");
	By NewPartnerName = By.xpath("(//div[@class='multiselect-dropdown']) [1]//div[text()=' Bagoff, Gary N. ']");
	By VerifyNewPartner = By.xpath("(//div[@class='p-datatable-scrollable-body ng-star-inserted']//tr[1]//td)[4]");
	
	

	public void ClickBulkLetterButton() {

		WebElement clkBulkLetButton = driver.findElement(BulkLetterGeneration);
		clkBulkLetButton.click();
		WaitAction();
	}

	public void ClickCreateBulkLettersBatch() {

		WebElement clkCreateBulkLetters = driver.findElement(CreateBulkLettersBatch);
		clkCreateBulkLetters.click();
		WaitAction();

	}

	public void SelectPartner() {

		WebElement clkDropdown = driver.findElement(PartnerPIC);
		clkDropdown.click();
		WaitAction();

		WebElement sltPartner1 = driver.findElement(SelectPartner1);
		sltPartner1.click();
//
//		WebElement sltPartner2 = driver.findElement(SelectPartner2);
//		sltPartner2.click();
	}

	public void TemplateDropdown() {

		WebElement clkTemplate = driver.findElement(Templatedropdown);
		clkTemplate.click();
		WaitAction();

		WebElement sltTemplate = driver.findElement(SelectTemplate);
		sltTemplate.click();
		WaitAction();
	}

	public void FetchClientDetails() {

		WebElement clkFetchDetails = driver.findElement(FetchClientDetails);
		clkFetchDetails.click();
		WaitAction();

	}

	public void SaveDraft() {

		WebElement clkSaveDraft = driver.findElement(SaveDraft);
		clkSaveDraft.click();
		WaitAction();

	}

	public void YesButtonSaveDraft() {

		WebElement clkYes = driver.findElement(YesSaveDraft);
		clkYes.click();
		WaitAction();
	}

	public void OkSaveDraft() {

		WebElement clkOk = driver.findElement(OkButton);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clkOk);

		WaitAction();

	}

	public void ActionButton() {

		WebElement btnAction = driver.findElement(Action);
		btnAction.click();
		WaitAction();

	}

	public void DeleteButton() {

		WebElement btnDelete = driver.findElement(Delete);
		btnDelete.click();
		WaitAction();

	}

	public void YesDeleteButton() {

		WebElement btnYes = driver.findElement(YesDelete);
		btnYes.click();
		WaitAction();
	}

	public void OkDeleteButton() {

		WebElement btnOk = driver.findElement(OkDelete);
		btnOk.click();
		WaitAction();
	}

	public void OkWarning() {

		WebElement btnOk = driver.findElement(WarningOk);
		btnOk.click();
		WaitAction();

	}

	public void Editbutton() {

		WebElement btnEdit = driver.findElement(Editbutton);
		btnEdit.click();
		WaitAction();

	}

	public void CloseIcon() {

		WebElement iconClose = driver.findElement(Closeicon);
		iconClose.click();
		WaitAction();
	}

	public void ClickEditFields() {

		WebElement btnEditField = driver.findElement(EditField);
		btnEditField.click();
		WaitAction();
	}

	public void ValuesZip() {

		WebElement valueZip = driver.findElement(Zip);

		valueZip.click();
		valueZip.clear();
		valueZip.sendKeys("10045");
		WaitAction();
	}

	public void ValueAddress() {

		WebElement Valuesaddress = driver.findElement(Address);
		Valuesaddress.click();
		Valuesaddress.clear();
		Valuesaddress.sendKeys("11, White town");
		WaitAction();

	}

	public void ValuesSignatoryTitle() {

		WebElement valueSignatoryTitle = driver.findElement(SignatoryTitle);
		valueSignatoryTitle.click();
		valueSignatoryTitle.clear();
		valueSignatoryTitle.sendKeys("Signature");
		WaitAction();
	}

	public void ValuesSignatoryLastName() {

		WebElement ValuesSignatoryLastName = driver.findElement(SignatoryLastName);
		ValuesSignatoryLastName.click();
		ValuesSignatoryLastName.clear();
		ValuesSignatoryLastName.sendKeys("Kennedy");
		WaitAction();

	}

	public void ValuesSignatoryFirstName() {

		WebElement ValuesSignatoryFirstName = driver.findElement(SignatoryFirstName);
		ValuesSignatoryFirstName.click();
		ValuesSignatoryFirstName.clear();
		ValuesSignatoryFirstName.sendKeys("John");
		WaitAction();

	}

	public void ButtonUpdate() {

		WebElement btnUpdate = driver.findElement(Update);
		btnUpdate.click();
		WaitAction();

	}

	public void ButtonOkay() {

		WebElement btnOkay = driver.findElement(Ok_Button);
		btnOkay.click();
		WaitAction();

	}

	public void ButtonPreview() {

		WebElement btnPreview = driver.findElement(Preview);
		btnPreview.click();
		WaitMore();

	}

	public void buttonClose() {

		WebElement btnClose = driver.findElement(Close);
		btnClose.click();
		WaitAction();
	}

	public void buttonAddClient() {

		WebElement btnAddClient = driver.findElement(AddClient);
		btnAddClient.click();
		WaitAction();

	}

	public void enterClientID() {

		WebElement enterClientID = driver.findElement(ClientID);
		enterClientID.sendKeys("10496");
		WaitAction();

	}

	public void enterSignatoryEmail() {

		WebElement enterSignatoryEmail = driver.findElement(Signatory_Email_ID);
		enterSignatoryEmail.sendKeys("testengage83@gmail.com");
		WaitAction();
	}

	public void enterClientName() {

		WebElement enterClientName = driver.findElement(ClientName);
		enterClientName.sendKeys("John Mathews");
		WaitAction();

	}

	public void enterState() {

		WebElement enterState = driver.findElement(State);
		enterState.sendKeys("NY");
		WaitAction();

	}

	public void enterCity() {

		WebElement enterCity = driver.findElement(City);
		enterCity.sendKeys("New York");
		WaitAction();

	}

	public void enterChildEntities() {

		WebElement enterChildEntities = driver.findElement(ChildEntities);
		enterChildEntities.sendKeys("V3 child entities");
		WaitAction();
	}

	public void AddChildEntities() {

		WebElement enterChildEntities = driver.findElement(AddChildEntities);
		enterChildEntities.click();
		WaitAction();
	}

	public void enterPartnerName() {

		WebElement enterPartnerName = driver.findElement(PartnerName);
		enterPartnerName.click();
		WaitAction();

	}

	public void selectPartnerName() {

		WebElement selectPartnerName = driver.findElement(SelectPartnerName);
		selectPartnerName.click();
		WaitAction();

	}

	public void selectNoRadioButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");

		WebElement elementToClick = driver.findElement(NoRadio);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", elementToClick);
		WaitAction();

	}

	public void AddClientFinal() throws InterruptedException {

		WebElement elementToClick = driver.findElement(AddButton);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", elementToClick);
		WaitAction();
		

	}

	public void addAttachment() {

		WebElement addfile = driver.findElement(Add);
		addfile.click();

		WaitAction();

	}

	public void clickEditAttachment() {
		WebElement clkEditAttachment = driver.findElement(EditAttachment);
		clkEditAttachment.click();
		WaitAction();

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
		
		WebElement clkPartnerDropdown = driver.findElement(PartnerDropdown);
		clkPartnerDropdown.click();
	}
	
	public void selectNewPartner() {
		
		WebElement selectNewPartner = driver.findElement(NewPartner);
		selectNewPartner.click();
	}
	
	public void clickInfo() {
		
		WebElement clkInfo = driver.findElement(InfoIcon);
		clkInfo.click();
		WaitAction();
		
		WebElement valueBatchID = driver.findElement(BatchIDVerify);
		String value = valueBatchID.getText();
		System.out.println(value);
		
		
		WebElement popup = driver.findElement(PopupVerify);
		String	list = popup.getText();
		System.out.println(list);
		
		WaitAction();
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
	
	public void clickReturnCode() {
		
		WebElement clkReturnCode = driver.findElement(ReturnCode);
		clkReturnCode.click();

	}
	
	public void SelectReturnCode() {
		
		WebElement sltReturnCode= driver.findElement(SelectReturnCode);
		sltReturnCode.click();
		
	}
	
	public void clkDropDownClose() {
		
		WebElement clk = driver.findElement(Click);
		clk.click();

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
	
	public void verifyPartnerChanged() {
		
		WebElement newPartner = driver.findElement(NewPartnerName);
		String newPartnerName = newPartner.getText();
		System.out.println(newPartnerName);
		
		
		WebElement partnerName = driver.findElement(VerifyNewPartner);
		String verifyPartnerName = partnerName.getText();
		System.out.println(verifyPartnerName);
		
		WaitAction();
		
		assertEquals(newPartnerName, verifyPartnerName , "Partner Name is not changed");
		System.out.println("Partner Name is changed successfully");
		
		
	}
	
	
	}
	

	
	

