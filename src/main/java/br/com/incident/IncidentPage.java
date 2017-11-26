package br.com.incident;

import org.openqa.selenium.WebDriver;

import static br.com.incident.SettingsToExecuteTests.PAGE;

public class IncidentPage {

    private WebDriver driver;

    IncidentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void visit() {
        driver.get(PAGE.getDescribe());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
