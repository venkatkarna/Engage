package com.cpt.Engage.StepDefinition;

import java.awt.AWTException;

import com.cpt.Engage.Pages.Phase2_pages;
import com.cpt.Engagee.CommonMethods;

import io.cucumber.java.StepDefinitionAnnotation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Phase2_Step_Definition {

	Phase2_pages p = new Phase2_pages();
	CommonMethods common = new CommonMethods();

	@Then("click on choose paragraph button in bulk letter generation screen")
	public void click_on_choose_paragraph_button_in_bulk_letter_generation_screen() {

		p.clickChooseParagraphButton();

	}

	@Then("select the wizard options as {string} in choose paragraph screen")
	public void select_the_wizard_options_as_in_choose_paragraph_screen(String questionoptions) {

		common.WaitAction();
		p.getFirstQuestionOptions(questionoptions);
	}

	@Then("select {string} in choose paragraph screen")
	public void select_in_choose_paragraph_screen(String secondquestionoption) {

		common.WaitImp();
		p.getSecondQuestionOptions(secondquestionoption);

	}

	@Then("select  the question options {string} in choose paragraph screen")
	public void select_the_question_options_in_choose_paragraph_screen(String thirdquestionoption) {

		common.WaitImp();
		p.getThirdQuestionOptions(thirdquestionoption);

	}

	@Then("click on Submit button in chooose paragraph screen")
	public void click_on_submit_button_in_chooose_paragraph_screen() {

		common.WaitAction();
		p.clickSubmitChooseParagraph();

	}

	@Then("verify the success popup after submit the question options in choose paragraph screen and click on ok button")
	public void verify_the_success_popup_after_submit_the_question_options_in_choose_paragraph_screen_and_click_on_ok_button() {

		common.WaitAction();
		p.verifySuccessPopupAfterSubmitQuestionOptions();
	}

	@Then("select the letter by clicking the checkbox")
	public void select_the_letter_by_clicking_the_checkbox() {

		common.WaitAction();
		p.selectLetterByClickOnCheckbox();
	}

	@Then("click on Edit paragraph button")
	public void click_on_edit_paragraph_button() {

		common.WaitAction();
		p.clickEditParagraphButton();
	}

	@Then("select editable block")
	public void select_editable_block() {

		common.WaitAction();
		p.selectFeeBlock();

	}

	@Then("edit the fee block as {string}")
	public void edit_the_fee_block_as(String editText) {

		common.WaitAction();
		p.editFeeBlock(editText);

	}

	@Then("edit the fee block as {string} and click on update button")
	public void edit_the_fee_block_and_click_on_update_button(String editText) {

		common.WaitAction();
		p.editFeeBlock(editText);
		common.WaitAction();
		p.clickUpdateButton();

	}

	@Then("verify the success popup content after update the fee block and click ok button")
	public void verify_the_success_popup_content_after_update_the_fee_block_and_click_ok_button() {

		common.WaitAction();
		p.verifySuccessPopupAfterEditBlock();
	}

	@Then("verify the choose paragraph is disbaled by default")
	public void verify_the_choose_paragraph_is_disbaled_by_default() {

		common.WaitAction();
		p.verifyChooseParagraphButton();

	}

	@Then("verify the choose paragraph is enabled after user selecting partner, template name and return type code")
	public void verify_the_choose_paragraph_is_enabled_after_user_selecting_partner_template_name_and_return_type_code() {

		common.WaitAction();
		p.verifyChooseParagraphButton();

	}

	@Then("verify the edit paragrph button is enable")
	public void verify_the_edit_paragrph_button_is_enable() {

		common.WaitAction();
		p.verifyEditParagraphButton();
	}

	@Then("verify the edit paragraph button is disabled by default")
	public void verify_the_edit_paragraph_button_is_disabled_by_default() {

		common.WaitMore();
		p.verifyEditParagraphButton();
	}

	@Then("click on close button in choose paragraph screen")
	public void click_on_close_button_in_choose_paragraph_screen() {

		common.WaitAction();
		p.clickCloseButtonChooseParagraph();

	}

	@When("click on choose paragraph icon in basic details")
	public void click_on_choose_paragraph_icon_in_basic_details() {
		common.WaitImp();
		p.clickChooseParagraphIconInBasicDetails();
	}

	@Then("verify the load client details button is disbaled while selecting wizard responses")
	public void verify_the_load_client_details_button_is_disbaled_while_selecting_wizard_responses() {

		common.WaitAction();
		p.verifyLoadClientDetailsButtonDisbaledorEnabled();

	}

	@Then("click on close icon in choose paragraph screen")
	public void click_on_close_icon_in_choose_paragraph_screen() {

		common.WaitAction();
		p.clickCloseIconChooseParagraph();

	}

	@Then("verify the load client details button is enabled after click on submit button")
	public void verify_the_load_client_details_button_is_enabled_after_click_on_submit_button() {

		common.WaitAction();
		p.verifyLoadClientDetailsButtonDisbaledorEnabled();

	}

	@Then("verify the content of the warning popup and click on ok button")
	public void verify_the_content_of_the_warning_popup_and_click_on_ok_button() {

		common.WaitAction();
		p.verifyWarningPopupContentWithoutQuestionOptions();
	}

	@Then("verify the choose paragraph button is disabled by default after load client details")
	public void verify_the_choose_paragraph_button_is_disabled_by_default_after_load_client_details() {

		common.WaitAction();
		p.verifyChooseParagraphButtonAfterLoadClientDetails();
	}

	@Then("select all the letter by clicking the checkbox")
	public void select_all_the_letter_by_clicking_the_checkbox() {

		common.WaitAction();
		p.selectAllClientLettersByClickingCheckbox();
	}

	@Then("click on Choose paragraph button")
	public void click_on_choose_paragraph_button() {

		common.WaitAction();
		p.clickChooseParagraphButtonBulkLetterGenerationScreen();
	}

	@Then("select the wizard option as {string} in choose paragraph screen")
	public void select_the_wizard_option_as_in_choose_paragraph_screen(String questionoptions) {

		common.WaitAction();
		p.changeQuestionOptionsChooseParagraphScreen(questionoptions);
	}

	@Then("verify the warning popup when user try to edit the question options for mutliple letters with different template")
	public void verify_the_warning_popup_when_user_try_to_edit_the_question_options_for_mutliple_letters_with_different_template() {

		common.WaitAction();
		p.verifyWarningpopupWithDifferentContent();
	}

	@Then("click on submit button in edit paragraph screen")
	public void click_on_submit_button_in_edit_paragraph_screen() {

		common.WaitAction();
		p.clickSubmitButtonEditParagraph();
	}

	@Then("verify the success popup content after edited the paragraph and click on ok button")
	public void verify_the_success_popup_content_after_edited_the_paragraph_and_click_on_ok_button() {

		common.WaitAction();
		p.verifySuccessPopupAfterParagraphEdit();
	}

	@Then("verify the Create bulk letters in batch button will be disabled for partner role users")
	public void verify_the_create_bulk_letters_in_batch_button_will_be_disabled_for_partner_role_users() {

		common.WaitAction();
		p.verifyCreateLettersInBatchDisabled();
	}

	@Then("click on Submit button in chooose paragraph screen after load client details")
	public void click_on_submit_button_in_chooose_paragraph_screen_after_load_client_details() {

		common.WaitAction();
		p.clickSubmitButtonInChooseParagraphAfterLoadClient();
	}

	@Then("verify the success popup after submit the question options in choose paragraph screen and click on ok button after load client details")
	public void verify_the_success_popup_after_submit_the_question_options_in_choose_paragraph_screen_and_click_on_ok_button_after_load_client_details() {

		common.WaitMore();
		p.verifySuccessPopupAfterLoadClient();

	}

	@Then("verify the success popup content after update the fee block and click ok button after load client details")
	public void verify_the_success_popup_content_after_update_the_fee_block_and_click_ok_button_after_load_client_details() {

		common.WaitAction();
		p.verifySuccessPopupAfterEditParagraph();
	}

	@Then("verify the warning popup when user try to edit the fee block for multiple letters with multiple letters with different template")
	public void verify_the_warning_popup_when_user_try_to_edit_the_fee_block_for_multiple_letters_with_multiple_letters_with_different_template() {

		common.WaitAction();
		p.verifyWarningpopupEditParagraphWithDifferentContent();
	}

	@Then("click on {string} option from action menu")
	public void click_on_option_from_action_menu(String actionmenu) {

		common.WaitImp();
		p.selectOptionsfromActionMenu(actionmenu);

	}

	@Then("verify the warning popup for field value is empty and click on ok button")
	public void verify_the_warning_popup_for_field_value_is_empty_and_click_on_ok_button() {

		common.WaitAction();
		p.verifyWarningPopupInputFieldValue();
	}

	@Then("select and clear the text in fee block and click on update button")
	public void select_and_clear_the_text_in_fee_block_and_click_on_update_button() throws AWTException {

		common.WaitAction();
		p.selectContentInFeeBlockAndClear();
		common.WaitImp();
		p.clickUpdateButton();

	}

	@Then("verify the warning toast message when user submit the empty block")
	public void verify_the_warning_toast_message_when_user_submit_the_empty_block() {

		common.WaitAction();

	}

	@Then("click on ok button in warning popup if warning popup is displaying")
	public void click_on_ok_button_in_warning_popup_if_warning_popup_is_displaying() {

		common.WaitAction();
		common.WaitAction();
		common.WaitMore();
		p.feeWarningContent();
	}

	@When("enter the draft status in status field in batch dashboard screen")
	public void enter_the_draft_status_in_status_field_in_batch_dashboard_screen() {

		common.WaitImp();
		p.enterStatusFieldInBatchDashboard();
	}

	@Then("verify the edit attachment button is disbaled by default in bulk letter generation screen")
	public void verify_the_edit_attachment_button_is_disbaled_by_default_in_bulk_letter_generation_screen() {

		common.WaitImp();
		p.editAttachmentButton();

	}

	@Then("verify the edit attachment button is enabled after selecting one or multiple letters")
	public void verify_the_edit_attachment_button_is_enabled_after_selecting_one_or_multiple_letters() {

		common.WaitImp();
		p.editAttachmentButton();
	}

	@When("click on Edit attachment button in bulk letter generation")
	public void click_on_edit_attachment_button_in_bulk_letter_generation() {

		common.WaitImp();
		p.clickEditAttachmentButton();

	}

	@When("click on preview button in add attachment popup")
	public void click_on_preview_button_in_add_attachment_popup() {

		common.WaitImp();
		p.clickPreviewAddAttachmentPopup();
		common.WaitImp();
		p.closePreviewInAddAttachment();
	}

	@When("click on remove button in add attachment popup")
	public void click_on_remove_button_in_add_attachment_popup() {
		common.WaitImp();
		p.clickRemoveAddAttachmentPopup();
	}

	@When("verify the content in success popup after added the attachment and click on ok button")
	public void verify_the_content_in_success_popup_after_added_the_attachment_and_click_on_ok_button() {

		common.WaitAction();
		p.verifySuccessToastAfterAddedAttachment();
	}

	@When("click on add button and attach same attachment again in add attachment popup")
	public void click_on_add_button_and_attach_same_attachment_again_in_add_attachment_popup() {

		common.WaitImp();
		p.addSameAttachment();
	}

	@When("verify the warning popup when user try to attach the same file")
	public void verify_the_warning_popup_when_user_try_to_attach_the_same_file() {

		common.WaitAction();
		p.verifyWarningPoupUploadSameAttachment();
	}

	@When("click on add button in attachment invalid file in add attachment popup")
	public void click_on_add_button_in_attachment_invalid_file_in_add_attachment_popup() {

		common.WaitImp();
		p.uploadInvalidFileInAddAttachment();

	}

	@When("verify the error popup when we upload the invalid file")
	public void verify_the_error_popup_when_we_upload_the_invalid_file() {

		common.WaitAction();
		p.verifyErrorPopupInvalidFileUpload();

	}

	@When("click on add button and attach five valid attachments")
	public void click_on_add_button_and_attach_five_valid_attachments() {

		common.WaitImp();
		p.addFiveAttachments();
	}

	@When("verify the add button is disbaled for added five attachments")
	public void verify_the_add_button_is_disbaled_for_added_five_attachments() {

		common.WaitImp();
		p.VerifyAdddButtonDisableAfterFiveAttachment();
	}

	@When("verify the submit button is disbaled by default")
	public void verify_the_submit_button_is_disbaled_by_default() {

		common.WaitImp();
		p.verifySubmitButtonInAddAttachmentPopup();
	}

	@When("verify the {int} available radio button is displaying in edit fields")
	public void verify_the_available_radio_button_is_displaying_in_edit_fields(Integer int1)
			throws InterruptedException {

		common.WaitAction();
		p.verify7216FormShowingInEditFields();
	}

	@When("select yes button in {int} available radio button in edit fields popup")
	public void select_yes_button_in_available_radio_button_in_edit_fields_popup(Integer int1) {

		common.WaitAction();
		p.clickYesButtonIn7216Form();
	}

	@When("select no button in {int} available radio button in edit fields popup")
	public void select_no_button_in_available_radio_button_in_edit_fields_popup(Integer int1) {

		common.WaitAction();
		p.clickNoButtonIn7216Form();

	}

	@When("click on ok button after update the {int} radio button in edit fields")
	public void click_on_ok_button_after_update_the_radio_button_in_edit_fields(Integer int1) {

		common.WaitAction();
		p.clickOkaySuccessToastAfterUpdate7216();
	}

	@When("verify the no option is selected by default if the letter have {int} form")
	public void verify_the_no_option_is_selected_by_default_if_the_letter_have_form(Integer int1) {

		common.WaitAction();
		p.verifyNoSelectedByDefaultIn7216();
	}

	@When("verify the yes option is not selected if the letter have {int} form")
	public void verify_the_yes_option_is_not_selected_if_the_letter_have_form(Integer int1) {

		common.WaitAction();
		p.verifyYesRadioButtonIn7216();
	}

	@When("verify the {int} available radio button is displaying in Add client screen")
	public void verify_the_available_radio_button_is_displaying_in_add_client_screen(Integer int1) {

		common.WaitImp();
		p.verify7216AvailableShowingInAddClient();
	}

	@When("verify the no option is selected by default in Add client screen")
	public void verify_the_no_option_is_selected_by_default_in_add_client_screen() {

		common.WaitImp();
		p.verifyRadioButton7216InAddClient();
	}

	@When("verify the yes option is not selected by default in Add client screen")
	public void verify_the_yes_option_is_not_selected_by_default_in_add_client_screen() {

		common.WaitAction();
		p.verifyYesRadioButton7216InAddClient();
	}

	@Then("click on tax year dropdown in bulk letter generation screen")
	public void click_on_tax_year_dropdown_in_bulk_letter_generation_screen() {

		common.WaitAction();
		p.clickTaxYearBasicDetailsDropdown();
	}

	@When("select single tax year as {string}")
	public void select_single_tax_year_as(String taxyear) {

		common.WaitAction();
		p.clickTaxYearBasicDetailsDropdown();
		common.WaitAction();
		p.selectTaxYear(taxyear);
	}

	@When("click on close icon in the tax year field")
	public void click_on_close_icon_in_the_tax_year_field() {

		common.WaitImp();
		p.clickCloseIconTaxYear();
	}

	@When("select all the tax years by click on select all checkbox")
	public void select_all_the_tax_years_by_click_on_select_all_checkbox() {

		common.WaitImp();
		p.clickSelectAllTaxYearDropdown();
	}

	@When("verify the choose paragraph button is disbaled without any year selected")
	public void verify_the_choose_paragraph_button_is_disbaled_without_any_year_selected() {

		common.WaitImp();
		p.verifyChooseParagraphButton();
	}

	@When("verify the load client paragraph button is disbaled without any year selected")
	public void verify_the_load_client_paragraph_button_is_disbaled_without_any_year_selected() {

		common.WaitImp();
		p.verifyLoadClientDetailsButtonDisbaledorEnabled();
	}

	@When("verify the edit {int} form button is disbaled for specific templates")
	public void verify_the_edit_form_button_is_disbaled_for_specific_templates(Integer int1) {

		common.WaitImp();
		p.verifyEdit7216FormButton();
	}

	@When("verify the edit {int} form button is enabled for individual templates")
	public void verify_the_edit_form_button_is_enabled_for_individual_templates(Integer int1) {

		common.WaitImp();
		p.verifyEdit7216FormButton();
	}

	@When("click on edit {int} form button")
	public void click_on_edit_form_button(Integer int1) {

		common.WaitImp();
		p.clickEdit7216FormButton();

	}

	@When("verify the ck editor title as Edit {int} provider")
	public void verify_the_ck_editor_title_as_edit_provider(Integer int1) {

		common.WaitImp();
		p.verifyEdit7216FormEditorTitle();

	}

	@When("verify the close button in ck editor")
	public void verify_the_close_button_in_ck_editor() {

		common.WaitImp();
		p.clickCloseIcon7216FormCKEditor();

	}

	@When("verify the cancel button in ck editor")
	public void verify_the_cancel_button_in_ck_editor() {

		common.WaitImp();
		p.clickCancelButton7216FormCkEditor();
	}

	@When("click on update button in edit {int} form ck editor")
	public void click_on_update_button_in_edit_form_ck_editor(Integer int1) {

		common.WaitAction();
		p.clickUpdateButton7216FormCKEditor();

	}

	@When("verify the success toast message after update the {int} form")
	public void verify_the_success_toast_message_after_update_the_form(Integer int1) {

		common.WaitAction();
		p.verifySuccessToastAfter7216FormUpdate();
	}

	@When("verify the note text in {int} form in ck editor")
	public void verify_the_note_text_in_form_in_ck_editor(Integer int1) {

		common.WaitAction();
		p.verifyNoteTextInEdit7216InCKEditor();
	}

	@Then("select the create letters based on templates")
	public void select_the_create_letters_based_on_templates() {

		common.WaitImp();
		p.clickTemplate();
	}

	@Then("click on continue button")
	public void click_on_continue_button() {

		common.WaitImp();
		p.clickContinue();
	}

	@When("enter the {string} in search value")
	public void enter_the_in_search_value(String clientid) {

		common.WaitImp();
		p.enterClientidInSearchValues(clientid);

	}

	@When("verify that user can able to add five attachments")
	public void verify_that_user_can_able_to_add_five_attachments() {

		common.WaitAction();
		p.addFiveAttachments();
	}

	@When("click on email radio button in upload attachment popup")
	public void click_on_email_radio_button_in_upload_attachment_popup() {

		common.WaitImp();
		p.clickAttachWithEmail();

	}

	@When("click on letter radio button in upload attachment popup")
	public void click_on_letter_radio_button_in_upload_attachment_popup() {

		common.WaitImp();
		p.clickAttachWithLetter();
	}

	@When("click on template option from menu bar")
	public void click_on_template_option_from_menu_bar() {

		common.WaitImp();
		p.clickTemplateFromMenuBar();

	}

	@When("click on add template button in template screen")
	public void click_on_add_template_button_in_template_screen() {

		common.WaitAction();
		p.clickAddNewTemplateButton();

	}

	@When("click on add attachment button in template screen")
	public void click_on_add_attachment_button_in_template_screen() {

		common.WaitAction();
		p.clickAddAttachmentButtonInTemplateScreen();

	}

	@When("add the attachment in upload attachment popup in template screen")
	public void add_the_attachment_in_upload_attachment_popup_in_template_screen() {

		common.WaitAction();
		p.uploadAttachmentInTemplateScreen();

	}

	@When("click on edit button for the exisiting templates")
	public void click_on_edit_button_for_the_exisiting_templates() {

		common.WaitAction();
		p.clickEditIconForExisitingTemplates();

	}

	@When("click on edit attachment button in template screen")
	public void click_on_edit_attachment_button_in_template_screen() {

		common.WaitAction();
		p.clickEditAttachmentInTemplateScreen();

	}

	@When("verify the warning content in the upload attachment popup screen")
	public void verify_the_warning_content_in_the_upload_attachment_popup_screen() {

		common.WaitAction();
		p.verifyWarningContentInUploadAttachment();

	}

	@When("click on close button in upload attachment popup screen")
	public void click_on_close_button_in_upload_attachment_popup_screen() {

		common.WaitImp();
		p.clickCloseUploadAttachment();
	}

	@When("verify the generic note text in the upload attachment popup screen")
	public void verify_the_generic_note_text_in_the_upload_attachment_popup_screen() {

		common.WaitImp();
		p.verifyGenericTextInUploadAttachment();
	}

	@When("verify that letter radio button is selected by default")
	public void verify_that_letter_radio_button_is_selected_by_default() {

		common.WaitImp();
		p.verifyLetterRadioButtonSelectedDefault();
	}

	@When("verify the title as {string} of the popup screen")
	public void verify_the_title_as_of_the_popup_screen(String popuptitle) {

		common.WaitImp();
		p.verifyPopupTitle(popuptitle);
	}

	@When("select the create letters based on clientid\\/name")
	public void select_the_create_letters_based_on_clientid_name() {

		common.WaitImp();
		p.clickClient();
	}

	@When("select clientname\\/id radio button for search and load clients based on")
	public void select_clientname_id_radio_button_for_search_and_load_clients_based_on() {

		common.WaitAction();
		p.selectClientIdNameRadioButton();

	}

	@When("user can able to select mulitple clientname\\/id")
	public void user_can_able_to_select_mulitple_clientname_id() {

		common.WaitImp();

	}

	@When("verify that clientname\\/id is selected by default")
	public void verify_that_clientname_id_is_selected_by_default() {

		common.WaitAction();

		p.verifyClientNameIDSelectedByDefault();

	}

	@When("select emailaddress radio button for search and load clients based on")
	public void select_emailaddress_radio_button_for_search_and_load_clients_based_on() {

		common.WaitAction();
		p.selectEmailAddressRadioButton();
	}

	@When("click clientname\\/id dropdown")
	public void click_clientname_id_dropdown() {

		common.WaitAction();
		common.WaitAction();
		p.clickClientIdNameDropdown();
	}

	@When("user can able to select {string} from the dropdown")
	public void user_can_able_to_select_from_the_dropdown(String clientName) {

		common.WaitAction();
		p.selectClientName(clientName);
	}

	@When("user can able to select multiple {string}, {string}, {string}\" from the dropdown")
	public void user_can_able_to_select_multiple_from_the_dropdown(String clientName1, String clientName2,
			String clientName3) {

		common.WaitImp();
		p.selectMultipleClientNames(clientName1, clientName2, clientName3);

	}

	@When("verify the next button is enabled or disbled without selecting templates, return type code")
	public void verify_the_next_button_is_enabled_or_disbled_without_selecting_templates_return_type_code() {

		common.WaitImp();
		p.verifyNextButtonIsDisabledWithoutSelectedTemplate();
	}

	@When("select template name as {string} in basic details")
	public void select_template_name_as_in_basic_details(String tempName) {

		common.WaitAction();
		p.chooseTemplateInBasicDetails(tempName);
	}

	@When("select return type code as {string} in basic details")
	public void select_return_type_code_as_in_basic_details(String code) {

		common.WaitImp();
		p.chooseReturnTypeCodeInBasicDetails(code);
	}

	@When("click on Submit button in basic details")
	public void click_on_submit_button_in_basic_details() {

		common.WaitAction();
		p.clickSubmitChooseParagrpahInBasicDetails();
	}

	@When("verify the success popup after submit in basic details and click on ok button")
	public void verify_the_success_popup_after_submit_in_basic_details_and_click_on_ok_button() {

		common.WaitAction();
		p.verifySuccessPopupAfterChooseParagraphInBasicDetails();
	}

	@When("user can able to select multiple {string}, {string} from the dropdown")
	public void user_can_able_to_select_multiple_from_the_dropdown(String clientName1, String clientName2) {

		common.WaitImp();
		p.selectTwoClientsInBasicDetails(clientName1, clientName2);

	}

	@When("select template name as {string} in basic details for next letter")
	public void select_template_name_as_in_basic_details_for_next_letter(String tempName2) {

		common.WaitImp();
		p.chooseTemplateInBasicDetailsForNextLetter(tempName2);
	}

	@When("select return type code as {string} in basic details for next letter")
	public void select_return_type_code_as_in_basic_details_for_next_letter(String code2) {

		common.WaitAction();
		p.chooseReturnTypeCodeInBasicDetailsForNextLetter(code2);
	}

	@When("click on choose paragraph icon in basic details for next letter")
	public void click_on_choose_paragraph_icon_in_basic_details_for_next_letter() {

		common.WaitImp();
		p.clickChooseParagraphIconForNextLetter();

	}

	@When("click on next button in client details")
	public void click_on_next_button_in_client_details() {

		common.WaitImp();
		p.clickNextButtonInClientDetails();
	}

	@When("click on email address dropdown")
	public void click_on_email_address_dropdown() {

		common.WaitAction();
		p.clickEmailAddressDropdownInBasicDetails();

	}

	@When("user can able to select single {string} from the dropdown in basic details")
	public void user_can_able_to_select_single_from_the_dropdown_in_basic_details(String emailAddress) {

		common.WaitImp();
		p.chooseEmailAddressInBasicDetails(emailAddress);

	}

	@When("click on Edit email attachment button in bulk letter generation")
	public void click_on_edit_email_attachment_button_in_bulk_letter_generation() {

		common.WaitAction();
		p.clickAddEmailAttachment();
	}

	@When("verify the content of the success toast after adding the attachment in email")
	public void verify_the_content_of_the_success_toast_after_adding_the_attachment_in_email() {

		common.WaitAction();
		p.verifySuccessPopupAfterAttachmentAddedInEmail();

	}

	@When("verify the continue button is disbaled by default")
	public void verify_the_continue_button_is_disbaled_by_default() {

		common.WaitImp();
		p.verifyContinueButtonIsDisbaledByDefault();
	}

	@When("verify the placeholder when user select the clientname?id is selected")
	public void verify_the_placeholder_when_user_select_the_clientname_id_is_selected() {

		common.WaitAction();
		p.verifyDropdownPlaceHolderClientId();
	}

	@When("verify the placeholder when user select the emailaddress is selected")
	public void verify_the_placeholder_when_user_select_the_emailaddress_is_selected() {

		common.WaitAction();
		p.verifyDropdownPlaceHolderEmail();
	}

	@When("verify the load client details button is disbaled without selecting the clientname\\/id or email address")
	public void verify_the_load_client_details_button_is_disbaled_without_selecting_the_clientname_id_or_email_address() {

		common.WaitAction();
		p.verifyLoadClientDetailsButtonDisbaledorEnabled();

	}

	@When("enter {string} in add client screen")
	public void enter_in_add_client_screen(String clientID) {

		common.WaitAction();
		p.enterClientIDInAddClientScreen(clientID);

	}

	@When("enter any {string} in child client id field")
	public void enter_any_in_child_client_id_field(String childname) {

		p.enterStringInChildClientIDField(childname);
	}

	@When("verify the warning text is showing when user enter the string in child client id field")
	public void verify_the_warning_text_is_showing_when_user_enter_the_string_in_child_client_id_field() {

		p.validateWarningTextShowingInChildClientIDField();
	}

	@When("enter the {string} in child client id field in add new client popup screen")
	public void enter_the_in_child_client_id_field_in_add_new_client_popup_screen(String childname) {

		p.enterStringInChildClientIDFieldInAddNewClient(childname);

	}

	@When("enter the {string} in child client id field")
	public void enter_the_in_child_client_id_field(String childId) {

		p.enterChildClientID(childId);
	}

	@When("enter the {string} in child client name field")
	public void enter_the_in_child_client_name_field(String childname) {

		p.enterChildClientName(childname);

	}

	@When("verify the added child client id and name is showing")
	public void verify_the_added_child_client_id_and_name_is_showing() {

		p.getAllChildClientNamesID();
	}

	@When("click on add button for adding child client name and id")
	public void click_on_add_button_for_adding_child_client_name_and_id() {

		p.clickAddChildClient();
	}

	@When("verify the add button is disbaled by default")
	public void verify_the_add_button_is_disbaled_by_default() {

		p.verifyAddChildClientButtonIsDisabledByDefault();
	}

	@When("verify the warning label is showing when user enter more than {int} characters in child client id field")
	public void verify_the_warning_label_is_showing_when_user_enter_more_than_characters_in_child_client_id_field(
			Integer int1) {

		p.verifyWarningLabelUserAddMoreCharactersInChildClientID();
	}

	@When("enter the {string} in child client id field in add new client screen")
	public void enter_the_in_child_client_id_field_in_add_new_client_screen(String childid) {

		p.enterMaximumIntegerInChildClientIDAddNewClientScreen(childid);
	}

	@When("verify the warning label is showing when user enter more than {int} characters in child client name field in edit field screen")
	public void verify_the_warning_label_is_showing_when_user_enter_more_than_characters_in_child_client_name_field_in_edit_field_screen(
			Integer int1) {

		p.verifyWarningLabelUserEnterMorethan100CharactersInChildClientName();
	}

	@When("verify the warning label is showing when user enter more than {int} characters in child client name field in add new client screen")
	public void verify_the_warning_label_is_showing_when_user_enter_more_than_characters_in_child_client_name_field_in_add_new_client_screen(
			Integer int1) {

		p.verifyWarningLabelUserEnterMorethan100CharactersInChildClientName();

	}

	@When("enter the {string} in child client name field in add new client popup screen")
	public void enter_the_in_child_client_name_field_in_add_new_client_popup_screen(String childname) {

		p.enterMoreCharacterChildCientNameInAddNewClientscreen(childname);
	}

	@When("verify the warning label is showing when user enter child client name below five character")
	public void verify_the_warning_label_is_showing_when_user_enter_child_client_name_below_five_character() {

		p.verifyWarningLabelBelowFiveCharacterInChildName();
	}

	@When("click on delete icon in child client")
	public void click_on_delete_icon_in_child_client() {

		p.clickDeleteIconChildClient();

	}

	@When("click on add button for adding child client name and id in add new client screen")
	public void click_on_add_button_for_adding_child_client_name_and_id_in_add_new_client_screen() {

		p.clickAddChildClientInAddNewClientScreen();
	}

	@When("verify the add button is enabled once user enter the valid inputs")
	public void verify_the_add_button_is_enabled_once_user_enter_the_valid_inputs() {

		p.verifyAddChildClientButtonIsDisabledByDefault();

	}

	@When("select the {string} from the status dropdown in dashboard screen")
	public void select_the_from_the_status_dropdown_in_dashboard_screen(String status) {

		p.selectStatusFromStatusDropdownInDashboardScreen(status);

	}

	@When("click on Load client details button in client approach")
	public void click_on_load_client_details_button_in_client_approach() {

		p.clickLoadClientDetailsInClientFlow();
	}

	@When("click on action icon in client flow")
	public void click_on_action_icon_in_client_flow() {

		p.clickActionInClientFlow();
	}

	@When("verify the address1, address2, address3 is showing in edit fields screen")
	public void verify_the_address1_address2_address3_is_showing_in_edit_fields_screen() {

		p.verifyAddressLineOneTwoThreeIsDisplayingInEditFieldScreen();
	}

	@When("verify the address1, address2, address3 is showing for office details in edit fields screen")
	public void verify_the_address1_address2_address3_is_showing_for_office_details_in_edit_fields_screen() {

		p.verifyOfficeAddressLineOneTwoThreeIsDisplayingInEditFieldScreen();
	}

	@When("user can able to select {string} from the partner dropdown")
	public void user_can_able_to_select_from_the_partner_dropdown(String partner) {

		p.selectValueFromPartnerDropdownInEditFieldScreen(partner);

	}

	@When("user can able to select {string} from the office dropdown")
	public void user_can_able_to_select_from_the_office_dropdown(String office) {

		p.selectValueFromOfficeDropdownInEditFieldScreen(office);

	}

	@When("click on update button in edit fields screen in client flow")
	public void click_on_update_button_in_edit_fields_screen_in_client_flow() {

		p.clickUpdateButtonInEditFieldScreenInEditScreen();
	}

	@When("verify the add bulk attachments to email button in bulk letter generation screen in client flow")
	public void verify_the_add_bulk_attachments_to_email_button_in_bulk_letter_generation_screen_in_client_flow() {

		p.verifyAddBulkAttachmentToEmail();
	}

	@When("click on Submit button in chooose paragraph screen in dashboard screen")
	public void click_on_submit_button_in_chooose_paragraph_screen_in_dashboard_screen() {

		p.clickSubmitChooseParagraphInDashboardScreen();
	}

	@When("verify the finance questions are disabled for non special users")
	public void verify_the_finance_questions_are_disabled_for_non_special_users() {

		p.verifyFinanceChargesDisbaleForNonSpecialUsers();
	}

	@When("verify the finance questions option is select as yes by default")
	public void verify_the_finance_questions_option_is_select_as_yes_by_default() {

		p.verifyFinanceChargesSelectedByDefault();
	}

	@When("verify the title of the send signing reminder popup screen")
	public void verify_the_title_of_the_send_signing_reminder_popup_screen() {

		p.verifyTitleOfSendSigningReminder();

	}

	@When("click on yes button in the send singing reminder popup")
	public void click_on_yes_button_in_the_send_singing_reminder_popup() {

		p.clickYesButtonInSendSigningReminder();

	}

	@When("verify the success toast after send signing reminder")
	public void verify_the_success_toast_after_send_signing_reminder() {

		p.verifyAfterSendSigningReminder();
	}

	@When("click on no button in the send singing reminder popup")
	public void click_on_no_button_in_the_send_singing_reminder_popup() {

		p.clickYNoButtonInSendSigningReminder();

	}

	@When("click on yes button in confirm cancel popup")
	public void click_on_yes_button_in_confirm_cancel_popup() {

		p.clickYesButtonInCancelConfirmPopup();
	}

	@When("verify user can able to land on resend popup")
	public void verify_user_can_able_to_land_on_resend_popup() {

		p.verifyResendPopupTitle();
	}

	@When("click on ok button in cancel success toast")
	public void click_on_ok_button_in_cancel_success_toast() {

		p.clickOkButtonInCancelSuccessPopup();
	}

	@When("verify child fee field is showing in edit fields")
	public void verify_child_fee_field_is_showing_in_edit_fields() {

		p.verifyChildFeeIsShowingInEditFields();

	}

	@When("enter the {string} in child fee field")
	public void enter_the_in_child_fee_field(String childFee) {

		p.enterChildFeeInEditFields(childFee);

	}

	@When("verify error toast is showing when user enter same child id")
	public void verify_error_toast_is_showing_when_user_enter_same_child_id() {

		p.verifyChildSameIdErrorPopup();

	}

	@When("verify error toast is showing when user enter same child name")
	public void verify_error_toast_is_showing_when_user_enter_same_child_name() {

		p.verifyChildSameNameErrorPopup();

	}

	@When("verify child fee field is showing in edit fields for standard language option is selected")
	public void verify_child_fee_field_is_showing_in_edit_fields_for_standard_language_option_is_selected() {

		p.verifyChildFeeIsShowingInEditFieldsForStandardOptionsIsSelected();
	}

	@When("verify the success popup after edit the question options in choose paragraph popup in dashboard screen and click on ok button")
	public void verify_the_success_popup_after_edit_the_question_options_in_choose_paragraph_popup_in_dashboard_screen_and_click_on_ok_button() {

		p.verifySuccessToastAfterEditChooseParagraphOptions();
	}

	@Then("enter {string} in search coloumn values in bulk letter generation screen")
	public void enter_in_search_coloumn_values_in_bulk_letter_generation_screen(String clinetid) {

		p.enterClientIDInSearchColumnValues(clinetid);

	}

	@When("select can able to select certain clients radio button in bulk letter generation screen")
	public void select_can_able_to_select_certain_clients_radio_button_in_bulk_letter_generation_screen() {

		p.clickSelectCertainClientRadioButton();

	}

	@When("user close the clientname dropdown")
	public void user_close_the_clientname_dropdown() {

		p.clickCloseIconInClientNameDropdown();
	}

	@When("verify warning popup is showing when user try to edit non free to edit paragraph")
	public void verify_warning_popup_is_showing_when_user_try_to_edit_non_free_to_edit_paragraph() {

		p.editNonFreeToEditBlock();

	}

	@When("verify the yes or no {int} form button is showing after adding child in edit fields screen")
	public void verify_the_yes_or_no_form_button_is_showing_after_adding_child_in_edit_fields_screen(Integer int1) {

		p.verifyChild7216FormIsShowing();

	}

	@When("user can able to select yes or no radio button in {int} form in edit fields screen")
	public void user_can_able_to_select_yes_or_no_radio_button_in_form_in_edit_fields_screen(Integer int1) {

		p.selectNoRadioButtonChild7216Form();

	}

	@When("verify yes radio button in child {int} form is selected by default in edit fields screen")
	public void verify_yes_radio_button_in_child_form_is_selected_by_default_in_edit_fields_screen(Integer int1) {

		p.verifyYesRadioButtonIsSelectedByDefault();
	}

	@When("verify Add client button in bulk letter generation screen in client based letter creation")
	public void verify_add_client_button_in_bulk_letter_generation_screen_in_client_based_letter_creation() {

		p.verifyAddClientButtonIsShowing();

	}

	@When("click on Add client button in bulk letter generation screen in client based letter creation")
	public void click_on_add_client_button_in_bulk_letter_generation_screen_in_client_based_letter_creation() {

		p.clickAddClientButton();

	}

	@When("click on Add button in add new client screen")
	public void click_on_add_button_in_add_new_client_screen() {

		p.clickAddButtonInAddNewClientScreen();

	}

	@When("click clientname\\/id dropdown in add new client screen in client based letter creation")
	public void click_clientname_id_dropdown_in_add_new_client_screen_in_client_based_letter_creation() {

		p.clickClientNameDropdownInAddNewClientScreen();

	}

	@When("user can able to select {string} from the dropdown in add new client screen in client based letter creation")
	public void user_can_able_to_select_from_the_dropdown_in_add_new_client_screen_in_client_based_letter_creation(
			String clientName) {

		p.enterClientNameAndSelectChildNameFromDropdown(clientName);

	}

	@When("click on Add New Client radio button in Add new client popup screen")
	public void click_on_add_new_client_radio_button_in_add_new_client_popup_screen() {

		p.clickAddNewClientRadioButtonInAddNewClientPopupScreen();
	}

	@When("verify the success toast after added client in add new client screen")
	public void verify_the_success_toast_after_added_client_in_add_new_client_screen() {
		
		p.verifySuccessToastAfterAddedNewClient();
	}
	
	@When("verify template name field is showing in edit fields screen")
	public void verify_template_name_field_is_showing_in_edit_fields_screen() {
	    
		p.verifyTemplateNameFieldInEditFieldScreen();
	}
	
	@When("verify template name field is disbaled or not")
	public void verify_template_name_field_is_disbaled_or_not() {
	    
		p.verifyTemplateNameFieldIsDisabled();
		
	}


}