
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in Screenplay at the Choucair academy with the automation course
    @scenario1
    Scenario: Search for automation course
      Given than brandon wants to learn automation at the academy Choucair
        | strUser    | strPassword   |
        | 1082923184 | Choucair2021* |
      When he search for the course on the Choucair Academy platform
        | strCourse                                              |
        | AiU Certified Tester in Artificial Intelligence (CTAI) |
      Then he finds the course called
        | strCourse                                              |
        | AiU Certified Tester in Artificial Intelligence (CTAI) |