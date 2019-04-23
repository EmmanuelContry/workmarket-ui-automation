# Work Market Automation

## Dependencies

- JDK 8
- Maven

## Setup

1. Clone code to local
2. Navigate to directory from command line
3. Execute `mvn clean compile`

## Scripting

To script tests:
1. Begin by creating a .feature file in `src/test/java/workmarket/features/` with the required steps
2. Create matching Step Definitions in `src/test/java/workmarket/steps/` for any unimplemented steps
3. Create Page Objects in `src/test/java/workmarket/pages/` for any page interactions required from the steps

## Execute

- To execute all tests: `mvn clean verify`
- To execute specific tagged tests: `mvn clean verify -D"cucumber.options"="--tags @my-ag"`

## Reporting

Once testing is complete, open the report from `target/site/serenity/index.html` in any browser
