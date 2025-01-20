package stepDefs;



import net.masterthought.cucumber.json.Match;
import org.hamcrest.Matchers;
import static org.hamcrest.MatcherAssert.assertThat;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ApiUtils.RestAssuredExtension;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.restassured.response.Response;

import io.restassured.response.ResponseOptions;

public class API_Step {
	private static ResponseOptions<Response> response;

	@Given("User perform GET method for Coin Desk")
	public void user_perform_GET_method() throws URISyntaxException {
		response = RestAssuredExtension.GetOps();
	}

	@Then("API response contains {string} as currency")
	public void currency_should_be(String currency) {
        assertThat(response.getBody().jsonPath().get("bpi"), Matchers.hasKey(currency));
	}
    @Then("The GBP description equals {string}")
    public void gbp_should_be(String currency) {
        assertThat(response.getBody().jsonPath().get("bpi.GBP.description"),Matchers.is(currency));
    }

	@Then("Should be response status code {int}")
	public void should_be_response_status_code(Integer statusCode) {
		assertThat(response.statusCode(), Matchers.is(statusCode));
	}
}
