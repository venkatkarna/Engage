package com.cpt.Engage.StepDefinition;

import java.awt.AWTException;

import com.cpt.Engage.Pages.Negative_pages;
import com.cpt.Engagee.BaseTest;
import com.cpt.Engagee.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Negative_StepDefinition extends BaseTest {
	
	

	Negative_pages neg = new Negative_pages();

	CommonMethods common = new CommonMethods();

	@When("verify the invalid error toast for invalid username")
	public void verify_the_invalid_error_toast_for_invalid_username() {

		common.WaitAction();
		neg.ErrorToastInvalidUserName();

	}

	@When("verify the invalid error toast for invalid password")
	public void verify_the_invalid_error_toast_for_invalid_password() {

		common.WaitAction();
		neg.ErrorToastInvalidPassword();
	}

	@Then("verify the search or filter combination warning popup")
	public void verify_the_search_or_filter_combination_warning_popup() {

		common.WaitAction();
		neg.VerifySearchFilterWarningPopup();
	}

	@Then("verify the load client details button is disbale by default")
	public void verify_the_load_client_details_button_is_disbale_by_default() {

		common.WaitAction();
		neg.VerifyDisableLoadClientButton();

	}

	@Then("verify the remove button is disabled by default")
	public void verify_the_remove_button_is_disabled_by_default() {

		common.WaitAction();
		neg.VerifyDisbaleRemoveButton();
	}

	@Then("enter exsisting client id in add client screen")
	public void enter_exsisting_client_id_in_add_client_screen() {

		common.WaitAction();
		neg.EnterExsistingClientID();
	}

	@Then("verify the error popup when user entered the exsisting client id in add new client screen and click ok button")
	public void verify_the_error_popup_when_user_entered_the_exsisting_client_id_in_add_new_client_screen_and_click_ok_button() {
	    
		common.WaitAction();
		neg.VerifyExsistingClientIDError();
		
	}
	
	@Then("enter invalid signatory email id in add client screen")
	public void enter_invalid_signatory_email_id_in_add_client_screen() {
	   
		common.WaitAction();
		neg.EnterInvalidEmailAddClient();
		common.WaitAction();
		neg.VerifyInvalidEmailLabel();
	}
	
	@Then("select the invalid file and click on open button")
	public void select_the_invalid_file_and_click_on_open_button() throws AWTException, InterruptedException {
	    
		common.WaitAction();
		common.fileUploadInvalid();
		
		
	}

	@Then("verify the error popup when user try to upload invalid file format")
	public void verify_the_error_popup_when_user_try_to_upload_invalid_file_format() {
	    
		common.WaitAction();
		neg.VerifyInvalidFileFormatPopup();
		
	}
	
	@Then("clear the zip value")
	public void clear_the_zip_value() {
	    
		common.WaitImp();
		neg.ClearZipValue();
	}

	@Then("clear the state value")
	public void clear_the_state_value() {
	    
		common.WaitImp();
		neg.ClearStateValue();
	}

	@Then("clear the city value")
	public void clear_the_city_value() {
	    
		common.WaitImp();
		neg.ClearCityValue();
		
	}

	@Then("clear the address value")
	public void clear_the_address_value() {
	    
		common.WaitImp();
		neg.ClearAddressValue();
		
	}
	
	@Then("verify the warning popup without providing the mandatory fields")
	public void verify_the_warning_popup_without_providing_the_mandatory_fields() {
	   
		common.WaitImp();
		neg.VerifyMandatoryErrorPopup();
		
	}
	
	@Then("select double signature template name")
	public void select_double_signature_template_name() {
	    
		neg.SelectInvidualTemplate();
	}
	
	@Then("enter spouse email id in add client screen")
	public void enter_spouse_email_id_in_add_client_screen() {
	    
		neg.EnterSpouseEmail();
	}
	
	@Then("enter spouse first name as {string}")
	public void enter_spouse_first_name(String spouseFirstName ) {
	    
		neg.EnterSpouseFirstName(spouseFirstName);
		
	}

	@Then("enter spouse last name as {string}")
	public void enter_spouse_last_name(String spouseLastName) {
	   
		neg.EnterSpouseLastName(spouseLastName);
		
	}
	
	@Then("verify the Error popup when user provide same email")
	public void verify_the_Error_popup_when_user_provide_same_email() {
	    
		neg.VerifySameEmailErrorPopup();
	}
	
	@Then("verify the template dropdown")
	public void verify_the_template_dropdown() {
	    
		common.WaitAction();
		neg.VerifyTemplateDropdownDisable();
	}
	
	@Then("click on add button in attachment warning popup for invalid file upload")
	public void click_on_add_button_in_attachment_warning_popup_for_invalid_file_upload() {
	   
		neg.uploadInvalidFile();
	}


}