package br.com.incident;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static br.com.incident.SettingsToExecuteTests.DRIVE_LOCATION;
import static br.com.incident.SettingsToExecuteTests.DRIVE_NAME;

public class IncidentTest {

    private WebDriver driver;
    private IncidentPage incidentPage;

    @Before
    public void init() {
        System.setProperty(DRIVE_NAME.getDescribe(), DRIVE_LOCATION.getDescribe());
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        this.incidentPage = new IncidentPage(driver);
    }

    @Test
    public void visitEndValidAnyDays() {
        incidentPage.visit();

        Assert.assertTrue(driver.getPageSource().contains("Ontem"));
        Assert.assertTrue(driver.getPageSource().contains("Hoje"));
        Assert.assertTrue(driver.getPageSource().contains("Amanhã"));
    }

}
