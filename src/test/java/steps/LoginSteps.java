package steps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {
    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void navigateToLoginPage() {
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }
    @Step
    public void setUserEmail(String email){
        loginPage.setEmailField(email);
    }
    public void setPassword(String password){
        loginPage.setPasswordField(password);
    }
    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }
    @Step
    public void verifyUserIsLoggedIn(String userName) {
        Assert.assertEquals("Hello " + userName + " (not " + userName + "? Log out)", accountPage.getWelcomeText());
    }
    public void verifyUserNotLoggedIn(){
        Assert.assertEquals("ERROR",loginPage.getErrorMessage());
    }
    @Step
    public void executeLogin(String email, String password){
        navigateToLoginPage();
        setUserEmail(email);
        setPassword(password);
        clickLogin();
    }
}
