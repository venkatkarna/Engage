package com.cpt.Engage.StepDefinition;

import java.awt.AWTException;

import com.cpt.Engage.Pages.BulkLetterGeneration_pages;
import com.cpt.Engagee.BaseTest;
import com.cpt.Engagee.CommonMethods;


import io.cucumber.java.en.Then;

public class BulkLetterGeneration_StepDefintion extends BaseTest {
	
	

	BulkLetterGeneration_pages bulk = new BulkLetterGeneration_pages();
	CommonMethods common = new CommonMethods();

	@Then("click on Bulk letter generation button")
	public void click_on_Bulk_letter_generation_button() throws InterruptedException {

		common.WaitMore();
		bulk.ClickBulkLetterButton();

	}

	@Then("click on Create bulk letters in batch button")
	public void click_on_Create_bulk_letters_in_batch_button() {

		common.WaitImp();
		bulk.ClickCreateBulkLettersBatch();

	}

	@Then("select single partner pic as {string}")
	public void select_single_partner_pic(String pic) {

		common.WaitAction();
		bulk.SelectPartner(pic);
	}

	@Then("select template name")
	public void select_template_name() {

		// bulk.TemplateDropdown();
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

		common.WaitAction();
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

		// System.out.println("Saved the letter successfully");
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
		
		common.WaitAction();
		bulk.Editbutton();

	}

	@Then("click on close icon in warning popup")
	public void click_on_close_icon_in_warning_popup() {

		bulk.CloseIcon();

	}

	@Then("click on action icon")
	public void click_on_action_icon() {

		//common.WaitAction();
		bulk.ActionButton();
	}

	@Then("click on edit fields button")
	public void click_on_edit_fields_button() {

		bulk.ClickEditFields();
	}

	@Then("enter fees as {string}")
	public void enter_fees(String fee) {

		bulk.ValuesFees(fee);
	}

	@Then("enter ZIP values as {string}")
	public void enter_ZIP_values(String zip) {

		bulk.ValuesZip(zip);
	}

	@Then("enter address as {string}")
	public void enter_address(String address) {

		bulk.ValueAddress(address);
	}

	@Then("enter signatory title as {string}")
	public void enter_signatory_title(String stitle) {

		bulk.ValuesSignatoryTitle(stitle);
	}

	@Then("enter signatory last name as {string}")
	public void enter_signatory_last_name(String lastname) {

		bulk.ValuesSignatoryLastName(lastname);
	}

