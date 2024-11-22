Feature: To validate the Bulk letter generation

Background:
Given User launch the application in chrome browser 
And Maximize the window 

Scenario Outline: Validate the Bulk letter generation - Save Draft [ Without Fee ]
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
And click on Load client details button
#And click on ok button in warning popup 
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
Then close the browser

Examples:
|username											 |password              |partnername     	|templatename                      |returncode |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Simon, Tonia			|990 Tax Eng Letter                |990			 	 |
|manikandan.ra@changepond.com  |Foz98112cp1 					|Auclair, David   |709 Eng Letter                    |709    		 |
|manikandan.ra@changepond.com  |Foz98112cp1 				  |Grimaldi, Jim R. |709 Single Eng Letter						 |709        |

Scenario Outline: Validate the Bulk letter generation - Save Draft [ With Fee Template ]
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
And click on Load client details button
And click on ok button in warning popup 
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
Then close the browser

Examples:
|username											 |password              |partnername     					|templatename                         							 |returncode  |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin							|BAS Eng Letter With Fee           								   |1065  		  |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Allen, Seth							|Trust Tax Eng Letter with fee     							 	 	 |1041			  |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Sophos, Constantine			|709 Single Eng Letter with fee     								 |709			    |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Dubin, Brett A.			    |SEC Client Rule Individual Tax Eng Letter with fee  |1040			  |


Scenario Outline: Validate the Bulk letter generation - Save Draft [ Without Fee + No 5% Template ]
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
And click on Load client details button
And click on ok button in warning popup 
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
Then close the browser

Examples:
|username											 |password              |partnername     					|templatename                         |returncode |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin							|SEC Business EL No 5%       					|1065  		  |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Allen, Seth							|Trust EL No 5%  								      |1041			  |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Sophos, Constantine			|SEC Individual EL No 5%              |1040			  |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Fernandez, Wilfredo			|Single Individual EL No 5%           |1040			  |

Scenario Outline: Validate the Bulk letter generation - Save Draft [ With Fee + No 5% Template ]
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
And click on Load client details button
And click on ok button in warning popup 
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
Then close the browser

Examples:
|username											 |password              |partnername     					|templatename                         |returncode |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Avnet, Erin							|Trust Tax Eng Letter With Fee        |1041  		  |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Allen, Seth							|Individual Fixed Fee EL No 5%        |1040			  |
|manikandan.ra@changepond.com  |Foz98112cp1   				|Sophos, Constantine			|SEC Individual Fixed Fee EL No 5%    |1040			  |

Scenario Outline: Validate the Bulk letter generation - Validate the error popup is showing when selected combination does not have clients 
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
And click on Load client details button
#And click on ok button in warning popup 
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
Then close the browser

Examples:
|username											 |password              |partnername     	|templatename                      |returncode |
|manikandan.ra@changepond.com  |Foz98112cp1 					|Bonney, Matthew J|709 Eng Letter                    |709    		 |


