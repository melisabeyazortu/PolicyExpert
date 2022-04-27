package policyExpert.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import policyExpert.utilities.ConfigurationReader;
import policyExpert.utilities.Driver;

public class AboutYouStepDefs {


    @Given("the user is on the enquiry form page")
    public void the_user_is_on_the_enquiry_form_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }

    @And("the user enters occupation")
    public void the_user_enters_occupation() throws InterruptedException {

        WebElement occupation= Driver.get().findElement(By.xpath("//input[@name='occupation']"));
        occupation.sendKeys("Software Engineer");
    }

    @When("the user chooses to enter another occupation")
    public void the_user_chooses_to_enter_another_occupation() {

    }

    @Then("the occupation is not the same with the first entered one")
    public void the_occupation_is_not_the_same_with_the_first_entered_one() {

    }

}
