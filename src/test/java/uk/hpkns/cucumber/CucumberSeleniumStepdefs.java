package uk.hpkns.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class CucumberSeleniumStepdefs {

    FirefoxDriver driver;

    public CucumberSeleniumStepdefs() {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    }

    @Given("I browse to the webpage {string}")
    public void browseTo(String url) {
        driver.get(url);
    }

    @When("I enter the search query {string}")
    public void search(String query) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(query);
    }

    @When("I press search")
    public void pressSearch() {
        WebElement searchButton = driver.findElement(By.className("search__button"));
        searchButton.click();
    }

    @Then("the results list appears")
    public void resultsAppear() {
        WebElement results = driver.findElement(By.className("results"));
        assertTrue(results.isDisplayed(), "results displayed");
    }

    @Then("the browser is closed")
    public void close() {
        driver.quit();
    }
}
