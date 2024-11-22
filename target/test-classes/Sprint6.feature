Feature: To validate the phase2 functionalities of the Engage application

Background:
Given User launch the application in chrome browser 
And Maximize the window 

Scenario Outline: To validate that the child client id field must have only integer 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And enter any "<childname>" in child client id field 
And verify the warning text is showing when user enter the string in child client id field 
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mike	   |

Scenario Outline: To validate that the child client id field must have only integer in add new client popup screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And enter the "<childname>" in child client id field in add new client popup screen
And verify the warning text is showing when user enter the string in child client id field 
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mike	   |

Scenario Outline: To validate that user can able to add child client id and child client name by click on add button 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And enter the "<childid>" in child client id field
And enter the "<childname>" in child client name field 
And click on add button for adding child client name and id

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mikeal	   |1001   |
@skip
Scenario Outline: To verify the added child client id and name is showing 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And enter the "<childid>" in child client id field
And enter the "<childname>" in child client name field 
And click on add button for adding child client name and id
And verify the added child client id and name is showing 
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |micheal	   |1001   |

Scenario Outline: To verify the add button is disbaled if user didnt enter child client id and name
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And verify the add button is disbaled by default 
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |micheal	   |1001   |

Scenario Outline: To validate that user can able to enter only 15 characters in child client id field in edit fields screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And verify the add button is disbaled by default 
And enter the "<childid>" in child client id field
And verify the warning label is showing when user enter more than 15 characters in child client id field
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid           |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |micheal	   |9090909009090000  |
@skip
Scenario Outline: To validate that user can able to enter only 15 characters in child client id field in add new client screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And verify the add button is disbaled by default 
And enter the "<childid>" in child client id field in add new client screen
And verify the warning label is showing when user enter more than 15 characters in child client id field
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid							|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |micheal	   |9090909009090000   |

Scenario Outline: To validate that user can able to enter 100 characters in child client name field in edit fields screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And verify the add button is disbaled by default 
And enter the "<childname>" in child client name field 
And verify the warning label is showing when user enter more than 100 characters in child client name field in edit field screen
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname                                                                                                             |childid|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mark V Antonyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy   |1001   |
@skip
Scenario Outline: To validate that user can able to enter 100 characters in child client name field in add new client screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And verify the add button is disbaled by default 
And enter the "<childname>" in child client name field in add new client popup screen
And verify the warning label is showing when user enter more than 100 characters in child client name field in add new client screen 
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  																																																						|childid	|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mark V Antonyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy	   |1001   |

Scenario Outline: To validate that user can able to enter atleast 5 characters in child client name field in edit fields screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And verify the add button is disbaled by default 
And enter the "<childname>" in child client name field 
And verify the warning label is showing when user enter child client name below five character
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |mike       |1001   |
@skip
Scenario Outline: To validate that user can able to enter atleast 5 characters in child client name field in add new client screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And verify the add button is disbaled by default 
And enter the "<childname>" in child client name field in add new client popup screen 
And verify the warning label is showing when user enter child client name below five character
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |mike	     |1001   |

Scenario Outline: To validate delete icon in the child client under action column in edit fields screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And verify the add button is disbaled by default 
And enter the "<childid>" in child client id field
And enter the "<childname>" in child client name field 
And click on add button for adding child client name and id
And click on delete icon in child client 
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |micheal	   |1001   |
@skip
Scenario Outline: To validate delete icon in the child client under action column in add new client screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And verify the add button is disbaled by default 
And enter the "<childid>" in child client id field in add new client screen
And enter the "<childname>" in child client name field in add new client popup screen
And click on add button for adding child client name and id in add new client screen
And click on delete icon in child client
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |micheal	   |1001   |

Scenario Outline: To validate the add button for child entity is enabled after user provide the valid input in child client id and name in edit fields screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And verify the add button is disbaled by default 
And enter the "<childid>" in child client id field
And enter the "<childname>" in child client name field 
And verify the add button is enabled once user enter the valid inputs

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |micheal	   |1001   |
@skip
Scenario Outline: To validate the add button for child entity is enabled after user provide the valid input in child client id and name in add new client screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And verify the add button is disbaled by default 
And enter the "<childid>" in child client id field in add new client screen
And enter the "<childname>" in child client name field in add new client popup screen
And verify the add button is enabled once user enter the valid inputs

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |micheal	   |1001   |

Scenario Outline: To validate the add button in edit fields popup in letter dashboard screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button 
And Validate the status dropdown
When select the "<status>" from the status dropdown in dashboard screen
And click the search button
And click on Action icon in dashboard screen
And click on "<actionmenu>" option from action menu 
And verify the add button is disbaled by default 
And enter the "<childid>" in child client id field
And enter the "<childname>" in child client name field 
And verify the add button is enabled once user enter the valid inputs
And click on add button for adding child client name and id
Then close the browser

Examples:	
|username											 |password              |status                      |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|
|manikandan.ra@changepond.com  |Foz98112cp12   				|With Admin for Review       |Fernandez, Wilfredo  			    |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |micheal	   |1001   |

