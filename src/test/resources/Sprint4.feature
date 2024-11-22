Feature: To validate the phase 2 features in the application.

Background:
Given User launch the application in chrome browser 
And Maximize the window 

Scenario Outline: To validate that user can able to select the year from the tax year dropdown 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on templates
And click on continue button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And click on tax year dropdown in bulk letter generation screen
And select single tax year as "<taxyear>"
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |

Scenario Outline: To validate that user can able to remove the selected year in tax year dropdown 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on templates
And click on continue button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And click on tax year dropdown in bulk letter generation screen
And select single tax year as "<taxyear>"
And click on close icon in the tax year field
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |

Scenario Outline: To validate that user can able to select all the years from tax year dropdown in bulk letter generation screen 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on templates
And click on continue button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
#And select single tax year as "<taxyear>"
And click on close icon in the tax year field
And click on tax year dropdown in bulk letter generation screen
And select all the tax years by click on select all checkbox
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |

Scenario Outline: To verify the choose paragraph button & load client details button id disabled without tax year
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on templates
And click on continue button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
#And select single tax year as "<taxyear>"
And click on close icon in the tax year field
And verify the choose paragraph button is disbaled without any year selected
And verify the load client paragraph button is disbaled without any year selected
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo 				  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |

Scenario Outline: To verify the Edit 7216 form button is disbaled for non individual templates 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on templates
And click on continue button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And click on ok button in warning popup if warning popup is displaying
And select the letter by clicking the checkbox
And verify the edit 7216 form button is disbaled for specific templates
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo 				  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |

Scenario Outline: To verify the Edit 7216 form button is enabled for Individuals template 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on templates
And click on continue button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And click on ok button in warning popup if warning popup is displaying
And select the letter by clicking the checkbox
And verify the edit 7216 form button is enabled for individual templates

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo 					|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |

Scenario Outline: To validate the close and cancel button in edit 7216 form ck editor
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on templates
And click on continue button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And click on ok button in warning popup if warning popup is displaying
And enter the "<clientid>" in search value
And select the letter by clicking the checkbox
And verify the edit 7216 form button is enabled for individual templates
And click on edit 7216 form button 
#And verify the ck editor title as Edit 7216 provider
And verify the close button in ck editor 
And select the letter by clicking the checkbox
And click on edit 7216 form button 
And verify the cancel button in ck editor 
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|clientid |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2022   |5218     |

Scenario Outline: To validate the update button in edit 7216 form ck editor
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on templates
And click on continue button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And click on ok button in warning popup if warning popup is displaying
And enter the "<clientid>" in search value
And select the letter by clicking the checkbox
And verify the edit 7216 form button is enabled for individual templates
And click on edit 7216 form button 
And click on update button in edit 7216 form ck editor
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|clientid |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo 				  |Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2022   |5218     |

Scenario Outline: To verify the success toast after update the 7216 form 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on templates
And click on continue button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And click on ok button in warning popup if warning popup is displaying
And select the letter by clicking the checkbox
And verify the edit 7216 form button is enabled for individual templates
And click on edit 7216 form button 
And click on update button in edit 7216 form ck editor
And verify the success toast message after update the 7216 form
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo 					|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |

Scenario Outline: To verify the note text in the 7216 form in ck editor
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on templates
And click on continue button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And click on ok button in warning popup if warning popup is displaying
And enter the "<clientid>" in search value
And select the letter by clicking the checkbox
And verify the edit 7216 form button is enabled for individual templates
And click on edit 7216 form button 
And verify the note text in 7216 form in ck editor
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|clientid |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2022   |5218    | 
@start
Scenario Outline: To verify the Edit 7216 form button is disabled for Admin role users
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on templates
And click on continue button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And click on ok button in warning popup if warning popup is displaying
And select the letter by clicking the checkbox
And verify the edit 7216 form button is enabled for individual templates

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|
|vignesh.k@changepond.com      |Vik@2024  				|Fernandez, Wilfredo 					|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |
