package groovy

import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class LoginTests extends GebReportingSpec {

    def "Validate Login page"() {
        given: "I am on the login page"
            to LoginPage

        when: "I enter login id and Password"
            loginWithUserCredentials("tomsmith","SuperSecretPassword!")

        then: "I am able to login successfully"
            logoutButton.click()

    }

}