Feature: To validate the phase 2 features in the application.

Background:
Given User launch the application in chrome browser 
And Maximize the window 

Scenario Outline: To validate the special user can able to edit all the blocks
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
When click on Bulk letter generation button 
And enter the draft status in status field in batch dashboard screen
And click on Edit button bulk letter generation screen
And click on ok button in warning popup if warning popup is displaying
And select the letter by clicking the checkbox
And click on Edit paragraph button






#And click on ok button in warning popup if warning popup is displaying
#And select the letter by clicking the checkbox
#And click on Edit paragraph button
#And select the mutiple letter by clicking the checkbox
#And click on Edit paragraph button
#And select editable block 
#And edit the fee block as "<edittext>" and click on update button
#And verify the success popup content after update the fee block and click ok button 

#And close the browser

Examples:	
|username											  |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|senthilkumar.b@changepond.com  |Hum@03882   				   | Adelizzi, Paul D. 					  |Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |
