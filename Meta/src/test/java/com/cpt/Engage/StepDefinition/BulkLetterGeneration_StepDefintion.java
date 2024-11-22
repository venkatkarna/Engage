package com.cpt.Engage.StepDefinition;

import java.awt.AWTException;

import com.cpt.Engage.Pages.BulkLetterGeneration_pages;
import com.cpt.Engagee.CommonMethods;

import io.cucumber.java.en.Then;

public class BulkLetterGeneration_StepDefintion {

	BulkLetterGeneration_pages bulk = new BulkLetterGeneration_pages();
	CommonMethods common = new CommonMethods();

	@Then("click on Bulk letter generation button")
	public void click_on_Bulk_letter_generation_button() throws InterruptedException {
		common.WaitAction();
		bulk.ClickBulkLetterButton();

	}

	@Then("click on Create bulk letters in batch button")
	public void click_on_Create_bulk_letters_in_batch_button() {

		bulk.ClickCreateBulkLettersBatch();

	}

	@Then("select single partner pic")
	public void select_single_partner_pic() {

		bulk.SelectPartner();
	}

	@Then("select template name")
	public void select_template_name() {

		bulk.TemplateDropdown();
	}

	@Then("click on Load client details button")
	public void click_on_Load_client_details_button() {

		common.WaitAction();
		bulk.FetchClientDetails();

	}

	@Then("click on ok button in warning popup")
	public void click_on_ok_button_in_warning_popup() throws InterruptedException {

		common.WaitAction();
		bulk.OkWarning();

	}

	@Then("click on Save as draft button")
	public void click_on_Save_as_draft_button() {

		bulk.SaveDraft();

	}

	@Then("click on Yes button in save draft confirmation popup")
	public void click_on_Yes_button_in_save_draft_confirmation_popup() {

		bulk.YesButtonSaveDraft();
	}

	@Then("click on Ok button in save draft success popup")
	public void click_on_Ok_button_in_save_draft_success_popup() throws InterruptedException {

		common.WaitAction();
		bulk.OkSaveDraft();
		
		//System.out.println("Saved the letter successfully");
	}

	@Then("click on action in list of bulk letters")
	public void click_on_action_in_list_of_bulk_letters() {

		bulk.ActionButton();
	}

	@Then("click on delete button")
	public void click_on_delete_button() {

		bulk.DeleteButton();

	}

	@Then("click on yes button in delete conformation in list of bulk letter screen")
	public void click_on_yes_button_in_delete_conformation_in_list_of_bulk_letter_screen() {

		bulk.YesDeleteButton();

	}

	@Then("click on ok button in delete successful")
	public void click_on_ok_button_in_delete_successful() {

		bulk.OkDeleteButton();

	}

	@Then("click on Edit button bulk letter generation screen")
	public void click_on_Edit_button_bulk_letter_generation_screen() {

		bulk.Editbutton();

	}

	@Then("click on close icon in warning popup")
	public void click_on_close_icon_in_warning_popup() {

		bulk.CloseIcon();

	}

	@Then("click on action icon")
	public void click_on_action_icon() {

		bulk.ActionButton();
	}

	@Then("click on edit fields button")
	public void click_on_edit_fields_button() {

		bulk.ClickEditFields();
	}

	@Then("enter ZIP values")
	public void enter_ZIP_values() {

		bulk.ValuesZip();
	}

	@Then("enter address")
	public void enter_address() {

		bulk.ValueAddress();
	}

	@Then("enter signatory title")
	public void enter_signatory_title() {

		bulk.ValuesSignatoryTitle();
	}

	@Then("enter signatory last name")
	public void enter_signatory_last_name() {

		bulk.ValuesSignatoryLastName();
	}

	@Then("enter signatory first name")
	public void enter_signatory_first_name() {

		bulk.ValuesSignatoryFirstName();

		common.ScrollDown();
	}

	@Then("click on update button in edit fields screen")
	public void click_on_update_button_in_edit_fields_screen() {

		bulk.ButtonUpdate();

	}

	@Then("click on ok button in edit updated success popup")
	public void click_on_ok_button_in_edit_updated_success_popup() {

		bulk.ButtonOkay();
		System.out.println("User successfully edited the fields");

	}

	@Then("click on preview button from action")
	public void click_on_preview_button_from_action() throws InterruptedException {

		bulk.ButtonPreview();
		common.WaitMore();
		common.WaitAction();

	}

	@Then("click on close button in preview screen")
	public void click_on_close_button_in_preview_screen() throws InterruptedException {

		common.WaitAction();
		common.ScrollDown();
		bulk.buttonClose();
		System.out.println("Preview the letter successfully");

	}

	@Then("click on Add client button")
	public void click_on_Add_client_button() {

		bulk.buttonAddClient();
	}

	@Then("enter client id in add client screen")
	public void enter_client_id_in_add_client_screen() {

		bulk.enterClientID();

	}

	@Then("enter signatory email id in add client screen")
	public void enter_signatory_email_id_in_add_client_screen() {

		bulk.enterSignatoryEmail();

	}

	@Then("enter ZIP code in add client screen")
	public void enter_ZIP_code_in_add_client_screen() {

	}

	@Then("enter state in add client screen")
	public void enter_state_in_add_client_screen() {
		bulk.enterState();
	}

