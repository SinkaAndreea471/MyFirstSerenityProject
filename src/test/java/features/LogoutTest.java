package features;
import steps.LoginSteps;
import utils.Constants;
import org.junit.Test;

import org.junit.Test;

public class LogoutTest extends BaseTest{
    @Test
    public void validLogoutTest(){
        loginSteps.executeLogin(Constants.USER_EMAIl, Constants.USER_PASS);
        logoutSteps.clickLogOutLink();
        logoutSteps.verifyUserLoggedOut();
    }

}
