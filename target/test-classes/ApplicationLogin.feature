Feature: To validate the login functionality of the Engage application

Background:
Given User launch the application in chrome browser 
And Maximize the window 

Scenario Outline: Validate the login functionality with valid users 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on profile icon
And click on yes button in conformation popup
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the My letter Search or filter searchbox in dashboard screen
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
#And click on All letters button in dashboard screen 
And click on Search or filter button
And click the engagement letter ID dropdown
And enter the value as "2483" in ID dropdown
And select the letterID as "2483"
And click the search button
And validate the letter ID as "2483"
And click on clear button

And Validate the engagement letter Name dropdown
And enter the value in letter name as "2023 Robert B Williamson Trust Trust Tax Eng Letter" dropdown
And select the engagement letter name as "2023 Robert B Williamson Trust Trust Tax Eng Letter"
And click the search button
And validate the letter name as "2023 Robert B Williamson Trust Trust Tax Eng Letter"
And click on clear button

And Validate the office dropdown
And enter the value as "Livingston Tax" in office dropdown
And select the office as "Livingston Tax"
And click the search button
And validate the office as "Livingston Tax"
And click on clear button

And Validate the tax year dropdown
And enter the value tax year as "2023"
And select the tax year as "2023" in dropdown
And click the search button
And validate the tax year as "2023" 
And click on clear button

And Validate the template name dropdown
And enter the value in template name as "Trust Tax Eng Letter"
And select the template name as "Trust Tax Eng Letter"
And click the search button
And validate the template name as "Trust Tax Eng Letter"
And click on clear button

And Validate the client ID/name dropdown
And enter the client ID/name as "227752 - Robert B Williamson Trust"
And select the client ID/name as "227752 - Robert B Williamson Trust"
And click the search button
And validate the client ID/name as "227752 - Robert B Williamson Trust"
And click on clear button

And Validate the partner PIC dropdown 
And enter the partner PIC as "Allen, Seth"
And select the partner PIC as "Allen, Seth"
And click the search button
And validate the partner PIC as "Allen, Seth"
And click on clear button

And Validate the department dropdown
And enter the department as "Tax"
And select the department as "Tax"
And click the search button
#And validate the department - This will not available in the grid, so skipping this step
And click on clear button

And Validate the type dropdown
And enter the type as "Trust"
And select the type as "Trust"
And click the search button
#And validate type - This will not available in the grid, so skipping this step
And click on clear button

And Validate the admin dropdown
And enter the admin as "Senthilkumar"
And select the admin as "Senthilkumar"
And click the search button
And validate the admin as "Senthilkumar"
And click on clear button
 
And Validate the status dropdown
And enter the status as "Completed"
And select the status as "Completed" 
And click the search button
And validate the status as "Completed"
And click on clear button

And Validate the status dropdown
And enter the status as "With Client For E-Signing"
And select the status as "With Client For E-Signing" 
And click the search button
And validate the status as "With Client For E-Signing"
And click on clear button

And Validate the status dropdown
And enter the status as "With Client For Manual Signing"
And select the status as "With Client For Manual Signing" 
And click the search button
And validate the status as "With Client For Manual Signing"
And click on clear button

And Validate the status dropdown
And enter the status as "With Admin for Review"
And select the status as "With Admin for Review" 
And click the search button
And validate the status as "With Admin for Review"
And click on clear button

Then close the browser

Examples:
|username											 |password              |
|senthilkumar.b@changepond.com |Hum@03882  					  |

Scenario Outline: Validate the All letters Search or filter in dashboard screen
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
And click on All letters button in dashboard screen 
And click on Search or filter button

And click the engagement letter ID dropdown
And enter the value as "2483" in ID dropdown
And select the letterID as "2483"
And click the search button
And validate the letter ID as "2483"
And click on clear button

