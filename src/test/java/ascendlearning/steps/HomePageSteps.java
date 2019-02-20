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
    public void iClickRegisterButton() {
    	homePage.open();
    	homePage.clickRegisterButton();
    }
    
    @Given("^I click login button$")
    public void iClickLoginButton() {
    	homePage.open();
    	homePage.clickLoginButton();
    }
    
    @Given("^I click my account button$")
    public void iClickMyAccountButton() {
    	homePage.open();
    	homePage.clickMyAccountButton();
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
    
    @When("^the welcome message correspond to the correct user$") 
    public void welcomeMessageCorrespondToUser() {
    	String userName = Serenity.sessionVariableCalled("username");
    	String welcomeMessage=homePage.getWelcomeMessage();
    	assertThat("WELCOME, "+userName.toUpperCase()==welcomeMessage);
    }
    
    @When("^the welcome message correspond to the correct user \"([^\"]*)\"$") 
    public void welcomeMessageCorrespondToUser(String userName) {
    	String welcomeMessage=homePage.getWelcomeMessage();
    	assertThat("WELCOME, "+userName.toUpperCase()==welcomeMessage);
    }
    
    @Then("^the log out button exists$") 
    public void logOutButtonExists() {
    	assertThat(homePage.btnLogOutDisplayed());
    }
}
