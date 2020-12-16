Feature: App Login

Scenario: Homepage default login
Given User is on landing page
When User logs into app with username "dmeps" and password "12345"
Then Homepage is populated
And CCs displayed: "true"


Scenario: Homepage default login
Given User is on landing page
When User logs into app with username "DME" and password "12345"
Then Homepage is populated
And CCs displayed: "false"