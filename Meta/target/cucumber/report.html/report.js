$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/BulkletterGeneration.feature");
formatter.feature({
  "name": "To validate the Bulk letter generation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate the Bulk letter generation - Edit Partner",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@start"
    }
  ]
});
formatter.step({
  "name": "user enter \"\u003cusername\u003e\" and click on Next button",
  "keyword": "When "
});
formatter.step({
  "name": "user enter \"\u003cpassword\u003e\" and click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "click on No button in stay in page",
  "keyword": "And "
});
formatter.step({
  "name": "User able to land on dashboard screen",
  "keyword": "Then "
});
formatter.step({
  "name": "click on Bulk letter generation button",
  "keyword": "And "
});
formatter.step({
  "name": "click on Create bulk letters in batch button",
  "keyword": "And "
});
formatter.step({
  "name": "select single partner pic",
  "keyword": "And "
});
formatter.step({
  "name": "select template name",
  "keyword": "And "
});
formatter.step({
  "name": "select return type code",
  "keyword": "And "
});
formatter.step({
  "name": "click on Load client details button",
  "keyword": "And "
});
formatter.step({
  "name": "click on Save as draft button",
  "keyword": "And "
});
formatter.step({
  "name": "click on Yes button in save draft confirmation popup",
  "keyword": "And "
});
formatter.step({
  "name": "click on Ok button in save draft success popup",
  "keyword": "And "
});
formatter.step({
  "name": "click on Edit button bulk letter generation screen",
  "keyword": "And "
});
formatter.step({
  "name": "click on Down arrow button in basic details",
  "keyword": "And "
});
formatter.step({
  "name": "remove the exisiting partner",
  "keyword": "And "
});
formatter.step({
  "name": "click on partner PIC dropdown",
  "keyword": "And "
});
formatter.step({
  "name": "select the new partner",
  "keyword": "And "
});
formatter.step({
  "name": "click on Load client details button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the partner name",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "harivignesh.s@changepond.com",
        "DuSopriHi25@2024CPT"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launch the application in chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ApplicationLogin_StepDefinition.user_launch_the_application_in_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationLogin_StepDefinition.maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the Bulk letter generation - Edit Partner",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@start"
    }
  ]
});
formatter.step({
  "name": "user enter \"harivignesh.s@changepond.com\" and click on Next button",
  "keyword": "When "
});
formatter.match({
  "location": "ApplicationLogin_StepDefinition.user_enter_and_click_on_Next_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"DuSopriHi25@2024CPT\" and click on Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationLogin_StepDefinition.user_enter_and_click_on_Sign_in_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on No button in stay in page",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationLogin_StepDefinition.click_on_No_button_in_stay_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User able to land on dashboard screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationLogin_StepDefinition.user_able_to_land_on_dashboard_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Bulk letter generation button",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.click_on_Bulk_letter_generation_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Create bulk letters in batch button",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.click_on_Create_bulk_letters_in_batch_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select single partner pic",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.select_single_partner_pic()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select template name",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.select_template_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select return type code",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.select_return_type_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Load client details button",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.click_on_Load_client_details_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Save as draft button",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.click_on_Save_as_draft_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Yes button in save draft confirmation popup",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.click_on_Yes_button_in_save_draft_confirmation_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Ok button in save draft success popup",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.click_on_Ok_button_in_save_draft_success_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Edit button bulk letter generation screen",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.click_on_Edit_button_bulk_letter_generation_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Down arrow button in basic details",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.click_on_Down_arrow_button_in_basic_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "remove the exisiting partner",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.remove_the_exisiting_partner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on partner PIC dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.click_on_partner_PIC_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the new partner",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.select_the_new_partner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Load client details button",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.click_on_Load_client_details_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the partner name",
  "keyword": "And "
});
formatter.match({
  "location": "BulkLetterGeneration_StepDefintion.verify_the_partner_name()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Partner Name is not changed expected [Bagoff, Gary N.] but found [Bagoff, Gary N.\nx]\r\n\tat org.testng.Assert.fail(Assert.java:111)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1578)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:150)\r\n\tat org.testng.Assert.assertEquals(Assert.java:132)\r\n\tat org.testng.Assert.assertEquals(Assert.java:656)\r\n\tat com.cpt.Engage.Pages.BulkLetterGeneration_pages.verifyPartnerChanged(BulkLetterGeneration_pages.java:597)\r\n\tat com.cpt.Engage.StepDefinition.BulkLetterGeneration_StepDefintion.verify_the_partner_name(BulkLetterGeneration_StepDefintion.java:448)\r\n\tat ✽.verify the partner name(file:src/test/resources/BulkletterGeneration.feature:238)\r\n",
  "status": "failed"
});
});