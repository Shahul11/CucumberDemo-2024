Feature: Uber Booking Feature

  @Smoke
  Scenario: Booking Cab
    Given User wants to select a car type "sedan" from uber app
    When User selects car "sedan" and pick up point as "bangalore" drop location "pune"
    Then Driver starts journey
    And Driver ends the journey
    Then User pays 1000 USD

  @Regression
  Scenario: Booking Cab1
    Given User wants to select a car type "suv" from uber app
    When User selects car "sedan" and pick up point as "bangalore" drop location "delhi"
    Then Driver starts journey
    And Driver ends the journey
    Then User pays 1000 USD

  @prod
  Scenario: Booking Cab2
    Given User wants to select a car type "mini" from uber app
    When User selects car "sedan" and pick up point as "bangalore" drop location "Hyderbad"
    Then Driver starts journey
    And Driver ends the journey
    Then User pays 1000 USD