@start
Scenario Outline: Validate the Bulk letter generation - Edit fields & Preview
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
And click on Load client details button
#And click on ok button in warning popup
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And verify the content of the save draft success popup 
And click on Ok button in save draft success popup 
And click on Edit button bulk letter generation screen
#And click on close icon in warning popup
And click on action icon 
And click on edit fields button 
And enter ZIP values as "10046"
And enter address as "11, White town" 
And enter signatory title as "Signature"
And enter signatory last name as "Kennedy"
And enter signatory first name as "John"
And click on update button in edit fields screen
#And verify the content of the success popup
And verify the content of the edit success popup and click on ok button in bulk letter generation
And click on action icon 
And click on preview button from action
And click on close button in preview screen
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Add client  
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on Load client details button
#And click on ok button in warning popup
And click on Add client button
And enter client id in add client screen 
And enter signatory email id in add client screen 
#And enter fees as "100"
And enter ZIP values as "10046"
And enter state as "NY" in add client screen
And enter city as "New York" in add client screen
And enter address as "11, White town" 
And enter signatory title as "Signature"
And enter signatory last name as "Kennedy"
And enter signatory first name as "John"
And enter client name as "John Mathews" in add client screen
And add client entities 
#And click on X button in child entities 
And select the partner name in add client screen 
And select no radio button in E signing 
And select the return type code
And click on add button in add client screen
And click on Ok button in new client added successfully popup
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Edit attachments  
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
And click on Load client details button
#And click on ok button in warning popup
And click on edit attachments button
And click on add button in attachment warning popup
#And select the pdf file and click on open button
And click on preview button in edit attachment screen 
And click on submit button
And click on Ok button in success popup
Then close the browser 

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Remove attachments after selected the attachment  
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
And click on Load client details button
#And click on ok button in warning popup
And click on edit attachments button
And click on add button in attachment warning popup
#And select the pdf file and click on open button
#And click on preview button in edit attachment screen
And click on remove button in edit attachment screen 
And click on submit button
And click on Ok button in success popup
Then close the browser 

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Edit Partner
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
And click on Load client details button
#And click on ok button in warning popup
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
And click on Edit button bulk letter generation screen
#And click on close icon in warning popup
And click on Down arrow button in basic details 
And remove the exisiting partner
And select single partner pic as "Ahn, Joe"
#And select the new partner as "Ahn, Joe"
And click on Load client details button after selecting new partner 
#And click on ok button in warning popup
And verify the partner name as "Ahn, Joe"
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Info
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
And click on Load client details button
#And click on ok button in warning popup
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
And click on info button 
And list the info popup
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - List action
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
And click on Load client details button
#And click on ok button in warning popup
#And click on Save as draft button
#And click on Yes button in save draft confirmation popup
#And click on Ok button in save draft success popup 
#And click on Edit button bulk letter generation screen
#And click on close icon in warning popup 
And click on action icon
And verify the list of actions 
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Remove clients 
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
And click on Load client details button
#And click on ok button in warning popup
And click on checkbox in list of bulk letters
And click on remove client button  
And click on yes button in conformation popup for removing client 
And click on ok button in success warning popup for removing client
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Create bulk letters 
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
And click on Load client details button
#And click on ok button in warning popup
And click on all bulk letter checkbox in bulk letter generation screen
And click on checkbox in list of bulk letters
And click on remove client button  
And click on yes button in conformation popup for removing client 
And click on ok button in success warning popup for removing client
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
And click on Edit button bulk letter generation screen
#And click on close icon in warning popup
And click on action icon 
And click on edit fields button 
#And enter fees
#And enter ZIP values 
#And enter address 
#And enter signatory title
#And enter signatory last name 
#And enter signatory first name 
And click on update button in edit fields screen
And click on ok button in edit updated success popup
And click on create bulk letter button
#And click on ok button in create letter success warning popup
And click yes button in create conformation popup 
And click ok button on create success popup
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - SearchByValues
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
And click on Load client details button
#And click on ok button in warning popup
And click on Search by values coloumn 
And search by client id as "129628"
And search by client name as "Quan Marital Tr. A created under Article"
And search by partner pic as "Avnet, Erin"
And search by office as "Livingston Tax"
And search by return type code as "1041"
And serach by signatory first name as "John"
And search by signatory email as "johnchan@gmail.com"
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - List of view grid in bulk letter generation screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And verify the view grid list in bulk letter generation screen
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Back to dashboard button
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And click on Back to dashboard button 
And click on yes button in back to dashboard conformation popup
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Download the above tabe as excel button
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
And click on Load client details button
#And click on ok button in warning popup
And click on download the above table as excel in bulk letter generation screen
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Verify the Warning popup when user try to delete all the letters in a batch
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
And click on Load client details button
#And click on ok button in warning popup
And click on all bulk letter checkbox in bulk letter generation screen
And click on remove client button  
And click on yes button in conformation popup for removing client 
And verify the warning popup atleast one letter should be in a batch
#And click on ok button in success warning popup for removing client
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Verify the add button after entering more than 200 child entities 
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
And click on Load client details button
#And click on ok button in warning popup
And click on Add client button
And enter client id in add client screen 
And enter signatory email id in add client screen 
#And enter fees
And enter ZIP values as "10046"
And enter state as "NY" in add client screen
And enter city as "New York" in add client screen
And enter address as "11, White town" 
And enter signatory title as "Signature"
And enter signatory last name as "Kennedy"
And enter signatory first name as "John"
And enter client name as "John Mathews" in add client screen
And enter client entities mutilpe times
And verify the add entities button after adding 200 entities
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Verify the warning popup for mandatory fields are not filled when Create bulk letters 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter With Fee"
And select return type code as "1041"
And click on Load client details button
And click on ok button in warning popup
And click on create bulk letter button
And click yes button in create conformation popup 
#And click ok button on create success popup
And verify the warning popup is showing when user create letters when mandatory fields are not provided
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - X remove button validation in partner dropdown & return type code dropdown
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic as "Avnet, Erin"
#And click on remove button in partner dropdown 
#And verify the selected partner is removed from the dropdown
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on remove button in partner dropdown 
And verify the selected partner is removed from the dropdown
And click on remove button in return type dropdown
And verify the selected return type code is removed from the dropdown
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - BatchID, Admin are disabled 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And verify the batch ID is disbaled 
And verify the admin is disbaled 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Template dropdown is readonly after load client details
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
And click on Load client details button
#And click on ok button in warning popup
And click on Down arrow button in bulk letter generation screen
And verify the template dropdown is disbaled after load client button clicked
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Template dropdown is searchable 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic as "Avnet, Erin"
And enter the template name as "Trust Tax" in search template dropdown
And select template name as "Trust Tax Eng Letter" 
And select return type code as "1041"
And click on Load client details button
#And click on ok button in warning popup
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Validate the close button in Edit fields popup screen
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
And click on Load client details button
And click on action icon 
And click on edit fields button 
And click on close icon in edit fields popup screen
#And click on ok button in warning popup
And click on action icon 
And click on edit fields button
And click on close button in edit fields popup screen
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Validate the yes and no checkbox in E signing? in edit field popup screen
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
And click on Load client details button
#And click on ok button in warning popup
And click on action icon 
And click on edit fields button
And click on no checkbox in e signing? in edit field popp screen
And click on yes checkbox in e signing? in edit field popp screen
And click on update button in edit fields screen
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|
@start
Scenario Outline: Validate the Bulk letter generation - Validate the error warning popup when user given alphabetic in fee field
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter With Fee"
And select return type code as "1041"
And click on Load client details button
And click on ok button in warning popup
And click on action icon 
And click on edit fields button 
And enter the alphabet in fee fields
And click on update button in edit fields screen
And verify the warning popup when user enter alphabetic in fee field 
And close the browser


Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Validate the X button in child entities  
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
And click on Load client details button
#And click on ok button in warning popup
And click on action icon 
And click on edit fields button
#And enter fees
#And user enter child entity as "Test Child Entity"
And click on X button in child entities 
And close the browser 

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Validate the error popup is showing when user upload wrong file by clicking the upload bulk letter details button
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
And click on Load client details button
#And click on ok button in warning popup
And verify the error popup is showing when user try to upload the wrong file
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Validating no button & X icon in create letter conformation popup
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
And click on Load client details button
#And click on ok button in warning popup
And click on all bulk letter checkbox in bulk letter generation screen
And click on checkbox in list of bulk letters
And click on remove client button  
And click on yes button in conformation popup for removing client 
And click on ok button in success warning popup for removing client
#And click on Save as draft button
#And click on Yes button in save draft confirmation popup
#And click on Ok button in save draft success popup 
#And click on Edit button bulk letter generation screen
#And click on close icon in warning popup
#And click on action icon 
#And click on edit fields button  
#And click on update button in edit fields screen
#And click on ok button in edit updated success popup
And click on create bulk letter button
And click no button in create conformation popup 
And click on create bulk letter button
And click on X button in conformation warning popup
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|