Scenario Outline: To validate the child client id and name in client mode
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And click clientname/id dropdown 
And user can able to select "<clientName/Id>" from the dropdown
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
And click on action icon in client flow
And click on "<actionmenu>" option from action menu
And verify the add button is disbaled by default 
And enter the "<childid>" in child client id field
And enter the "<childname>" in child client name field
And click on add button for adding child client name and id
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields        |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To validate the address line 1,2,3 are showing in client details and office details [ template mode ]
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And verify the address1, address2, address3 is showing in edit fields screen
And verify the address1, address2, address3 is showing for office details in edit fields screen

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields   		 |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To validate the address line 1,2,3 are showing in client details and office details [ client mode ]
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And click clientname/id dropdown 
And user can able to select "<clientName/Id>" from the dropdown
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
And click on action icon in client flow
And click on "<actionmenu>" option from action menu
And verify the address1, address2, address3 is showing in edit fields screen
And verify the address1, address2, address3 is showing for office details in edit fields screen

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields        |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To validate that the user can able to select the value from partner and office dropdown [client mode]
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
And click on action icon in client flow
And click on "<actionmenu>" option from action menu 
And user can able to select "<partner name>" from the partner dropdown
And user can able to select "<office name>" from the office dropdown

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |partner name|office name| 
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields        |Upload Attachments |Brooke Rosenthal (192442) |Avnet, Erin |Livingston Tax|

Scenario Outline: To validate that the user can able to select the value from partner and office dropdown [template mode]
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And user can able to select "<partner name>" from the partner dropdown
And user can able to select "<office name>" from the office dropdown 

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |partner name|office name|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields        |Upload Attachments |Brooke Rosenthal (192442) |Avnet, Erin |Livingston Tax|

Scenario Outline: To validate that the user can able to select the value from partner and office dropdown in letter dashboard screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button 
And Validate the status dropdown
When select the "<status>" from the status dropdown in dashboard screen
And click the search button
And click on Action icon in dashboard screen
And click on "<actionmenu>" option from action menu
And user can able to select "<partner name>" from the partner dropdown
And user can able to select "<office name>" from the office dropdown 

Then close the browser

Examples:	
|username											 |password              |partnername     	  |status                |      		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |partner name|office name|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo|With Admin for Review |   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Fields        |Upload Attachments |Brooke Rosenthal (192442) |Avnet, Erin |Livingston Tax|

Scenario Outline: To verify the button name should be like Add Attachments to Email [ client mode ]
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
And verify the add bulk attachments to email button in bulk letter generation screen in client flow 
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To validate that the special user role user can able to edit the finance charges questions in choose paragraph screen [ client mode ]
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
Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|inbarasi.k@changepond.com     |Buy43142   				    |Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) |
|inbarasi.k@changepond.com     |Buy43142   				    |Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |Yes     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To validate that the special user role user can able to edit the finance charges questions in choose paragraph screen [ template mode ]
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) |
|inbarasi.k@changepond.com     |Buy43142   				    |Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |Yes     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To validate that the special user role user can able to edit the finance charges questions in choose paragraph screen [ letter dashboard ]
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button 
And Validate the status dropdown
When select the "<status>" from the status dropdown in dashboard screen
And click the search button
And click on Action icon in dashboard screen
And click on "<actionmenu>" option from action menu
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen in dashboard screen

Then close the browser

Examples:	
|username											 |password              |partnername     	     |status                   		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu               |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   |With Admin for Review 		  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Choose Paragraphs        |Upload Attachments |Brooke Rosenthal (192442) |
|inbarasi.k@changepond.com     |Buy43142   				    |Fernandez, Wilfredo   |With Admin for Review 			|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |Yes     			 |Choose Paragraphs         |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To verify that the finance charges paragraph are disbaled for non special users [ template mode ]
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And verify the finance questions are disabled for non special users
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And click on ok button in warning popup if warning popup is displaying

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|vignesh.k@changepond.com      |Vik@2024   				    |Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To verify that the finance charges paragraph are disbaled for non special users [ client mode ]
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on clientid/name
And click on continue button
And verify that clientname/id is selected by default
#And select clientname/id radio button for search and load clients based on
#And select emailaddress radio button for search and load cliens based on
And click clientname/id dropdown 
And user can able to select "<clientName/Id>" from the dropdown
And click on Load client details button in client approach
And select template name as "<templatename>" in basic details
And verify the next button is enabled or disbled without selecting templates, return type code
And select return type code as "<returncode>" in basic details
And click on choose paragraph icon in basic details 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And verify the finance questions are disabled for non special users
And click on Submit button in basic details

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|vignesh.k@changepond.com      |Vik@2024   				    |Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To verify that the finance charges paragraph are selected yes option by default [ template mode ]
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Bulk letter generation button 
And click on Create bulk letters in batch button
And select the create letters based on templates
And click on continue button
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And verify the finance questions option is select as yes by default
And click on Submit button in chooose paragraph screen

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To verify that the finance charges paragraph are selected yes option by default [ client mode ]
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
And click on Load client details button in client approach
And select template name as "<templatename>" in basic details
And verify the next button is enabled or disbled without selecting templates, return type code
And select return type code as "<returncode>" in basic details
And click on choose paragraph icon in basic details 
And select the wizard options as "<questionoption>" in choose paragraph screen

And verify the finance questions option is select as yes by default
And click on Submit button in basic details

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu         |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo   			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Attachments   |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To verify that the finance charges paragraph are selected yes option by default [letter dashboard ]
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button 
And Validate the status dropdown
When select the "<status>" from the status dropdown in dashboard screen
And click the search button
And click on Action icon in dashboard screen
And click on "<actionmenu>" option from action menu
And select the wizard options as "<questionoption>" in choose paragraph screen
And verify the finance questions option is select as yes by default

Then close the browser

Examples:	
|username											 |password              |partnername     	    |status      		                |templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu          |popuptitle         |clientName/Id             |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  |With Admin For Review 			    |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Choose Paragraphs   |Upload Attachments |Brooke Rosenthal (192442) |


