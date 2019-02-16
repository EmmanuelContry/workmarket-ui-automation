package ascendlearning.steps;

import ascendlearning.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePageSteps extends ScenarioSteps {

	HomePage homePage;

    @Given("^I click register button$")
    public void iClickRegisterBUtton() {
    	homePage.open();
    	homePage.clickRegisterButton();
    }
    
    @When("^I click in continous education$")
    public void iClickContinousEducation() {
    	homePage.clickContinueEduaction();
    	homePage.hoverContinueEducation();
    }
    
    @When("^I click in all courses$") 
    public void iClickAllCourses() {
    	homePage.clickAllCourses();
    }
    
    @When("^the welcome message correspond to the created user$") 
    public void welcomeMessageCorrespondToUser() {
    	String userName = Serenity.sessionVariableCalled("username");
    	String welcomeMessage=homePage.getWelcomeMessage();
    	assertThat("WELCOME, "+userName==welcomeMessage);
    }
}
