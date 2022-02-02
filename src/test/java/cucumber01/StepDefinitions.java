package cucumber01;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

/*

 */
public class StepDefinitions {
    private WebDriver PowerDriver;

    @Given("existing Server application https:\\/\\/reqres.in\\/api")
    public void existingServerApplicationHttpsReqresInApi() {
        PowerDriver.get("https://reqres.in/api");
    }

    @Then("on GET request to \\/users it returns expected users list")
    public void onGETRequestToUsersItReturnsExpectedUsersList() {
    }

    @Then("on GET request to \\/users\\/{int} it returns expected welcome message")
    public void onGETRequestToUsersItReturnsExpectedWelcomeMessage(int arg0) {
    }

    @Then("on GET request to \\/users\\/{int} it returns {int} status code")
    public void onGETRequestToUsersItReturnsStatusCode(int arg0, int arg1) {
    }

}
