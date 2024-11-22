Feature: To validate the phase 2 features in the application.

Background:
Given User launch the application in chrome browser 
And Maximize the window 

Scenario Outline: To validate that user can able to add 5 attachments in the upload attachment popup [ Batch Level ]
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
And click on Edit attachment button in bulk letter generation
And verify that user can able to add five attachments
And click on submit button
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |

Scenario Outline: To validate that user can able to add 5 attachments in the upload attachment popup [ Letter Level ]
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
#And click on Edit attachment button in bulk letter generation
And verify that user can able to add five attachments
And click on submit button
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   				|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Attachments   |

Scenario Outline: To validate that the Email and letter radio button in action with column [ Batch Level ]
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
And click on Edit attachment button in bulk letter generation
And click on add button in attachment warning popup
#And verify that user can able to add five attachments
And click on email radio button in upload attachment popup
And click on letter radio button in upload attachment popup

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |

Scenario Outline: To validate that the Email and letter radio button in action with column [ Letter Level ]
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
#And verify that user can able to add five attachments
And click on email radio button in upload attachment popup
And click on letter radio button in upload attachment popup

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Attachments   |

Scenario Outline: To validate that user can able to add the attachment while creating new template
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on template option from menu bar
And click on add template button in template screen
And click on add attachment button in template screen
And add the attachment in upload attachment popup in template screen
And click on submit button

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   				|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Attachments   |

Scenario Outline: To validate that user can able to add and remove attachments in the upload attachment popup [ Letter Level ]
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
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |

Scenario Outline: To validate that user can able to add and remove attachments in the upload attachment popup [ Batch Level ]
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
And click on Edit attachment button in bulk letter generation
And click on add button in attachment warning popup
And click on remove button in add attachment popup
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo    		  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |

Scenario Outline: To validate that user can able to click on edit attachment for exisiting template in template screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on template option from menu bar
And click on edit button for the exisiting templates
And click on edit attachment button in template screen
And add the attachment in upload attachment popup in template screen
And click on submit button
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   				|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |

Scenario Outline: To validate that user can able to preview the attachment after added the attachment
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
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo    			|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |

Scenario Outline: To verify that the letter radio button is selected by default
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
And click on Edit attachment button in bulk letter generation
And verify that letter radio button is selected by default
And click on close button in upload attachment popup screen
And click on action icon
And click on "<actionmenu>" option from action menu 
And verify that letter radio button is selected by default
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   				|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |
@change
Scenario Outline: To verify warning content in upload attachment popup screen
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
And click on Edit attachment button in bulk letter generation
And verify the warning content in the upload attachment popup screen
And click on close button in upload attachment popup screen
And click on action icon
And click on "<actionmenu>" option from action menu 
And click on add button in attachment warning popup
And verify the warning content in the upload attachment popup screen
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |
@change
Scenario Outline: To verify the generic note text in upload attachment popup screen
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
And click on Edit attachment button in bulk letter generation
And verify the generic note text in the upload attachment popup screen
And click on close button in upload attachment popup screen
And click on action icon
And click on "<actionmenu>" option from action menu 
And click on add button in attachment warning popup
And verify the generic note text in the upload attachment popup screen
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |
@change
Scenario Outline: To verify the title of the popup
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
And click on Edit attachment button in bulk letter generation
And verify the title as "<popuptitle>" of the popup screen
And click on close button in upload attachment popup screen
And click on action icon
And click on "<actionmenu>" option from action menu 
And verify the title as "<popuptitle>" of the popup screen
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   				|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |

Scenario Outline: To validate the Create Letters Based on Clients in the popup
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   				|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To verify continue button is disbaled by default
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And verify the continue button is disbaled by default
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   				|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To verify the clientname/id is selected by default
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify that clientname/id is selected by default
And click clientname/id dropdown 
And user can able to select "<clientName/Id>" from the dropdown
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To validate that user can able to multi select the client name/id
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify that clientname/id is selected by default
#And select clientname/id radio button for search and load clients based on
#And select emailaddress radio button for search and load cliens based on
And click clientname/id dropdown 
And user can able to select multiple "<clientName/Id1>", "<clientName/Id2>", "<clientName/Id3>"" from the dropdown
#And user can able to select mulitple clientname/id 
Then close the browser 

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id1             |clientName/Id2                      | clientName/Id3         |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442)  |Artabane, Anthony & Cheryl (191355) |Chelsea Sanzone (192845)|

