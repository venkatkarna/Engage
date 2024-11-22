Feature: To validate the creation of fields, blocks and templates
Background:
Given User launch the application in chrome browser 
And Maximize the window 



Scenario Outline: Validate the creation of fields
When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
And User able to land on dashboard screen
And click on menu button
And click on fields from the menu list 
And click on Add button 
And enter field name in add new field popup
And enter field display name in add new field popup
#And select input source in add new field popup 
And select data type in add new field popup
And select active in status dropdown
And enter changenotes in add new field popup 
Then click on Save button 
And click on Ok button 
#And verify the created field is showing 
And select that field by clicking on checkbox
And click on Edit button
And change the data type
And change the display name 
And change the change notes
And click on update button
And select that field 
And click on Delete button
And click on Yes button in conformation popup
And click on ok button in success popup



Scenario Outline: Validate the creation of block

When user enter "<username>" and click on Next button
And user enter "<password>" and click on Sign in button
And click on No button in stay in page
And User able to land on dashboard screen
And click on menu button
And click on blocks from the menu list
And click on Add block button 
And enter block name in add block popup screen 
And select the status in add block popup screen 
And enter change notes in add block popup screen 
And enter block description in add block popup screen 
And enter block content 
And drag the list of fields in block content
Then click on save button
And click on Ok button in block added popup
And click on preview block button in action
And click on Edit block button
And search the field using search fields feature
And drag the searched field to block content
And change the change notes in edit block popup 
And change the block description in edit block popup 
And click on Update button in edit block popup 
And click on Ok button in block edited popup 
And select the block 
And click on delete button in block screen 
And click on Yes button in block delete popup 
And click on Ok button in delete block popup 


Examples:
|username											 |password              |
|harivignesh.s@changepond.com  |DuSopriHi25CPT@2024   |