And Validate the engagement letter Name dropdown
And enter the value in letter name as "2023 Robert B Williamson Trust Trust Tax Eng Letter" dropdown
And select the engagement letter name as "2023 Robert B Williamson Trust Trust Tax Eng Letter"
And click the search button
And validate the letter name as "2023 Robert B Williamson Trust Trust Tax Eng Letter"
And click on clear button

And Validate the office dropdown
And enter the value as "Livingston Tax" in office dropdown
And select the office as "Livingston Tax"
And click the search button
And validate the office as "Livingston Tax"
And click on clear button

And Validate the tax year dropdown
And enter the value tax year as "2023"
And select the tax year as "2023" in dropdown
And click the search button
And validate the tax year as "2023" 
And click on clear button

And Validate the template name dropdown
And enter the value in template name as "Trust Tax Eng Letter"
And select the template name as "Trust Tax Eng Letter"
And click the search button
And validate the template name as "Trust Tax Eng Letter"
And click on clear button

And Validate the client ID/name dropdown
And enter the client ID/name as "227752 - Robert B Williamson Trust"
And select the client ID/name as "227752 - Robert B Williamson Trust"
And click the search button
And validate the client ID/name as "227752 - Robert B Williamson Trust"
And click on clear button

And Validate the partner PIC dropdown 
And enter the partner PIC as "Allen, Seth"
And select the partner PIC as "Allen, Seth"
And click the search button
And validate the partner PIC as "Allen, Seth"
And click on clear button

And Validate the department dropdown
And enter the department as "Tax"
And select the department as "Tax"
And click the search button
#And validate the department - This will not available in the grid, so skipping this step
And click on clear button

And Validate the type dropdown
And enter the type as "Trust"
And select the type as "Trust"
And click the search button
#And validate type - This will not available in the grid, so skipping this step
And click on clear button

And Validate the admin dropdown
And enter the admin as "Senthilkumar"
And select the admin as "Senthilkumar"
And click the search button
And validate the admin as "Senthilkumar"
And click on clear button
 
And Validate the status dropdown
And enter the status as "Completed"
And select the status as "Completed" 
And click the search button
And validate the status as "Completed"
And click on clear button

And Validate the status dropdown
And enter the status as "With Client For E-Signing"
And select the status as "With Client For E-Signing" 
And click the search button
And validate the status as "With Client For E-Signing"
And click on clear button

And Validate the status dropdown
And enter the status as "With Client For Manual Signing"
And select the status as "With Client For Manual Signing" 
And click the search button
And validate the status as "With Client For Manual Signing"
And click on clear button

And Validate the status dropdown
And enter the status as "With Admin for Review"
And select the status as "With Admin for Review" 
And click the search button
And validate the status as "With Admin for Review"
And click on clear button

Then close the browser

Examples:
|username											 |password              |
|senthilkumar.b@changepond.com |Hum@03882  					  |

Scenario Outline: Validate the Sorting feature in dashboard screen 
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
And click on sort button in batch id 
#And click on refresh button
And click on sort button in letter id 
#And click on refresh button
And click on sort button in letter name 
#And click on refresh button
And click on sort button in office
#And click on refresh button
And click on sort button in year 
#And click on refresh button
And click on sort button in template name 
#And click on refresh button 
And click on sort button in client name 
#And click on refresh button 
And click on sort button in Partner pic
#And click on refresh button 
And click on sort button in admin 
#And click on refresh button 
And click on sort button in status
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Export above table button in dashboard screen for My letters/ All letters
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
And click on export above table button in my letters tab
And click on export above table button in all letters tab
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Pagination in my letters and all letters in dashboard screen
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And user click on next page in my letters tab
And user click on last page in my letters tab
And user click on next page in all letters tab
And user click on last page in all letters tab 
And user click on previous page in all letters tab
And user click on previous page in my letters tab
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Clear button in search of filter after selecting all the values in my letters or all letters
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button
And click the engagement letter ID dropdown
And enter the value as "2483" in ID dropdown
And select the letterID as "2483"


