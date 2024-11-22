
Feature: To validate the phase 2 features in the application.

Background:
Given User launch the application in chrome browser 
And Maximize the window  

Scenario Outline: To validate the radio button for 7216 form in Add client screen 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And click on Load client details button
And click on ok button in warning popup
And click on Add client button
And verify the 7216 radio button is present
And change the response in radio button 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: To validate the radio button for 7216 form in Add client screen for all the templates which is mentioned in user story
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Single Individual Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on ok button in warning popup
And click on Add client button
And verify the 7216 radio button is present
And change the response in radio button 

And select single partner pic as "Avnet, Erin"
And select template name as "SEC Client Rule Individual Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on Add client button
And verify the 7216 radio button is present
And change the response in radio button 

And select single partner pic as "Avnet, Erin"
And select template name as "Individual Tax Eng Letter With Fee"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on Add client button
And verify the 7216 radio button is present
And change the response in radio button

And select single partner pic as "Avnet, Erin"
And select template name as "Single Individual Tax Eng Letter With Fee"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on Add client button
And verify the 7216 radio button is present
And change the response in radio button

And select single partner pic as "Avnet, Erin"
And select template name as "SEC Client Rule Individual Tax Eng Letter With Fee"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on Add client button
And verify the 7216 radio button is present
And change the response in radio button

And select single partner pic as "Avnet, Erin"
And select template name as "SEC Individual EL No 5%"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on Add client button
And verify the 7216 radio button is present
And change the response in radio button

And select single partner pic as "Avnet, Erin"
And select template name as "Single Individual EL No 5%"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on Add client button
And verify the 7216 radio button is present
And change the response in radio button

And select single partner pic as "Avnet, Erin"
And select template name as "Individual EL No 5%"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on Add client button
And verify the 7216 radio button is present
And change the response in radio button

And select single partner pic as "Avnet, Erin"
And select template name as "SEC Individual Fixed Fee EL No 5%"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on Add client button
And verify the 7216 radio button is present
And change the response in radio button

And select single partner pic as "Avnet, Erin"
And select template name as "Single Individual Fixed Fee EL No 5%"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on Add client button
And verify the 7216 radio button is present
And change the response in radio button

And select single partner pic as "Avnet, Erin"
And select template name as "Individual Fixed Fee EL No 5%"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on Add client button
And verify the 7216 radio button is present
And change the response in radio button
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: To validate the radio button for 7216 form in Edit fields screen 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Single Individual Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on ok button in warning popup
And click on action icon 
And click on edit fields button 
And verify the 7216 radio button is present
And change the response in radio button 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: To validate the radio button for 7216 form in Edit fields screen in bulk letter generation screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Single Individual Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on ok button in warning popup
And click on action icon 
And click on edit fields button 
And verify the 7216 radio button is present
And change the response in radio button 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: To validate the radio button for 7216 form in Edit fields screen in dashboard screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Search or filter button
And enter the status as "With Admin for Review"
And select the status as "With Admin for Review" 
And click the search button
And click on action icon 
And click on edit fields button 
And verify the 7216 radio button is present
And change the response in radio button 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|


Scenario Outline: To validate the no radio button is selected by default in 7216 field in Add client screen 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And click on ok button in warning popup
And click on Add client button
And verify the 7216 radio button is present
And change the response in radio button 
And close the browser


Examples:
|username											 |password              |partnername     	|templatename                      |returncode |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |

@start1
Scenario Outline: To validate the user can able to edit the Fee block by selecting the single client letter 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And select the letter by clicking the checkbox
And click on Edit paragraph button
#And select the mutiple letter by clicking the checkbox
#And click on Edit paragraph button
And select editable block 
And edit the fee block as "<edittext>" and click on update button
And verify the success popup content after update the fee block and click ok button 

And close the browser


Examples:
|username											 |password              |partnername     	|templatename                      |returncode |questionoption                   	  	 |secondquestionoption|edittext																			|
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |Exclude fee and exclude admin charges  |Yes									|Testing user can able to edit the fee block  | 

Scenario Outline: To validate the IT help user not able to edit the fee block
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Single Individual Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on Load client details button
And select the letter by clicking the checkbox
And click on Edit paragraph button
And select the mutiple letter by clicking the checkbox
And click on Edit paragraph button
And verify the IT help desk user not able edit the fee block

And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: To validate the IT helpdesk user can resume the batch in batch dashboard screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Edit button bulk letter generation screen

And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|
@start2
Scenario Outline: To validate the choose paragrah button is disabled by default
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And verify the choose paragraph is disbaled by default 

And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|
@start3
Scenario Outline: To validate the choose paragrah button is enabled after user selecting the partner, template name and return type code
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And verify the choose paragraph is disbaled by default 
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code

And close the browser

Examples:
|username											 |password              |partnername     	|templatename                      |returncode |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |

