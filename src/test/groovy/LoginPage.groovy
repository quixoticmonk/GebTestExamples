package groovy

import geb.Page

class LoginPage extends Page{
    static url = "/login"
    static at = {
        $("h2").text() == "Login Page"
    }
    static content ={
        userNameField{ $("input", name: "username") }
        passwordField { $("input", name: "password") }
        loginButton(to: SecureAreaPage) { $("button", type: "submit") }
    }
    void loginWithUserCredentials(String userName,String pass){
        userNameField.value(userName)
        passwordField.value(pass)
        loginButton.click()
    }

}
