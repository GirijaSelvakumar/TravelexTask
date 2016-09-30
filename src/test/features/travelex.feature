Feature: Travelex slider

As a user
I would like to view travelex home page in compressed screen
So that i could see information in slides

@1
Scenario: View third Slide

  Given I am on home page
  When I resize my window to 550 px
  And swipe sliders to the third slide
  Then I should see slide title as "Exchange rate updates"



