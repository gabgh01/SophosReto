Feature: create user in gorest
  I as certfication user
  need to add a new user in api
  for verification of creation user functionality

  Scenario: creation user
    Given Gabriel has add a new user
    |name|gender|email|status|
    |Gabriel|Male|gabgh@gmail.com|Active|
    When consult the new user
    Then should see the user add consult method in api