And Validate the engagement letter Name dropdown
And enter the value in letter name as "2023 Robert B Williamson Trust Trust Tax Eng Letter" dropdown
And select the engagement letter name as "2023 Robert B Williamson Trust Trust Tax Eng Letter"

And Validate the office dropdown
And enter the value as "Livingston Tax" in office dropdown
And select the office as "Livingston Tax"

And Validate the tax year dropdown
And enter the value tax year as "2023"
And select the tax year as "2023" in dropdown

And Validate the template name dropdown
And enter the value in template name as "Trust Tax Eng Letter"
And select the template name as "Trust Tax Eng Letter"

And Validate the client ID/name dropdown
And enter the client ID/name as "123820 - Rajendra Shukla Article IV Marital Trust "
And select the client ID/name as "123820 - Rajendra Shukla Article IV Marital Trust "

And Validate the partner PIC dropdown 
And enter the partner PIC as "Allen, Seth"
And select the partner PIC as "Allen, Seth"

And Validate the department dropdown
And enter the department as "Tax"
And select the department as "Tax"

And Validate the type dropdown
And enter the type as "Trust"
And select the type as "Trust"

And Validate the admin dropdown
And enter the admin as "Senthilkumar"
And select the admin as "Senthilkumar"

And Validate the status dropdown
And enter the status as "Completed"
And select the status as "Completed" 
#And click the search button
#And validate the status as "Completed"
And click on clear button in after all values given

And navigate to all letters tab 
#And click on Search or filter button
And click the engagement letter ID dropdown
And enter the value as "2250" in ID dropdown
And select the letterID as "2250"
And Validate the engagement letter Name dropdown
And enter the value in letter name as "2023 Ahimsa Foundation  Trust Tax Eng Letter" dropdown
And select the engagement letter name as "2023 Ahimsa Foundation Trust Tax Eng Letter"
And Validate the office dropdown
And enter the value as "Providence Tax" in office dropdown
And select the office as "Providence Tax"
And Validate the tax year dropdown
And enter the value tax year as "2023"
And select the tax year as "2023" in dropdown
And Validate the template name dropdown
And enter the value in template name as "Trust Tax Eng Letter"
And select the template name as "Trust Tax Eng Letter"
And Validate the client ID/name dropdown
And enter the client ID/name as "23446 - Kamma Olesen"
And select the client ID/name as "23446 - Kamma Olesen"
And Validate the partner PIC dropdown 
And enter the partner PIC as "Allen, Seth"
And select the partner PIC as "Allen, Seth"
And Validate the department dropdown
And enter the department as "Tax"
And select the department as "Tax"
And Validate the type dropdown
And enter the type as "Trust"
And select the type as "Trust"
And Validate the admin dropdown
And enter the admin as "HariVignesh"
And select the admin as "HariVignesh"
And Validate the status dropdown
And enter the status as "Completed"
And select the status as "Completed" 
#And click the search button
#And validate the status as "Completed"
#And click on clear button

And click on clear button in after all values given
Then close the browser

Examples:
|username											 |password              |
|senthilkumar.b@changepond.com |Hum@03882 					  |

Scenario Outline: Validate the Search textbox feature in Batch dashboard screen 
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on bulk letter generation
And user search the letters by batch ID 
And user search the letters by admin
And user search the letters by Partner 
And user search the  letters by template name 
And user search the letters by no of letters 
And user search the letters by status
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Sort the fields in batch dashboard screen 
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on bulk letter generation
And click on sort button in batch id 
And click on sort button in admin 
And click on sort button in Partner pic 
And click on sort button in template name 
And click on sort button in Noofletters 
And click on sort button in Lastupdated
And click on sort button in status in bulk letter generation screen
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the letter status in dashboard screen
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button
And Validate the status dropdown

And enter the status as "Completed"
And select the status as "Completed" 
And click the search button
And validate the status as "Completed"
And click on clear button

And Validate the status dropdown
And enter the status as "With Client For E-Signing"
And select the status as "With Client For E-Signing" 
And click the search button
And validate the status as "With Client For E-Signing"
And click on clear button

