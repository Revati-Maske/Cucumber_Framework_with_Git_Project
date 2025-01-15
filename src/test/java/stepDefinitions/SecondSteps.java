package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondSteps {

@When("launch the browser from config variables")
public void launch_the_browser_from_config_variables() {
    System.out.println("launch the browser from config variables");
}
@When("hit the home page url of banking site")
public void hit_the_home_page_url_of_banking_site() {
    System.out.println("hit the home page url of banking site");
}
@Given("User is on Mortgage banking page")
public void user_is_on_mortgage_banking_page() {
    System.out.println("User is on Mortgage banking page");
    Assert.assertTrue(false);
}
@When("User enter  username {string} and password {string} and click on submit")
public void user_enter_username_and_password_and_click_on_submit(String user, String pass) {
    System.out.println("User enter  username "+user+" and password "+pass+" and click on submit");
}
@Then("Home page is displayed")
public void home_page_is_displayed() {
    System.out.println("Home page is displayed");
}
@Then("Cards are displayed")
public void cards_are_displayed() {
    System.out.println("Cards are displayed");
}
@Given("User is on net banking page")
public void user_is_on_net_banking_page() {
    System.out.println("User is on net banking page");
}
@When("User enter  username {string} and password {int} and click on submit")
public void user_enter_username_and_password_and_click_on_submit(String username, Integer password) {
   System.out.println("User enter  username "+username+" and password "+password+ " and click on submit");
}
}
