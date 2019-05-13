package resources

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

baseUrl = "https://the-internet.herokuapp.com"
reportsDir = new File("target/geb-reports")
environments {
    chrome {
        System.setProperty('webdriver.chrome.driver', "drivers/chromedriver.exe")
        driver = {
            ChromeOptions options = new ChromeOptions()
            options.addArguments('--headless', '--disable-gpu', '--disable-plugins', '--enable-logging', '--v=1')
            return new ChromeDriver(options)
        }
    }
}
