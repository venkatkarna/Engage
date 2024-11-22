package com.cpt.Engage.StepDefinition;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.cpt.Engage.Pages.ApplicationLogin_page;
import com.cpt.Engagee.BaseTest;
import com.cpt.Engagee.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationLogin_StepDefinition extends BaseTest {

	ApplicationLogin_page app = new ApplicationLogin_page();

	CommonMethods common = new CommonMethods();

	@Given("User launch the application in chrome browser")
	public void user_launch_the_application_in_chrome_browser() {
		LaunchBrowser();
		common.LaunchUrl("https://engage-qa.citrincooperman.com/#/engagementletterdashboard");

	}

	@Given("Maximize the window")
	public void maximize_the_window() throws InterruptedException {
		common.maxWindow();
		common.WaitAction();
	}

	@When("user enter {string} and click on Next button")
	public void user_enter_and_click_on_Next_button(String string) throws InterruptedException {
		common.EnterSignin(string);
		common.ClickNext();
		common.WaitAction();
	}

	@When("user enter {string} and click on Sign in button")
	public void user_enter_and_click_on_Sign_in_button(String string) throws InterruptedException {

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

		common.WaitImp();
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

	/*
	 * @Then("close the browser") public void close_the_browser() {
	 * 
	 * driver.close(); }
	 */

	@When("User enter {string} and click on Next button")
	public void User_enter_and_click_on_Next_button(String string) throws InterruptedException {

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

	@When("select the value in ID dropdown")
	public void select_the_value_in_ID_dropdown() throws InterruptedException {

		common.WaitImp();
		app.ClickIdValue();

	}

	@When("click the search button")
	public void click_the_search_button() throws InterruptedException {

		common.WaitAction();
		app.ClickSearch();
//		common.WaitAction();
//		common.ScrollDown();
	}

	@When("validate the letter ID")
	public void validate_the_letter_ID() throws InterruptedException {

		common.WaitAction();
		app.validationID();
	}

	@When("click on clear button")
	public void click_on_clear_button() throws InterruptedException {

		common.ScrollUp();
		common.WaitAction();
		app.ClickClear();
	}

	@When("Validate the engagement letter Name dropdown")
	public void validate_the_engagement_letter_Name_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickLetterName();
	}

	@When("select the value in letter name dropdown")
	public void select_the_value_in_letter_name_dropdown() throws InterruptedException {

		common.WaitAction();
		app.SelectLetterName();

	}

	@When("validate the letter name")
	public void validate_the_letter_name() throws InterruptedException {

		common.WaitAction();
		app.ValidateLetterName();
	}

	@When("Validate the office dropdown")
	public void validate_the_office_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickOffice();

	}

	@When("select the value in office dropdown")
	public void select_the_value_in_office_dropdown() throws InterruptedException {

		common.WaitAction();
		app.SelectOffice();
	}

	@When("validate the office")
	public void validate_the_office() throws InterruptedException {

		common.WaitAction();
		app.ValidateOffice();
	}

	@When("Validate the tax year dropdown")
	public void validate_the_tax_year_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickTaxYear();

	}

	@When("select the value tax year dropdown")
	public void select_the_value_tax_year_dropdown() throws InterruptedException {

		common.WaitAction();
		app.SelectTaxYear();
	}

	@When("validate the tax year")
	public void validate_the_tax_year() throws InterruptedException {

		common.WaitAction();
		app.ValidateTaxYear();
	}

	@When("Validate the template name dropdown")
	public void validate_the_template_name_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickTemplateName();
	}

	@When("select the value in template name dropdown")
	public void select_the_value_in_template_name_dropdown() throws InterruptedException {

		common.WaitAction();
		app.SelectTemplateName();
	}

	@When("validate the template name")
	public void validate_the_template_name() throws InterruptedException {

		common.WaitAction();
		app.validateTemplateName();
	}

	@When("Validate the client ID\\/name dropdown")
	public void validate_the_client_ID_name_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickClientId();

	}

	@When("select the client ID\\/name dropdown")
	public void select_the_client_ID_name_dropdown() throws InterruptedException {

		common.WaitAction();
		app.SelectClientId();
	}

	@When("validate the client ID\\/name")
	public void validate_the_client_ID_name() throws InterruptedException {

		common.WaitAction();
		app.ValidateClientId();
	}

	@When("Validate the partner PIC dropdown")
	public void validate_the_partner_PIC_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickPartner();
	}

	@When("select the partner PIC dropdown")
	public void select_the_partner_PIC_dropdown() throws InterruptedException {

		common.WaitAction();
		app.SelectPartner();
	}

	@When("validate the partner PIC")
	public void validate_the_partner_PIC() throws InterruptedException {

		common.WaitAction();
		app.ValidatePartner();
	}

	@When("Validate the department dropdown")
	public void validate_the_department_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickDepartment();
	}

	@When("select the department dropdown")
	public void select_the_department_dropdown() throws InterruptedException {

		common.WaitAction();
		app.SelectDepartment();
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

	@When("select the type dropdown")
	public void select_the_type_dropdown() throws InterruptedException {

		common.WaitAction();
		app.SelectType();
	}

	@When("Validate the admin dropdown")
	public void validate_the_admin_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickAdmin();
	}

	@When("select the admin dropdown")
	public void select_the_admin_dropdown() throws InterruptedException {

		common.WaitAction();
		app.SelectAdmin();
	}

	@When("validate the admin")
	public void validate_the_admin() throws InterruptedException {

		common.WaitAction();
		app.ValidateAdmin();
	}

	@When("Validate the status dropdown")
	public void validate_the_status_dropdown() throws InterruptedException {

		common.WaitAction();
		app.ClickStatus();
		common.WaitAction();
	}

	@When("select the status dropdown")
	public void select_the_status_dropdown() throws InterruptedException {

		common.WaitMore();
		app.SelectStatus();
		common.WaitMore();
	}

	@When("validate the status")
	public void validate_the_status() throws InterruptedException {

		common.WaitAction();
		app.ValidateStatus();
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
		app.ClickSortYear();
		System.out.println("Sort by year successfully done");

	}

	@When("click on sort button in template name")
	public void click_on_sort_button_in_template_name() {

		common.WaitMore();
		common.WaitAction();
		app.ClickSortTemplateName();
		System.out.println("Sort by template name successfully done");

	}

	@When("click on sort button in client name")
	public void click_on_sort_button_in_client_name() {

		common.WaitMore();
		common.WaitAction();
		app.ClickSortClientName();
		System.out.println("Sort by client name successfully done");

	}

	@When("click on sort button in Partner pic")
	public void click_on_sort_button_in_Partner_pic() {

		common.WaitMore();
		common.WaitAction();
		app.ClickSortPartner();
		System.out.println("Sort by Partner PIC successfully done");

	}

	@When("click on sort button in admin")
	public void click_on_sort_button_in_admin() {

		common.WaitMore();
		common.WaitAction();
		app.ClickSortAdmin();
		System.out.println("Sort by admin successfully done");

	}

	@When("click on sort button in status")
	public void click_on_sort_button_in_status() {

		common.WaitMore();
		common.WaitAction();
		app.ClickSortStatus();
		System.out.println("Sort by status successfully done");

	}

	@When("click on export above table button in my letters tab")
	public void click_on_export_above_table_button_in_my_letters_tab() {

		common.WaitMore();
		app.ClickExportDashboard();
		System.out.println("Downloaded the list of bulk letter in my letters");

	}

	@When("click on export above table button in all letters tab")
	public void click_on_export_above_table_button_in_all_letters_tab() {

		common.WaitAction();
		app.ClickAllLetters();
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

		common.WaitAction();
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

		common.WaitAction();
		app.clickBulkLetterGeneration();
	}

	@Then("user search the letters by admin")
	public void user_search_the_letters_by_admin() {

		app.SearchAdmin();
		common.WaitAction();
		System.out.println("Search by Admin done successfully");
	}

	@Then("user search the letters by batch ID")
	public void user_search_the_letters_by_batch_ID() {

		app.SearchBatchID();
		common.WaitAction();
		System.out.println("Search by Batch ID search done successfully");
	}

	@Then("user search the letters by Partner")
	public void user_search_the_letters_by_Partner() {

		common.WaitAction();
		app.SearchPartner();
		common.WaitAction();
		common.EraseText();
		System.out.println("Search by Partner search done successfully");

	}

	@Then("user search the  letters by template name")
	public void user_search_the_letters_by_template_name() {

		common.WaitAction();
		app.SearchTemplateName();
		common.WaitAction();
		common.EraseText();
		System.out.println("Search by Template name search done successfully");
	}

	@Then("user search the letters by no of letters")
	public void user_search_the_letters_by_no_of_letters() {

		common.WaitAction();
		app.SearchNoofLetters();
		common.WaitAction();
		common.EraseText();
		System.out.println("Search by no of letters search done successfully");
	}

	@Then("user search the letters by status")
	public void user_search_the_letters_by_status() {

		common.WaitAction();
		app.SearchStatus();
		common.WaitAction();
		common.EraseText();
		System.out.println("Search by status search done successfully");
	}

	@Then("click on sort button in Noofletters")
	public void click_on_sort_button_in_Noofletters() {

		common.WaitAction();
		app.ClickSortNoofLetters();
	}

	@Then("click on sort button in Lastupdated")
	public void click_on_sort_button_in_Lastupdated() {

		common.WaitAction();
		app.ClickSortLastUpdated();
	}

	@Then("close the browser")
	public void close_the_browser() {

		common.closeBrowser();
	}
}
