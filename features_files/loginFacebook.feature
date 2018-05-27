Feature: login into Facebook account and validate
  
  @general
  Scenario: Login with valid login details  
  	Given read excel data	
  	Then check application is running
  	And "Pavan" and "Priya" for account is
    Given User enters PasswordX and UsernameX    
    |UsernameX|PasswordX|
    |test    |1224    |
    |test    |1224    |
    |test    |1224    |
    #Then open application
  
  @endtoend @e2e
  Scenario Outline: Consuimg datai
  	When data read from  example table with "<TestData>"
    And "Pavan" and "Priya" for account is
    
    Examples: 
    |TestData|
    |CHINTI |
    |MINTI  |