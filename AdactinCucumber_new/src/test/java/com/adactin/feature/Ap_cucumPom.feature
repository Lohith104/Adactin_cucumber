@AutomationPractice
Feature: Automation Practice Add To cart

Scenario: move to Sign in Page
Given Lunch the url of Automation Practice
Then user click the signin nutton



@SignIn
Scenario: Sign In Page
    When User Enter The Valid User name 
    And User Enter The Valid Password
    Then User Click The SignIn Button And Page Navigat's To My Account Page
    
@MyAccount
Scenario: My Account Page
Then User Click on Women and Page Navigate to Womens page

@Women'sDress
Scenario: Select a Dress
When Choose a Dress And Move over
Then Click On Add To cart Button And Page Navigate to Successfully added page 

@ProceedtoCheckout
Scenario: Proceed to Checkout 
Then User Click on the Checkout Button And Page Navigate Cart Summary

@CartSummary
Scenario: Shopping Cart Summary
When User Click the Add Button For Quantity
Then User Click the Checkout Button and Page Navigate to Address

@Address
Scenario: Address Page
Then user click the checkout Button and Navigates to Shipping Page

@Shipping
Scenario: Shipping Page 
When User Click The Terms Of Service Check Button 
Then User Click the Checkout Button and Page Navigate to Payement Page

@Payment
Scenario:  Payement Page
Then User Click The Pay by Check and Page Navigate to Order Summary Page

@orderSummary
Scenario: Order Summary
Then User Click the confrim  Button and page navigate to Order confirmation and message is displayed



