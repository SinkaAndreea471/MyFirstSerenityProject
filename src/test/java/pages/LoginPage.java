package pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage{
    @FindBy (css = "#user_login")
    private WebElementFacade emailField;
    @FindBy (css = "input#user_pass.input")
    private WebElementFacade passwordField;
    @FindBy (css= "input#rememberme")
    private WebElementFacade rememberMeTick;
    @FindBy (css= "input#wp-submit.button.button-primary.button-large")
    private WebElementFacade loginButton;
    @FindBy(css = "strong")
    private WebElementFacade errorMessageElement;

    public void setEmailField(String value){
        typeInto(emailField, value);
    }
    public void setPasswordField (String value){
        typeInto(passwordField, value);
    }
    public void setRememberMeTick (){
        clickOn(rememberMeTick);
    }
    public void clickLoginButton(){
        clickOn(loginButton);
    }
    public String getErrorMessage(){
        return errorMessageElement.getText();
    }
}




