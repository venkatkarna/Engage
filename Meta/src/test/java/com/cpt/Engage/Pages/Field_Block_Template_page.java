package com.cpt.Engage.Pages;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

import com.cpt.Engagee.CommonMethods;

public class Field_Block_Template_page extends CommonMethods {

	By MenuIcon = By.xpath("//a[@class='toggle-sidebar']");
	By Field = By.xpath("//li[@class='nav-item'] [3]");
	By Add = By.xpath("//div//button[text()='Add']");
	By Enterfieldname = By.xpath("//div//input[@id='FieldName']");
	By Enterdisplayname = By.xpath("//div//input[@name='DisplayName'] [1]");
	// By SelectInputsource = By.xpath("//label[text()='Direct Input']");

	By DataType = By.xpath("(//div[@class='ng-select-container']) [1]");
	By SelectDataType = By.xpath("//div//span[text()='Date']");
	By ClickStatus = By.xpath("(//div//ng-select[@name='Status']) [1]");
	By SelectStatus = By.xpath("(//span[text()='Active']) [1]");
	By ChangeNotes = By.xpath("//textarea[@placeholder='Enter Change Notes']");
	By Save = By.xpath("//div//button[text()='Save']");
	By Checkbox = By.xpath("(//tr//td//input[@type='checkbox']) [1]");
	By btnOk = By.xpath("(//div//button[text()='Ok']) [3]");
	By Edit = By.xpath("(//td//button[@class='bg-transparent mx-1']) [1]");
	By ChangeDataType = By.xpath("(//div//span[text()='Number']) [1]");
	By ChangeDisplayName = By.xpath("(//div//input[@name='DisplayName']) [1]");
	By ChangetheNotes = By.xpath("//textarea[@placeholder='Enter Change Notes']");

	By ChangeDataTypeClick = By.xpath("(//div[@class='ng-select-container ng-has-value'])[3]");
	By ChangeDisplayNameClick = By.xpath("//div//input[@id='DisplayName']");
	By ChangetheNotesClick = By
			.xpath("//textarea[@class='form-control input-md no-resize ng-untouched ng-pristine ng-valid']");
	By Updatebutton = By.xpath("//div//button[text()='Update']");
	By OKbutton = By.xpath("(//div//button[text()='Ok']) [2]");
	By Deletebutton = By.xpath("//div//button[text()='Delete']");
	By DeleteYesButton = By.xpath("(//div//button[text()='Yes']) [3]");