	@Then("enter city in add client screen")
	public void enter_city_in_add_client_screen() {
		bulk.enterCity();
	}

	@Then("enter address in add client screen")
	public void enter_address_in_add_client_screen() {

		bulk.ValueAddress();
	}

	@Then("enter signatory title in add client screen")
	public void enter_signatory_title_in_add_client_screen() {

		bulk.ValuesSignatoryTitle();
	}

	@Then("enter signatory last name in add client screen")
	public void enter_signatory_last_name_in_add_client_screen() {

		bulk.ValuesSignatoryLastName();
	}

	@Then("enter signatory first name in add client screen")
	public void enter_signatory_first_name_in_add_client_screen() {

		bulk.ValuesSignatoryFirstName();
	}

	@Then("enter client name in add client screen")
	public void enter_client_name_in_add_client_screen() {

		bulk.enterClientName();

	}

	@Then("add client entities")
	public void add_client_entities() {

		bulk.enterChildEntities();
		bulk.AddChildEntities();

	}

	@Then("select the partner name in add client screen")
	public void select_the_partner_name_in_add_client_screen() {

		common.ScrollDown();
		bulk.enterPartnerName();
		bulk.selectPartnerName();

	}

	@Then("select no radio button in E signing")
	public void select_no_radio_button_in_E_signing() {
		
		bulk.selectNoRadioButton();
	}

	@Then("click on add button in add client screen")
	public void click_on_add_button_in_add_client_screen() throws InterruptedException {
		
		bulk.AddClientFinal();

	}

	@Then("click on edit attachments button")
	public void click_on_edit_attachments_button() {

		bulk.clickEditAttachment();

	}

	@Then("click on add button in attachment warning popup")
	public void click_on_add_button_in_attachment_warning_popup() throws AWTException, InterruptedException {

		bulk.addAttachment();

	}

	@Then("select the pdf file and click on open button")
	public void select_the_pdf_file_and_click_on_open_button() throws AWTException, InterruptedException {

		common.fileUpload();
		common.WaitAction();
	}

	@Then("click on preview button in edit attachment screen")
	public void click_on_preview_button_in_edit_attachment_screen() throws InterruptedException {

		bulk.previewAttachment();
		common.WaitAction();
		bulk.closeAttachment();
	}

	@Then("click on submit button")
	public void click_on_submit_button() {

		bulk.submitAttachment();
		System.out.println("User upload the attachment successfully");

		// common.closeBrowser();
	}

	@Then("click on Ok button in success popup")
	public void click_on_Ok_button_in_success_popup() throws InterruptedException {

		common.WaitAction();
		bulk.okaySuccess();
	}

	@Then("click on create bulk letter button")
	public void click_on_create_bulk_letter_button() {

		bulk.clickCreatrebulkletter();
	}

	@Then("click on ok button in create letter success warning popup")
	public void click_on_ok_button_in_create_letter_success_warning_popup() {

		bulk.createLetterOkay();

	}

	@Then("click on Down arrow button in basic details")
	public void click_on_Down_arrow_button_in_basic_details() {

		common.WaitAction();
		bulk.clickBasicDetail();
	}

	@Then("remove the exisiting partner")
	public void remove_the_exisiting_partner() {

		common.WaitAction();
		bulk.removePartner();
	}

	@Then("click on partner PIC dropdown")
	public void click_on_partner_PIC_dropdown() {

		common.WaitAction();
		bulk.clickPartnerDropdown();

	}

	@Then("select the new partner")
	public void select_the_new_partner() {

		common.WaitAction();
		bulk.selectNewPartner();
	}

	@Then("click on info button")
	public void click_on_info_button() {

		common.WaitAction();
		bulk.clickInfo();
	}

	@Then("verify the list of actions")
	public void verify_the_list_of_actions() {
		
		common.WaitAction();
		bulk.verifyActionList();
		
	}
	
	@Then("select return type code")
	public void select_return_type_code() {
	  
		bulk.clickReturnCode();
		common.WaitImp();
		bulk.SelectReturnCode();
		common.WaitImp();
		bulk.clkDropDownClose();
	}

	@Then("select the return type code")
	public void select_the_return_type_code() {
	   
		bulk.sltAddClientReturnType();
	}

	@Then("click on Ok button in new client added successfully popup")
	public void click_on_Ok_button_in_new_client_added_successfully_popup() {
	  
		bulk.btnOkAddClient();
	}
	
	@Then("click on checkbox in list of bulk letters")
	public void click_on_checkbox_in_list_of_bulk_letters() {
	    
		bulk.sltBulkLetterCheckbox();
	}

	@Then("click on remove client button")
	public void click_on_remove_client_button() {
	   
		bulk.clkRemoveClient();
	}

	@Then("click on yes button in conformation popup for removing client")
	public void click_on_yes_button_in_conformation_popup_for_removing_client() {
	 
		bulk.btnYesRemoveClient();
		
	}

	@Then("click on ok button in success warning popup for removing client")
	public void click_on_ok_button_in_success_warning_popup_for_removing_client() {
	   
		common.WaitAction();
		bulk.btnOkayRemoveClient();
	}
	
	@Then("verify the partner name")
	public void verify_the_partner_name() {
	    
		common.WaitAction();
		bulk.verifyPartnerChanged();
	}
}
