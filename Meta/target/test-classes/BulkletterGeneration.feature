Feature: To validate the Bulk letter generation


Background:
Given User launch the application in chrome browser 
And Maximize the window 



Scenario Outline: Validate the Bulk letter generation - Save Draft
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic 
And select template name
And select return type code 
And click on Load client details button
#And click on ok button in warning popup [ if required later we can enable this ]
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 

Examples:
|username											 |password              |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT   |




Scenario Outline: Validate the Bulk letter generation - Edit fields 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic 
And select template name
And select return type code  
And click on Load client details button
#And click on ok button in warning popup
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
And click on Edit button bulk letter generation screen
#And click on close icon in warning popup
And click on action icon 
And click on edit fields button 
And enter ZIP values 
And enter address 
And enter signatory title
And enter signatory last name 
And enter signatory first name 
And click on update button in edit fields screen
And click on ok button in edit updated success popup

Examples:
|username											 |password              |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT   |



Scenario Outline: Validate the Bulk letter generation - Preview letter 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic 
And select template name 
And select return type code 
And click on Load client details button
#And click on ok button in warning popup
#And click on action icon 
#And click on edit fields button 
#And enter ZIP values 
#And enter address 
#And enter signatory title
#And enter signatory last name 
#And enter signatory first name 
#And click on update button in edit fields screen
#And click on ok button in edit updated success popup
And click on action icon 
And click on preview button from action
And click on close button in preview screen


Examples:
|username											 |password              |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT   |




Scenario Outline: Validate the Bulk letter generation - Add client  
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic 
And select template name 
And select return type code 
And click on Load client details button
#And click on ok button in warning popup
And click on Add client button
And enter client id in add client screen 
And enter signatory email id in add client screen 
And enter ZIP values
And enter state in add client screen
And enter city in add client screen
And enter address 
And enter signatory title 
And enter signatory last name 
And enter signatory first name 
And enter client name in add client screen
And add client entities 
And select the partner name in add client screen 
And select no radio button in E signing 
And select the return type code
And click on add button in add client screen
And click on Ok button in new client added successfully popup



Examples:
|username											 |password              |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT   |



Scenario Outline: Validate the Bulk letter generation - Edit attachments  
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic 
And select template name 
And select return type code 
And click on Load client details button
#And click on ok button in warning popup
And click on edit attachments button
And click on add button in attachment warning popup
And select the pdf file and click on open button
And click on preview button in edit attachment screen 
And click on submit button
And click on Ok button in success popup
 
 
 
#Need to check the remove button in add attachment. 

Examples:
|username											 |password              |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT   |



Scenario Outline: Validate the Bulk letter generation - Create letter 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic 
And select template name 
And select return type code 
And click on Load client details button
#And click on ok button in warning popup
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
And click on Edit button bulk letter generation screen
#And click on close icon in warning popup
And click on action icon 
And click on edit fields button 
And enter ZIP values 
And enter address 
And enter signatory title
And enter signatory last name 
And enter signatory first name 
And click on update button in edit fields screen
And click on ok button in edit updated success popup
And click on create bulk letter button
And click on ok button in create letter success warning popup
 

Examples:
|username											 |password              |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT   |



Scenario Outline: Validate the Bulk letter generation - Edit Partner
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic 
And select template name 
And select return type code 
And click on Load client details button
#And click on ok button in warning popup
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
And click on Edit button bulk letter generation screen
#And click on close icon in warning popup
And click on Down arrow button in basic details 
And remove the exisiting partner
And click on partner PIC dropdown 
And select the new partner 
And click on Load client details button
#And verify the partner name  


Examples:
|username											 |password              |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT   |



Scenario Outline: Validate the Bulk letter generation - Info
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic 
And select template name 
And select return type code 
And click on Load client details button
#And click on ok button in warning popup
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
And click on info button 

Examples:
|username											 |password              |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT   |





Scenario Outline: Validate the Bulk letter generation - List action
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic 
And select template name 
And select return type code 
And click on Load client details button
#And click on ok button in warning popup
And click on Save as draft button
And click on Yes button in save draft confirmation popup
And click on Ok button in save draft success popup 
And click on Edit button bulk letter generation screen
#And click on close icon in warning popup 
And click on action icon
And verify the list of actions 


Examples:
|username											 |password              |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT   |




Scenario Outline: Validate the Bulk letter generation - Remove clients 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And click on Create bulk letters in batch button 
And select single partner pic 
And select template name 
And select return type code 
And click on Load client details button
And click on checkbox in list of bulk letters
And click on remove client button  
And click on yes button in conformation popup for removing client 
And click on ok button in success warning popup for removing client


Examples:
|username											 |password              |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT   |

