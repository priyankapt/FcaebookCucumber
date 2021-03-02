@LoginFeature @Sanity

  Feature: LoginFeature

    Background:
      User navigate to facebook
      Given I am on facebook login page



    @Test1
    Scenario: Verify login fails with incorrect credentials
      When I enter username as "8610051663"
      And I enter password as "aaaaaaa"
#    MANICKAMUMA
      Then Login should fail
      And This is a test

