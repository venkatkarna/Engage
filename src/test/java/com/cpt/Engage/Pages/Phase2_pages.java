package com.cpt.Engage.Pages;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.interactions.Actions;

import com.cpt.Engagee.BaseTest;
import com.cpt.Engagee.CommonMethods;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Phase2_pages extends BaseTest {

	CommonMethods common = new CommonMethods();
	Actions a;

	By ChooseParagraphButton = By.xpath("//button[text()=' Choose Paragraphs ']");
	By QuestionOptions = By.xpath("//fieldset[@class='sv_qcbc']//div//label");
	By SecondQuestionOptions = By.xpath("(//fieldset)[2]//div//label");
	By ThirdQuestionOptions = By.xpath("//div[@id='sq_102']//label");
	By FinanceChargesDisbale = By.xpath("(//fieldset[@class='sv_qcbc']) [2]//label//input");
	By SubmitChooseParagraphConfirmQuestion = By.xpath("//div[@id='viewChooseParatemplate']//button[text()='Submit']");
	By SubmitChooseParargaphInDashboard = By.xpath("//div[@id='viewChooseParaTemplate']//button[text()='Submit']");
	By SubmitChooseParagraphAfterLoadClientDetails = By
			.xpath("//div[@id='viewtemplate']//div[@id='viewChooseTemplate']//button[text()='Submit']");

	By SuccessPopup = By.xpath("//div[@id='successModal']//p");
	By SuccessPopupClientBased = By
			.xpath("//div[@id='SuccessModalblocks']//p[text()='Paragraph(s) are changed successfully']");
	By successPopupAfterLoadClient = By
			.xpath("//div[@id='SuccessModalblocks']//div[@class='modal-body text-center']//p [1]");
	By OkButton = By.xpath("//button[text()='Ok']");
	By SelectCheckbox = By.xpath("((//tbody[@class='p-datatable-tbody']) [2]//tr//td//input) [1]");
	By EditParagraphButton = By
			.xpath("//div[@class='p-datatable-header ng-star-inserted']//button[text()='Edit Paragraphs ']");
	By SelectFeeBlock = By.xpath("//strong[text()='Invoicing and Collection']");
	By ContentEdit = By
			.xpath("(//body[@contenteditable='true']//span[@style='font-family:Arial,Helvetica,sans-serif']) [2]");
	By UpdateEditParagraph = By.xpath("//div[@class='modal-footer border-0']//button[text()='Update']");
	By SuccessPopupAfterEditBlock = By.xpath("//div[@id='successModal']//div[@class='modal-body text-center']//p");
	By OkayButtonSuccessPopup = By.xpath("//div[@id='success'][2]//button[text()='Ok']");
	By LoadClientDetailsButton = By.xpath("(//button[text()=' Load Client Details ']) [1]");
	By CloseButtonChooseParagraph = By.xpath("(//div[@class='modal-footer']) [10]//button[text()='Close']");
	By CloseIconChooseParagraph = By
			.xpath("//div[@class='modal-header border-0 px-4 py-3']//button[@class='btn-close shadow-none']");
	By WarningPopupWithoutQuestionOptions = By
			.xpath("(//div[@id='commonerror']) [2]//div[@class='modal-body text-center']//p");
	By WarningOkayButton = By.xpath("(//div[@id='commonerror']) [2]//button[text()='Ok']");
	By ChooseParagraphButtonBulkLetterGeneration = By
			.xpath("//div[@class='p-datatable-header ng-star-inserted']//button[text()='Choose Paragraphs ']");
	By EditParagraphButtonBulkLetterGeneration = By
			.xpath("//div[@class='p-datatable-header ng-star-inserted']//button[text()='Edit Paragraphs ']");
	By SelectAllClientLettersCheckBox = By.xpath(
			"(//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']//thead[@class='p-datatable-thead']//th [1])//input");
	By WarningPopupDifferentContent = By.xpath("//div[@id='displayEditParaErrorModal']//p");
	By SubmitButtonEditParagraph = By.xpath("(//div[@id='viewtemplate']) [3]//button[text()='Submit']");
	By SuccessPopupAfterParagraphEdit = By.xpath("(//div[@id='success']) [2]//div[@id='successModalblocks']//p");
	By SuccessPopupAfterParagraphEditAfterLoadClient = By
			.xpath("//div[@id='successModal']//p[text()='Paragraph content updated successfully']");
	By CreateLettersInBatchButton = By
			.xpath("//div[@class='text-md-end mb-32']//button[text()='Create Bulk Letters in Batch']");
	By WarningPopupEditParagraphDifferentContent = By.xpath("//div[@id='displayEditParaErrorModal']//p");
	By WarningPopupInputFieldValue = By
			.xpath("//div[@id='displayWarningModal']//div[@class='modal-body text-center']//p");

	By FeeWarning = By.xpath("//div[@id='displayWarningModal']");
	By FeeWarningOkButton = By.xpath("//div[@id='displayWarningModal']//button[text()='Ok']");
	By SecondQuestion = By.xpath("//span[text()='Do you want to include Administrative Fee?']");
	By StatusField = By.xpath(
			"((//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']) [1]//thead[@class='p-datatable-thead']//tr[@class='ng-star-inserted']) [2]//th [1]//input");
	By EditAttachmentButton = By
			.xpath("//div[@class='p-datatable-header ng-star-inserted']//div//button[text()=' Edit Attachments']");
	By PreviewAddAttachmentPopup = By.xpath("(//div[@id='add-attachment']) [2]//a[@title='Preview']//i");
	By RemoveAddAttachmentPopup = By.xpath("(//div[@id='add-attachment']) [2]//i[@title='Delete']");
	By ClosePreview = By.xpath("//div[@id='preview_doc'] [2]//div[@class='modal-content']//button");
	By SuccessToastAfterAddedAttachment = By.xpath(
			"//div[@id='attachmentsuccess']//p[text()='Attachment(s) are successfully added to the bulk letters']");
	By Add = By.xpath("(//div[@id='add-attachment']) [2]//div[@class='position-relative file-upload'] //input");
	By WarningPopupSameAttachment = By.xpath("//div[@id='displayWarningModal']//p[1]");
	By ErrorPopupInvalidFileUpload = By.xpath("//div[@id='attachmenterrorModal']//p");
	By SubmitButtonAddAttachment = By.xpath("(//div[@id='add-attachment']) [2]//button[text()='Submit']");
	By Form7216AvaibaleEditFields = By.xpath("//button[text()='Edit 7216 Provider ']");
	By Form7216AvailableAddNewClient = By
			.xpath("(//div[@id='ClientIfovalues']) [2]//label[text()='Parent 7216 Available?']");
	By YesButton7216Form = By.xpath("(//input[@name='editField7216available']) [1]");
	By NoButton7216Form = By.xpath("(//input[@name='editField7216available']) [2]");
	By Update = By.xpath("//div//button[text()='Update']");
	By VerifyEditFieldsSuccessPopup = By
			.xpath("//div[@id='success']//p[contains(text(), 'Field details has been updated successfully')]");
	By OkayAfterUpdate7216 = By
			.xpath("//div[@id='successUpdate']//div[@class='modal-body text-center']//button[text()='Ok']");
	By UpdateSucessOkay = By.xpath("(//div[@id='success']) [4]//button[text()='Ok']");
	By VerifyRadioButtonSelected7216 = By.xpath("//input[@id='7216inlineRadio1']");
	By VerifyRadioButtonSelected7216InAddClient = By.xpath("//input[@id='addClient7216inlineRadio2']");
	By TaxYearBasicDetails = By.xpath("//ng-multiselect-dropdown[@formcontrolname='selectedYearsform']");
	By TaxYearBasicDetailsList = By.xpath("(//div[@class='dropdown-list']) [3]//ul[@class='item2']//li");
	By ClickTaxYear = By.xpath("//span[@class='dropdown-btn']//span[contains(text(), 'Tax')]");

	By CloseIconTaxYearBasicDetails = By.xpath("(//div[@class='selected-item ng-star-inserted']) [3]//a");
	By SelectAllTaxYearBasicDetails = By.xpath("(//div[text()='Select All']) [3]");
	By Edit7216FormButton = By
			.xpath("//div[@class='p-datatable-header ng-star-inserted']//div//button[text()='Edit 7216 Provider ']");
	By Edit7216FormCkEditorTitle = By.xpath("//div[@id='Edit7216']//h5[text()='Edit 7216 Provider']");
	By CloseIconEdit7216CKEditor = By.xpath("//div[@id='Edit7216']//button[@class='btn-close shadow-none']");
	By CancelIconEdit7216CKEditor = By.xpath("//div[@id='Edit7216']//button[text()='Cancel']");
	By UpdateButtonEdit7216CKEditor = By.xpath("//div[@id='Edit7216']//button[text()='Update']");
	By SuccessToastAfter7216Update = By.xpath("//div[@id='successUpdate']//p");
	By NoteText7216CkEditor = By
			.xpath("//div[@class='modal-footer border-0 p-0 d-flex flex-column align-items-start']//span");
	By BasedOnClient = By.xpath("//div[@id='client']");
	By BasedOnTemplate = By.xpath("//div[@id='template']");
	By ClickContinue = By.xpath("//button[text()='Continue']");
	By SearchValue = By.xpath("//div[@id='searchfilter']//input");
	By AttachWithEmail = By.xpath("//input[@value='Email']");
	By AttachWithLetter = By.xpath("//input[@value='Letter']");
	By TemplateMenuBar = By.xpath("(//nav[@id='sidebar']//ul[@id='menu']//a[@class='nav-link']) [5]");
	By AddTemplate = By.xpath("//main[@id='maintoggledrop']//button[text()='Add']");
	By AddAttachmentTemplateScreen = By.xpath(
			"//div[@class='mt-3 mt-lg-4 d-flex flex-wrap justify-content-lg-end gap-3']//button[text()=' Add Attachments']");
	By AddAttachmentIconTemplateScreen = By.xpath("(//div[@class='position-relative file-upload']) [1]//input");
	By EditIconInTemplateScreen = By.xpath("(//a[text()=' Edit ']) [1]");
	By EditAttachmentInTemplateScreen = By.xpath(
			"//div[@class='mt-3 mt-lg-4 d-flex flex-wrap justify-content-lg-end gap-3']//button[text()=' Edit Attachments']");

	By CloseUploadAttachment = By.xpath("(//button[text()='Close']) [3]");
	By VerifyWarningContentUploadAttachmentPopup = By.xpath("(//div[@class='modal-content p-4']) [1]//p//b");
	By VerifyPopupTitle = By.xpath("(//div[@id='add-attachment']) [2]//h5[text()='Upload Attachments ']");
	By ClientNameRadioButton = By.xpath("//div[@id='basic-details']//input[@id='client-name-radio']");
	By EmailAddressRadioButton = By.xpath("//div[@id='basic-details']//input[@id='email-radio']");
	By ClientNameIdDropdown = By
			.xpath("//div[@id='basic-details']//div[@class='ng-tns-c109-24 p-multiselect p-component']");
	By ClientNameDropdownInAddNewClientScreen = By.xpath("//ng-select[@placeholder='Select Clients']");
	By EmailAddressDropdown = By.xpath("//div[@id='basic-details']//div[@class='ng-value-container']");
	By NextButtonInBasicDetails = By.xpath(
			"(//div[@id='basic-details']) [2]//div[@class='d-flex justify-content-end flex-wrap gap-3 mt-2 mt-lg-3']//button[text()='Next']");
	By TemplateDropdownInBasicDetails = By.xpath(
			"//div[@id='collapseAccordianTwo']//div[@class='p-datatable-scrollable-body ng-star-inserted']//div[@class='ng-input']//input");
	By ChooseTemplateInBasicDetails = By.xpath("//div[@class='ng-option ng-star-inserted']");
	By ReturnTypeCodeInBasicDetails = By.xpath(
			"(//div[@id='collapseAccordianTwo']//div[@class='p-datatable-scrollable-body ng-star-inserted']//div[@class='ng-input']//input) [2]");

	By ChooseParagraphIconInBasicDetails = By
			.xpath("((//tbody[@class='p-datatable-tbody']) [2]//td[@class='text-center']) [1]//span");
	By SubmitChooseParagraphInBasicDetails = By
			.xpath("//div[@id='viewChooseTemplate']//button[@id='submitQuestionBlocks']");
	By AddEmailAttachmentButton = By.xpath("//button[text()=' Add Bulk Attachments to Email']");
	By SuccessPopupAfterAttachmentAddedInEmail = By
			.xpath("//div[@id='attachmentsuccess']//p[contains(text(), 'Attachments')]");
	By ClientIDAddClientScreen = By.xpath("//div[@id='ClientId']//input");
	By ChildClientID = By.xpath("//input[@id='Childclientid']");
	By ChildClientIDInAddNewClient = By.xpath("(//input[@id='Childclientid']) [2]");
	By VerifyContentChildClientID = By.xpath("//label[@class='errorcolor']");
	By AddedChildClientNames = By.xpath("(//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']) [2]");
	By AddChildClient = By.xpath("//button[text()='Add']");
	By AddChildClientInAddNewClient = By.xpath("((//div[@id='bulk-letter-add-field']) [2]//button[text()='Add']) [2]");
	By ChildClientName = By.xpath("(//input[@id='ChildEntities']) [1]");
	By WarningLabeMoreNoOfClientID = By.xpath("//div[@class='errorvl ng-star-inserted']//label");
	By WarningLabelInChildClientName = By.xpath("//div[@class='errorvl ng-star-inserted']//label");
	By ChildClientNameInAddNewClientScreen = By.xpath("(//input[@id='ChildEntities']) [2]");
	By WarningLabelBelowFiveCharacter = By.xpath("//div[@class='errorvl ng-star-inserted']//label");
	By DeleteIconChildClient = By.xpath(
			"(//div[@class='p-datatable-scrollable-body ng-star-inserted']) [2]//tbody[@class='p-datatable-tbody']//button[@ptooltip='Delete']");
	By Clickstatus = By.xpath("(//div[@class='ng-value-container']) [11]");
	By StatusDropdownOptions = By.xpath("//div[@class='scrollable-content']//div[@role='option']");
	By FetchClientDetailsClientFlow = By
			.xpath("//div[@id='collapseAccordianOne']//button[text()=' Load Client Details ']");
	By ActionClientFlow = By.xpath(
			"(//div[@class='p-datatable-scrollable-body ng-star-inserted']) [2]//tbody[@class='p-datatable-tbody']//td[@class='text-center align-middle']//i");
	By AddressLine1 = By.xpath("//div[@id='mddformbody']//label[text()='AddressLine1 ']");
	By AddressLine2 = By.xpath("//div[@id='mddformbody']//label[text()='AddressLine2']");
	By AddressLine3 = By.xpath("//div[@id='mddformbody']//label[text()='AddressLine3']");
	By OfficeAddressLine1 = By.xpath("//div[@id='officedetails']//label[text()='Office Address Line1 ']");
	By OfficeAddressLine2 = By.xpath("//div[@id='officedetails']//label[text()='Office Address Line2 ']");
	By OfficeAddressLine3 = By.xpath("//div[@id='officedetails']//label[text()='Office Address Line3 ']");
	By ClickPartnerDropdownInEditFields = By
			.xpath("(//div[@id='officedetails']//div[@class='ng-value-container']) [1]");
	By ClickOfficeDropdownInEdditFields = By
			.xpath("(//div[@id='officedetails']//div[@class='ng-value-container']) [2]");
	By SelectPartnerFromPartnerDropdownList = By
			.xpath("//div[@class='ng-dropdown-panel-items scroll-host']//div[@role='option']");
	By selectOfficeFromOfficeDropdownList = By
			.xpath("//div[@class='ng-dropdown-panel-items scroll-host']//div[@role='option']");
	By UpdateButtonInEditFieldScreen = By.xpath("(//button[text()='Update']) [2]");
	By AddBulkAttachmentsToEmail = By.xpath("//button[text()=' Add Bulk Attachments to Email']");
	By SendSigningReminderTitle = By.xpath("//div[@id='emailRemainderConfirm']//h5[text()='Send Signing Reminder']");
	By YesButtonInSendSigningReminder = By.xpath("//div[@id='emailRemainderConfirm']//button[text()='Yes']");
	By VerifySuccessToastAfterSendSigningReminder = By.xpath(
			"//div[@id='EmailRemainderSuccessModal']//p[text()='E-Signing reminder email has been sent successfully']");
	By NoButtonInSendSigningReminder = By.xpath("//div[@id='emailRemainderConfirm']//button[text()='No']");
	By YesButtonInCancelConfirmPopup = By.xpath("(//div[@id='cancelSigningModal']) [2]//button[text()='Yes']");
	By VerifyResendPopup = By.xpath("//h5[text()='Resend the letter for signing']");
	By OkButtonInCancelSuccessPopup = By.xpath("(//div[@id='success']) [2]//button[text()='Ok']");
	By ChildFeeInEditFields = By.xpath("(//div[@id='ClientIfovalues']) [1]//label[@for='ChildFees']");
	By EnterChildFeeInEditFields = By.xpath("(//div[@id='ClientIfovalues']) [1]//input[@id='ChildFees']");
	By ChildSameIdErrorPopup = By.xpath(
			"//div[@id='errorModalBlocks']//p[text()=' Child client ID already available, please provide different child client ID and try again']");
	By ChildSameNameErrorPopup = By.xpath(
			"//div[@id='errorModalBlocks']//p[text()=' Child client name already available, please provide different child client name and try again']");
	By SuccessToastAfterEditQuestionOptions = By.xpath("(//div[@id='success']) [4]//p");
	By SearchColumnValue = By.xpath("//div[@id='searchfilter']//input");
	By SelectCertainClients = By.xpath("//form[@id='bulkletterform']//input[@id='search-client-radio']");
	By CloseClientNameDropdown = By
			.xpath("//button[@type='button']//span[@class='p-multiselect-close-icon pi pi-times ng-tns-c109-24']");
	By SelectNonEditableBlock = By.xpath("(//div[@class='edit_text']) [3] // b[2]");
	By YesRadioButtonChild7216Form = By.xpath("//input[@id='inlineRadioYes0']");
	By NoRadioButtonChild7216Form = By.xpath("//input[@id='inlineRadioNo0']");
	By Child7216FormTitle = By.xpath("//th[text()=' Child 7216 Available ']");
	By AddClientButton = By.xpath("(//div[@id='basic-details']) [2]//button[text()='Add Client ']");
	By AddButtonInAddNewClient = By.xpath("((//div[@id='bulk-letter-add-field']) [2]//button[text()='Add']) [2]");
	By EnterClientNameInAddNewClient = By.xpath("(//div[@class='ng-input']) [6]//input");
	By SuccessToastAfterAddedNewClientInNewFlow = By
			.xpath("//div[@id='successModal']//p[text()='New client details has been added successfully']");
	By AddNewClientRadioButton = By.xpath("//input[@id='add-new-client-radio']");
	By TemplateNameFieldInEditFieldScreen = By.xpath("(//label[text()='Template name ']) [1]");
	By TemplateNameFieldDisabled = By.xpath("(//input[@id='templateName']) [1]");

	public void clickChooseParagraphButton() {

		common.WaitAction();
		WebElement clkButton = driver.findElement(ChooseParagraphButton);
		clkButton.click();

	}

	public void getFirstQuestionOptions(String questionoptions) {

		List<WebElement> questionOptions = driver.findElements(QuestionOptions);

		for (WebElement question : questionOptions) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (question.getText().trim().equalsIgnoreCase(questionoptions)) {
				question.click();
				break;
			}

		}

	}

	public void getSecondQuestionOptions(String secondquestionoption) {

		try {

			List<WebElement> questionOptions = driver.findElements(SecondQuestionOptions);

			for (WebElement question : questionOptions) {

				if (question.getText().trim().equalsIgnoreCase(secondquestionoption)) {
					question.click();
					break;
				}
			}

		} catch (Exception e) {

		}

	}

	public void getThirdQuestionOptions(String thirdquestion) {

		try {
			List<WebElement> questionOptions = driver.findElements(ThirdQuestionOptions);

			for (WebElement question : questionOptions) {

				if (question.getText().trim().equalsIgnoreCase(thirdquestion)) {
					question.click();
					break;

				}
			}
		} catch (Exception e) {

		}
	}

	public void clickSubmitChooseParagraph() {

		WebElement clkButton = driver.findElement(SubmitChooseParagraphConfirmQuestion);
		clkButton.click();
	}

	public void verifySuccessPopupAfterSubmitQuestionOptions() {

		WebElement verifyText = driver.findElement(SuccessPopup);
		String text = verifyText.getText();
		System.out.println(text);

		assertEquals(text, "Paragraphs are included successfully. Please load the client details and proceed further",
				"Success toast is not matched");
		System.out.println(
				"Success toast is showing correctly when user submit the question options in choose paragraph screen");

		common.WaitImp();

		WebElement btnclick = driver.findElement(By.xpath("//button[@id='succesOk']"));
		btnclick.click();

	}

	public void selectLetterByClickOnCheckbox() {

		WebElement selectLetter = driver.findElement(SelectCheckbox);
		selectLetter.click();

	}

	public void clickEditParagraphButton() {

		WebElement clkEditParagraph = driver.findElement(EditParagraphButton);
		clkEditParagraph.click();

	}

	public void selectFeeBlock() {

		List<WebElement> selectBlocks = driver.findElements(SelectFeeBlock);

		for (WebElement blocktitle : selectBlocks) {
			if (blocktitle.isDisplayed()) {
				blocktitle.click();
				break;
			}
		}

	}

	public void editFeeBlock(String editText) {

		driver.switchTo().frame(0);
		common.WaitImp();
		WebElement editContent = driver.findElement(ContentEdit);
		editContent.click();
		editContent.sendKeys(editText);
		driver.switchTo().defaultContent();

	}

	public void clickUpdateButton() {

		WebElement clkUpdateButton = driver.findElement(UpdateEditParagraph);
		clkUpdateButton.click();

	}

	public void verifySuccessPopupAfterEditBlock() {

		WebElement verifySuccessPopup = driver.findElement(SuccessPopupAfterEditBlock);
		String text = verifySuccessPopup.getText();
		System.out.println(text);

		assertEquals(text, "Paragraph content updated successfully", "Success toast is not matched");
		System.out.println(
				"Success toast is showing correctly when user submit the question options in choose paragraph screen");

		common.WaitImp();
		driver.findElement(OkayButtonSuccessPopup).click();

	}

	public void verifyLoadClientDetailsButtonDisbaledorEnabled() {

		WebElement btnLoadClientDetails = driver.findElement(LoadClientDetailsButton);
		if (btnLoadClientDetails.isEnabled()) {
			System.out.println("Load client details Button is enabled.");
		} else {
			System.out.println("Load client Details Button is disabled.");
		}
	}

	public void verifyChooseParagraphButton() {

		WebElement btnChooseParagraph = driver.findElement(ChooseParagraphButton);
		if (btnChooseParagraph.isEnabled()) {
			System.out.println("Choose paragraph Button is enabled");
		} else {

			System.out.println("Choose paragraph Button is disabled.");
		}

	}

	public void verifyEditParagraphButton() {

		WebElement btnEditParagraph = driver.findElement(EditParagraphButton);
		if (btnEditParagraph.isEnabled()) {
			System.out.println("Edit paragraph button is enabled");
		} else {
			System.out.println("Edit paragraph button is disbaled");
		}

	}

	public void clickCloseButtonChooseParagraph() {

		WebElement btnClose = driver.findElement(CloseButtonChooseParagraph);
		btnClose.click();
	}

	public void clickCloseIconChooseParagraph() {

		WebElement btnClose = driver.findElement(CloseIconChooseParagraph);
		btnClose.click();
	}

	public void verifyWarningPopupContentWithoutQuestionOptions() {

		WebElement verifyWarningContent = driver.findElement(WarningPopupWithoutQuestionOptions);
		String text = verifyWarningContent.getText();
		System.out.println(text);

		assertEquals(text, "Please choose the paragraph(s) to continue", "Success toast is not matched");
		System.out.println(
				"Warning toast is showing correctly when user submit without question options in choose paragraph screen");

		common.WaitImp();
		driver.findElement(WarningOkayButton).click();

	}

	public void verifyChooseParagraphButtonAfterLoadClientDetails() {

		WebElement btnChooseParagraph = driver.findElement(ChooseParagraphButtonBulkLetterGeneration);
		if (btnChooseParagraph.isEnabled()) {
			System.out.println("Button is enabled");
		} else {

			System.out.println("Choose paragraph Button is disabled by default.");
		}

	}

	public void selectAllClientLettersByClickingCheckbox() {

		WebElement clkCheckbox = driver.findElement(SelectAllClientLettersCheckBox);
		clkCheckbox.click();
	}

	public void clickChooseParagraphButtonBulkLetterGenerationScreen() {

		WebElement btnChooseParagraph = driver.findElement(ChooseParagraphButtonBulkLetterGeneration);
		btnChooseParagraph.click();
	}

	public void changeQuestionOptionsChooseParagraphScreen(String changequestionoptions) {

		List<WebElement> questionOptions = driver.findElements(QuestionOptions);

		for (WebElement question : questionOptions) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (question.getText().trim().equalsIgnoreCase(changequestionoptions)) {
				question.click();
				break;
			}

		}

	}

	public void verifyWarningpopupWithDifferentContent() {

		WebElement contentVerification = driver.findElement(WarningPopupDifferentContent);
		String text = contentVerification.getText();
		System.out.println(text);

		assertEquals(text, "To edit the selected letters, ensure their paragraph choices are identical.",
				"Warning toast is not matched");
		System.out.println("Warning toast is showing correctly when user try to edit paragraph with different content");

		WebElement btnClick = driver
				.findElement(By.xpath("//div[@id='displayEditParaErrorModal']//button[text()='Ok']"));
		btnClick.click();

	}

	public void clickSubmitButtonEditParagraph() {

		WebElement clkSubmit = driver.findElement(SubmitButtonEditParagraph);
		clkSubmit.click();

	}

	public void verifySuccessPopupAfterParagraphEdit() {

		WebElement verifyContent = driver.findElement(SuccessPopupAfterParagraphEditAfterLoadClient);
		String text = verifyContent.getText();
		System.out.println(text);

		assertEquals(text, "Paragraph content updated successfully", "Success toast is not matched");
		System.out.println("Success toast is showing correctly when user submit after edit the paragraphs");

		common.WaitImp();
		WebElement btnClick = driver.findElement(By.xpath("//div[@id='successModal']//button[text()='Ok']"));
		btnClick.click();

	}

	public void verifyCreateLettersInBatchDisabled() {

		WebElement btnVerification = driver.findElement(CreateLettersInBatchButton);

		if (btnVerification.isEnabled()) {
			System.out.println("Button is enabled.");
		} else {
			System.out.println("Create Letters in batch Button is disabled.");
		}
	}

	public void clickSubmitButtonInChooseParagraphAfterLoadClient() {

		WebElement clkSubmit = driver.findElement(SubmitChooseParagraphAfterLoadClientDetails);
		clkSubmit.click();

	}

	public void verifySuccessPopupAfterLoadClient() {

		WebElement verifyPopup = driver.findElement(successPopupAfterLoadClient);

		String text = verifyPopup.getText();
		System.out.println(text);

		assertEquals(text, "Paragraph(s) are changed successfully", "Success toast is not matched");
		System.out.println(
				"Success toast is showing correctly when user change the question options in choose paragraph screen after load client details");

		common.WaitImp();

		driver.findElement(By.xpath("//button[@id='successBlocksOk']")).click();

	}

	public void verifySuccessPopupAfterEditParagraph() {

		WebElement verifyPopup = driver.findElement(SuccessPopupAfterParagraphEdit);
		String text = verifyPopup.getText();
		System.out.println(text);

		assertEquals(text, "Paragraph content updated successfully", "Success toast is not matched");
		System.out.println("Success toast is showing correctly when user edit the paragraph after load client details");

		common.WaitImp();

		driver.findElement(By.xpath("(//div[@id='success']) [2]//div[@id='successModal']//button[text()='Ok']"))
				.click();

	}

	public void verifyWarningpopupEditParagraphWithDifferentContent() {

		WebElement contentVerification = driver.findElement(WarningPopupDifferentContent);
		String text = contentVerification.getText();
		System.out.println(text);

		assertEquals(text, "To edit the selected letters, ensure their contents are identical.",
				"Warning toast is not matched");
		System.out.println("Warning toast is showing correctly when user try to edit paragraph with different content");

		WebElement btnClick = driver
				.findElement(By.xpath("//div[@id='displayEditParaErrorModal']//button[text()='Ok']"));
		btnClick.click();

	}

