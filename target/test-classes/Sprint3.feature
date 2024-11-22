Feature: To validate the phase 2 features in the application.

Background:
Given User launch the application in chrome browser 
And Maximize the window 

Scenario Outline: To verify the edit attachment button is disbaled by default
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
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
And verify the edit attachment button is disbaled by default in bulk letter generation screen 

And close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |

Scenario Outline: To verify the edit attachment button will enabled after selecting one or multiple letters 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
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
And verify the edit attachment button is enabled after selecting one or multiple letters

And close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo 				  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |

Scenario Outline: To validate user can able to add attachment for all letters in a batch
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
And select all the letter by clicking the checkbox
And verify the edit attachment button is enabled after selecting one or multiple letters
And click on Edit attachment button in bulk letter generation
And click on add button in attachment warning popup
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |

Scenario Outline: To validate user can able to preview the attached attachment in add attachment popup.
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
And select all the letter by clicking the checkbox
And verify the edit attachment button is enabled after selecting one or multiple letters
And click on Edit attachment button in bulk letter generation
And click on add button in attachment warning popup
And click on preview button in add attachment popup
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |

Scenario Outline: To validate user can able to remove the attached attachment in add attachment popup.
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
And select all the letter by clicking the checkbox
And verify the edit attachment button is enabled after selecting one or multiple letters
And click on Edit attachment button in bulk letter generation
And click on add button in attachment warning popup
And click on remove button in add attachment popup
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo 				  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |

Scenario Outline: To verify the content of the successful toast after adding the attachment to the all the letters in batch
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
And select all the letter by clicking the checkbox
And verify the edit attachment button is enabled after selecting one or multiple letters
And click on Edit attachment button in bulk letter generation
And click on add button in attachment warning popup
And click on submit button
And verify the content in success popup after added the attachment and click on ok button

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Preview   |

Scenario Outline: To validate user can able to preview the letter under action menu after added the attachment.
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
And select all the letter by clicking the checkbox
And verify the edit attachment button is enabled after selecting one or multiple letters
And click on Edit attachment button in bulk letter generation
And click on add button in attachment warning popup
And click on submit button
And verify the content in success popup after added the attachment and click on ok button
And click on action icon
And click on "<actionmenu>" option from action menu
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu       |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo				  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Preview letter   |

Scenario Outline: To validate user can able to download the letter under action menu after added the attachment.
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
And select all the letter by clicking the checkbox
And verify the edit attachment button is enabled after selecting one or multiple letters
And click on Edit attachment button in bulk letter generation
And click on add button in attachment warning popup
And click on submit button
And verify the content in success popup after added the attachment and click on ok button
And click on action icon
And click on "<actionmenu>" option from action menu
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu        |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Download letter   |

Scenario Outline: To verify the warning toast popup when user try to attach the same file
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
And select all the letter by clicking the checkbox
And verify the edit attachment button is enabled after selecting one or multiple letters
And click on Edit attachment button in bulk letter generation
And click on add button and attach same attachment again in add attachment popup
And verify the warning popup when user try to attach the same file
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |

Scenario Outline: To validate that user can able to add attachment for single letters in a batch
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
And verify the edit attachment button is enabled after selecting one or multiple letters
And click on Edit attachment button in bulk letter generation
And click on add button in attachment warning popup

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |

Scenario Outline: To verify the error popup when user try to upload the invalid file in add attachment popup
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
And verify the edit attachment button is enabled after selecting one or multiple letters
And click on Edit attachment button in bulk letter generation
And click on add button in attachment invalid file in add attachment popup
And verify the error popup when we upload the invalid file 
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |

Scenario Outline: To validate system should disable the add button after added five attachments in add attachment popup 
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
And verify the edit attachment button is enabled after selecting one or multiple letters
And click on Edit attachment button in bulk letter generation
And click on add button and attach five valid attachments  
And verify the add button is disbaled for added five attachments
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |

