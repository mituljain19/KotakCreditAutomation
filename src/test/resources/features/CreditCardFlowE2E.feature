Feature: Automated End2End Kotak Credit Card flow

@firsttest 
Scenario: Customer place an order by purchasing an item from search	
	Given user is on Home Page
	When user navigates to Credit Cards Page
	And Apply for Myntra Kotak Credit Card
	And Clicks Get your card now
	And User provide "<mobilenumber>" to get otp
	|9876543210|
	And User verify otp
	And User fills personal details
	|pannumber|ABCDE1234A|
	|dob|1995-01-01|
	|emailid|abc@xyz.com|
	|gender|male|
