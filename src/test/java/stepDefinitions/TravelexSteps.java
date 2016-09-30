package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BaseMain;
import pageObjects.TravelexPage;

/**
 * Created by girija on 29/09/2016.
 */
public class TravelexSteps {
    TravelexPage page=new TravelexPage();
    @Given("^I am on home page$")
    public void i_am_on_home_page()  {
     page.assertHomePage();

    }

    @When("^I resize my window to (\\d+) px$")
    public void i_resize_my_window_to_px(int width)  {
        page.resizeWindow(width);
    }

    @When("^swipe sliders to the third slide$")
    public void swipe_sliders_to_the_third_slide() throws InterruptedException {
        page.navigateToThirdSlide();

    }

    @Then("^I should see slide title as \"([^\"]*)\"$")
    public void i_should_see_slide_title_as(String slideName)  {
        System.out.println(slideName);
        page.assertThirdSlide(slideName);

    }

}
