# Kotlin Cucumber demo

## Prerequisites

- JDK >1.8
- IntelliJ Cucumber for Kotlin plugin (optional)

## Running

`./gradlew cucumber`

## Output

```
Scenario: use the API with Java8 style    # src/test/resources/io/cucumber/kotlin/kotlin.feature:3
  Given I have 42 cukes in my belly       # io.cucumber.kotlin.LambdaStepDefinitions.<init>(LambdaStepDefinitions.kt:45)
  Then I really have 42 cukes in my belly # io.cucumber.kotlin.LambdaStepDefinitions.<init>(LambdaStepDefinitions.kt:51)

Scenario: Parameterless lambdas            # src/test/resources/io/cucumber/kotlin/kotlin.feature:7
  Given A statement with a simple match    # io.cucumber.kotlin.LambdaStepDefinitions.<init>(LambdaStepDefinitions.kt:58)
  Given A statement with a scoped argument # io.cucumber.kotlin.LambdaStepDefinitions.<init>(LambdaStepDefinitions.kt:61)

Scenario: I can use body expressions       # src/test/resources/io/cucumber/kotlin/kotlin.feature:11
  Given A statement with a body expression # io.cucumber.kotlin.LambdaStepDefinitions.<init>(LambdaStepDefinitions.kt:56)

Scenario: Multi-param lambdas                     # src/test/resources/io/cucumber/kotlin/kotlin.feature:14
  Given I will give you 1 and 2.2 and three and 4 # io.cucumber.kotlin.LambdaStepDefinitions.<init>(LambdaStepDefinitions.kt:63)

Scenario: use a table    # src/test/resources/io/cucumber/kotlin/kotlin.feature:17
  Given this data table: # io.cucumber.kotlin.LambdaStepDefinitions.<init>(LambdaStepDefinitions.kt:38)
    | first  | last     |
    | Aslak  | Hellesøy |
    | Donald | Duck     |

5 Scenarios (5 passed)
7 Steps (7 passed)
0m0.444s

```