And Validate the status dropdown
And enter the status as "With Client For Manual Signing"
And select the status as "With Client For Manual Signing" 
And click the search button
And validate the status as "With Client For Manual Signing"
And click on clear button

And Validate the status dropdown
And enter the status as "With Admin for Review"
And select the status as "With Admin for Review" 
And click the search button
And validate the status as "With Admin for Review"


#And select the status dropdown
#And click the search button
#And verify the completed status
#And Validate the status dropdown
#And select with client for E signing status
#And click the search button 
#And verify client for E signing status 
#And Validate the status dropdown
#And select with client for manual signing status 
#And click the search button 
#And verify client for manual signing status
#And Validate the status dropdown 
#And select with admin for review status
#And click the search button  
#And verify with admin for review status 
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the letter action in dashboard screen
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button
And Validate the status dropdown
#aAnd select the status dropdown
And enter the status as "Completed"
And select the status as "Completed" 
And click the search button
And click on Action icon in dashboard screen
And verify the list of action when the status is with completed 
#And verify the completed status
And Validate the status dropdown
And select with client for E signing status
And click the search button 
#And verify client for E signing status 
And click on Action icon in dashboard screen
And verify the list of action when the status is with client for E-Signing 

And Validate the status dropdown
And select with client for Manual signing status
And click the search button 
And click on Action icon in dashboard screen
And verify the list of action when the status is with client for Manual signing

And Validate the status dropdown
And select with admin for review status 
And click the search button 
And click on Action icon in dashboard screen
And verify the list of action when the status is with admin for review 
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the list of menu for Admin 
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on menu button
And verify the list of menu for admin user
Then close the browser

Examples:
|username											 |password                   |
|senthilkumar.b@changepond.com |Hum@03882         				 |

Scenario Outline: Validate the list of History log popup 
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button
And Validate the status dropdown
And select with client for E signing status
And click the search button 
And click on Action icon in dashboard screen
And click on History log popup 
And verify the History log popup 
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Preview, Download and info in History log popup 
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button
And Validate the status dropdown
And select with client for E signing status
And click the search button 
And click on Action icon in dashboard screen
And click on History log popup 
And click on Preview button in history log popup
And click on close button in preview screen
And click on Download button in history log popup 
And info button 
And verify the info popup
#Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Refresh from action in dashboard screen
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button
And Validate the status dropdown
And select with client for E signing status
And click the search button 
And click on Action icon in dashboard screen
And click on Refresh button 
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Upload letter from action in dashboard screen
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button
And Validate the status dropdown
And select with client for E signing status
And click the search button 
And click on Action icon in dashboard screen
And click on Upload letter button 
And click on Browse button
#And select the document and click on open button
And click on submit button after select the file 
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|
@start
Scenario Outline: Validate the Cancel Signing and resending from action in dashboard screen
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on All letters button in dashboard screen
And click on Search or filter button
And enter the status as "With Client For E-Signing"
And select the status as "With Client For E-Signing" 
And click the search button
#And click the search button
#And Validate the status dropdown
#And select with client for E signing status
#And click the search button 
And click on Action icon in dashboard screen
And click on cancel signing button 
And click on yes in cancel signing warning popup
And click on ok button in cancel success popup
#And verify the status after cancel the signing 
#And click on Action in dashboard screen
#And click on Resend button 
#And click No in E signing radiobutton
#And click Submit button in resend the letter for signing popup
#And verify the resending success popup and click on ok button
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp12   				|
|manikandan.ra@changepond.com  |Foz98112cp12   				|
|manikandan.ra@changepond.com  |Foz98112cp12   				|
|manikandan.ra@changepond.com  |Foz98112cp12   				|
|manikandan.ra@changepond.com  |Foz98112cp12   				|
|manikandan.ra@changepond.com  |Foz98112cp12   				|
|manikandan.ra@changepond.com  |Foz98112cp12   				|
|manikandan.ra@changepond.com  |Foz98112cp12   				|
|manikandan.ra@changepond.com  |Foz98112cp12   				|
|manikandan.ra@changepond.com  |Foz98112cp12   				|

