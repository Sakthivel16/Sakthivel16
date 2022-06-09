Feature: feature to test register for webinar

 Scenario: user successfully register for webinar with valid credentials
    Given User is on webinar page
    When user enter valid name and mobile number
    And clicks on Register for webinar button
    Then user enter valid Email and Choose an online session
    And click on Confirm   
    
    Scenario Outline: user successfully register for webinar with invalid credentials
      Given User is on webinar page
      When user enter Invalid2 <name> and <mobile number>
      And clicks on Register for webinar button
      Then user enter invalid2 <Email> and <Choose an online session>
      And click on Confirm 
      Then user checking page2 error message
    
    Examples:
    
     |name | mobile number| Email| Choose an online session|
     |sakthivel | 8610362115| sakthivel%gmail.com| 18 Nov,Wednesday -6 PM|
    
     
     Scenario Outline: user successfully register for webinar with invalid credentials
      Given User is on webinar page
      When user enter Invalid <name> and <mobile number>
      And clicks on Register for webinar button
      Then user checking page1 error message
      
      Examples:
      
       |name | mobile number|
       |sakthivel1 | 86103621155| 
       |abcd$ | 86103| 
    
     
    
    
       
 
    
   
     
     
     
    
   
 

  