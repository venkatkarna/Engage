Feature: To validate the phase 2 features in the application.

Background:
Given User launch the application in chrome browser 
And Maximize the window 


Scenario Outline: To validate the user can able to edit the Fee block by selecting the single client letter 
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
And enter "<clientid>" in search coloumn values in bulk letter generation screen
And select the letter by clicking the checkbox
And click on Edit paragraph button
#And select the mutiple letter by clicking the checkbox
#And click on Edit paragraph button
And select editable block 
And edit the fee block as "<edittext>" and click on update button
And verify the success popup content after update the fee block and click ok button 

And close the browser

Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |clientid |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Moskovkina, Maria      			|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |999999007|
#|manikandan.ra@changepond.com  |Foz98112cp12   				|Moskovkina, Maria						|Trust Tax Eng Letter       					       |1041  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |999999011|
#|manikandan.ra@changepond.com  |Foz98112cp12   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp12   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp12   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp12   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp12   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp12   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp12   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp12   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |


Scenario Outline: To validate the choose paragrah button is disabled by default
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
And verify the choose paragraph is disbaled by default 

And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp12   				|

Scenario Outline: To validate the choose paragrah button is enabled after user selecting the partner, template name and return type code
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
And verify the choose paragraph is disbaled by default 
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code

And close the browser

Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Allen, Seth 									|Trust Tax Eng Letter             					 |1041  	 	 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |

Scenario Outline: To validate the choose paragrah button should disbale after click on load client details button
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
And verify the choose paragraph is disbaled by default 
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And verify the choose paragraph is disbaled by default 
And close the browser

Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Allen, Seth									|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To validate the edit paragraph button should be enable after selecting the single or multiple letter
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
And verify the choose paragraph is disbaled by default 
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And click on ok button in warning popup if warning popup is displaying
And verify the choose paragraph is disbaled by default 
And enter "<clientid>" in search coloumn values in bulk letter generation screen
And select the letter by clicking the checkbox
And verify the edit paragrph button is enable
And click on Edit paragraph button

And close the browser

Examples:
Examples:	
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |clientid |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Moskovkina, Maria      			|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |999999007|
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To validate the user can able to select the wizard options in choose paragraph screen
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
And verify the choose paragraph is disbaled by default 
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button

And close the browser

Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Allen, Seth				 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To validate the edit paragrapgh button is disbaled by default after load client details 
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
And verify the choose paragraph is disbaled by default 
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And verify the edit paragraph button is disabled by default

And close the browser

Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Allen, Seth				 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To validate the load client details button is disbaled if all the question options are selected but user click on close button or close icon in choose paragraph screen
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
And verify the choose paragraph is disbaled by default 
And select single partner pic as "<partnername>"
And select template name as "<templatename>"
And select return type code as "<returncode>"
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on close button in choose paragraph screen
And verify the load client details button is disbaled while selecting wizard responses
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on close icon in choose paragraph screen
And verify the load client details button is disbaled while selecting wizard responses

And close the browser

Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Allen, Seth				 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To validate the load client details button is enabled after user selecting all the wizard options
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
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the load client details button is enabled after click on submit button

And close the browser

Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Allen, Seth				 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To validate the warning popup if user click on submit  button if question options are not selected
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
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen 
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
 

And close the browser

Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Allen, Seth				 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To verify the choose paragraph button is disabled by default after load client details  
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
And verify the choose paragraph is enabled after user selecting partner, template name and return type code
And click on choose paragraph button in bulk letter generation screen
And select the wizard options as "<questionoption>" in choose paragraph screen
And select "<secondquestionoption>" in choose paragraph screen
And select  the question options "<thirdquestion>" in choose paragraph screen
And click on Submit button in chooose paragraph screen
And verify the success popup after submit the question options in choose paragraph screen and click on ok button
And click on Load client details button
And verify the choose paragraph button is disabled by default after load client details 
#And verify the edit paragraph button is disbaled by default 
And close the browser

Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Allen, Seth				 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To validate user can able to select all the letters by clicking checkbox and edit paragraph for all letters 
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
And enter "<clientid>" in search coloumn values in bulk letter generation screen
And select all the letter by clicking the checkbox
And click on Edit paragraph button
#And select the mutiple letter by clicking the checkbox
#And click on Edit paragraph button
And select editable block 
And edit the fee block as "<edittext>" and click on update button
And verify the success popup content after update the fee block and click ok button 

