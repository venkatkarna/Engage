Feature: To validate the phase 2 features in the application.

Background:
Given User launch the application in chrome browser 
And Maximize the window 
@start
Scenario Outline: To validate the pdf content after adding the add client
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
And click on Add client button
And enter "<clientid>" in add client screen 
And enter "<signatoryemailid>" in add client screen 
And enter "<zipvalues>" in add client screen
And enter "<state>" in add client screen
And enter "<city>" in add client screen
And enter "<address>" in add client screen
#And enter signatory title as "Signature"
And enter "<signatorylastname>" in add client screen
And enter "<signatoryfirstname>" in add client screen
And enter "<clientname>" in add client screen
And add client entities 
#And click on X button in child entities 
And select the partner name in add client screen 
And select no radio button in E signing 
And select the return type code
And click on add button in add client screen
And click on Ok button in new client added successfully popup

Then close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |taxyear|clientid|signatoryemailid |zipvalues|state|city     |address         |signatorylastname|signatoryfirstname  |clientname   |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Fernandez, Wilfredo  			  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |2021   |10001   |test123@gmail.com|10046    |NY   |New York |11, White town  |Kennedy          |John                |John Mathews |