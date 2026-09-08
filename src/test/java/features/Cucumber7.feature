Feature: Deliveryorders Module

Scenario: Login to EspoCRM 
Given the user launches the EspoCRM application 
When the user clicks the Login button 
Then the user should be successfully logged into EspoCRM

Scenario: Navigate to Delivery Orders 
Given the user is on the homepage 
When the user mousehovers over Sales and Purchases
And the user clicks on Delivery Orders 
Then the Delivery Orders page should be displayed

Scenario Outline: Create delivery order with valid and invalid data 

    Given the user is on the Delivery Orders page
    When the user clicks on Create Delivery Order
    And the user selects "<status>" from the Status dropdown
    And the user selects "<account>" from the Account dropdown
    And the user enters "<dateOrdered>" in the Date Ordered field
    And the user enters "<deliveryDate>" in the Delivery Date field
    And the user selects "<warehouse>" from the Warehouse dropdown
    And the user selects "<shippingProvider>" from the Shipping Provider dropdown
    And the user enters "<description>" in the Description field
    And the user clicks on Save
    Then the delivery order should be created successfully with result
    
    
    Examples:
 | status    | account          | dateOrdered | deliveryDate | warehouse      | shippingProvider | description |
 | Completed | Janeville France | 09/02/2026  | 09/03/2026   | Main Warehouse | Royal Parcel     | new product |


Scenario: Edit Delivery Order description
Given the user is on Delivery Orders page
When the user clicks on Edit
And the user updates description in the Description field & clicks on save
Then the Delivery Order should be updated successfully


Scenario: View Completed Delivery Orders
    Given the user is on the Delivery Order saved page
    When the user navigates back
    And the user selects the Completed status filter option
    Then the user should be able to view completed Delivery Orders
    
Scenario: Search Delivery Order
    Given the user is on the completed status Delivery Order
    When the user selects the all status filter option
    And the user enters delivery order number in the search box
    And the user clicks the Search button
    Then the user should see the delivery order number