Scenario Outline: Validate the Edit fields from action in dashboard screen
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button
And Validate the status dropdown
And select with admin for review status 
And click the search button 
And click on Action icon in dashboard screen
#And click on cancel signing button 
#And click on yes in cancel signing warning popup
#And click on ok button in cancel success popup
#And verify the status after cancel the signing 
And click on edit fields button in dashboard  
#And enter fees
And enter ZIP values as "10046"
And click on update button in edit fields screen
And verify the content of the edit success popup and click on ok button
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Delete from action in dashboard screen
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button
And Validate the status dropdown
And select with client for E signing status
And click the search button 
And click on Action icon in dashboard screen
And click on delete button from action in dashboard screen
And click yes button in delete conformation popup
And click ok button in delete success popup
Then close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Verify the menu panel is expand and collapse  
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on menu button
And verify the list of menu for admin user
And click on menu button
And verify the menu panel is closed
Then close the browser

Examples:
|username											 |password                   |
|senthilkumar.b@changepond.com |Hum@03882        					 |

Scenario Outline: Validate the Bulk letter generation - Webtable to ExcelSheet 
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And create the excelsheet and fetch the values from webtable 
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Letter Dashboard button and Batch Dashboard button in the dashboard screen
When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Batch dashboard button from the menu panel 
And verify the user can able to land on batch dashboard page
And click on Letter dashboard button from the menu panel
And verify the user can able to land on letter dashboard page.
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Dashboard - Validate the close button in Edit fields popup screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Search or filter button
And Validate the status dropdown
And select with admin for review status 
And click the search button 
And click on Action icon in dashboard screen 
And click on edit fields button in dashboard
And click on close icon in edit fields popup screen
#And click on ok button in warning popup
And click on Action icon in dashboard screen 
And click on edit fields button
And click on close button in edit fields popup screen
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Dashboard screen -Validate the yes and no checkbox in E signing? in edit field popup screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Search or filter button
And Validate the status dropdown
And select with admin for review status 
And click the search button 
And click on Action icon in dashboard screen 
And click on edit fields button in dashboard
And click on no checkbox in e signing? in edit field popp screen in dashboard screen
And click on yes checkbox in e signing? in edit field popp screen in dashboard screen
And click on update button in edit fields screen
And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|

Scenario Outline: Validate the Bulk letter generation - Validate the Edit fields yes or no checkbox in E signing? in Edit popup screen
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
#And click on profile icon
#And click on yes button in conformation popup
And click on Search or filter button
And Validate the status dropdown
And enter the status as "With Client For E-Signing"
And select the status as "With Client For E-Signing" 
And click the search button
And click on Action icon in dashboard screen 
And click on cancel signing button 
And click on yes in cancel signing warning popup
And click on ok button in cancel success popup
And click on Action icon in dashboard screen 
And click on edit fields button in dashboard
And click on no checkbox in e signing? in edit field popp screen in dashboard screen
And click on update button in edit fields screen
And verify the content of the edit success popup and click on ok button in dashboard screen
And click on Action icon in dashboard screen
And click on Resend button
And click Submit button in resend the letter for signing popup
#And verify the resending success popup and click on ok button
#And close the browser

Examples:
|username											 |password              |
|manikandan.ra@changepond.com  |Foz98112cp1   				|


#
#Scenario Outline: Validate the Cancel Signing and resending from action in dashboard screen - For Resend live purpose
#When User enter "<username>" and click on Next button
#And User enter "<password>" and click on Sign in button
#And click on No button in stay in page
#Then User able to land on dashboard screen
#And click on All letters button in dashboard screen
#And click on Search or filter button
#And click the engagement letter ID dropdown
#And call the resend letter live
#Then close the browser
#
#Examples:
#|username											 |password              					|
#|manikandan.ra@changepond.com  |Foz98112cp   										|