package features;

import steps.LoginSteps;
import utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{
    @Test
    public void loginWithValidInformation(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIl);
        loginSteps.setPassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("sinkaandreea3");
    }
    @Test
    public void loginWithInvalidInformation(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail("sinkaandreea@fefjeo.com");
        loginSteps.setPassword("daadada");
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();
    }
}