Scenario Outline: To validate that user can able to select the single client name/id
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify that clientname/id is selected by default
#And select clientname/id radio button for search and load clients based on
#And select emailaddress radio button for search and load cliens based on
And click clientname/id dropdown 
And user can able to select "<clientName/Id>" from the dropdown
#And user can able to select mulitple clientname/id 
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   				|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) | 

Scenario Outline: To verify the next button is enabled or disabled without selecting templates, return type & choose paragraph
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify that clientname/id is selected by default
And click clientname/id dropdown 
And user can able to select "<clientName/Id>" from the dropdown
#And user can able to select mulitple clientname/id 
And click on Load client details button in client approach
And verify the next button is enabled or disbled without selecting templates, return type code
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   				|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To verify the next button will be enabled after giving all the corresponding inputs
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify that clientname/id is selected by default
And click clientname/id dropdown 
And user can able to select "<clientName/Id>" from the dropdown
#And user can able to select mulitple clientname/id 
And click on Load client details button in client approach
And select template name as "<templatename>" in basic details
And verify the next button is enabled or disbled without selecting templates, return type code
And select return type code as "<returncode>" in basic details
And click on choose paragraph icon in basic details 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in basic details
And verify the success popup after submit in basic details and click on ok button
And verify the next button is enabled or disbled without selecting templates, return type code
#Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   				|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) | 
@change
Scenario Outline: To verify the warning popup when user try to create the letter with different email address [ Letter creation based on client ]
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify that clientname/id is selected by default
And click clientname/id dropdown 
And user can able to select multiple "<clientName/Id1>", "<clientName/Id2>" from the dropdown
#And user can able to select mulitple clientname/id 
And click on Load client details button
And select template name as "<templatename>" in basic details
And verify the next button is enabled or disbled without selecting templates, return type code
And select return type code as "<returncode>" in basic details
And click on choose paragraph icon in basic details 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in basic details
And verify the success popup after submit in basic details and click on ok button
And select template name as "<templatename2>" in basic details for next letter
#And verify the next button is enabled or disbled without selecting templates, return type code
And select return type code as "<returncode2>" in basic details for next letter
And click on choose paragraph icon in basic details for next letter
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in basic details
And verify the success popup after submit in basic details and click on ok button
And verify the next button is enabled or disbled without selecting templates, return type code
And click on next button in client details
And click on ok button in warning popup if warning popup is displaying

#Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id1             |clientName/Id2                      |templatename2            |returncode2|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442)  |Artabane, Anthony & Cheryl (191355) |Business Tax Eng Letter  |1065       |

Scenario Outline: To validate the user can able to select single email address from the dropdown in basic details
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify that clientname/id is selected by default
And select emailaddress radio button for search and load clients based on
And click on email address dropdown 
And user can able to select single "<emailaddress>" from the dropdown in basic details
#And user can able to select mulitple clientname/id 
And click on Load client details button in client approach
And select template name as "<templatename>" in basic details
And verify the next button is enabled or disbled without selecting templates, return type code
And select return type code as "<returncode>" in basic details
And click on choose paragraph icon in basic details 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in basic details
And verify the success popup after submit in basic details and click on ok button
And verify the next button is enabled or disbled without selecting templates, return type code
And click on next button in client details
And click on ok button in warning popup if warning popup is displaying

#Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id1             |clientName/Id2                      |templatename2            |returncode2|emailaddress              |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442)  |Artabane, Anthony & Cheryl (191355) |Business Tax Eng Letter  |1065       |Brookegrosenthal@gmail.com|

Scenario Outline: To validate the add email attachment and edit 7216 form button based on client letter creation
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify that clientname/id is selected by default
And select emailaddress radio button for search and load clients based on
And click on email address dropdown 
And user can able to select single "<emailaddress>" from the dropdown in basic details
#And user can able to select mulitple clientname/id 
And click on Load client details button in client approach
And select template name as "<templatename>" in basic details
And verify the next button is enabled or disbled without selecting templates, return type code
And select return type code as "<returncode>" in basic details
And click on choose paragraph icon in basic details 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in basic details
And verify the success popup after submit in basic details and click on ok button
And verify the next button is enabled or disbled without selecting templates, return type code
And click on next button in client details
And click on ok button in warning popup if warning popup is displaying
And click on Edit email attachment button in bulk letter generation
And click on add button in attachment warning popup
And click on submit button
And verify the content of the success toast after adding the attachment in email 
And select all the letter by clicking the checkbox
And click on edit 7216 form button 
And click on update button in edit 7216 form ck editor
And verify the success toast message after update the 7216 form

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id1             |clientName/Id2                      |templatename2            |returncode2|emailaddress              |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442)  |Artabane, Anthony & Cheryl (191355) |Business Tax Eng Letter  |1065       |Brookegrosenthal@gmail.com|

