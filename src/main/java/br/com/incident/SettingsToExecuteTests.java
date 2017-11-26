package br.com.incident;

public enum SettingsToExecuteTests {

    PAGE("http://front-incident.surge.sh"),
    DRIVE_NAME("webdriver.chrome.driver"),
    DRIVE_LOCATION("insert path chrome drive here");

    private String describe;

    SettingsToExecuteTests(String describe) {
        this.describe = describe;
    }

    public String getDescribe() {
        return this.describe;
    }


}
