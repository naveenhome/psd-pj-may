Feature: Movie List

Scenario: Display based on region
Given User has selected "Korean"
When Click on "Search"
Then It should display "abc","Year" and "Duration"

Scenario: Display based on region
Given User has selected "Hindi"
When Click on "Search"
Then It should display "XYZ","Year" and "Duration"

Scenario: Display based on Year
Given User has enter "1985"
When Click on "Search"
Then It should display "XYZ","Year" and "Duration"

