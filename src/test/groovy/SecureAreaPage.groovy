package groovy

import geb.Page

class SecureAreaPage extends Page {
    static url ="secure"
    static at ={
        $("h2").text()=="Secure Area"
    }
    static content ={
        flashMessage{$("div#flash")}
        logoutButton{$("i.icon-2x.icon-signout")}
    }
}
