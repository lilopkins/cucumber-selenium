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

    @Given("^I browse to the webpage \"(.*)\"$")
    public void browseTo(String url) {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get(url);
    }

    @When("^I enter the search query \"(.*)\" and press search$")
    public void search(String query) {
        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.className("search__button"));

        searchBox.sendKeys(query);
        searchButton.click();
    }

    @Then("^The results list appears$")
    public void resultsAppear() {
        WebElement results = driver.findElement(By.className("results"));
        assertTrue(results.isDisplayed(), "results displayed");
        driver.quit();
    }
}
