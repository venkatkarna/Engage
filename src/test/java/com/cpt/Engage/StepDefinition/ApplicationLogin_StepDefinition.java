package com.cpt.Engage.StepDefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.cpt.Engage.Pages.ApplicationLogin_page;
import com.cpt.Engagee.BaseTest;
import com.cpt.Engagee.CommonMethods;
import com.cpt.ExcelUtil.WebTableToExcel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationLogin_StepDefinition extends BaseTest {

	ApplicationLogin_page app = new ApplicationLogin_page();
	WebTableToExcel web = new WebTableToExcel();
	CommonMethods common = new CommonMethods();

	@Given("User launch the application in chrome browser")
	public void user_launch_the_application_in_chrome_browser() {

		LaunchBrowser();
		common.LaunchUrl("https://engage-qa.citrincooperman.com/");

	}

	@Given("Maximize the window")
	public void maximize_the_window() throws InterruptedException {

		common.maxWindow();
		common.WaitAction();
	}

	@When("user enter {string} and click on Next button")
	public void user_enter_and_click_on_Next_button(String string) throws InterruptedException, IOException {

		common.WaitMore();
		common.WaitImp();
		common.EnterSignin(string);
		common.ClickNext();

	}

	@When("user enter {string} and click on Sign in button")
	public void user_enter_and_click_on_Sign_in_button(String string) throws InterruptedException {

		common.WaitAction();
		common.EnterPassword(string);
		common.LoginClick();

	}

	@When("click on No button in stay in page")
	public void click_on_No_button_in_stay_in_page() throws InterruptedException {

		common.WaitImp();
		common.ClickNo();

	}

	@Then("click on profile icon")
	public void click_on_profile_icon() throws InterruptedException {

		common.WaitAction();
		app.ClickProfile();
	}

	@Then("click on yes button in conformation popup")
	public void click_on_yes_button_in_conformation_popup() throws InterruptedException {

		app.ClickYes();
		System.out.println("User logout the application successfully");
	}

	@When("User able to land on dashboard screen")
	public void user_able_to_land_on_dashboard_screen() throws InterruptedException {

		common.WaitMore();
		app.verifyDashboard();
	}

	@When("User enter {string} and click on Next button")
	public void User_enter_and_click_on_Next_button(String string) throws InterruptedException, IOException {

		common.WaitAction();
		common.EnterSignin(string);
		common.ClickNext();
		common.WaitAction();
	}

	@When("User enter {string} and click on Sign in button")
	public void User_enter_and_click_on_Sign_in_button(String string) throws InterruptedException {

		common.EnterPassword(string);
		common.LoginClick();
		common.WaitAction();

	}

	@When("click on Search or filter button")
	public void click_on_Search_or_filter_button() throws InterruptedException {

		common.WaitAction();
		app.clickSearchFilter();
	}

	@When("click the engagement letter ID dropdown")
	public void click_the_engagement_letter_ID_dropdown() throws InterruptedException {

		common.WaitImp();
		app.ClickIDdropdown();

	}

	@When("enter the value as {string} in ID dropdown")
	public void enter_the_value_in_ID_dropdown(String letterID) {

		common.WaitAction();
		app.ClickIdValue(letterID);

	}

	@When("select the letterID as {string}")
	public void select_the_letterID_as(String letterID) {
		common.WaitAction();
		app.selectID(letterID);

	}

	@When("click the search button")
	public void click_the_search_button() throws InterruptedException {

		common.WaitAction();
		common.WaitImp();
		app.ClickSearch();

	}

	@When("validate the letter ID as {string}")
	public void validate_the_letter_ID(String letterID) throws InterruptedException {

		common.WaitAction();
		app.validationID(letterID);
	}

	@When("click on clear button")
	public void click_on_clear_button() throws InterruptedException {

		common.WaitAction();
		app.ClickClear();
	}

	@When("Validate the engagement letter Name dropdown")
	public void validate_the_engagement_letter_Name_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickLetterName();
	}

	@When("enter the value in letter name as {string} dropdown")
	public void select_the_value_in_letter_name_dropdown(String lettername) throws InterruptedException {

		common.WaitAction();
		app.ClickLetterName(lettername);

	}

	@When("select the engagement letter name as {string}")
	public void select_the_engagement_letter_name_as(String lettername) {

		common.WaitAction();
		app.SelectLetterName(lettername);
	}

	@When("validate the letter name as {string}")
	public void validate_the_letter_name(String lettername) throws InterruptedException {

		common.WaitAction();
		app.ValidateLetterName(lettername);
	}

	@When("Validate the office dropdown")
	public void validate_the_office_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickOffice();

	}

	@When("enter the value as {string} in office dropdown")
	public void select_the_value_in_office_dropdown(String officename) throws InterruptedException {

		common.WaitAction();
		app.ClickOffice(officename);
	}

	@When("select the office as {string}")
	public void select_the_office_as(String officename) {

		common.WaitImp();
		app.SelectOffice(officename);
	}

	@When("validate the office as {string}")
	public void validate_the_office(String officename) throws InterruptedException {

		common.WaitAction();
		app.ValidateOffice(officename);
	}

	@When("Validate the tax year dropdown")
	public void validate_the_tax_year_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickTaxYear();

	}

	@When("enter the value tax year as {string}")
	public void select_the_value_tax_year_dropdown(String year) throws InterruptedException {

		common.WaitAction();
		app.EnterTaxYear(year);
	}

	@When("select the tax year as {string} in dropdown")
	public void select_the_tax_year_as_in_dropdown(String year) {

		common.WaitImp();
		app.selectTaxYear(year);
	}

	@When("validate the tax year as {string}")
	public void validate_the_tax_year(String year) {

		common.WaitAction();
		app.ValidateTaxYear(year);
	}

	@When("Validate the template name dropdown")
	public void validate_the_template_name_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickTemplateName();
	}

	@When("enter the value in template name as {string}")
	public void select_the_value_in_template_name_dropdown(String tempName) throws InterruptedException {

		common.WaitImp();
		app.enterTemplateName(tempName);
	}

	@When("select the template name as {string}")
	public void select_the_template_name_as(String tempName) {

		common.WaitAction();
		app.selectTemplateName(tempName);
	}

	@When("validate the template name as {string}")
	public void validate_the_template_name(String tempName) throws InterruptedException {

		common.WaitAction();
		app.validateTemplateName(tempName);
	}

	@When("Validate the client ID\\/name dropdown")
	public void validate_the_client_ID_name_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickClientId();

	}

	@When("enter the client ID\\/name as {string}")
	public void select_the_client_ID_name_dropdown(String clientIDName) throws InterruptedException {

		common.WaitImp();
		app.enterClientId(clientIDName);
	}

	@When("select the client ID\\/name as {string}")
	public void select_the_client_ID_name_as(String clientIDName) {

		common.WaitImp();
		app.selectClientID(clientIDName);
	}

	@When("validate the client ID\\/name as {string}")
	public void validate_the_client_ID_name(String clientIDName) throws InterruptedException {

		common.WaitAction();
		app.ValidateClientId(clientIDName);
	}

	@When("Validate the partner PIC dropdown")
	public void validate_the_partner_PIC_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickPartner();
	}

	@When("enter the partner PIC as {string}")
	public void select_the_partner_PIC_dropdown(String partner) throws InterruptedException {

		common.WaitAction();
		app.enterPartner(partner);
	}

	@When("select the partner PIC as {string}")
	public void select_the_partner_PIC_as(String partner) {

		common.WaitImp();
		app.selectPartner(partner);
	}

	@When("validate the partner PIC as {string}")
	public void validate_the_partner_PIC(String partner) throws InterruptedException {

		common.WaitAction();
		app.ValidatePartner(partner);
	}

	@When("Validate the department dropdown")
	public void validate_the_department_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickDepartment();
	}

	@When("enter the department as {string}")
	public void select_the_department_dropdown(String department) throws InterruptedException {

		common.WaitAction();
		app.enterDepartment(department);
	}

	@When("select the department as {string}")
	public void select_the_department_as(String department) {

		common.WaitImp();
		app.selectDepartment(department);
	}

