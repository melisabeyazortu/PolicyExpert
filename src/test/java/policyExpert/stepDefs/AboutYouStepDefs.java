package policyExpert.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import policyExpert.utilities.ConfigurationReader;
import policyExpert.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class AboutYouStepDefs {



    @Given("the user is on the enquiry form page")
    public void the_user_is_on_the_enquiry_form_page() {

        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }



    @Given("The user enters occupation")
    public void the_User_Enters_Occupation() throws InterruptedException {
        WebElement occupation = Driver.get().findElement(By.xpath("//input[@name='occupation']"));
        occupation.sendKeys("Software Engineer");

        WebElement dropdownOptions=Driver.get().findElement(By.xpath("//li[@role='option']"));
        Thread.sleep(3000);
        dropdownOptions.click();

        String occupationEntered= occupation.getAttribute("value");

        Assert.assertEquals("Software Engineer", occupationEntered);

    }



    @When("The user chooses to enter another occupation")
    public void the_User_Chooses_To_Enter_Another_Occupation() {

        WebElement yesButton=Driver.get().findElement(By.xpath("//div[@id='occupation_part_time_confirm']/button"));

        yesButton.click();


    }

    @Then("the occupation is not the same with the first entered one")
    public void the_occupation_is_not_the_same_with_the_first_entered_one() {


    }


    @When("The occupation is the same with the first entered one")
    public void the_occupation_is_the_same_with_the_first_entered_one() {

       WebElement occupation = Driver.get().findElement(By.xpath("//input[@name='occupation']"));

       WebElement secondOccupation=Driver.get().findElement(By.xpath("//input[@name='occupation_part_time']"));
       secondOccupation.sendKeys("Software Engineer");
       WebElement dropdownOptions=Driver.get().findElement(By.xpath("//li[@role='option']"));

       WebDriverWait wait=new WebDriverWait(Driver.get(), 5);
       wait.until(ExpectedConditions.visibilityOf(dropdownOptions));
       dropdownOptions.click();


        String occupationEntered= occupation.getAttribute("value");


        String secondOccupationEntered= secondOccupation.getAttribute("value");
        Assert.assertEquals(occupationEntered, secondOccupationEntered);

    }

    @Then("System gives warning")
    public void system_gives_warning() {
        //There is bug there is no warning against

    }

    @Given("The user clicks {string}")
    public void the_user_clicks(String string) {

    }

    @Then("The title is clickable")
    public void the_title_is_clickable() {

    }

    @Then("Under Married User sees the list of following options:")
    public void under_Married_User_sees_the_list_of_following_options() {

    }

    @Then("Under Single User sees the list of following options:")
    public void under_Single_User_sees_the_list_of_following_options() {

    }

    @Then("Under Co-habiting \\/ partner User sees the list of following options:")
    public void under_Co_habiting_partner_User_sees_the_list_of_following_options() {

    }

    @Then("Under Divorced User sees the list of following options:")
    public void under_Divorced_User_sees_the_list_of_following_options() {

    }

    @Then("Under Widowed User sees the list of following options:")
    public void under_Widowed_User_sees_the_list_of_following_options() {

    }

    @Then("Under Separated User sees the list of following options:")
    public void under_Separated_User_sees_the_list_of_following_options() {

    }

    @Then("Under Civil partnership User sees the list of following options:")
    public void under_Civil_partnership_User_sees_the_list_of_following_options() {

    }

    @Given("The user enters the First name")
    public void the_user_enters_the_First_name() {

    }

    @Given("The user enters the Last name")
    public void the_user_enters_the_Last_name() {

    }

    @Then("The First name and Last name sections are filled")
    public void the_First_name_and_Last_name_sections_are_filled() {

    }

    @Given("The user enters the date")
    public void the_user_enters_the_date() {

    }

    @Given("The user enters the month")
    public void the_user_enters_the_month() {

    }

    @Given("The user enters the year")
    public void the_user_enters_the_year() {

    }

    @Then("Date of Birth section is filled")
    public void date_of_Birth_section_is_filled() {

    }

    @Given("The user enters the date out of range")
    public void the_user_enters_the_date_out_of_range() {

    }

    @Then("There is warning")
    public void there_is_warning() {

    }

    @Given("The user tries to enter letters to the the date")
    public void the_user_tries_to_enter_letters_to_the_the_date() {

    }

    @Given("The user tries to enter letters to the the month")
    public void the_user_tries_to_enter_letters_to_the_the_month() {

    }

    @Given("The user tries to enter letter to the year")
    public void the_user_tries_to_enter_letter_to_the_year() {

    }

    @Then("Then user can not enter letters")
    public void then_user_can_not_enter_letters() {

    }

    @Given("The user chooses its marital status")
    public void the_user_chooses_its_marital_status() {

    }

    @Then("Marital Status is chosen")
    public void marital_Status_is_chosen() {

    }

    @Then("Under {string} User sees the list of following options:")
    public void under_User_sees_the_list_of_following_options(String maritalStatus) {


    }

    @Given("The user selects its occupation")
    public void the_user_selects_its_occupation() {

    }

    @Then("The occupation is selected")
    public void the_occupation_is_selected() {

    }

    @Given("The user clicks Yes")
    public void the_user_clicks_Yes() {

    }

    @Then("The user can add second occupation")
    public void the_user_can_add_second_occupation() {

    }

    @Given("The user clicks No")
    public void the_user_clicks_No() {

    }

    @Then("The user can not add second occupation")
    public void the_user_can_not_add_second_occupation() {

    }

    @Given("The user does not select")
    public void the_user_does_not_select() {

    }

    @Given("The user enters its phone number")
    public void the_user_enters_its_phone_number() {

    }

    @Then("The phone number section is filled")
    public void the_phone_number_section_is_filled() {

    }

    @Given("The entrance contains letters")
    public void the_entrance_contains_letters() {

    }

    @Given("The user enters its e-mail address")
    public void the_user_enters_its_e_mail_address() {

    }

    @Then("The e-mail address ection is filled")
    public void the_e_mail_address_ection_is_filled() {

    }

    @Given("The user enters invalid e-mail address")
    public void the_user_enters_invalid_e_mail_address() {

    }


}
