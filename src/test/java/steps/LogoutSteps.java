package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LogoutSteps extends BaseSteps{
    @Step
    public void clickLogOutLink() {
        accountPage.clickLogoutLink();
    }
    @Step
    public void verifyUserLoggedOut(){
        Assert.assertEquals("Login",accountPage.getBackToLoginElement());
    }

}
