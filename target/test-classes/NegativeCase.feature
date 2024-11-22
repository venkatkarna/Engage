Feature: To validate the login functionality of the Engage application
Background:
Given User launch the application in chrome browser 
And Maximize the window 

Scenario Outline: Validate the login functionality with Invalid username 
When user enter "<username>" and click on Next button
And verify the invalid error toast for invalid username
#And user enter "<password>" and click on Sign in button
#And click on No button in stay in page
#Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And close the browser

Examples:
|username											 										|
|harivignesh.s@changepond.comDuSopriHi25@2024CPT  |

Scenario Outline: Validate the login functionality with Invalid password  
When user enter "<username>" and click on Next button 
And user enter "<password>" and click on Sign in button
And verify the invalid error toast for invalid password
#And click on No button in stay in page
#Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And close the browser

Examples:
|username											 |password                   |
|harivignesh.s@changepond.com  |DuSopriHi25      					 |

Scenario Outline: Validate the Search or filter warning popup when user selected invalid combination
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Search or filter button
And click the engagement letter ID dropdown
And select the value in ID dropdown
And Validate the engagement letter Name dropdown
And select the value in letter name dropdown
And Validate the office dropdown
And select the value in office dropdown 
And click the search button
And verify the search or filter combination warning popup 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp   					|

Scenario Outline: Validate the Load client button is disbaled by default
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And verify the load client details button is disbale by default
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp   					|

Scenario Outline: Validate the  Remove client button is disbaled by default
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And verify the load client details button is disbale by default
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on Load client details button
#And click on ok button in warning popup
And verify the remove button is disabled by default
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp   					|

Scenario Outline: Validate the error popup when user try to add new client with exsisting client ID
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
#And verify the load client details button is disbale by default
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on Load client details button
#And click on ok button in warning popup
#And verify the remove button is disabled by default
And click on Add client button
And enter exsisting client id in add client screen 
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
And add client entities 
And select the partner name in add client screen 
And select no radio button in E signing 
And select the return type code
And click on add button in add client screen
And verify the error popup when user entered the exsisting client id in add new client screen and click ok button
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp   					|

Scenario Outline: Validate the Invalid email label when user enter invalid email address
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
#And verify the load client details button is disbale by default
And select single partner pic as "Avnet, Erin"
And select template name as "Trust Tax Eng Letter"
And select return type code as "1041"
And click on Load client details button
#And click on ok button in warning popup
#And verify the remove button is disabled by default
And click on Add client button
And enter invalid signatory email id in add client screen 
And close the browser
 
Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp   					|
@start
Scenario Outline: Validate the error popup when user upload the invalid file format in edit attachment screen
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
And click on add button in attachment warning popup for invalid file upload
#And select the invalid file and click on open button
And verify the error popup when user try to upload invalid file format
And close the browser 
 
Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp   					|

Scenario Outline: Validate the error popup when user try to update the Edit fields without providing the mandatory fields
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
And clear the zip value
And clear the state value
And clear the city value
And clear the address value 
And click on update button in edit fields screen
And verify the warning popup without providing the mandatory fields
 
Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp   					|

Scenario Outline: Validate the error popup when user giving same emaid id in both signatory and spouse email id fields
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic as "Avnet, Erin"
And select template name as "Individual Tax Eng Letter"
#And select double signature template name 
And select return type code as "1041"
And click on Load client details button
#And click on ok button in warning popup
And click on Add client button
And enter client id in add client screen 
And enter signatory email id in add client screen 
And enter spouse email id in add client screen
#And enter fees
And enter ZIP values as "10046"
And enter state as "NY" in add client screen
And enter city as "New York" in add client screen
And enter address as "11, White town" 
And enter signatory title as "Signature"
And enter signatory last name as "Kennedy"
And enter signatory first name as "John"
And enter spouse first name as "Lilly"
And enter spouse last name as "Williamson"
And enter client name as "John Mathews" in add client screen
And add client entities 
And select the partner name in add client screen 
And select no radio button in E signing 
And select the return type code
And click on add button in add client screen
And verify the Error popup when user provide same email

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp   					|

Scenario Outline: Validate the template name dropdown is disbaled after save draft the batch
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
And click on Down arrow button in basic details
And verify the template dropdown 
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
And click on Edit button bulk letter generation screen
#And click on close icon in warning popup
And click on Down arrow button in basic details
And verify the template dropdown
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp   					|