And close the browser


Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |clientid |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Moskovkina, Maria      			|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |999999007|
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To validate user can able to select single letters by clicking checkbox and edit paragraph for that particular letter 
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
And enter "<clientid>" in search coloumn values in bulk letter generation screen
And select the letter by clicking the checkbox
And click on Edit paragraph button
#And select the mutiple letter by clicking the checkbox
#And click on Edit paragraph button
And select editable block 
And edit the fee block as "<edittext>" and click on update button
And verify the success popup content after update the fee block and click ok button 

And close the browser


Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |clientid |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Moskovkina, Maria      			|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |999999007|
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To validate user can able to edit the question options for all the letters by click on checkbox after load client details 
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
And select all the letter by clicking the checkbox
And click on Choose paragraph button
#And select the mutiple letter by clicking the checkbox
#And click on Edit paragraph button
And select the wizard option as "<changequestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen after load client details
And verify the success popup after submit the question options in choose paragraph screen and click on ok button after load client details
And enter "<clientid>" in search coloumn values in bulk letter generation screen
And select all the letter by clicking the checkbox
And click on Edit paragraph button
And select editable block 
And edit the fee block as "<edittext>" and click on update button
And verify the success popup content after update the fee block and click ok button 

And close the browser

Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |clientid |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Moskovkina, Maria      			|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |999999007|
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To validate user can able to edit the question options for single letters by click on checkbox after load client details
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
And enter "<clientid>" in search coloumn values in bulk letter generation screen
And select the letter by clicking the checkbox
And click on Choose paragraph button
And select the wizard option as "<changequestionoption>" in choose paragraph screen
And select the wizard option as "<changesecondquestionoption>" in choose paragraph screen
And select the wizard option as "<changethirdquestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen after load client details
And verify the success popup after submit the question options in choose paragraph screen and click on ok button after load client details
#And select the mutiple letter by clicking the checkbox
#And click on Edit paragraph button

And close the browser

Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |clientid |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Moskovkina, Maria      			|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |999999007|
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |
@update
Scenario Outline: To validate the warning popup when user try to edit the question options for multiple letters with different template content 
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
And click on Edit paragraph button
And select editable block 
And edit the fee block as "<edittext>" and click on update button
And verify the success popup content after update the fee block and click ok button 
And click on submit button in edit paragraph screen
And verify the success popup content after edited the paragraph and click on ok button
And select all the letter by clicking the checkbox
And click on Choose paragraph button
#And select the mutiple letter by clicking the checkbox
#And click on Edit paragraph button
And verify the warning popup when user try to edit the question options for mutliple letters with different template  

And close the browser

Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Allen, Seth				 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |
@update
Scenario Outline: To validate the warning popup when user try to edit the fee block for multiple letters with different template content 
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
And click on Edit paragraph button
And select editable block 
And edit the fee block as "<edittext>" and click on update button
And verify the success popup content after update the fee block and click ok button 
And click on submit button in edit paragraph screen
And verify the success popup content after edited the paragraph and click on ok button
And select all the letter by clicking the checkbox
And click on Edit paragraph button
#And select the mutiple letter by clicking the checkbox
#And click on Edit paragraph button
And verify the warning popup when user try to edit the fee block for multiple letters with multiple letters with different template  

And close the browser

Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Allen, Seth				 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To validate that user can able to edit question options for specific letter by Choose paragraph button under action menu
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
And enter "<clientid>" in search coloumn values in bulk letter generation screen
And click on action icon
And click on "<actionmenu>" option from action menu
And select the wizard option as "<changequestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen after load client details
And verify the success popup after submit the question options in choose paragraph screen and click on ok button after load client details

And close the browser

Examples: 
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |clientid |actionmenu			  |changequestionoption|
|manikandan.ra@changepond.com  |Foz98112cp12   				|Moskovkina, Maria      			|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |999999007|Choose Paragraphs |No                  |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To verify the warning popup when user try to preview the letter without field value after changing the question options for specific letter
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
And enter "<clientid>" in search coloumn values in bulk letter generation screen
And click on action icon
And click on "<actionmenu>" option from action menu
And select the wizard option as "<changequestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen after load client details
And verify the success popup after submit the question options in choose paragraph screen and click on ok button after load client details
And click on action icon
And click on preview button from action
#And verify the warning popup for field value is empty and click on ok button
And close the browser

Examples: 
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |clientid |actionmenu       |changequestionoption |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Moskovkina, Maria      			|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |999999007|Choose Paragraphs|No                   |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |
@update
Scenario Outline: To verify the warning popup when user try to preview the letter without field value after changing the question options for all the letter
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
And select all the letter by clicking the checkbox
And click on Choose paragraph button
And select the wizard option as "<changequestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen after load client details
And verify the success popup after submit the question options in choose paragraph screen and click on ok button after load client details
And enter "<clientid>" in search coloumn values in bulk letter generation screen
And click on action icon
And click on preview button from action
And verify the warning popup for field value is empty and click on ok button
And close the browser