Scenario Outline: To validate user can able to add or edit attachment under action menu for specific letter in bulk letter generation screen
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
And click on action icon
And click on "<actionmenu>" option from action menu 
And click on add button in attachment warning popup
And click on submit button
And verify the content in success popup after added the attachment and click on ok button

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |

Scenario Outline: To validate user can able to preview the attached attachment in add attachment popup for the specific letter
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
And click on action icon
And click on "<actionmenu>" option from action menu 
And click on add button in attachment warning popup
And click on preview button in add attachment popup
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  				|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |

Scenario Outline: To validate user can able to remove the attached attachment in add attachment popup for specific letter
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
And click on action icon
And click on "<actionmenu>" option from action menu 
And click on add button in attachment warning popup
And click on remove button in add attachment popup
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |

Scenario Outline: To verify the submit button is disbaled by default in add attachment popup for whole batch
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
And select all the letter by clicking the checkbox
And verify the submit button is disbaled by default
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |

Scenario Outline: To verify the submit button is disbaled by default in add attachment popup for specific letter
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
And click on action icon
And click on "<actionmenu>" option from action menu 
And verify the submit button is disbaled by default
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |

Scenario Outline: To verify the 7216 radio button is showing in edit fields for Individual templates
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
And click on action icon
And click on "<actionmenu>" option from action menu 
And verify the 7216 available radio button is displaying in edit fields 

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields        |
#|manikandan.ra@changepond.com  |Foz98112cp1   				|Adelizzi, Paul D. 					  |              			     |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields        |

Scenario Outline: To validate that user can able to select yes or no in 7216 radio button in edit fields for Individual templates
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
And click on action icon
And click on "<actionmenu>" option from action menu 
And verify the 7216 available radio button is displaying in edit fields 
And select yes button in 7216 available radio button in edit fields popup 
And select no button in 7216 available radio button in edit fields popup

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12  				| Fernandez, Wilfredo  			  |Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields        |

Scenario Outline: To validate that user can able to select yes or no in 7216 radio button in edit fields for Individual templates after save draft
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
And click on action icon
And click on "<actionmenu>" option from action menu 
And verify the 7216 available radio button is displaying in edit fields 
And select yes button in 7216 available radio button in edit fields popup 
And select no button in 7216 available radio button in edit fields popup
And click on update button
And click on ok button after update the 7216 radio button in edit fields
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And verify the content of the save draft success popup 
And click on Ok button in save draft success popup 
And click on Edit button bulk letter generation screen

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Fernandez, Wilfredo   	    |Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields        |

Scenario Outline: To validate that if the letter have 7216 form then system select no option by default 7216 available in edit field popup
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
And click on action icon
And click on "<actionmenu>" option from action menu 
And verify the 7216 available radio button is displaying in edit fields 
And verify the no option is selected by default if the letter have 7216 form


Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Fernandez, Wilfredo         |Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields        |

Scenario Outline: To validate that if the letter have 7216 form then system is not select yes option 7216 available in edit field popup
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
And click on action icon
And click on "<actionmenu>" option from action menu 
And verify the 7216 available radio button is displaying in edit fields 
And verify the yes option is not selected if the letter have 7216 form


Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Fernandez, Wilfredo  		    |Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields        |

Scenario Outline: To validate that if the letter have 7216 form then system should select no option as default when add new client 
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
And click on Add client button
And verify the 7216 available radio button is displaying in Add client screen
And verify the no option is selected by default in Add client screen


Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Fernandez, Wilfredo         |Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields        |

Scenario Outline: To validate that if the letter have 7216 form then system is not selected yes option as default in add new client screen
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
And click on Add client button
And verify the 7216 available radio button is displaying in Add client screen
And verify the no option is selected by default in Add client screen
And verify the yes option is not selected by default in Add client screen

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Fernandez, Wilfredo  			  |Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields        |

