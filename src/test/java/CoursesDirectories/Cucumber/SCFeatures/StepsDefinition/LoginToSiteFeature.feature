Feature:  Login to Silver Screen


  Scenario: Login app
    Given I Login To SilverScreen site
    When I login with <login> and <password>
    Then I can see Red Carpet Club <level> in upper right corner

  Scenario: Login app with login blank field
    Given I am on login page on Silver Screen site
    When I left blank <login> field
    Then I see  message "Enter a correct login"