Scenario Outline: To validate that the template dropdown is single selected.
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify that clientname/id is selected by default
And click clientname/id dropdown 
And user can able to select "<clientName/Id>" from the dropdown

#And select emailaddress radio button for search and load cliens based on
#And user can able to select mulitple clientname/id 
#And click on Load client details button


#Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id1             |clientName/Id2                      |templatename2            |returncode2|emailaddress              |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442)  |Artabane, Anthony & Cheryl (191355) |Business Tax Eng Letter  |1065       |Brookegrosenthal@gmail.com|

Scenario Outline: To verify the dropdown placeholder based on the search & load clients based on 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify that clientname/id is selected by default
And verify the placeholder when user select the clientname?id is selected
And select emailaddress radio button for search and load clients based on
And verify the placeholder when user select the emailaddress is selected 
#And user can able to select mulitple clientname/id 


#Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id1             |clientName/Id2                      |templatename2            |returncode2|emailaddress              |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442)  |Artabane, Anthony & Cheryl (191355) |Business Tax Eng Letter  |1065       |Brookegrosenthal@gmail.com|

Scenario Outline: To verify the load client details button is disbaled without select clientname/id or email address 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify the load client details button is disbaled without selecting the clientname/id or email address
#And user can able to select mulitple clientname/id 


#Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id1             |clientName/Id2                      |templatename2            |returncode2|emailaddress              |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  				|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442)  |Artabane, Anthony & Cheryl (191355) |Business Tax Eng Letter  |1065       |Brookegrosenthal@gmail.com|

Scenario Outline: To validate the user can able to add the existing client by selecting Select Existing Client radio button in bulk letter generation screen [client flow]
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify that clientname/id is selected by default
And click clientname/id dropdown 
And user can able to select "<clientName/Id>" from the dropdown
#And user can able to select mulitple clientname/id 
And click on Load client details button in client approach
And select template name as "<templatename>" in basic details
And verify the next button is enabled or disbled without selecting templates, return type code
And select return type code as "<returncode>" in basic details
And click on choose paragraph icon in basic details 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in basic details
And verify the success popup after submit in basic details and click on ok button
And verify Add client button in bulk letter generation screen in client based letter creation
And click on Add client button in bulk letter generation screen in client based letter creation
And click clientname/id dropdown in add new client screen in client based letter creation
And user can able to select "<clientName/Id>" from the dropdown in add new client screen in client based letter creation
And click on Add button in add new client screen
And verify the success toast after added client in add new client screen
#Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id1             |clientName/Id2                      |templatename2            |returncode2|clientName/Id											 |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442)  |Artabane, Anthony & Cheryl (191355) |Business Tax Eng Letter  |1065       |Mark & Jen CitrinEngage (999999007) |
@start
Scenario Outline: To validate the user can able to add the existing client by selecting Select Existing Client radio button in bulk letter generation screen [client flow]
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify that clientname/id is selected by default
And click clientname/id dropdown 
And user can able to select "<clientName/Id>" from the dropdown
#And user can able to select mulitple clientname/id 
And click on Load client details button in client approach
And select template name as "<templatename>" in basic details
And verify the next button is enabled or disbled without selecting templates, return type code
And select return type code as "<returncode>" in basic details
And click on choose paragraph icon in basic details 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in basic details
And verify the success popup after submit in basic details and click on ok button
And verify Add client button in bulk letter generation screen in client based letter creation
And click on Add client button in bulk letter generation screen in client based letter creation
And click on Add New Client radio button in Add new client popup screen

#Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id1             |clientName/Id2                      |templatename2            |returncode2|clientName/Id											 |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442)  |Artabane, Anthony & Cheryl (191355) |Business Tax Eng Letter  |1065       |Mark & Jen CitrinEngage (999999007) |