package ascendlearning.steps;

import ascendlearning.pages.CoursesPage;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class CoursesPageSteps extends ScenarioSteps {
	CoursesPage coursesPage;
	@Then("^suspended message \"([^\"]*)\" displayed$")
	public void suspendedMsgIs(String userSuspendedMsgExpected) {
		String userSuspendedMsg=coursesPage.getUserSuspendedMessage();
		assertThat(userSuspendedMsgExpected.equals(userSuspendedMsgExpected));
	}
	
}