//	@When("validate the department")
//	public void validate_the_department() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
//	}

	@When("Validate the type dropdown")
	public void validate_the_type_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickType();

	}

	@When("enter the type as {string}")
	public void select_the_type_dropdown(String type) throws InterruptedException {

		common.WaitAction();
		app.enterType(type);
	}

	@When("select the type as {string}")
	public void select_the_type_as(String type) {

		common.WaitImp();
		app.selectType(type);
	}

	@When("Validate the admin dropdown")
	public void validate_the_admin_dropdown() throws InterruptedException {

		common.WaitMore();
		app.ClickAdmin();
	}

	@When("enter the admin as {string}")
	public void select_the_admin_dropdown(String admin) throws InterruptedException {

		common.WaitMore();
		app.enterAdmin(admin);
	}

	@When("select the admin as {string}")
	public void select_the_admin_as(String admin) {

		common.WaitImp();
		app.selectAdmin(admin);
	}

	@When("validate the admin as {string}")
	public void validate_the_admin(String admin) throws InterruptedException {

		common.WaitAction();
		app.ValidateAdmin(admin);
	}

	@When("Validate the status dropdown")
	public void validate_the_status_dropdown() throws InterruptedException {

		// common.WaitMore();
		common.WaitAction();
		common.WaitImp();
		app.ClickStatus();
		// common.WaitAction();
	}

	@When("enter the status as {string}")
	public void enter_the_status(String status) {

		common.WaitMore();
		app.enterStatus(status);
	}

	@When("select the status as {string}")
	public void select_the_status_dropdown(String status) throws InterruptedException {

		common.WaitMore();
		app.SelectStatus(status);
		// common.WaitMore();
	}

	@When("validate the status as {string}")
	public void validate_the_status(String status) throws InterruptedException {

		common.WaitMore();
		app.ValidateStatus(status);
		common.WaitAction();

	}

	@When("click on All letters button in dashboard screen")
	public void click_on_All_letters_button_in_dashboard_screen() throws InterruptedException {

		common.WaitAction();
		app.ClickAllLetters();
	}

	@When("click on sort button in batch id")
	public void click_on_sort_button_in_batch_id() {

		common.WaitMore();
		common.WaitAction();
		app.ClickSortBatchID();
		System.out.println("Sort by Batch ID successfully done");
	}

	@When("click on refresh button")
	public void click_on_refresh_button() throws AWTException {

		common.ReloadBrowser();
	}

	@When("click on sort button in letter id")
	public void click_on_sort_button_in_letter_id() {

		common.WaitMore();
		common.WaitAction();
		app.ClickSortLetterID();
		System.out.println("Sort by Letter ID successfully done");

	}

	@When("click on sort button in letter name")
	public void click_on_sort_button_in_letter_name() {

		common.WaitMore();
		common.WaitAction();
		app.ClickSortLetterName();
		System.out.println("Sort by Letter name successfully done");

	}

	@When("click on sort button in office")
	public void click_on_sort_button_in_office() {

		common.WaitMore();
		common.WaitAction();
		app.ClickSortOffice();
		System.out.println("Sort by office successfully done");

	}

	@When("click on sort button in year")
	public void click_on_sort_button_in_year() {

		common.WaitMore();
		common.WaitAction();
		common.WaitImp();
		app.ClickSortYear();
		System.out.println("Sort by year successfully done");

	}

	@When("click on sort button in template name")
	public void click_on_sort_button_in_template_name() {

		common.WaitMore();
		common.WaitAction();
		common.WaitImp();
		app.ClickSortTemplateName();
		System.out.println("Sort by template name successfully done");

	}

	@When("click on sort button in client name")
	public void click_on_sort_button_in_client_name() {

		common.WaitMore();
		common.WaitAction();
		common.WaitImp();
		app.ClickSortClientName();
		System.out.println("Sort by client name successfully done");

	}

	@When("click on sort button in Partner pic")
	public void click_on_sort_button_in_Partner_pic() {

		common.WaitMore();
		common.WaitAction();
		common.WaitImp();
		app.ClickSortPartner();
		System.out.println("Sort by Partner PIC successfully done");

	}

	@When("click on sort button in admin")
	public void click_on_sort_button_in_admin() {

		common.WaitMore();
		common.WaitAction();
		common.WaitImp();
		app.ClickSortAdmin();
		System.out.println("Sort by admin successfully done");

	}

	@When("click on sort button in status")
	public void click_on_sort_button_in_status() {

		common.WaitMore();
		common.WaitAction();
		common.WaitImp();
		app.ClickSortStatus();
		System.out.println("Sort by status successfully done");

	}

	@When("click on export above table button in my letters tab")
	public void click_on_export_above_table_button_in_my_letters_tab() {

		common.WaitMore();
		common.WaitImp();
		app.ClickExportDashboard();
		System.out.println("Downloaded the list of bulk letter in my letters");

	}

	@When("click on export above table button in all letters tab")
	public void click_on_export_above_table_button_in_all_letters_tab() {

		common.WaitAction();
		app.ClickAllLetters();
		common.WaitAction();
		common.WaitImp();
		app.ClickExportDashboard();
		System.out.println("Downloaded the list of bulk letters in all letters");

	}

	@Then("user click on next page in my letters tab")
	public void user_click_on_next_page_in_my_letters_tab() {

		common.WaitAction();
		app.ClickNextPage();
	}

	@Then("user click on last page in my letters tab")
	public void user_click_on_last_page_in_my_letters_tab() {

		common.WaitAction();
		app.ClickLastPage();

	}

	@Then("user click on next page in all letters tab")
	public void user_click_on_next_page_in_all_letters_tab() {

	}

	@Then("user click on last page in all letters tab")
	public void user_click_on_last_page_in_all_letters_tab() {

		common.WaitAction();
		app.ClickAllLetters();
		app.ClickNextPage();
		common.WaitAction();
		app.ClickLastPage();
	}

	@Then("click on clear button in after all values given")
	public void click_on_clear_button_in_after_all_values_given() {

		common.WaitAction();
		app.ClickClear();

	}

	@Then("navigate to all letters tab")
	public void navigate_to_all_letters_tab() {

		common.WaitMore();
		common.WaitImp();
		app.navigateAllLetters();

	}

	@Then("user click on previous page in my letters tab")
	public void user_click_on_previous_page_in_my_letters_tab() {

		common.WaitAction();
		app.clickMyLetters();
		common.WaitAction();
		app.previousPage();

	}

	@Then("user click on previous page in all letters tab")
	public void user_click_on_previous_page_in_all_letters_tab() {

		common.WaitAction();
		app.previousPage();
	}

	@Then("click on bulk letter generation")
	public void click_on_bulk_letter_generation() {

		common.WaitMore();
		app.clickBulkLetterGeneration();
	}

	@Then("user search the letters by admin")
	public void user_search_the_letters_by_admin() {

		common.WaitAction();
		app.SearchAdmin();
		System.out.println("Search by Admin done successfully");
	}

	@Then("user search the letters by batch ID")
	public void user_search_the_letters_by_batch_ID() {

		common.WaitAction();
		app.SearchBatchID();
		System.out.println("Search by Batch ID search done successfully");
	}

	@Then("user search the letters by Partner")
	public void user_search_the_letters_by_Partner() {

		common.WaitAction();
		app.SearchPartner();
		System.out.println("Search by Partner search done successfully");

	}

	@Then("user search the  letters by template name")
	public void user_search_the_letters_by_template_name() {

		common.WaitAction();
		app.SearchTemplateName();
		System.out.println("Search by Template name search done successfully");
	}

	@Then("user search the letters by no of letters")
	public void user_search_the_letters_by_no_of_letters() {

		common.WaitAction();
		app.SearchNoofLetters();
		System.out.println("Search by no of letters search done successfully");
	}

	@Then("user search the letters by status")
	public void user_search_the_letters_by_status() {

		common.WaitAction();
		app.SearchStatus();
		common.WaitAction();

		System.out.println("Search by status search done successfully");
	}

	@Then("click on sort button in Noofletters")
	public void click_on_sort_button_in_Noofletters() {

		common.WaitAction();
		app.ClickSortNoofLetters();
		// common.WaitAction();
		// common.EraseText();
		System.out.println("Sort by NoofLetters search done successfully");
	}

	@Then("click on sort button in Lastupdated")
	public void click_on_sort_button_in_Lastupdated() {

		common.WaitAction();
		app.ClickSortLastUpdated();
		// common.WaitAction();
		// common.EraseText();
		System.out.println("Sort by Last updated on search done successfully");
	}

	@Then("close the browser")
	public void close_the_browser() {

		common.WaitImp();
		common.closeBrowser();
	}

	@Then("verify the completed status")
	public void verify_the_completed_status() {

		common.WaitAction();
		app.verifyCompletedStatus();
	}

	@Then("select with client for E signing status")
	public void select_with_client_for_E_signing_status() {

		common.WaitAction();
		app.clickWithEsigningStatus();

	}

	@Then("verify client for E signing status")
	public void verify_client_for_E_signing_status() {

		common.WaitAction();
		app.verifyWithEsigningStatus();
	}

	@Then("select with client for manual signing status")
	public void select_with_client_for_manual_signing_status() {

		common.WaitAction();
		app.clickWithManualSigning();
	}

	@Then("verify client for manual signing status")
	public void verify_client_for_manual_signing_status() {

		common.WaitAction();
		app.verifyWithManualSigning();
	}

	@Then("select with admin for review status")
	public void select_with_admin_for_review_status() {
		common.WaitAction();
		common.WaitImp();
		app.clickWithAdminReview();
	}

	@Then("verify with admin for review status")
	public void verify_with_admin_for_review_status() {
		common.WaitAction();
		app.verifyAdminReviewStatus();
	}

	@Then("click on Action icon in dashboard screen")
	public void click_on_Action_icon_in_dashboard_screen() {

		common.WaitAction();
		app.clkActionDashboard();

	}

	@Then("verify the list of action when the status is with completed")
	public void verify_the_list_of_action_when_the_status_is_with_completed() {

		common.WaitAction();
		app.listActionForCompletedStatus();

	}

	@Then("verify the list of action when the status is with client for E-Signing")
	public void verify_the_list_of_action_when_the_status_is_with_client_for_E_Signing() {

		common.WaitAction();
		app.listActionForESigningStatus();

	}

	@Then("select with client for Manual signing status")
	public void select_with_client_for_Manual_signing_status() {

		common.WaitAction();
		app.clickWithManualSigning();

	}

	@Then("verify the list of action when the status is with client for Manual signing")
	public void verify_the_list_of_action_when_the_status_is_with_client_for_Manual_signing() {

		common.WaitAction();
		app.listActionForManualSigningStatus();
	}

	@Then("verify the list of action when the status is with admin for review")
	public void verify_the_list_of_action_when_the_status_is_with_admin_for_review() {

		common.WaitAction();
		app.listActionForAdminReviewStatus();
	}

	@Then("verify the list of menu for admin user")
	public void verify_the_list_of_menu_for_admin_user() {

		common.WaitAction();
		app.verifyListMenuAdmin();
	}

	@Then("click on History log popup")
	public void click_on_History_log_popup() {

		common.WaitImp();
		app.clickHistoryLogPopup();
	}

	@Then("verify the History log popup")
	public void verify_the_History_log_popup() {

		common.WaitAction();
		app.verifyHistoryLogPopup();
	}

	@Then("click on Preview button in history log popup")
	public void click_on_Preview_button_in_history_log_popup() {

		common.WaitImp();
		app.clickHistoryLogPreview();
	}

	@Then("click on Download button in history log popup")
	public void click_on_Download_button_in_history_log_popup() {

		common.WaitImp();
		app.clickHistoryLogDownload();

	}

	@Then("info button")
	public void info_button() {

		common.WaitAction();
		app.clickInfo();
	}

	@Then("verify the info popup")
	public void verify_the_info_popup() {

		common.WaitAction();
		app.verifyInfoPopup();
	}

	@Then("click on Refresh button")
	public void click_on_Refresh_button() {

		common.WaitAction();
		app.clickRefresh();
		System.out.println("Refresh click successfully");
	}

	@Then("click on Upload letter button")
	public void click_on_Upload_letter_button() {

		common.WaitAction();
		app.clickUploadLetter();

	}

	@Then("select the document and click on open button")
	public void select_the_document_and_click_on_submit_button() throws AWTException, InterruptedException {

		common.WaitAction();
		common.fileUpload();

	}

	@Then("click on Browse button")
	public void click_on_Browse_button() {

		common.WaitImp();
		app.clickBrowseButton();
	}

	@Then("click on submit button after select the file")
	public void click_on_submit_button_after_select_the_file() {

		common.WaitAction();
		app.clickSubmitAfterUpload();

	}

	@Then("click on cancel signing button")
	public void click_on_cancel_signing_button() {

		common.WaitImp();
		app.clickCancelSigning();

	}

	@Then("click on yes in cancel signing warning popup")
	public void click_on_yes_in_cancel_signing_warning_popup() {

		common.WaitImp();
		app.clickYesCancelSigning();

	}

	@Then("click on ok button in cancel success popup")
	public void click_on_yes_button_in_cancel_success_popup() {

		common.WaitAction();
		app.clickOkayCancelSigningPopup();
	}

	@Then("verify the status after cancel the signing")
	public void verify_the_status_after_cancel_the_signing() {

		common.WaitAction();
		app.verifyAdminReviewStatus();
		System.out.println("After cancel the signing the status should be With Admin for Review");

	}

	@Then("click on edit fields button in dashboard")
	public void click_on_edit_fields_button_in_dashboard() {

		common.WaitAction();
		app.clickEditFieldsDashboard();

	}

	@Then("click on delete button from action in dashboard screen")
	public void click_on_delete_button_from_action_in_dashboard_screen() {

		common.WaitAction();
		app.clickDeleteLetterDashboard();
	}

	@Then("click yes button in delete conformation popup")
	public void click_yes_button_in_delete_conformation_popup() {

		common.WaitImp();
		app.clickYesDeleteLetter();

	}

	@Then("click ok button in delete success popup")
	public void click_ok_button_in_delete_success_popup() {

		common.WaitAction();
		app.clickOkayDeleteSuccess();
	}

	@Then("click on sort button in status in bulk letter generation screen")
	public void click_on_sort_button_in_status_in_bulk_letter_generation_screen() {

		common.WaitMore();
		common.WaitAction();
		common.WaitImp();
		app.clickSortStatusBulkLetterScreen();
		System.out.println("Sort by status successfully done");
	}

	@Then("verify the content of the edit success popup and click on ok button")
	public void verify_the_content_of_the_edit_success_popup_and_click_on_ok_button() {

		common.WaitAction();
		app.verifyEditFeildsSuccessPopup();
	}

	@Then("verify the menu panel is closed")
	public void verify_the_menu_panel_is_closed() {

		common.WaitImp();
		System.out.println("Left side menu panel is closed.");
	}

	@Then("click on Action in dashboard screen")
	public void click_on_Action_in_dashboard_screen() {

		common.WaitImp();
		app.clkActionDashboard();

	}

	@Then("click on Resend button")
	public void click_on_Resend_button() {

		common.WaitImp();
		app.clickResendButton();

	}

	@Then("click No in E signing radiobutton")
	public void click_No_in_E_signing_radiobutton() {

		common.WaitImp();
		app.clickManualCheckbox();

	}

	@Then("click Submit button in resend the letter for signing popup")
	public void click_Submit_button_in_resend_the_letter_for_signing_popup() {

		// common.WaitAction();
		common.WaitAction();
		app.clickSubmitButton();
	}

	// @Then("verify the resending success popup_click_on_ok_button")
