Feature: User Regisrtation

  Scenario: user registration with different data   # This is with asLists note no columns
    Given User is on registration page
    When User enters following user details
      | naveen | automation | nav@gmail.com  |   99999 | Bangalore |
      | tom    | peter      | tom@gmail.com  |   99999 | London    |
      | lisa   | dsouza     | lisa@gmail.com | 8887777 | SFO       |
    Then user registration should be successful

  Scenario: user registration with different data with columns  # This is with asMaps note there is a column names
    Given User is on registration page
    When User enters following user details with columns
      | firstname | lastname   | email          | phone   | city      |
      | naveen    | automation | nav@gmail.com  |   99999 | Bangalore |
      | tom       | peter      | tom@gmail.com  |   99999 | London    |
      | lisa      | dsouza     | lisa@gmail.com | 8887777 | SFO       |
    Then user registration should be successful
