package steps;
import net.thucydides.core.steps.ScenarioSteps;
import pages.*;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;


public class BaseSteps extends ScenarioSteps{
    protected AccountPage accountPage;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected SearchResultsPage searchResultsPage;
    protected ProductPage productPage;
    protected CartPage cartPage;
    protected CheckoutPage checkoutPage;
}
