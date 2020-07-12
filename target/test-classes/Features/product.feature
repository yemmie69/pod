Feature: Products

  Scenario: Products check
    Given user visit https://checkout.pod-point.com/
    And user select Mitsubishi and Outlander in the Select Your Car fields
    And user check the box ‘I am NOT eligible to claim the dealership discount as I did not come through a dedicated dealership’
    When user select the ‘Universal Socket’ option
    And user select power rating 
    And user check the prices for the 7kw unit displayed match the following values £879 Full Price and £529 With OLEV Grant
    And user check that 6 compatible extras are shown
    And user select a random compatible extra
    Then the total price at the bottom right of the screen should correctly match the 7kw unit price + the compatible extra price
