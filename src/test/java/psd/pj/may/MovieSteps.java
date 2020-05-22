package psd.pj.may;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.*;

public class MovieSteps extends TestCase {
	String criteria;
	@Given("^User has selected \"([^\"]*)\"$")
	public void user_has_selected(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		criteria = arg1;
	}

	@When("^Click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^It should display \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void it_should_display_and(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		MovieList movieList = new MovieList();
		assertEquals(arg1, movieList.movieList(criteria));
	}


}
