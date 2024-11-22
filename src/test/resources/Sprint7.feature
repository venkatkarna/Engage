Feature: To validate the phase2 functionalities of the Engage application

Background:
Given User launch the application in chrome browser 
And Maximize the window 

Scenario Outline: To validate the send signing reminder in dashboard screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Search or filter button
And Validate the status dropdown
And enter the status as "<status>"
And select the status as "<status>" 
And click the search button
And click on action icon
And click on "<actionmenu>" option from action menu 
And verify the title of the send signing reminder popup screen
And click on yes button in the send singing reminder popup
Then close the browser

Examples:	
|username											 |password              |partnername     	   |status    		           |actionmenu                  |templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo |With Client For E-Signing|Send Signing Reminder			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mike	   |

Scenario Outline: To verify the success toast after sending the send signing reminder
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Search or filter button
And Validate the status dropdown
And enter the status as "<status>"
And select the status as "<status>" 
And click the search button
And click on action icon
And click on "<actionmenu>" option from action menu 
And verify the title of the send signing reminder popup screen
And click on yes button in the send singing reminder popup
And verify the success toast after send signing reminder
Then close the browser

Examples:	
|username											 |password              |partnername     	   |status    		           |actionmenu                  |templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo |With Client For E-Signing|Send Signing Reminder			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mike	   |

Scenario Outline: To validate the no button in send singning popup screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Search or filter button
And Validate the status dropdown
And enter the status as "<status>"
And select the status as "<status>" 
And click the search button
And click on action icon
And click on "<actionmenu>" option from action menu 
And verify the title of the send signing reminder popup screen
And click on no button in the send singing reminder popup
Then close the browser

Examples:	
|username											 |password              |partnername     	   |status    		           |actionmenu                  |templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo |With Client For E-Signing|Send Signing Reminder			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mike	   |

Scenario Outline: To validate the resend button is available after cancelling the signing process
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
When click on Search or filter button
And Validate the status dropdown
And enter the status as "<status>"
And select the status as "<status>" 
And click the search button
And click on action icon
And click on "<actionmenu>" option from action menu 
And click on yes button in confirm cancel popup
And click on ok button in cancel success toast
And click on action icon
And click on "<actionmenu2>" option from action menu 
And verify user can able to land on resend popup 
Then close the browser

Examples:	
|username											 |password              |partnername     	   |status    		               |actionmenu    |actionmenu2              |templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo |With Client For E-Signing    |Cancel Signing|Resend			              |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mike	   |

Scenario Outline: To validate the child fee value is showing in edit fields for individual templates
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
And verify child fee field is showing in edit fields 
And enter the "<childfee>" in child fee field 
And click on add button for adding child client name and id

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption         |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|childfee|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Individual Tax Eng Letter             			 |1040  	 	 |Fixed Fee Language		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mikeal	   |1001   |10      |

Scenario Outline: To validate the error toast is showing when user give same child id  
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
And verify child fee field is showing in edit fields 
And enter the "<childfee>" in child fee field 
And click on add button for adding child client name and id
And enter the "<childid>" in child client id field
And enter the "<childname2>" in child client name field 
And verify child fee field is showing in edit fields 
And enter the "<childfee>" in child fee field 
And click on add button for adding child client name and id
And verify error toast is showing when user enter same child id

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption         |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|childfee|childname2|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Individual Tax Eng Letter             			 |1040  	 	 |Fixed Fee Language		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Richard	   |1001   |10      |Mikeal    |

Scenario Outline: To validate the error toast is showing when user give same child name 
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
And verify child fee field is showing in edit fields 
And enter the "<childfee>" in child fee field 
And click on add button for adding child client name and id
And enter the "<childid2>" in child client id field
And enter the "<childname2>" in child client name field 
And verify child fee field is showing in edit fields 
And enter the "<childfee>" in child fee field 
And click on add button for adding child client name and id
And verify error toast is showing when user enter same child name

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption         |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|childfee|childname2|childid2|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Individual Tax Eng Letter             			 |1040  	 	 |Fixed Fee Language		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Richard	   |1001   |10      |Richard    |1002 |

