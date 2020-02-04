Feature: login to crm application


#without example
#Scenario: verify the user is login to crm application
#
#Given User is on home page
#When enters "jagtapmahesh01@gmail.com"
#Then enters the "JAGTAPmahesh@01" 
#Then click signin
#And user on homepage


#with Example
#
#Scenario Outline: verify the user is login to crm application
#
#Given User is on home page
#When enters "<username>"
#Then enters the "<password>" 
#Then click signin
#And user on homepage
#
#Examples:
# |       username             |       password         |
# |   jagtapmahesh01@gmail.com |   JAGTAPmahesh@01      |




#with datatable


Scenario: verify the user is login to crm application

Given User is on home page
When enters username
 	|jagtapmahesh01@gmail.com |
Then enters the password
	|  JAGTAPmahesh@01 |
Then click signin
And user on homepage





