package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;

public class UserLoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("^the user open the browser$")
    public void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "D:\\projects\\prueba_POM\\src\\test\\resources\\drivers\\firefox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("^the user enters valid credentials$")
    public void enterValidCredentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @Then("^the user should be logged in successfully$")
    public void verifyLoginSuccess() {
        loginPage.verifyLoginSuccess("https://www.saucedemo.com/inventory.html");
    }

    @And("^the user clicks on the login button$")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("^the user is on the login page$")
    public void navigateToLoginPage() {
        loginPage.navigateToLoginPage("https://www.saucedemo.com/");
    }

    @And("the user close the browser")
    public void theUserCloseTheBrowser() {
        loginPage.theUserCloseTheBrowser();;
    }
}
