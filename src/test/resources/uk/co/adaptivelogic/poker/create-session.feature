Feature: Start a Project
  In order to estimate stories with a distributed team
  As a moderator
  I want to start a new scrum poker project

  Scenario: Start a Project Successfully
    Given I open scrum poker
    When I create a project called 'example'
    Then my project will be created
    And my project will have no user stories attached
    And my project will have no developers attached


 1. Moderator creates a project
 2. Project is created with the moderator user attached
 3. Moderator adds one or more initial user stories
 4. Moderator shares link to application with team
 5. Team members join (and show up)
 6.