Examples: 
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |clientid |changequestionoption|
|manikandan.ra@changepond.com  |Foz98112cp12   				| Allen, Seth				 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |888800163|Yes |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To validate that user can able to edit the fee block for specific letter by edit paragraph button under action menu
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
And enter "<clientid>" in search coloumn values in bulk letter generation screen
And click on action icon
And click on "<actionmenu>" option from action menu
And select editable block 
And edit the fee block as "<edittext>" and click on update button
And verify the success popup content after edited the paragraph and click on ok button  

And close the browser

Examples: 
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |clientid |actionmenu       |
|manikandan.ra@changepond.com  |Foz98112cp12   				|Moskovkina, Maria      			|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |999999007|Edit Paragraphs  |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To verify that system is showing the warning toast when user try to click on update button with empty content in ck editor
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
And click on action icon
And click on "<actionmenu>" option from action menu
And select editable block 
And select and clear the text in fee block and click on update button
And verify the warning toast message when user submit the empty block  

And close the browser

Examples: 
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |actionmenu     |
|manikandan.ra@changepond.com  |Foz98112cp12   				| Allen, Seth				 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |Edit Paragraphs|
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Allen, Seth 								|Individual Tax Eng Letter        					 |1040  		 |Fixed Fee Language 									     				 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Ahn, Joe   									|SEC Client Rule Business Tax Eng Letter     |1065  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Arnold, Andrea  						|BAS Eng Letter                              |1065  		 |Fixed Fee Language 		 													 |Yes									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brennan, Christopher 				|Single Individual Tax Eng Letter            |1040  		 |Standard Language 		 													 |No									|Testing the fee block edit  									|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Brown, Peter T. T.  				|SEC Client Rule Individual Tax Eng Letter   |1040  		 |Open paragraph to enter the details manually 		 |Yes									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Barrett, Popi  						  |709 Single Eng Letter                       |709  		 	 |Fixed Fee Language 		 													 |No									|User able to edit the fee block   						|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Bagoff, Gary N.  						|709 Eng Letter                              |709   		 |Standard Language  		 												   |No									|Testing the fee block edit  									|No     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Carlen, Ronald  						|990 Tax Eng Letter                          |990   		 |Fixed Fee Language 		 													 |Yes									|Testing user can able to edit the fee block	|Yes     			 |
#|manikandan.ra@changepond.com  |Foz98112cp1   				| Daly, Patrick  						  |Business Tax Eng Letter                     |1065  		 |Open paragraph to enter the details manually  	 |No									|Testing the fee block edit  									|No     			 |

Scenario Outline: To validate the create bulk letters in batch button is disbaled for partner users 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Bulk letter generation button 
And verify the Create bulk letters in batch button will be disabled for partner role users 

And close the browser

Examples:
|username											 |password              |partnername     	|templatename                      |returncode |questionoption                   	  	 |secondquestionoption|edittext																			|
|gopi.m@changepond.com   			 |Mot9491011  					|Avnet, Erin			|Trust Tax Eng Letter              |1041  		 |Exclude fee and exclude admin charges  |Yes									|Testing user can able to edit the fee block  |

Scenario Outline: To validate the success popup after paragraphs are arranged correctly 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
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
And click on Choose paragraph button
And select the wizard option as "<changequestionoption>" in choose paragraph screen
And click on Submit button in chooose paragraph screen after load client details
And verify the success popup after submit the question options in choose paragraph screen and click on ok button after load client details
And close the browser 

Examples:
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |clientid |changequestionoption|
|manikandan.ra@changepond.com  |Foz98112cp12   				| Allen, Seth				 					|Trust Tax Eng Letter             					 |1041  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |888800163|Yes |

Scenario Outline: To validate the warning popup is showing when user try to edit paragraph for Admin role users 
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
And verify warning popup is showing when user try to edit non free to edit paragraph  
Then close the browser

Examples: 
|username											 |password              |partnername     	        		|templatename                     					 |returncode |questionoption                   	       		  	 |secondquestionoption|edittext																			|thirdquestion |clientid |actionmenu       |
|vignesh.k@changepond.com      |Vik@2024   				    |Moskovkina, Maria      			|Individual Tax Eng Letter             			 |1040  	 	 |Open paragraph to enter the details manually		 |No									|Testing user can able to edit the fee block  |No     			 |999999007|Edit Paragraphs  |