Scenario Outline: To validate that child fee should not show when user select standard language option is selected
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
And verify child fee field is showing in edit fields for standard language option is selected

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption         |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|childfee|childname2|childid2|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Individual Tax Eng Letter             			 |1040  	 	 |Standard Language		   |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Richard	   |1001   |10      |Richard    |1002 |

Scenario Outline: To validate that the user can able to add childs after cancelling the letter in dashboard screen
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
And verify the success popup after edit the question options in choose paragraph popup in dashboard screen and click on ok button
And click on Action icon in dashboard screen
And click on "<actionmenu2>" option from action menu
And verify child fee field is showing in edit fields 

Then close the browser

Examples:	
|username											 |password              |partnername     	    |status      		                |templatename         |actionmenu2    |returncode |questionoption         |secondquestionoption|edittext																			|thirdquestion |actionmenu          |popuptitle         |clientName/Id           |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  |With Admin For Review 			    |Trust Tax Eng Letter |Edit fields    |1041  	 	  |Fixed Fee Language     |No									|Testing user can able to edit the fee block  |No     			 |Choose Paragraphs   |Upload Attachments |Brooke Rosenthal (192442) |

Scenario Outline: To validate that user can able to select clients radio button in bulk letter generation screen
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
And select can able to select certain clients radio button in bulk letter generation screen
And click clientname/id dropdown 
And user can able to select "<clientName/Id>" from the dropdown
And user close the clientname dropdown
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
#Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname|clientName/Id                       |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Moskovkina, Maria 			      |Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mike	   |Mark & Jen CitrinEngage (999999007) |

Scenario Outline: To validate the user can able to select yes or no radio button for child 7216 in edit fields screen
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
And enter "<clientid>" in search coloumn values in bulk letter generation screen
And click on action icon
And click on "<actionmenu>" option from action menu 
And enter the "<childid>" in child client id field
And enter the "<childname>" in child client name field 
And verify child fee field is showing in edit fields 
And enter the "<childfee>" in child fee field 
And click on add button for adding child client name and id
And verify the yes or no 7216 form button is showing after adding child in edit fields screen
And verify yes radio button in child 7216 form is selected by default in edit fields screen
And user can able to select yes or no radio button in 7216 form in edit fields screen 

#Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption         |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|childfee|clientid|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Moskovkina, Maria  			    |Individual Tax Eng Letter             			 |1040  	 	 |Fixed Fee Language		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mikeal	   |1001   |10      |999999010|

Scenario Outline: To verify the template name field is showing in edit field screen
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
And enter "<clientid>" in search coloumn values in bulk letter generation screen
And click on action icon
And click on "<actionmenu>" option from action menu 
And verify template name field is showing in edit fields screen
Then close the browser 


Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption         |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|childfee|clientid|
|manikandan.ra@changepond.com  |Foz98112cp123   				|Moskovkina, Maria  			    |Individual Tax Eng Letter             			 |1040  	 	 |Fixed Fee Language		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mikeal	   |1001   |10      |999999010|

@start
Scenario Outline: To verify the template name field is disabled or not
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
And enter "<clientid>" in search coloumn values in bulk letter generation screen
And click on action icon
And click on "<actionmenu>" option from action menu 
And verify template name field is disbaled or not
Then close the browser 


Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption         |secondquestionoption|edittext																			|thirdquestion |taxyear|actionmenu         |childname  |childid|childfee|clientid|
|manikandan.ra@changepond.com  |Foz98112cp123   				|Moskovkina, Maria  			    |Individual Tax Eng Letter             			 |1040  	 |Fixed Fee Language		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |Edit Fields        |Mikeal	   |1001   |10      |999999010|