Scenario Outline: To validate the partner user can only able to preview and download the letter in dashboard history log
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Action icon in dashboard screen
And click on History log popup 
And click on Preview button in history log popup
And click on close button in preview screen
And click on Download button in history log popup  

And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

@start4
Scenario Outline: To validate the choose paragrah button should disbale after click on load client details button
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And verify the choose paragraph is disbaled by default 
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And verify the choose paragraph is disbaled by default 
And close the browser

Examples:
|username											 |password              |partnername     	|templatename                      |returncode |questionoption                   	  	 |secondquestionoption|
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |Exclude fee and exclude admin charges  |Yes									|

@start5
Scenario Outline: To validate the edit paragraph button should be enable after selecting the single or multiple letter
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And verify the choose paragraph is disbaled by default 
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And verify the choose paragraph is disbaled by default 
And select the letter by clicking the checkbox
And verify the edit paragrph button is enable
And click on Edit paragraph button


And close the browser

Examples:
|username											 |password              |partnername     	|templatename                      |returncode |questionoption                   	  	 |secondquestionoption|
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |Exclude fee and exclude admin charges  |Yes									|
@start6
Scenario Outline: To validate the user can able to select the wizard options in choose paragraph screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And verify the choose paragraph is disbaled by default 
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button

And close the browser

Examples:
|username											 |password              |partnername     	|templatename                      |returncode |questionoption                   	  	 |secondquestionoption|
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |Exclude fee and exclude admin charges  |Yes									|
@start7
Scenario Outline: To validate the edit paragrapgh button is disbaled by default after load client details 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And verify the choose paragraph is disbaled by default 
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And verify the edit paragraph button is disabled by default

And close the browser

Examples:
|username											 |password              |partnername     	|templatename                      |returncode |questionoption                   	  	 |secondquestionoption|
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |Exclude fee and exclude admin charges  |Yes									|
@start8
Scenario Outline: To validate the load client details button is disbaled if all the question options are selected but user click on close button or close icon in choose paragraph screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And verify the choose paragraph is disbaled by default 
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And click on close button in choose paragraph screen
And verify the load client details button is disbaled while selecting wizard responses
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And click on close icon in choose paragraph screen
And verify the load client details button is disbaled while selecting wizard responses

And close the browser

Examples:
|username											 |password              |partnername     	|templatename                      |returncode |questionoption                   	  	 |secondquestionoption|
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |Exclude fee and exclude admin charges  |Yes									|

@start9
Scenario Outline: To validate the load client details button is enabled after user selecting all the wizard options
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the load client details button is enabled after click on submit button

And close the browser

Examples:
|username											 |password              |partnername     	|templatename                      |returncode |questionoption                   	  	 |secondquestionoption|
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |Exclude fee and exclude admin charges  |Yes									|

@start10
Scenario Outline: To validate the warning popup if user click on submit  button if question options are not selected
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
 

And close the browser

Examples:
|username											 |password              |partnername     	|templatename                      |returncode |questionoption                   	  	 |secondquestionoption|
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |Exclude fee and exclude admin charges  |Yes									|

@start11
Scenario Outline: To verify the choose paragraph button is disabled by default after load client details  
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And verify the choose paragraph button is disabled by default after load client details 
#And verify the edit paragraph button is disbaled by default 
And close the browser

Examples:
|username											 |password              |partnername     	|templatename                      |returncode |questionoption                   	  	 |secondquestionoption|
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |Exclude fee and exclude admin charges  |Yes									|  

@start12
Scenario Outline: To validate user can able to select all the letters by clicking checkbox and edit paragraph for all letters 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And select all the letter by clicking the checkbox
And click on Edit paragraph button
#And select the mutiple letter by clicking the checkbox
#And click on Edit paragraph button
And select editable block 
And edit the fee block as "<edittext>" and click on update button
And verify the success popup content after update the fee block and click ok button 

And close the browser


Examples:
|username											 |password              |partnername     	|templatename                      |returncode |questionoption                   	  	 |secondquestionoption|edittext																			|
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |Exclude fee and exclude admin charges  |Yes									|Testing user can able to edit the fee block  | 


Scenario Outline: To validate the user can edit any specific block or paragraphs for the particular letter
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And click on edit paragraph button from the action menu for one individual letter
And user select the block 
And verify the edit button is enabled in edit paragraph screen
And click on Edit button in edit paragraph popup
And user edit the block with the content ""
And click on update button in ck editor

And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: To validate the user can able to edit the block by selecting multiple letters
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And user can able to select the multiple letters by clicking the checkbox
And user click on edit paragraph button
And user select the block 
And verify the edit button is enabled in edit paragraph screen
And click on Edit button in edit paragraph popup
And user edit the block with the content ""
And click on update button in ck editor

And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: To verify the edit paragraph button is disabled by default in the bulk letter generation screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And verify the edit paragraph button is disabled by default in the bulk letter generation screen

And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|


