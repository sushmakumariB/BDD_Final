Feature: Neet

Background: Validate user is able to login

Given Browser is open and url is navigated
And The user is able to click on login button
When The user enters phone number 
And The user clicks on login button
And The user should enter otp
Then The user should be successfully logged in


Scenario: Validate user selects NEET-UG from the dropdown 
    
Given The user is on the Unacademy homepage
When The user clicks on the Dropdown menu
And The user selects add another goal 
And The user selects NEET-UG 
Then The NEET-UG page should be displayed


Scenario: Validate user is able to click on courses and  get subscription

Given The user is on the Unacademy homepage
When The user clicks on the Dropdown menu
And The user selects add another goal 
And The user selects NEET-UG 
Then The NEET-UG page should be displayed
And The user clicks on educators
And The user clicks on view Profile
And The user clicks on courses
And The user selects course
Then The user gets the subscription


Scenario: Validate user can view the full schedule of the test  


Given The user is on the Unacademy homepage
When The user clicks on the Dropdown menu
And The user selects add another goal 
And The user selects NEET-UG 
Then The NEET-UG page should be displayed
And The user clicks on educators
And The user clicks on view all educators button
And The user selects test
And The user selects the free button
And The user scrolls and clicks on full schedule

Scenario: Validate user can navigate to other centers of unacademy

Given The user is on the Unacademy homepage
When The user clicks on the Dropdown menu
And The user selects add another goal 
And The user selects NEET-UG 
Then The NEET-UG page should be displayed
And The user Scrolls till our centers are now open
And The user clicks on know more about centers
And The user scrolls to the centre
And The user clicks on view details

Scenario Outline: Validate user can select dropdown from all languages dropdown

Given The user is on the Unacademy homepage
When The user clicks on the Dropdown menu
And The user selects add another goal 
And The user selects NEET-UG 
Then The NEET-UG page should be displayed
And The user clicks on educators
And The user clicks on view all educators button
And The user clicks on dropdown and select <click text> inside all languages


Examples:
       | click text  |
       | 0   |
       | 1   |
       | 2   | 


