Feature: the user open the app and try pay a credit but the user not have a credit

  Scenario: the user wants to pay a credit but cannot because he does not have one
    Given the user open the app Sistecredito
    When the user enter the user payment information
    |cedula  |
    |98772838|
    Then The user should see the messsage "No tienes créditos por pagar"
