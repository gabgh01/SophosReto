Feature: add product in shopping cart
  I as user
  need add product in shopping cart
  for verify the add the product

  Scenario: add product
    Given Juan as user is in home page
    When search product and add the product to shopping cart
      | name product | quantity |
      | Aceite       | 2        |
    Then should see the product
