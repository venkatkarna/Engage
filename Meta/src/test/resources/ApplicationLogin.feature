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
|username											 |password                   |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT        |



Scenario Outline: Validate the My letter Search or filter searchbox in dashboard screen

When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
And click on Search or filter button


And click the engagement letter ID dropdown
And select the value in ID dropdown
And click the search button
And validate the letter ID 
And click on clear button

And Validate the engagement letter Name dropdown
And select the value in letter name dropdown
And click the search button
And validate the letter name
And click on clear button

And Validate the office dropdown
And select the value in office dropdown
And click the search button
And validate the office
And click on clear button

And Validate the tax year dropdown
And select the value tax year dropdown
And click the search button
And validate the tax year
And click on clear button

And Validate the template name dropdown
And select the value in template name dropdown
And click the search button
And validate the template name
And click on clear button

And Validate the client ID/name dropdown
And select the client ID/name dropdown
And click the search button
And validate the client ID/name
And click on clear button

And Validate the partner PIC dropdown 
And select the partner PIC dropdown
And click the search button
And validate the partner PIC
And click on clear button

And Validate the department dropdown
And select the department dropdown
And click the search button
#And validate the department - This will not available in the grid, so skipping this step
And click on clear button

And Validate the type dropdown
And select the type dropdown
And click the search button
#And validate type - This will not available in the grid, so skipping this step
And click on clear button

And Validate the admin dropdown
And select the admin dropdown
And click the search button
And validate the admin
And click on clear button
 
And Validate the status dropdown
And select the status dropdown
And click the search button
And validate the status
And click on clear button
Then close the browser

Examples:
|username											 |password                   |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT        |



Scenario Outline: Validate the All letters Search or filter in dashboard screen

When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
And click on All letters button in dashboard screen 
And click on Search or filter button
And click the engagement letter ID dropdown
And select the value in ID dropdown
And click the search button
And validate the letter ID 
And click on clear button
Then close the browser


Examples:
|username											 |password                   |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT        |



Scenario Outline: Validate the Sorting feature in dashboard screen 

When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
And click on sort button in batch id 
And click on refresh button
And click on sort button in letter id 
And click on refresh button
And click on sort button in letter name 
And click on refresh button
And click on sort button in office
And click on refresh button
And click on sort button in year 
And click on refresh button
And click on sort button in template name 
And click on refresh button 
And click on sort button in client name 
And click on refresh button 
And click on sort button in Partner pic
And click on refresh button 
And click on sort button in admin 
And click on refresh button 
And click on sort button in status
Then close the browser


Examples:
|username											 |password                   |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT       |


Scenario Outline: Validate the Export above table in dashboard screen

When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
And click on export above table button in my letters tab
And click on export above table button in all letters tab
Then close the browser


Examples:
|username											 |password                   |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT       |




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
|username											 |password                   |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT        |



Scenario Outline: Validate the Clear button in search of filter after selecting all the values in my letters or all letters

When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on Search or filter button
And click the engagement letter ID dropdown
And select the value in ID dropdown
And Validate the engagement letter Name dropdown
And select the value in letter name dropdown

And Validate the office dropdown
And select the value in office dropdown
And Validate the tax year dropdown
And select the value tax year dropdown
And Validate the template name dropdown
And select the value in template name dropdown
And Validate the client ID/name dropdown
And select the client ID/name dropdown
And Validate the partner PIC dropdown 
And select the partner PIC dropdown
And Validate the department dropdown
And select the department dropdown
And Validate the type dropdown
And select the type dropdown
And Validate the admin dropdown
And select the admin dropdown
And Validate the status dropdown
And select the status dropdown
And click on clear button in after all values given
And navigate to all letters tab 
#And click on Search or filter button
And click the engagement letter ID dropdown
And select the value in ID dropdown
And Validate the engagement letter Name dropdown
And select the value in letter name dropdown
And Validate the office dropdown
And select the value in office dropdown
And Validate the tax year dropdown
And select the value tax year dropdown
And Validate the template name dropdown
And select the value in template name dropdown
And Validate the client ID/name dropdown
And select the client ID/name dropdown
And Validate the partner PIC dropdown 
And select the partner PIC dropdown
And Validate the department dropdown
And select the department dropdown
And Validate the type dropdown
And select the type dropdown
And Validate the admin dropdown
And select the admin dropdown
And Validate the status dropdown
And select the status dropdown
And click on clear button in after all values given
Then close the browser


Examples:
|username											 |password                   |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT        |



Scenario Outline: Validate the Search fields feature in Bulk letter generation screen 

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
|username											 |password                   |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT        |



Scenario Outline: Validate the Sort the fields in Bulk letter generation screen 

When User enter "<username>" and click on Next button
And User enter "<password>" and click on Sign in button
And click on No button in stay in page
Then User able to land on dashboard screen
And click on bulk letter generation
And click on sort button in batch id 
And click on sort button in admin 
#And click on sort button in Partner pic - can't proceed due to bug 
And click on sort button in template name 
And click on sort button in Noofletters 
And click on sort button in Lastupdated
And click on sort button in status
Then close the browser


Examples:
|username											 |password                   |
|harivignesh.s@changepond.com  |DuSopriHi25@2024CPT        |