//	public void verify_the_resending_success_popup_click_on_ok_button() {

	// common.WaitAction();
	// app.verifyManualSigningSuccessPopupText();
//

	@Then("verify the resending success popup and click on ok button")
	public void verify_the_resending_success_popup_and_click_on_ok_button() {

		common.WaitMore();
		common.WaitAction();
		app.verifyManualSigningSuccessPopupText();
	}

	@Then("create the excelsheet and fetch the values from webtable")
	public void create_the_excelsheet_and_fetch_the_values_from_webtable() throws IOException {

		web.tableToExcel();

	}

	@Then("click on Batch dashboard button from the menu panel")
	public void click_on_Batch_dashboard_button_from_the_menu_panel() {

		common.WaitImp();
		app.clickBatchDashboardButton();

	}

	@Then("verify the user can able to land on batch dashboard page")
	public void verify_the_user_can_able_to_land_on_batch_dashboard_page() {

		common.WaitAction();
		app.verifyBatchDashboardScreen();

	}

	@Then("click on Letter dashboard button from the menu panel")
	public void click_on_Letter_dashboard_button_from_the_menu_panel() {

		common.WaitImp();
		app.clickLetterDashboardButton();

	}

	@Then("verify the user can able to land on letter dashboard page.")
	public void verify_the_user_can_able_to_land_on_letter_dashboard_page() {

		common.WaitAction();
		app.verifyLetterDashboardScreen();
	}

	@Then("click on no checkbox in e signing? in edit field popp screen in dashboard screen")
	public void click_on_no_checkbox_in_e_signing_in_edit_field_popp_screen_in_dashboard_screen() {

		app.clickNoCheckBoxESigning();
	}

	@Then("click on yes checkbox in e signing? in edit field popp screen in dashboard screen")
	public void click_on_yes_checkbox_in_e_signing_in_edit_field_popp_screen_in_dashboard_screen() {

		app.clickYesCheckBoxESigning();

	}

	@Then("call the resend letter live")
	public void call_the_resend_letter_live() {

		common.WaitAction();
		// app.resendLettersLive();

	}

	@Then("verify the content of the edit success popup and click on ok button in dashboard screen")
	public void verify_the_content_of_the_edit_success_popup_and_click_on_ok_button_in_dashboard_screen() {

		common.WaitAction();
		app.verifyEditFeildsSuccessPopup();
	}

}