	@Then("enter signatory first name as {string}")
	public void enter_signatory_first_name(String firstname) {

		bulk.ValuesSignatoryFirstName(firstname);

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

	@Then("enter state as {string} in add client screen")
	public void enter_state_in_add_client_screen(String state) {
		bulk.enterState(state);
	}

	@Then("enter city as {string} in add client screen")
	public void enter_city_in_add_client_screen(String city) {
		bulk.enterCity(city);
	}

	@Then("enter address in add client screen")
	public void enter_address_in_add_client_screen() {

		// bulk.ValueAddress();
	}

	@Then("enter signatory title in add client screen")
	public void enter_signatory_title_in_add_client_screen() {

		// bulk.ValuesSignatoryTitle();
	}

	@Then("enter signatory last name in add client screen")
	public void enter_signatory_last_name_in_add_client_screen() {

		// bulk.ValuesSignatoryLastName();
	}

	@Then("enter signatory first name in add client screen")
	public void enter_signatory_first_name_in_add_client_screen() {

		// bulk.ValuesSignatoryFirstName();
	}

	@Then("enter client name as {string} in add client screen")
	public void enter_client_name_in_add_client_screen(String clientname) {

		bulk.enterClientName(clientname);

	}

	@Then("user enter child entity as {string}")
	public void user_enter_child_entity_as(String childname) {

		common.WaitAction();
		bulk.enterChildEntityForRemove(childname);
		bulk.clickAddChildEntities();
	}

	@Then("add client entities")
	public void add_client_entities() throws InterruptedException {

		bulk.enterChildEntities();
		common.WaitAction();
		bulk.AddChildEntities();

	}

	@Then("select the partner name in add client screen")
	public void select_the_partner_name_in_add_client_screen() {

		common.ScrollDown();
		common.WaitAction();
		bulk.enterPartnerName();
		common.WaitAction();
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
		// System.out.println("User upload the attachment successfully");
		// common.closeBrowser();
	}

	@Then("click on Ok button in success popup")
	public void click_on_Ok_button_in_success_popup() throws InterruptedException {

		common.WaitAction();
		bulk.okaySuccess();
	}

	@Then("click on create bulk letter button")
	public void click_on_create_bulk_letter_button() {

		common.WaitAction();
		bulk.clickCreatrebulkletter();
	}

	@Then("click on ok button in create letter success warning popup")
	public void click_on_ok_button_in_create_letter_success_warning_popup() {

		common.WaitImp();
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

	@Then("select the new partner as {string}")
	public void select_the_new_partner(String partnername) {

		// common.WaitAction();
		bulk.selectNewPartner(partnername);
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

	@Then("select return type code as {string}")
	public void select_return_type_code_as(String code) {

		common.WaitAction();	
		bulk.clickReturnCode(code);
		common.WaitImp();		
		//bulk.dropDownClose();
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

		common.WaitImp();
		bulk.sltBulkLetterCheckbox();
	}

	@Then("click on remove client button")
	public void click_on_remove_client_button() {

		common.WaitImp();
		bulk.clkRemoveClient();
	}

	@Then("click on yes button in conformation popup for removing client")
	public void click_on_yes_button_in_conformation_popup_for_removing_client() {

		common.WaitImp();
		bulk.btnYesRemoveClient();

	}

	@Then("click on ok button in success warning popup for removing client")
	public void click_on_ok_button_in_success_warning_popup_for_removing_client() {

		common.WaitAction();
		bulk.btnOkayRemoveClient();
	}

	@Then("verify the partner name as {string}")
	public void verify_the_partner_name(String partnername) {

		common.WaitAction();
		bulk.verifyPartnerChanged(partnername);
	}

	@Then("click on remove button in edit attachment screen")
	public void click_on_remove_button_in_edit_attachment_screen() {

		common.WaitAction();
		bulk.clkRemoveAttachment();
		System.out.println("User remove the attachment successfully");

	}

	@Then("list the info popup")
	public void list_the_info_popup() {

		common.WaitAction();
		bulk.listInfo();
	}

	@Then("verify the content of the success popup")
	public void verify_the_content_of_the_success_popup() {

		common.WaitAction();
		bulk.verifyEditSuccessText();
	}

	@Then("verify the content of the save draft success popup")
	public void verify_the_content_of_the_save_draft_success_popup() {

		common.WaitAction();
		bulk.verifySaveDraftPopup();
	}

	@Then("click on Load client details button after selecting new partner")
	public void click_on_Load_client_details_button_after_selecting_new_partner() {

		common.WaitAction();
		bulk.btnLoadClientDetails();
	}

	@Then("click on Search by values coloumn")
	public void click_on_Search_by_values_coloumn() {

		common.WaitImp();
		bulk.clkSearchByValues();
	}

	@Then("search by client id as {string}")
	public void search_by_client_id(String empid) {

		common.WaitImp();
		bulk.searchByClientID(empid);

	}

	@Then("search by client name as {string}")
	public void search_by_client_name(String clientname) {

		common.WaitImp();
		bulk.searchByClientName(clientname);
	}

	@Then("search by partner pic as {string}")
	public void search_by_partner_pic(String partnername) {

		common.WaitImp();
		bulk.searchByPartner(partnername);

	}

	@Then("search by office as {string}")
	public void search_by_office(String officename) {

		common.WaitImp();
		bulk.searchByOffice(officename);

	}

	@Then("search by return type code as {string}")
	public void search_by_return_type_code(String code) {

		common.WaitImp();
		bulk.searchByReturnCode(code);

	}

	@Then("serach by signatory first name as {string}")
	public void serach_by_signatory_first_name(String firstname) {

		common.WaitImp();
		bulk.searchBySignatoryFirstName(firstname);

	}

	@Then("search by signatory email as {string}")
	public void search_by_signatory_email(String emailaddress) {

		common.WaitImp();
		bulk.searchBySignatoryEmail(emailaddress);

	}

	@Then("verify the view grid list in bulk letter generation screen")
	public void verify_the_view_grid_list_in_bulk_letter_generation_screen() {

		common.WaitImp();
		bulk.listViewGrid();
	}

	@Then("click on all bulk letter checkbox in bulk letter generation screen")
	public void click_on_all_bulk_letter_checkbox_in_bulk_letter_generation_screen() {

		common.WaitAction();
		bulk.clickAllLetterCheckbox();

	}

	@Then("click yes button in create conformation popup")
	public void click_yes_button_in_create_conformation_popup() {

		common.WaitImp();
		bulk.clickYesCreateLetterConformation();
	}

	@Then("click ok button on create success popup")
	public void click_ok_button_on_create_success_popup() {

		common.WaitImp();
		bulk.clickOkayCreateLetterSuccess();

	}

	@Then("click on Back to dashboard button")
	public void click_on_Back_to_dashboard_button() {

		common.WaitImp();
		bulk.ClickBacktoDashboard();

	}

	@Then("click on yes button in back to dashboard conformation popup")
	public void click_on_yes_button_in_back_to_dashboard_conformation_popup() {

		common.WaitImp();
		bulk.ClickYesBacktoDashboard();

	}

	@Then("click on download the above table as excel in bulk letter generation screen")
	public void click_on_download_the_above_table_as_excel_in_bulk_letter_generation_screen() {

		common.WaitImp();
		bulk.ClickDownloadAboveDetails();
	}

	@Then("verify the warning popup atleast one letter should be in a batch")
	public void verify_the_warning_popup_atleast_one_letter_should_be_in_a_batch() {

		common.WaitImp();
		bulk.VerifyDeleteAllLetterWarningPopup();
	}

	@Then("enter client entities mutilpe times")
	public void enter_client_entities_mutilpe_times() {

		common.WaitMore();
		bulk.Enter200ChildEntities();
	}

	@Then("verify the warning popup is showing when user create letters when mandatory fields are not provided")
	public void verify_the_warning_popup_is_showing_when_user_create_letters_when_mandatory_fields_are_not_provided() {

		common.WaitAction();
		bulk.VerifyWarningPopupBeforeCreateLetter();
	}

	@Then("select different partner pic")
	public void select_different_partner_pic() {

		bulk.selectDifferentPartner();

	}

	@Then("verify the add entities button after adding {int} entities")
	public void verify_the_add_entities_button_after_adding_entities(Integer int1) {

		common.WaitAction();
		bulk.verifyAddButtonAfter200Entities();
	}

	@Then("click on remove button in partner dropdown")
	public void click_on_remove_button_in_partner_dropdown() {

		common.WaitAction();
		bulk.clickRemoveButtonPartner();

	}

	@Then("verify the selected partner is removed from the dropdown")
	public void verify_the_selected_partner_is_removed_from_the_dropdown() {

		common.WaitAction();
		bulk.verifyPartnerDropdownAfterRemoveButton();
	}

	@Then("click on remove button in return type dropdown")
	public void click_on_remove_button_in_return_type_dropdown() {

		common.WaitImp();
		bulk.clickRemoveReturnTypeCode();

	}

	@Then("verify the selected return type code is removed from the dropdown")
	public void verify_the_selected_return_type_code_is_removed_from_the_dropdown() {

		common.WaitAction();
		bulk.verifyRemoveReturnTyepCodeAfterRemoveButton();
	}

	@Then("verify the batch ID is disbaled")
	public void verify_the_batch_ID_is_disbaled() {

		common.WaitImp();
		bulk.verifyBatchID();

	}

	@Then("verify the admin is disbaled")
	public void verify_the_admin_is_disbaled() {

		common.WaitImp();
		bulk.verifyAdmin();

	}

	@Then("verify the template dropdown is disbaled after load client button clicked")
	public void verify_the_template_dropdown_is_disbaled_after_load_client_button_clicked() {

		common.WaitImp();
		bulk.verifyTemplateDropdown();
	}

	@Then("click on Down arrow button in bulk letter generation screen")
	public void click_on_Down_arrow_button_in_bulk_letter_generation_screen() {

		common.WaitImp();
		bulk.clickBasicDetail();
	}

	@Then("enter the template name as {string} in search template dropdown")
	public void enter_the_template_name_in_search_template_dropdown(String templateName) {

		common.WaitImp();
		bulk.templateDropdownSearch(templateName);
	}

	@Then("click on close icon in edit fields popup screen")
	public void click_on_close_icon_in_edit_fields_popup_screen() {

		common.WaitAction();
		bulk.closeIconEditFieldPopup();
	}

	@Then("click on close button in edit fields popup screen")
	public void click_on_close_button_in_edit_fields_popup_screen() {

		common.WaitAction();
		bulk.closeButtonFieldPopup();
	}

	/*
	 * @Then("select template name with fee") public void
	 * select_template_name_with_fee() {
	 * 
	 * common.WaitImp(); bulk.selectTemplateWithFee(); }
	 */

	@Then("select template name as {string}")
	public void select_template_name_as(String string) {

		bulk.TemplateDropdown(string);
	}

	@Then("click on no checkbox in e signing? in edit field popp screen")
	public void click_on_no_checkbox_in_e_signing_in_edit_field_popp_screen() {

		common.WaitImp();
		bulk.clickNoCheckBoxESigning();
	}

	@Then("click on yes checkbox in e signing? in edit field popp screen")
	public void click_on_yes_checkbox_in_e_signing_in_edit_field_popp_screen() {

		bulk.clickYesCheckBoxESigning();
	}

	@Then("enter the alphabet in fee fields")
	public void enter_the_alphabet_in_fee_fields() {

		bulk.enterAlphabetInFee();

	}

	@Then("verify the warning popup when user enter alphabetic in fee field")
	public void verify_the_warning_popup_when_user_enter_alphabetic_in_fee_field() {

		bulk.verifyWarningAlphabeticFeeField();

	}

	@Then("click on X button in child entities")
	public void click_on_X_button_in_child_entities() {

		common.WaitAction();
		bulk.removeChildEntities();
	}

	@Then("verify the error popup is showing when user try to upload the wrong file")
	public void verify_the_error_popup_is_showing_when_user_try_to_upload_the_wrong_file() {

		bulk.verifyUploadBulkLetterErrorPopup();
	}

	@Then("click no button in create conformation popup")
	public void click_no_button_in_create_conformation_popup() {

		bulk.clickNoCreateConformationPopup();
	}

	@Then("click on X button in conformation warning popup")
	public void click_on_X_button_in_conformation_warning_popup() {

		bulk.clickXbuttonCreateConformationPopup();
	}

	@Then("verify the content of the edit success popup and click on ok button in bulk letter generation")
	public void verify_the_content_of_the_edit_success_popup_and_click_on_ok_button_in_bulk_letter_generation() {
		
		bulk.verifyFieldSuccessPopupBulkLetterScreen();
	}
	
	

}