	By Block = By.xpath("(//li[@class='nav-item'])[4]");
	By AddBlock = By.xpath("//div//button[text()='Add']");
	By BlockName = By.xpath("//input[@name='BlockName']");
	By BlockStatus = By.xpath("//div[@class='ng-select-container']");
	By SelectBlockStatus = By.xpath("(//span[text()='Active']) [1]");
	By BlockChangeNotes = By.xpath("//textarea[@placeholder='Enter Change Notes']");
	By BlockDescription = By.xpath("(//textarea[@id='blockdescription']) [1]");
	By BlockContent = By.xpath("(//ckeditor[@bodyclass='document-editor']) [1]");
	By SourceField = By.xpath("(//tbody//tr//td//ul[@id='mandatoryfields']) [1]");
	By DestinationField = By.xpath("(//ckeditor[@bodyclass='document-editor']) [1]");
	By SaveBlock	= By.xpath("//div//button[text()='Save']");
	By OkBlockSuccess = By.xpath("(//button[text()='Ok']) [3]");
	By PreviewBlock = By.xpath("(//tbody//tr//td//button[@ptooltip='Preview']) [1]");
	
	
	
	
	public void ClickMenuIcon() throws InterruptedException {

		WebElement btnMenu = driver.findElement(MenuIcon);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnMenu);
		WaitAction();

	}

	public void ClickField() throws InterruptedException {

		WebElement btnField = driver.findElement(Field);
		btnField.click();

	}

	public void ClickAdd() throws InterruptedException {

		WebElement btnAdd = driver.findElement(Add);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnAdd);

	}

	public void EnterFieldName() throws InterruptedException {

		WebElement EnterField = driver.findElement(Enterfieldname);
		EnterField.sendKeys("Field Test");

	}

	public void EnterDisplayName() throws InterruptedException {

		WebElement EnterDisplay = driver.findElement(Enterdisplayname);
		EnterDisplay.sendKeys("Field Test");

	}

	public void ClickDataType() throws InterruptedException {

		WebElement clickdatatype = driver.findElement(DataType);
		clickdatatype.click();

	}

	public void SelectDataType() throws InterruptedException {

		WebElement sltDataType = driver.findElement(SelectDataType);
		sltDataType.click();

	}

	/*
	 * public void SelectInputSource() throws InterruptedException {
	 * 
	 * 
	 * WebElement sltInputsouce = driver.findElement(SelectInputsource);
	 * JavascriptExecutor executor = (JavascriptExecutor) driver;
	 * executor.executeScript("arguments[0].click();", sltInputsouce); WaitAction();
	 * 
	 * }
	 */

	public void ClickStatus() throws InterruptedException {

		WebElement clickStatus = driver.findElement(ClickStatus);
		clickStatus.click();

	}

	public void SelectStatus() throws InterruptedException {

		WebElement sltStatus = driver.findElement(SelectStatus);
		sltStatus.click();

	}

	public void EnterChangeNotes() throws InterruptedException {

		WebElement EnterChangeNotes = driver.findElement(ChangeNotes);
		EnterChangeNotes.sendKeys("Change Notes testing");

	}

	public void ClickSaveButton() throws InterruptedException {

		WebElement clickSave = driver.findElement(Save);
		clickSave.click();

	}

	public void EditCheckBox() throws InterruptedException {

		WebElement Editcheckbox = driver.findElement(Checkbox);
		Editcheckbox.click();

	}

	public void ButtonOk() throws InterruptedException {

		WebElement btnOkay = driver.findElement(btnOk);
		btnOkay.click();

	}

	public void ClickEdit() throws InterruptedException {

		WebElement clkEdit = driver.findElement(Edit);
		clkEdit.click();
		WaitAction();
	}

	public void ChangeDatatype() throws InterruptedException {

		WebElement chgDataType = driver.findElement(ChangeDataType);
		chgDataType.click();
		WaitAction();

	}

	public void EditDataTypeClick() {

		WebElement EditDataType = driver.findElement(ChangeDataTypeClick);
		EditDataType.click();

	}

	public void ClickDisplayName() throws AWTException, InterruptedException {

		WebElement displayNameClick = driver.findElement(ChangeDisplayNameClick);
		displayNameClick.click();
		WaitAction();
		EraseText();
		WaitAction();
		displayNameClick.sendKeys("Field display name changed ");

	}

	/*
	 * public void EditDisplayName() throws InterruptedException {
	 * 
	 * WebElement editDisplayName = driver.findElement(ChangeDisplayName);
	 * editDisplayName.sendKeys("Field DisplayName Edit"); WaitAction(); }
	 */

	public void ClickChangeNotes() throws AWTException, InterruptedException {

		WebElement clkChangeNotes = driver.findElement(ChangetheNotesClick);
		clkChangeNotes.click();
		WaitAction();
		EraseText();
		WaitAction();
		clkChangeNotes.sendKeys("Changed the change notes successfully");
	}

	/*
	 * public void EditChangeNotes() throws InterruptedException {
	 * 
	 * WebElement editNotes = driver.findElement(ChangetheNotes);
	 * editNotes.sendKeys("Edit the change note is successfully done");
	 * WaitAction(); }
	 */

	public void UpdateButton() throws InterruptedException {

		WebElement btnUpdate = driver.findElement(Updatebutton);
		btnUpdate.click();
		WaitAction();
	}

	public void OkButton() {

		WebElement btnOk = driver.findElement(OKbutton);
		btnOk.click();

	}

	public void DeleteField() {

		WebElement btnDelete = driver.findElement(Deletebutton);
		btnDelete.click();

	}

	public void DeleteYesButton() {

		WebElement clickYes = driver.findElement(DeleteYesButton);
		clickYes.click();
	}

	/*
	 * public void OkButtonFieldDelete() {
	 * 
	 * WebElement btnOk = driver.findElement(OkbuttonDeleteField); btnOk.click(); }
	 */

	public void ClickBlock() {

		WebElement clkBlock = driver.findElement(Block);
		clkBlock.click();

	}

	public void ClickAddBlock() {

		WebElement addBlock = driver.findElement(AddBlock);
		addBlock.click();

	}

	public void EnterBlockName() {

		WebElement enterBlockName = driver.findElement(BlockName);
		enterBlockName.sendKeys("Automation testing");
	}

	public void ClickBlockStatus() {

		WebElement clkStatus = driver.findElement(BlockStatus);
		clkStatus.click();

	}

	public void SelectBlockStatus() {

		WebElement sltStatus = driver.findElement(SelectBlockStatus);
		sltStatus.click();

	}

	public void BlockChangeNotes() throws InterruptedException {

		WebElement enterChangeNotes = driver.findElement(BlockChangeNotes);
		enterChangeNotes.click();
		WaitAction();
		enterChangeNotes.sendKeys("Block change notes");

	}

	public void EnterBlockDescription() throws InterruptedException {

		WebElement enterDescription = driver.findElement(BlockDescription);
		enterDescription.click();
		WaitAction();
		enterDescription.sendKeys("Entering the values by automation");
	}

	public void EnterBlockContent() throws InterruptedException {

		WebElement enterBlocktext = driver.findElement(BlockContent);
		enterBlocktext.click();
		WaitAction();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement iframe = driver.findElement(By.className("cke_wysiwyg_frame"));
		driver.switchTo().frame(iframe);

		js.executeScript("document.body.innerHTML = 'Block content';");

		driver.switchTo().defaultContent();

	}

	public void DragField() throws InterruptedException {

		
	//	WebElement target = driver.findElement(DestinationField);

		WebElement source = driver.findElement(SourceField);
		
		WebElement iframe = driver.findElement(By.className("cke_wysiwyg_frame"));
		
		WaitAction();
		Actions a = new Actions(driver);

		a.dragAndDrop(source, iframe).perform();

	}
	
	public void SaveButton() {
		
		WebElement clkBlock = driver.findElement(SaveBlock);
		clkBlock.click();
		WaitAction();
		

	}
	
	public void BlockSuccessClick() {
		
		
		WebElement clkOk = driver.findElement(OkBlockSuccess);
		clkOk.click();
		WaitAction();
	
	}
	
	public void PreviewBlock() {
		
		WebElement clkPreview = driver.findElement(PreviewBlock);
		clkPreview.click();
		WaitAction();
	}
	
	

}
