package com.cpt.Engage.StepDefinition;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;

import com.cpt.Engage.Pages.Field_Block_Template_page;
import com.cpt.Engagee.BaseTest;
import com.cpt.Engagee.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Field_Block_Template_StepDefinition extends BaseTest {
	
	Field_Block_Template_page f =new Field_Block_Template_page();
	CommonMethods common = new CommonMethods(); 
	
	
	@When("click on menu button")
	public void click_on_menu_button() throws InterruptedException {
		
		common.WaitAction();
		f.ClickMenuIcon();
	    common.WaitAction();	
	}

	@When("click on fields from the menu list")
	public void click_on_fields_from_the_menu_list() throws InterruptedException {
	    
		
		f.ClickField();
		common.WaitAction();
		
	}

	@When("click on Add button")
	public void click_on_Add_button() throws InterruptedException {
	    
		
		f.ClickAdd();
		common.WaitAction();
	}

	@When("enter field name in add new field popup")
	public void enter_field_name_in_add_new_field_popup() throws InterruptedException {
	    
		f.EnterFieldName();
		common.WaitAction();
	
	}

	@When("enter field display name in add new field popup")
	public void enter_field_display_name_in_add_new_field_popup() throws InterruptedException {
	    
		f.EnterDisplayName();
		common.WaitAction();
	}

	/*@When("select input source in add new field popup")
	public void select_input_source_in_add_new_field_popup() throws InterruptedException {
	  
		f.SelectInputSource();
		common.WaitAction();
		
	}*/

	@When("select data type in add new field popup")
	public void select_data_type_in_add_new_field_popup() throws InterruptedException {
		
		f.ClickDataType();
		common.WaitAction();
		f.SelectDataType();
		common.WaitAction();
		
	}

	@When("select active in status dropdown")
	public void select_active_in_status_dropdown() throws InterruptedException {
		
		f.ClickStatus();
		common.WaitAction();
		f.SelectStatus();
		common.WaitAction();
	    
	}

	@When("enter changenotes in add new field popup")
	public void enter_changenotes_in_add_new_field_popup() throws InterruptedException {
	    
		f.EnterChangeNotes();
		common.WaitAction();
	}

	@Then("click on Save button")
	public void click_on_Save_button() throws InterruptedException {
	  
		f.ClickSaveButton();
		common.WaitAction();
		
	}

	

	@Then("select that field by clicking on checkbox")
	public void select_that_field_by_clicking_on_checkbox() throws InterruptedException {
	    
		f.EditCheckBox();
		common.WaitAction();
	}

	@Then("click on Edit button")
	public void click_on_Edit_button() throws InterruptedException {
	    
		f.ClickEdit();
		common.WaitAction();
		
	}

	@Then("change the data type")
	public void change_the_data_type() throws InterruptedException {
		
		f.EditDataTypeClick();
		common.WaitAction();
		f.ChangeDatatype();
		common.WaitAction();
	   
		
	}

	@Then("change the display name")
	public void change_the_display_name() throws InterruptedException, AWTException {
	    
		
		f.ClickDisplayName();
		common.WaitAction();
		
		
	}

	@Then("change the change notes")
	public void change_the_change_notes() throws AWTException, InterruptedException {
	    
	
		f.ClickChangeNotes();
		common.WaitAction();
		
				
	}

	@Then("click on update button")
	public void click_on_update_button() throws InterruptedException {
	    
		f.UpdateButton();
		common.WaitAction();
		f.ButtonOk();
		common.WaitAction();
	
	}

	@Then("select that field")
	public void select_that_field() throws InterruptedException {
	    
		f.EditCheckBox();
		common.WaitAction();
		
		
	}

	@Then("click on Delete button")
	public void click_on_Delete_button() throws InterruptedException {
	    
		f.DeleteField();
		common.WaitAction();
		
	}
	
	@Then("click on Yes button in conformation popup")
	public void click_on_Yes_button_in_conformation_popup() throws InterruptedException {
	    
		f.DeleteYesButton();
		common.WaitAction();
	}

//	@Then("click on ok button in success popup")
//	public void click_on_ok_button_in_success_popup() throws InterruptedException {
//	    
//		f.DeleteYesButton();
//		common.WaitAction();
//		
//		
//	}
	
	@Then("click on ok button in success popup")
	public void click_on_ok_button_in_success_popup() throws InterruptedException {
	  
		f.ButtonOk();
	}



	@Then("click on Ok button")
	public void click_on_Ok_button() throws InterruptedException {
	   
		f.ButtonOk();
		common.WaitAction();
		
		
	}
	
	@When("click on blocks from the menu list")
	public void click_on_blocks_from_the_menu_list() throws InterruptedException {
		
		f.ClickBlock();
		common.WaitAction();
	
	}

	@When("click on Add block button")
	public void click_on_Add_block_button() throws InterruptedException {
	 
		f.ClickAddBlock();
		common.WaitAction();
	}

	@When("enter block name in add block popup screen")
	public void enter_block_name_in_add_block_popup_screen() throws InterruptedException {
	   
		f.EnterBlockName();
		common.WaitAction();
	}

	@When("select the status in add block popup screen")
	public void select_the_status_in_add_block_popup_screen() {
	    
		f.ClickBlockStatus();
		common.WaitAction();
		
		f.SelectBlockStatus();
		common.WaitAction();
	}

	@When("enter change notes in add block popup screen")
	public void enter_change_notes_in_add_block_popup_screen() {
	   
		try {
			f.BlockChangeNotes();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@When("enter block description in add block popup screen")
	public void enter_block_description_in_add_block_popup_screen() {
		
		try {
			f.EnterBlockDescription();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	}

	@When("enter block content")
	public void enter_block_content() {
	  
		try {
			f.EnterBlockContent();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
	}

	@When("drag the list of fields in block content")
	public void drag_the_list_of_fields_in_block_content() {
	
		try {
			f.DragField();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Then("click on save button")
	public void click_on_save_button() {
	   
		f.SaveButton();
	}

	@Then("click on Ok button in block added popup")
	public void click_on_Ok_button_in_block_added_popup() {
		
		f.BlockSuccessClick();
	   
	}

	@Then("click on preview block button in action")
	public void click_on_preview_block_button_in_action() {
	    
		f.PreviewBlock();
	}

	@Then("click on Edit block button")
	public void click_on_Edit_block_button() {
		
	
	 
	}

	@Then("search the field using search fields feature")
	public void search_the_field_using_search_fields_feature() {
	   
	}

	@Then("drag the searched field to block content")
	public void drag_the_searched_field_to_block_content() {
	  
	}

	@Then("change the change notes in edit block popup")
	public void change_the_change_notes_in_edit_block_popup() {
	    
	}

	@Then("change the block description in edit block popup")
	public void change_the_block_description_in_edit_block_popup() {
	  
	}

	@Then("click on Update button in edit block popup")
	public void click_on_Update_button_in_edit_block_popup() {
	    
	}

	@Then("click on Ok button in block edited popup")
	public void click_on_Ok_button_in_block_edited_popup() {
	 
	}

	@Then("select the block")
	public void select_the_block() {
	  
	}

	@Then("click on delete button in block screen")
	public void click_on_delete_button_in_block_screen() {
	
	}

	@Then("click on Yes button in block delete popup")
	public void click_on_Yes_button_in_block_delete_popup() {
	
	}

	@Then("click on Ok button in delete block popup")
	public void click_on_Ok_button_in_delete_block_popup() {
	    
	}

}