//	public void selectOptionsfromActionMenu(String actionmenu) {
//	    List<WebElement> actionMenu = driver.findElements(By.xpath("//div[contains(@class, 'p-menu')]//a"));
//
//	    for (WebElement menu : actionMenu) {
//	        try {
//	            // Explicit wait for the element to be visible and clickable
//	           CommonMethods.WaitForElementVisibility(menu);
//	            wait.until(ExpectedConditions.elementToBeClickable(menu));
//
//	            // Scroll the element into view
//	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menu);
//
//	            if (menu.getText().trim().equalsIgnoreCase(actionmenu)) {
//	                Actions actions = new Actions(driver);
//	                actions.moveToElement(menu).click().perform();
//	                break;
//	            }
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            // Optionally add retry logic here if necessary
//	        }
//	    }
//	}
	public void selectOptionsfromActionMenu(String actionmenu) {

		List<WebElement> actionMenu = driver.findElements(By.xpath("//div[contains(@class, 'p-menu')]//a"));

		for (WebElement menu : actionMenu) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (menu.getText().trim().equalsIgnoreCase(actionmenu)) {

				a = new Actions(driver);
				a.moveToElement(menu).click().perform();
				break;
			}
		}
	}

	public void verifyWarningPopupInputFieldValue() {

		WebElement verifyPopup = driver.findElement(WarningPopupInputFieldValue);
		String text = verifyPopup.getText();
		System.out.println(text);

		assertEquals(text, "Please provide inputs to all the fields and then try again",
				"Warning toast is not matched");
		System.out
				.println("Warning toast is showing correctly when user try to preview the letter without field value");

		WebElement btnClick = driver.findElement(By.xpath("//div[@id='displayWarningModal']//button[text()='Ok']"));
		btnClick.click();

	}

	public void selectContentInFeeBlockAndClear() throws AWTException {

		driver.switchTo().frame(0);

		WebElement contentArea = driver.findElement(
				(By.xpath("//body [@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")));

		contentArea.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "var element = arguments[0];" + "var range = document.createRange();"
				+ "range.selectNodeContents(element);" + "var selection = window.getSelection();"
				+ "selection.removeAllRanges();" + "selection.addRange(range);";
		js.executeScript(script, contentArea);

		String clearTextScript = "var element = arguments[0];" + "element.innerHTML = '';";
		js.executeScript(clearTextScript, contentArea);

		try {
			Thread.sleep(3000); // 3 seconds delay
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Switch back to the default content
		driver.switchTo().defaultContent();

	}

	public void feeWarningContent() {

		try {
			WebElement warningContent = driver.findElement(FeeWarning);
			if (warningContent.isDisplayed()) {
				driver.findElement(FeeWarningOkButton).click();

			}
		} catch (Exception e) {

		}

	}

	public void enterStatusFieldInBatchDashboard() {

		WebElement enterStatus = driver.findElement(StatusField);
		enterStatus.sendKeys("4731");

	}

	public void editAttachmentButton() {

		WebElement verifyButton = driver.findElement(EditAttachmentButton);
		if (verifyButton.isEnabled()) {
			System.out.println("Edit attachment button is enabled");
		} else {
			System.out.println("Edit attachment button is disbaled by default");
		}

	}

	public void clickEditAttachmentButton() {

		WebElement clkButton = driver.findElement(EditAttachmentButton);
		clkButton.click();
	}

	public void clickPreviewAddAttachmentPopup() {

		WebElement clkPreview = driver.findElement(PreviewAddAttachmentPopup);
		clkPreview.click();

	}

	public void clickRemoveAddAttachmentPopup() {

		WebElement clkRemove = driver.findElement(RemoveAddAttachmentPopup);
		clkRemove.click();

	}

	public void closePreviewInAddAttachment() {

		WebElement btnClose = driver.findElement(ClosePreview);
		btnClose.click();
	}

	public void verifySuccessToastAfterAddedAttachment() {

		WebElement verifySuccess = driver.findElement(SuccessToastAfterAddedAttachment);
		String text = verifySuccess.getText();
		System.out.println(text);

		assertEquals(text, "Attachment(s) are successfully added to the bulk letters", "Warning toast is not matched");
		System.out.println("Success toast is showing correctly when user added the attachment");

		common.WaitImp();

		WebElement clkOk = driver.findElement(By.xpath("//div[@id='attachmentsuccess']//button[@id='successOk']"));
		clkOk.click();
	}

	public void addSameAttachment() {

		for (int i = 0; i < 2; i++) {
			WebElement addfile = driver.findElement(Add);
			common.WaitAction();
			addfile.sendKeys("D:\\New folder (2)\\DocumentUpload\\Uploadattachment.pdf");
			common.WaitImp();
		}

	}

	public void verifyWarningPoupUploadSameAttachment() {

		WebElement verifyPopup = driver.findElement(WarningPopupSameAttachment);
		String text = verifyPopup.getText();
		System.out.println(text);

		assertEquals(text, "Attachment already exists, please upload different attachment file",
				"Warning toast is not matched");
		System.out.println("Warning toast is showing correctly when user added the same attachment");

	}

	public void uploadInvalidFileInAddAttachment() {

		WebElement btnAdd = driver.findElement(Add);
		btnAdd.sendKeys("C:\\Users\\sasidaran.s\\Downloads\\Sprint-1_Requirement.docx");

	}

	public void verifyErrorPopupInvalidFileUpload() {

		WebElement verifyPopup = driver.findElement(ErrorPopupInvalidFileUpload);
		String text = verifyPopup.getText();
		System.out.println(text);

		assertEquals(text, "Please upload only valid PDF file.", "Warning toast is not matched");
		System.out.println("Error toast is showing correctly when user upload invalid file");

		common.WaitImp();

		WebElement clkOk = driver
				.findElement(By.xpath("//div[@id='attachmenterrorModal']//button[@id='attachmenterrorOk']"));
		clkOk.click();

	}

	public void addFiveAttachments() {

		WebElement addAttachment = driver.findElement(Add);
		addAttachment.sendKeys(
				"C:\\Users\\sasidaran.s\\Downloads\\2023 Steven Tulchin 2012 Family Trust Trust Tax Eng Letter.pdf");
		common.WaitImp();
		addAttachment.sendKeys(
				"C:\\Users\\sasidaran.s\\Downloads\\2023 Alden & Amy Philbrick Individual Tax Eng Letter.pdf");
		common.WaitImp();
		addAttachment.sendKeys("D:\\New folder (2)\\DocumentUpload\\Uploadattachment.pdf");
		common.WaitImp();
		addAttachment
				.sendKeys("C:\\Users\\sasidaran.s\\Downloads\\2023 KRR Providence 2 LLC Business Tax Eng Letter.pdf");
		common.WaitImp();
		addAttachment.sendKeys(
				"C:\\Users\\sasidaran.s\\Downloads\\2023 Family Trust Under The Melvin Greenberg 2009 Trust Trust Tax Eng Letter.pdf");

	}

	public void VerifyAdddButtonDisableAfterFiveAttachment() {

		WebElement addButton = driver.findElement(Add);
		if (addButton.isEnabled()) {
			System.out.println("Add button is enabled after added five attachments");
		} else {
			System.out.println("Add button is disbaled after added five attachments");
		}

	}

	public void verifySubmitButtonInAddAttachmentPopup() {

		WebElement btnVerify = driver.findElement(SubmitButtonAddAttachment);

		if (btnVerify.isEnabled()) {
			System.out.println("Submit button is enabled");

		} else {
			System.out.println("Submit button is disbaled by default");
		}
	}

	public void verify7216FormShowingInEditFields() throws InterruptedException {

		WebElement verifyForm = driver.findElement(Form7216AvaibaleEditFields);

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", verifyForm);

		if (verifyForm.isDisplayed()) {
			System.out.println("7216 form is showing in edit fields popup screen");
		}

		else {
			System.out.println("7216 form is not showing in edit fields popup screen");
		}

	}

	public void clickYesButtonIn7216Form() {

		WebElement btnYes = driver.findElement(YesButton7216Form);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", btnYes);
		js.executeScript("arguments[0].click();", btnYes);

	}

	public void clickNoButtonIn7216Form() {

		WebElement btnNo = driver.findElement(NoButton7216Form);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", btnNo);
		js.executeScript("arguments[0].click();", btnNo);

	}

	public void clickOkaySuccessToastAfterUpdate7216() {

		By OkayButton = By.xpath("//div[@id='successUpdate']//button[text()='Ok']");

		WebElement clickOkayButton = driver.findElement(OkayButton);
		boolean enabled = clickOkayButton.isEnabled();
		System.out.println(enabled);
		clickOkayButton.click();
	}

	public void verifyNoSelectedByDefaultIn7216() {

		WebElement verification = driver.findElement(VerifyRadioButtonSelected7216);
		String attribute = verification.getAttribute("ng-reflect-value");
		// sSystem.out.println(attribute);

		if (attribute.equalsIgnoreCase("false")) {
			System.out.println("No option is selected when there is a 7216 form available for this client");
		} else {
			System.out.println("No option is not selected when there is a 7216 form available for the client");
		}

	}

	public void verifyYesRadioButtonIn7216() {

		WebElement verification = driver.findElement(VerifyRadioButtonSelected7216);

		String attribute = verification.getAttribute("ng-reflect-value");
		// sSystem.out.println(attribute);

		if (attribute.equalsIgnoreCase("true")) {
			System.out.println("Yes option is not selected when there is a 7216 form available for this client");
		} else {
			System.out.println("Yes option is selected when there is a 7216 form available for the client");
		}

	}

	public void verify7216AvailableShowingInAddClient() {

		WebElement verifyForm = driver.findElement(Form7216AvailableAddNewClient);

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", verifyForm);

		if (verifyForm.isDisplayed()) {
			System.out.println("7216 form is showing in Add client popup screen");
		}

		else {
			System.out.println("7216 form is not showing in Add client popup screen");
		}

	}

	public void verifyYesRadioButton7216InAddClient() {

		WebElement verification = driver.findElement(VerifyRadioButtonSelected7216InAddClient);

		String attribute = verification.getAttribute("ng-reflect-value");

		if (attribute.equalsIgnoreCase("false")) {
			System.out.println("Yes option is not selected when there is a 7216 form available for this client");
		} else {
			System.out.println("Yes option is selected when there is a 7216 form available for the client");
		}

	}

	public void verifyRadioButton7216InAddClient() {

		WebElement verification = driver.findElement(VerifyRadioButtonSelected7216InAddClient);

		String attribute = verification.getAttribute("ng-reflect-value");

		if (attribute.equalsIgnoreCase("false")) {
			System.out.println("No option is selected by default in add client screen");
		} else {
			System.out.println("Yes option is selected in add client screen");
		}

	}

	public void clickTaxYearBasicDetailsDropdown() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//label[text()='Select Clients ']")).click();
		common.WaitImp();
		WebElement clkDropdown = driver.findElement(TaxYearBasicDetails);
		clkDropdown.click();

	}

	public void selectTaxYear(String taxyear) {

		List<WebElement> taxYears = driver.findElements(TaxYearBasicDetailsList);

		for (WebElement year : taxYears) {

			if (year.getText().equalsIgnoreCase(taxyear)) {
				year.click();
				break;
			}
		}

	}

	public void clickCloseIconTaxYear() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//label[text()='Select Clients ']")).click();
		common.WaitImp();
		WebElement clkClose = driver.findElement(CloseIconTaxYearBasicDetails);
		clkClose.click();
	}

	public void clickSelectAllTaxYearDropdown() {

		WebElement selectAllTaxYear = driver.findElement(SelectAllTaxYearBasicDetails);
		selectAllTaxYear.click();

	}

	public void verifyEdit7216FormButton() {

		WebElement btn = driver.findElement(Edit7216FormButton);
		if (btn.isEnabled()) {
			System.out.println("Edit 7216 button is enabled");
		} else {
			System.out.println("Edit 7216 button is disbaled");
		}

	}

	public void clickEdit7216FormButton() {

		WebElement clkEdit7216 = driver.findElement(Edit7216FormButton);
		clkEdit7216.click();

	}

	public void verifyEdit7216FormEditorTitle() {

		WebElement ckEditorTitle = driver.findElement(Edit7216FormCkEditorTitle);
		String text = ckEditorTitle.getText();
		System.out.println(text);

		assertEquals(text, "Edit 7216 Provider", "Title is not matched");
		System.out.println("Ck Editor title is showing correctly");

	}

	public void clickCloseIcon7216FormCKEditor() {

		WebElement btnClose = driver.findElement(CloseIconEdit7216CKEditor);
		btnClose.click();

	}

	public void clickCancelButton7216FormCkEditor() {

		WebElement clkCancel = driver.findElement(CancelIconEdit7216CKEditor);
		clkCancel.click();

	}

	public void clickUpdateButton7216FormCKEditor() {

		WebElement clkUpdate = driver.findElement(UpdateButtonEdit7216CKEditor);
		clkUpdate.click();
	}

	public void verifySuccessToastAfter7216FormUpdate() {

		WebElement verifySuccess = driver.findElement(SuccessToastAfter7216Update);
		String text = verifySuccess.getText();

		assertEquals(text, "7216 provider details has been updated successfully",
				"Success toast message is not matched");
		System.out.println("Success toast message is showing correctly after update the 7216 form");

	}

	public void verifyNoteTextInEdit7216InCKEditor() {

		WebElement verification = driver.findElement(NoteText7216CkEditor);
		String text = verification.getText();

		assertEquals(text, "This change will be applied to all the letters which has 7216 in this batch",
				"Note text is not matched");
		System.out.println("Note text is showing correctly in 7216 ck editor");

	}

	public void clickClient() {

		WebElement clkClient = driver.findElement(BasedOnClient);
		clkClient.click();

	}

	public void clickTemplate() {

		WebElement clkTemplate = driver.findElement(BasedOnTemplate);
		clkTemplate.click();
	}

	public void clickContinue() {

		WebElement clkContinue = driver.findElement(ClickContinue);
		clkContinue.click();

	}

	public void enterClientidInSearchValues(String clientid) {

		WebElement enterClientID = driver.findElement(SearchValue);
		enterClientID.sendKeys(clientid);

	}

	public void clickAttachWithEmail() {

		WebElement btnEmail = driver.findElement(AttachWithEmail);
		btnEmail.click();
		System.out.println("User can able to select the Email radiobutton successfully");
	}

	public void clickAttachWithLetter() {

		WebElement btnLetter = driver.findElement(AttachWithLetter);
		btnLetter.click();
		System.out.println("User can able to select the Letter radiobutton successfully");
	}

	public void clickTemplateFromMenuBar() {

		WebElement clkTemplate = driver.findElement(TemplateMenuBar);
		clkTemplate.click();

	}

	public void clickAddNewTemplateButton() {

		WebElement clkAdd = driver.findElement(AddTemplate);
		clkAdd.click();
	}

	public void clickAddAttachmentButtonInTemplateScreen() {

		common.ScrollDown(AddAttachmentTemplateScreen);
		WebElement btnAddAttachment = driver.findElement(AddAttachmentTemplateScreen);
		btnAddAttachment.click();

	}

	public void uploadAttachmentInTemplateScreen() {

		WebElement addAttachment = driver.findElement(AddAttachmentIconTemplateScreen);
		common.WaitImp();
		addAttachment.sendKeys("D:\\New folder (2)\\DocumentUpload\\Uploadattachment.pdf");

	}

	public void clickEditIconForExisitingTemplates() {

		WebElement iconEdit = driver.findElement(EditIconInTemplateScreen);
		iconEdit.click();

	}

	public void clickEditAttachmentInTemplateScreen() {

		common.ScrollDown(EditAttachmentInTemplateScreen);
		WebElement btnEditAttachment = driver.findElement(EditAttachmentInTemplateScreen);
		btnEditAttachment.click();

	}

	public void clickCloseUploadAttachment() {

		WebElement clkClose = driver.findElement(CloseUploadAttachment);
		clkClose.click();

	}

	public void verifyWarningContentInUploadAttachment() {

		WebElement verification = driver.findElement(VerifyWarningContentUploadAttachmentPopup);
		String text = verification.getText();
		System.out.println(text);

	}

	public void verifyGenericTextInUploadAttachment() {

		WebElement Note1 = driver.findElement(By.xpath("(//div[@class='d-inline-flex']) [2]//ul//li[1]"));
		String text = Note1.getText();
		System.out.println(text);

	}

	public void verifyLetterRadioButtonSelectedDefault() {

		WebElement radioButtonLetter = driver.findElement(AttachWithLetter);
		if (radioButtonLetter.isSelected()) {
			System.out.println("Letter radiobutton is selected by default");
		} else {
			System.out.println("Letter radiobutton is not selected by default");
		}

	}

	public void verifyPopupTitle(String popuptitle) {

		WebElement verifyTitle = driver.findElement(VerifyPopupTitle);
		String text = verifyTitle.getText();
		System.out.println(text);

		if (text.equals(popuptitle)) {
			System.out.println("Popup title is showing correctly");
		}
		System.out.println("Popup title is not showing correctly");
	}

	public void selectClientIdNameRadioButton() {

		WebElement clkRadioButton = driver.findElement(ClientNameRadioButton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", clkRadioButton);
	}

	public void selectEmailAddressRadioButton() {

		WebElement clkRadioButton = driver.findElement(EmailAddressRadioButton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", clkRadioButton);
	}

	public void verifyClientNameIDSelectedByDefault() {

		WebElement verification = driver.findElement(ClientNameRadioButton);
		if (verification.isSelected()) {
			System.out.println("ClientName/ID is selected by default");
		} else {
			System.out.println("ClientName/ID is not selected by default");
		}
	}

	public void clickClientIdNameDropdown() {

		WebElement clkDropdown = driver.findElement(ClientNameIdDropdown);
		clkDropdown.click();

	}

	public void selectClientName(String clientName) {

		By SearchClient = By
				.xpath("//div[@class='p-multiselect-filter-container ng-tns-c109-24 ng-star-inserted']//input");
		WebElement enterClientName = driver.findElement(SearchClient);
		enterClientName.sendKeys(clientName);

		By ClientNameList = By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']//li");
		List<WebElement> listOfClients = driver.findElements(ClientNameList);

		for (WebElement list : listOfClients) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			if (list.getText().equalsIgnoreCase(clientName)) {
				list.click();
				System.out.println("User can able to select signle client name from the dropdown");
				break;
			}

		}

	}

	public void selectMultipleClientNames(String clientName1, String clientName2, String clientName3) {

		By ClientNameList = By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']//li");
		List<WebElement> listOfClients = driver.findElements(ClientNameList);

		for (WebElement list : listOfClients) {
			String clientName = list.getText().trim();

			if (clientName.equalsIgnoreCase(clientName1) || clientName.equalsIgnoreCase(clientName2)
					|| clientName.equalsIgnoreCase(clientName3)) {

				list.click();
				try {
					Thread.sleep(1000); // Consider using an explicit wait instead of Thread.sleep
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}

		System.out.println("User can able to  select three clients successfully");
	}

	public void verifyNextButtonIsDisabledWithoutSelectedTemplate() {

		WebElement verifyNextButton = driver.findElement(NextButtonInBasicDetails);
		if (verifyNextButton.isEnabled()) {
			System.out.println("Next button is enabled");

		} else {

			System.out.println("Next button is disbaled");
		}
	}

	public void chooseTemplateInBasicDetails(String tempName) {

		WebElement clkTemplate = driver.findElement(TemplateDropdownInBasicDetails);
		common.WaitForElementTobeClickable(TemplateDropdownInBasicDetails);
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

	public void chooseReturnTypeCodeInBasicDetails(String ReturnTypeCode) {

		WebElement clkReturnCode = driver.findElement(ReturnTypeCodeInBasicDetails);
		common.WaitAction();
		clkReturnCode.click();

		List<WebElement> returnCodeList = driver
				.findElements(By.xpath("//span[@class='ng-option-label ng-star-inserted']"));

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

	public void clickChooseParagraphIconInBasicDetails() {

		WebElement clkIcon = driver.findElement(ChooseParagraphIconInBasicDetails);
		clkIcon.click();

	}

	public void clickSubmitChooseParagrpahInBasicDetails() {

		WebElement clkSubmit = driver.findElement(SubmitChooseParagraphInBasicDetails);
		clkSubmit.click();

	}

	public void verifySuccessPopupAfterChooseParagraphInBasicDetails() {

		WebElement verifyPopup = driver.findElement(SuccessPopupClientBased);
		String text = verifyPopup.getText();
		System.out.println(text);

		assertEquals(text, "Paragraph(s) are changed successfully", "Success toast is not matched");
		System.out.println(
				"Success toast is showing correctly when user submit the choose paragraph for client based letter creation");

		common.WaitImp();

		WebElement btnclick = driver.findElement(By.xpath("//button[@id='successBlocksOk']"));
		btnclick.click();
	}

	public void selectTwoClientsInBasicDetails(String clientName1, String clientName2) {

		By ClientNameList = By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']//li");
		List<WebElement> listOfClients = driver.findElements(ClientNameList);

		for (WebElement list : listOfClients) {
			String clientName = list.getText().trim();

			if (clientName.equalsIgnoreCase(clientName1) || clientName.equalsIgnoreCase(clientName2)) {

				list.click();
				try {
					Thread.sleep(1000); // Consider using an explicit wait instead of Thread.sleep
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}

		System.out.println("User can able to  select three clients successfully");
	}

	public void chooseTemplateInBasicDetailsForNextLetter(String tempName2) {
		By TemeplateDropdownForNextLetter = By.xpath(
				"(//div[@id='collapseAccordianTwo']//div[@class='p-datatable-scrollable-body ng-star-inserted']//div[@class='ng-input']//input) [3]");

		WebElement clkTemplate = driver.findElement(TemeplateDropdownForNextLetter);
		common.WaitForElementTobeClickable(TemeplateDropdownForNextLetter);
		clkTemplate.click();
		common.WaitImp();
		clkTemplate.sendKeys(tempName2);

		List<WebElement> tempList = driver
				.findElements(By.cssSelector(".scroll-host .ng-option.ng-star-inserted .ng-option-label"));

		for (WebElement temp : tempList) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			if (temp.getText().equalsIgnoreCase(tempName2)) {
				temp.click();
				break;
			}
		}

	}

	public void chooseReturnTypeCodeInBasicDetailsForNextLetter(String ReturnTypeCode) {

		By ReturnTypeCodeForNextLetter = By.xpath(
				"(//div[@id='collapseAccordianTwo']//div[@class='p-datatable-scrollable-body ng-star-inserted']//div[@class='ng-input']//input) [4]");
		WebElement clkReturnCode = driver.findElement(ReturnTypeCodeForNextLetter);
		common.WaitAction();
		clkReturnCode.click();

		List<WebElement> returnCodeList = driver
				.findElements(By.xpath("//span[@class='ng-option-label ng-star-inserted']"));

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

	public void clickChooseParagraphIconForNextLetter() {

		By ClickChooseParagraphNextLetter = By
				.xpath("((//tbody[@class='p-datatable-tbody']) [2]//td[@class='text-center']) [3]//span");

		WebElement clkBtn = driver.findElement(ClickChooseParagraphNextLetter);
		clkBtn.click();

	}

	public void clickNextButtonInClientDetails() {

		WebElement clkNext = driver.findElement(NextButtonInBasicDetails);
		clkNext.click();
	}

	public void clickEmailAddressDropdownInBasicDetails() {

		WebElement clkDropdown = driver.findElement(EmailAddressDropdown);
		clkDropdown.click();

	}

	public void chooseEmailAddressInBasicDetails(String emailAddress) {

		By EmailList = By.xpath("//div[@class='ng-option ng-star-inserted']//span");
		List<WebElement> listOfEmails = driver.findElements(EmailList);

		for (WebElement email : listOfEmails) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			if (email.getText().equalsIgnoreCase(emailAddress)) {
				email.click();
				break;
			}

		}
	}

	public void clickAddEmailAttachment() {

		WebElement clkBtn = driver.findElement(AddEmailAttachmentButton);
		common.WaitAction();
		clkBtn.sendKeys("D:\\New folder (2)\\DocumentUpload\\Uploadattachment.pdf");
	}

	public void verifySuccessPopupAfterAttachmentAddedInEmail() {

		WebElement verifySuccess = driver.findElement(SuccessPopupAfterAttachmentAddedInEmail);
		String text = verifySuccess.getText();
		System.out.println(text);

		assertEquals(text,
				"Attachments have been successfully added. They will be included as email attachments with the signing email, but will not be part of the letter.",
				"Success toast is not matched");
		System.out.println("Success toast is showing correctly when user added the attachment in Email");

		common.WaitImp();

		WebElement btnclick = driver.findElement(By.xpath("//button[@id='successOk']"));
		btnclick.click();
	}

	public void verifyContinueButtonIsDisbaledByDefault() {

		WebElement clkContinue = driver.findElement(ClickContinue);
		if (clkContinue.isEnabled()) {
			System.out.println("Continue button is enabled");
		} else {

			System.out.println("Continue button is disbaled by default");
		}

	}

	public void verifyDropdownPlaceHolderEmail() {

		By PlaceHolderEmail = (By.xpath("(//ng-select) [1]"));

		WebElement placeHolderEmail = driver.findElement(PlaceHolderEmail);
		String attribute = placeHolderEmail.getAttribute("placeholder");
		System.out.println(attribute);

		if (attribute.contains("Select Email")) {
			System.out
					.println("Placeholder is showing select Email when user select the email radiobutton is selected");
		} else {
			System.out.println("Placeholder is not showing select Email");
		}
	}

	public void verifyDropdownPlaceHolderClientId() {

		By PlaceHolderClientID = By.xpath("(//p-multiselect) [1]");

		WebElement placeHolderClientID = driver.findElement(PlaceHolderClientID);
		String attribute = placeHolderClientID.getAttribute("placeholder");
		System.out.println(attribute);

		if (attribute.contains("Select Clients")) {
			System.out.println("Placeholder is showing select clients when clientname/id radiobutton is selected");
		} else {

			System.out.println("Placeholder is showing not select clients");
		}
	}

	public void verifyLoadClientDetailsButton() {

		WebElement btnLoadClientDetails = driver.findElement(LoadClientDetailsButton);
		if (btnLoadClientDetails.isEnabled()) {
			System.out.println("Load client details button is enabled");
		} else {

			System.out.println("Load Client details button is disabled");
		}

	}

	public void enterClientIDInAddClientScreen(String clientID) {

		WebElement enterClientID = driver.findElement(ClientIDAddClientScreen);
		enterClientID.sendKeys(clientID);

	}

	public void enterStringInChildClientIDField(String childname) {

		common.WaitImp();
		WebElement childClientID = driver.findElement(ChildClientID);
		childClientID.sendKeys(childname);
	}

	public void validateWarningTextShowingInChildClientIDField() {

		common.WaitImp();
		WebElement verifyText = driver.findElement(VerifyContentChildClientID);
		String text = verifyText.getText();
		System.out.println(text);
		assertEquals(text, "Child Client ID must be integer", "Label is not showing correctly");
		System.out.println("Warning text is showing correctly when user enter string in child client id field");

	}

	public void enterStringInChildClientIDFieldInAddNewClient(String childname) {

		common.WaitImp();
		WebElement childClientID = driver.findElement(ChildClientIDInAddNewClient);
		childClientID.sendKeys(childname);
	}

	public void getAllChildClientNamesID() {

		WebElement table = driver.findElement(AddedChildClientNames);

		Map<String, String> tableData = new HashMap<>();

		List<WebElement> rows = table.findElements(
				By.xpath("(//div[@class='p-datatable-scrollable-wrapper ng-star-inserted'])[2]//tbody//tr"));

		System.out.println("rows" + rows.size());

		for (WebElement row : rows) {

			List<WebElement> cols = row.findElements(
					By.xpath("(//div[@class='p-datatable-scrollable-wrapper ng-star-inserted']) [2]//tr//td"));

			if (cols.size() >= 4) {
				String key = cols.get(0).getText();
				String value = cols.get(1).getText();
				tableData.put(key, value);
			}
		}

		for (Map.Entry<String, String> entry : tableData.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

	}

	public void enterChildClientID(String childId) {

		common.WaitAction();
		WebElement childClientID = driver.findElement(ChildClientID);
		childClientID.sendKeys(childId);
	}

	public void enterChildClientName(String childname) {

		common.WaitImp();
		WebElement childClientName = driver.findElement(ChildClientName);
		childClientName.sendKeys(childname);
	}

	public void clickAddChildClient() {

		common.WaitAction();
		WebElement clkAdd = driver.findElement(AddChildClient);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", clkAdd);
		js.executeScript("arguments[0].click();", clkAdd);
		// a.moveToElement(clkAdd).click().build().perform();

	}

	public void verifyAddChildClientButtonIsDisabledByDefault() {

		common.WaitImp();
		WebElement verifyButton = driver.findElement(AddChildClient);
		common.WaitImp();
		if (verifyButton.isEnabled()) {
			System.out.println("Add child client button is enabled");
		} else {
			System.out.println("Add child client button is disbaled by default");
		}

	}

	public void verifyWarningLabelUserAddMoreCharactersInChildClientID() {

		common.WaitImp();
		WebElement verifyLabel = driver.findElement(WarningLabeMoreNoOfClientID);
		String text = verifyLabel.getText();
		System.out.println(text);
		assertEquals(text, "System should not allow more than 15 characters", "Label is not showing correctly");
		System.out.println(
				"Warning text is showing correctly when user enter more than 15 characters in child client id");

	}

	public void enterMaximumIntegerInChildClientIDAddNewClientScreen(String childid) {

		common.WaitImp();
		WebElement enterChildClientId = driver.findElement(ChildClientIDInAddNewClient);
		enterChildClientId.sendKeys(childid);

	}

	public void verifyWarningLabelUserEnterMorethan100CharactersInChildClientName() {

		common.WaitImp();
		WebElement verifyLabel = driver.findElement(WarningLabelInChildClientName);
		String text = verifyLabel.getText();
		System.out.println(text);
		assertEquals(text, "System should not allow more than 100 characters", "Label is not showing correctly");
		System.out.println(
				"Warning text is showing correctly when user enter more than 100 characters in child client name field");

	}

	public void enterMoreCharacterChildCientNameInAddNewClientscreen(String childname) {

		common.WaitImp();
		WebElement enterChildClientName = driver.findElement(ChildClientNameInAddNewClientScreen);
		enterChildClientName.sendKeys(childname);

	}

	public void verifyWarningLabelBelowFiveCharacterInChildName() {

		common.WaitImp();
		WebElement verifyWarning = driver.findElement(WarningLabelBelowFiveCharacter);
		String text = verifyWarning.getText();
		System.out.println(text);

		assertEquals(text, "Child Client Name should be at least 5 Characters", "Label is not showing correctly");
		System.out.println(
				"Warning text is showing correctly when user enter less than 5 characters in child client name field");

	}

	public void clickDeleteIconChildClient() {

		common.WaitImp();
		WebElement clkDeleteIcon = driver.findElement(DeleteIconChildClient);
		clkDeleteIcon.click();

	}

	public void clickAddChildClientInAddNewClientScreen() {

		common.WaitAction();
		WebElement clkAdd = driver.findElement(AddChildClientInAddNewClient);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", clkAdd);
		js.executeScript("arguments[0].click();", clkAdd);

	}

	public void selectStatusFromStatusDropdownInDashboardScreen(String status) {

		common.WaitImp();

		WebElement clkStatus = driver.findElement(Clickstatus);
		clkStatus.click();

		List<WebElement> optionsStatus = driver.findElements(StatusDropdownOptions);
		for (WebElement option : optionsStatus) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			if (option.getText().trim().equalsIgnoreCase(status)) {
				option.click();
				break;
			}
		}

	}

	public void clickLoadClientDetailsInClientFlow() {

		WebElement clkButton = driver.findElement(FetchClientDetailsClientFlow);
		common.WaitForElementTobeClickable(FetchClientDetailsClientFlow);
		clkButton.click();

	}

	public void clickActionInClientFlow() {

		common.WaitImp();
		WebElement clkAction = driver.findElement(ActionClientFlow);
		clkAction.click();

	}

	public void verifyAddressLineOneTwoThreeIsDisplayingInEditFieldScreen() {

		common.WaitImp();
		boolean displayed = driver.findElement(AddressLine1).isDisplayed();
		System.out.println("AddressLine1 is displaying " + displayed);
		boolean displayed2 = driver.findElement(AddressLine2).isDisplayed();
		System.out.println("AddressLine2 is displaying " + displayed2);
		boolean displayed3 = driver.findElement(AddressLine3).isDisplayed();
		System.out.println("AddressLine3 is displaying " + displayed3);

	}

	public void verifyOfficeAddressLineOneTwoThreeIsDisplayingInEditFieldScreen() {

		common.WaitImp();
		boolean displayed = driver.findElement(OfficeAddressLine1).isDisplayed();
		System.out.println("OfficeAddressLine1 is displaying " + displayed);
		boolean displayed2 = driver.findElement(OfficeAddressLine2).isDisplayed();
		System.out.println("OfficeAddressLine2 is displaying " + displayed2);
		boolean displayed3 = driver.findElement(OfficeAddressLine3).isDisplayed();
		System.out.println("OfficeAddressLine3 is displaying " + displayed3);
	}

	public void selectValueFromPartnerDropdownInEditFieldScreen(String partner) {

		common.WaitAction();
		WebElement officeAddress = driver.findElement(OfficeAddressLine1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", officeAddress);
		common.WaitAction();
		WebElement clkDropdown = driver.findElement(ClickPartnerDropdownInEditFields);
		clkDropdown.click();

		List<WebElement> listPartner = driver.findElements(SelectPartnerFromPartnerDropdownList);
		for (WebElement partnerName : listPartner) {
			if (partnerName.getText().equalsIgnoreCase(partner)) {
				partnerName.click();
				break;
			}
		}
	}

	public void selectValueFromOfficeDropdownInEditFieldScreen(String office) {

		common.WaitAction();
		WebElement clkDropdown = driver.findElement(ClickOfficeDropdownInEdditFields);
		clkDropdown.click();

		List<WebElement> listOffice = driver.findElements(selectOfficeFromOfficeDropdownList);
		for (WebElement officeName : listOffice) {

			if (officeName.getText().equalsIgnoreCase(office)) {
				officeName.click();
				break;
			}
		}

	}

	public void clickUpdateButtonInEditFieldScreenInEditScreen() {

		common.WaitImp();
		WebElement clkUpdate = driver.findElement(UpdateButtonInEditFieldScreen);
		clkUpdate.click();

	}

	public void verifyAddBulkAttachmentToEmail() {

		common.WaitImp();
		WebElement clkAddBulkAttachment = driver.findElement(AddBulkAttachmentsToEmail);
		String text = clkAddBulkAttachment.getText();
		System.out.println(text);

		assertEquals(text, "Add Bulk Attachments to Email", "Button name is not showing correctly");
		System.out.println("Button name is showing correctly");

	}

	public void clickSubmitChooseParagraphInDashboardScreen() {

		common.WaitImp();
		WebElement clkSubmit = driver.findElement(SubmitChooseParargaphInDashboard);
		clkSubmit.click();

	}

	public void verifyFinanceChargesDisbaleForNonSpecialUsers() {

		common.WaitImp();
		WebElement verification = driver.findElement(FinanceChargesDisbale);
		if (verification.isEnabled()) {
			System.out.println("Option is enabled");
		} else {
			System.out.println("Option is disabled for non special users");
		}
	}

	public void verifyFinanceChargesSelectedByDefault() {

		common.WaitImp();
		WebElement verification = driver.findElement(FinanceChargesDisbale);
		if (verification.isSelected()) {
			System.out.println("Yes option is selected by default for finance charges question");
		} else {
			System.out.println("Option is not selected by default");
		}

	}

	public void verifyTitleOfSendSigningReminder() {

		WebElement getTitle = driver.findElement(SendSigningReminderTitle);
		String text = getTitle.getText();
		System.out.println(text);

		assertEquals(text, "Send Signing Reminder", "Title is not showing correctly");
		System.out.println("Popup name is showing correctly");

	}

	public void clickYesButtonInSendSigningReminder() {

		WebElement btnClick = driver.findElement(YesButtonInSendSigningReminder);
		btnClick.click();

	}

	public void verifyAfterSendSigningReminder() {

		WebElement verification = driver.findElement(VerifySuccessToastAfterSendSigningReminder);
		String text = verification.getText();
		System.out.println(text);
		assertEquals(text, "E-Signing reminder email has been sent successfully",
				"Success toast is not showing correctly");
		System.out.println("Success toast is showing correctly");

	}

	public void clickYNoButtonInSendSigningReminder() {

		WebElement btnClick = driver.findElement(NoButtonInSendSigningReminder);
		btnClick.click();

	}

	public void clickYesButtonInCancelConfirmPopup() {

		WebElement btnClick = driver.findElement(YesButtonInCancelConfirmPopup);
		btnClick.click();

	}

	public void verifyResendPopupTitle() {

		common.WaitAction();
		WebElement getTitle = driver.findElement(VerifyResendPopup);
		String text = getTitle.getText();
		System.out.println(text);
		assertEquals(text, "Resend the letter for signing", "Resend popup title is not showing correctly");
		System.out.println("Resend popup title is showing correctly");

	}

	public void clickOkButtonInCancelSuccessPopup() {

		common.WaitAction();
		WebElement clkBtn = driver.findElement(OkButtonInCancelSuccessPopup);
		clkBtn.click();

	}

	public void verifyChildFeeIsShowingInEditFields() {

		common.WaitAction();
		WebElement verifyChildFeeField = driver.findElement(ChildFeeInEditFields);
		if (verifyChildFeeField.isDisplayed()) {
			System.out.println("Child Fee is showing");
		} else {
			System.out.println("Child Fee is not showing");
		}

	}

	public void enterChildFeeInEditFields(String childFee) {

		common.WaitImp();
		WebElement enterChildFee = driver.findElement(EnterChildFeeInEditFields);
		enterChildFee.sendKeys(childFee);

	}

	public void verifyChildSameIdErrorPopup() {

		WebElement verification = driver.findElement(ChildSameIdErrorPopup);
		String text = verification.getText();
		System.out.println(text);
		assertEquals(text, "Child client ID already available, please provide different child client ID and try again",
				"Error popup is not showing properly");
		System.out.println("Error popup is showing correctly when user enter same child id for two childs");

	}

	public void verifyChildSameNameErrorPopup() {

		WebElement verification = driver.findElement(ChildSameNameErrorPopup);
		String text = verification.getText();
		System.out.println(text);
		assertEquals(text,
				"Child client name already available, please provide different child client name and try again",
				"Error popup is not showing properly");
		System.out.println("Error popup is showing correctly when user enter same child name for two childs");

	}

	public void verifyChildFeeIsShowingInEditFieldsForStandardOptionsIsSelected() {

		common.WaitAction();

		try {
			WebElement verifyField = driver.findElement(ChildFeeInEditFields);
			// boolean displayed = verifyField.isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Child Fee element not found: " + e.getMessage());

		}

	}

	public void verifySuccessToastAfterEditChooseParagraphOptions() {

		common.WaitAction();
		WebElement verifySuccessToast = driver.findElement(SuccessToastAfterEditQuestionOptions);
		String text = verifySuccessToast.getText();
		System.out.println(text);
		assertEquals(text, "Paragraph(s) are changed successfully", "Success toast is not showing properly");
		System.out.println("Success toast is showing correctly when user edit the question options");

		driver.findElement(By.xpath("(//div[@id='success']) [4]//button[text()='Ok']")).click();

	}

	public void enterClientIDInSearchColumnValues(String clientid) {

		WebElement enterClientID = driver.findElement(SearchColumnValue);
		enterClientID.sendKeys(clientid);

	}

	public void clickSelectCertainClientRadioButton() {

		common.WaitImp();
		WebElement clickRadioButton = driver.findElement(SelectCertainClients);
		clickRadioButton.click();

	}

	public void clickCloseIconInClientNameDropdown() {

		common.WaitImp();
		WebElement clkClose = driver.findElement(CloseClientNameDropdown);
		clkClose.click();

	}

	public void editNonFreeToEditBlock() {

		common.WaitForElementVisibility(SelectNonEditableBlock);
		WebElement selectBlock = driver.findElement(SelectNonEditableBlock);
		selectBlock.click();
		By getWarningPopupTitle = By.xpath("//div[@id='displayCommonErrorModal']//h5[text()='Error']");
		common.WaitAction();
		String text = driver.findElement(getWarningPopupTitle).getText();
		System.out.println(text);
		assertEquals(text, "Error", "Warning message is not showing properly");
		System.out.println("Warning popup is showing correctly when user try to edit non editable paragraph");
	}

	public void verifyChild7216FormIsShowing() {

		common.WaitForElementVisibility(Child7216FormTitle);
		WebElement verifyTitle = driver.findElement(Child7216FormTitle);
		String text = verifyTitle.getText();
		System.out.println(text);
		assertEquals(text, "Child 7216 Available", "Title is not showing correctly");
		System.out.println("Child 7216 form Title is showing correctly");

	}

	public void selectNoRadioButtonChild7216Form() {

		common.WaitForElementTobeClickable(NoRadioButtonChild7216Form);
		WebElement clkNo = driver.findElement(NoRadioButtonChild7216Form);
		clkNo.click();

	}

	public void verifyYesRadioButtonIsSelectedByDefault() {

		common.WaitForElementTobeClickable(YesRadioButtonChild7216Form);
		WebElement btnYes = driver.findElement(YesRadioButtonChild7216Form);
		if (btnYes.isSelected()) {
			System.out.println("Yes radio button is selected by default");
		} else {
			System.out.println("Yes radio button is not selected by default");
		}

	}

	public void verifyAddClientButtonIsShowing() {

		WebElement btnAddClient = driver.findElement(AddClientButton);
		common.WaitForElementVisibility(AddClientButton);
		if (btnAddClient.isDisplayed()) {
			System.out.println("Button is showing");
		} else {
			System.out.println("Button is not showing");
		}

	}

	public void clickAddClientButton() {

		WebElement btnClick = driver.findElement(AddClientButton);
		common.WaitForElementVisibility(AddClientButton);
		btnClick.click();

	}

	public void clickAddButtonInAddNewClientScreen() {

		WebElement clkBtn = driver.findElement(AddChildClientInAddNewClient);
		common.WaitForElementTobeClickable(AddChildClientInAddNewClient);
		clkBtn.click();

	}

	public void clickClientNameDropdownInAddNewClientScreen() {

		WebElement clkClientDropdown = driver.findElement(ClientNameDropdownInAddNewClientScreen);
		common.WaitForElementVisibility(ClientNameDropdownInAddNewClientScreen);
		clkClientDropdown.click();

	}

	public void enterClientNameAndSelectChildNameFromDropdown(String clientName) {

		WebElement enterClientName = driver.findElement(EnterClientNameInAddNewClient);
		enterClientName.sendKeys(clientName);

		By selectClientDropdown = By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']//span");
		List<WebElement> clientNameDropdown = driver.findElements(selectClientDropdown);

		for (WebElement name : clientNameDropdown) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (name.getText().equalsIgnoreCase(clientName)) {
				name.click();
				break;
			}
		}

	}

	public void verifySuccessToastAfterAddedNewClient() {

		WebElement verifySuccess = driver.findElement(SuccessToastAfterAddedNewClientInNewFlow);
		common.WaitForElementVisibility(SuccessToastAfterAddedNewClientInNewFlow);
		String text = verifySuccess.getText();
		System.out.println(text);
		assertEquals(text, "New client details has been added successfully", "Success toast is not showing properly");
		System.out.println("Success toast is showing correctly");
	}

	public void clickAddNewClientRadioButtonInAddNewClientPopupScreen() {

		WebElement clkRadioButton = driver.findElement(AddNewClientRadioButton);
		common.WaitForElementVisibility(AddNewClientRadioButton);
		clkRadioButton.click();
		System.out.println("User can able to select add new client radiobutton in add new client popup screen");

	}

	public void verifyTemplateNameFieldInEditFieldScreen() {

		WebElement verifyField = driver.findElement(TemplateNameFieldInEditFieldScreen);
		common.WaitForElementVisibility(TemplateNameFieldInEditFieldScreen);
		String text = verifyField.getText();
		System.out.println(text);
		assertEquals(text, "Template name *", "Field name is not showing correctly");
		System.out.println("Field name is showing correctly");

	}

	public void verifyTemplateNameFieldIsDisabled() {

		WebElement verification = driver.findElement(TemplateNameFieldDisabled);
		if (verification.isEnabled()) {
			System.out.println("TemplateName field is enabled");
		} else {
			System.out.println("Template name field is disbaled");
		}

	}

}