Scenario Outline: To validate the cancel button and X icon in ck editor in edit paragraph popup when user select multiple letters
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And user can able to select the multiple letters by clicking the checkbox
And click on Edit paragraph button 
And user select the block 
And user edit the block with the content ""
And verify the cancel button and X icon in ck editor 

And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|
  
Scenario Outline: To validate the cancel button and X icon in ck editor in edit paragraph popup when user when user select signle letter
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And click on edit paragraph button from the action menu for one individual letter
And user select the block 
And verify the edit button is enabled in edit paragraph screen
And click on Edit button in edit paragraph popup
And click on Edit paragraph button 
And verify the cancel button and X icon in ck editor  

And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				| 
  
Scenario Outline: To validate the cancel button in Choose paragraph screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And click on edit paragraph button from the action menu for one individual letter
And user select the block 
And verify the edit button is enabled in edit paragraph screen
And click on Edit button in edit paragraph popup
And click on Edit paragraph button 
And verify the cancel button and X icon in ck editor  

And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				| 
 
Scenario Outline: To validate the submit button is disabled in choose paragraph screen before selecting all the wizard options
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And verify the submit button is disabled before selecting all the wizard options

And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				| 

Scenario Outline: To validate the submit button is enabled in choose paragraph screen after selecting all the wizard options
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And verify the submit button is enabled after selecting all the wizard options
And click on submit button in choose paragraph screen


And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				| 

Scenario Outline: To verify the note text that indicates which block can be edited
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And click on edit paragraph button from the action menu for one individual letter
And verify the note text indicates which block can be edited
 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|   

Scenario Outline: To verify that wizard options are uncecked by default
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And verify the options are unchecked by default
 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|  

Scenario Outline: To verify that edit attachment button is disbaled by default
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And verify the edit attachment button is disbaled by default
 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|  

Scenario Outline: To validate that user can able to add attachment for any template available in the application
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And verify the edit attachment button is disbaled by default
And click on add attachment 
And click on add button in add attachment screen
And click on browse button and select the pdf document
And click on submit button
 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				| 

Scenario Outline: To validate that user can able to add maximum of 5 attachment in a batch in bulk letter generation screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And verify the edit attachment button is disbaled by default
And click on add attachment 
And click on add button in add attachment screen
And click on browse button and select the pdf document
And verify the user can upload only 5 attachment
And verify the error toast when user try to upload more than 5 attachment
And click on submit button
 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				| 

Scenario Outline: To validate that user can able to add any attachment to any individual client or some client in the batch using the checkbox at the time of bulk letter screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And verify the edit attachment button is disbaled by default
And user can select single letter by clicking checkbox
And click on add attachment 
And click on add button in add attachment screen
And click on browse button and select the pdf document
And click on submit button
 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				| 

Scenario Outline: To validate that user can able to add attachment of any pdf file in the edit attachment screen.
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And verify the edit attachment button is disbaled by default
And user can select single letter by clicking checkbox
And click on add attachment 
And click on add button in add attachment screen
And click on browse button and select the pdf document
And click on submit button
 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				| 

Scenario Outline: To validate the error toast when user try to upload
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And verify the edit attachment button is disbaled by default
And user can select single letter by clicking checkbox
And click on add attachment 
And click on add button in add attachment screen
And click on browse button and select the invalid file
And verify the error toast when user try to upload the invalid file

 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				| 

Scenario Outline: To validate the add button in the add attachment popup screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And verify the edit attachment button is disbaled by default
And user can select single letter by clicking checkbox
And click on add attachment 
And click on add button in add attachment screen

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				| 

Scenario Outline: To validate the success toast after user attach the file successfully
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And verify the edit attachment button is disbaled by default
And user can select single letter by clicking checkbox
And click on add attachment 
And click on add button in add attachment screen
And click on browse button and select the invalid file
And verify the error toast when user try to upload the invalid file
And click on submit button
And verify the success toast after user attach the file successfully
 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				| 

Scenario Outline: To validate that submit button in add attachment screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And verify the edit attachment button is disbaled by default
And click on add attachment 
And click on add button in add attachment screen
And click on browse button and select the pdf document
And click on submit button

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: To validate that user can able to add any attachment to all the loaded client by selecting the checkbox at the time of bulk letter generation
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "" in choose paragraph button
And click on submit button in choose paragraph screen
And verify the load client details button is enabled after click on submit button
And click on Load client details button
And verify the edit attachment button is disbaled by default
And user select all the loaded letters by clicking on checkbox
And click on add attachment 
And click on add button in add attachment screen
And click on browse button and select the pdf document
And click on submit button

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: To validate that the partner user can view list of letters which they involved
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And verify the list of letters which they are involved 

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|


Scenario Outline: To validate that the partner user can view all the letters available in the application in all letters tab 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And verify the list of letters which they are involved 
And click on All letters button in dashboard screen
And verify system is showing all the letters available in the application for partner user 

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: To validate that the partner user should land on my letters tab by default
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And verify the partner user should land on my letters tab by default

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

