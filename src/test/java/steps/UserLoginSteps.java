package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class UserLoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("^the user open the browser$")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\projects\\prueba_POM\\src\\test\\resources\\drivers");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @And("^the user is on the login page$")
    public void navigateToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }


    @When("^the user enters valid credentials$")
    public void enterValidCredentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @And("^the user clicks on the login button$")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("^the user should be logged in successfully$")
    public void verifyLoginSuccess() {
        // Agrega aquí las aserciones para verificar el inicio de sesión exitoso
    }

    @And("^the user close the browser$")
    public void closeBrowser() {
        driver.quit();
    }
}