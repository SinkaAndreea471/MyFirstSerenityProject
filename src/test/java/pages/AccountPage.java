package pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends BasePage{
    @FindBy(css= "div.woocommerce-MyAccount-content p:first-child")
    private WebElementFacade welcomeTextElement;
    @FindBy(css= "a[href*=\"http://qa1.fasttrackit.org:8008/my-account/orders/\"]")
    private WebElementFacade ordersButton;
    @FindBy (css="li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--customer-logout a")
    private WebElementFacade logoutLink;
    @FindBy (css= "div.u-column1.col-1 h2")
    private WebElementFacade backToLoginElement;

    public String getWelcomeText(){
        return welcomeTextElement.getText();
    }
    public void clickOrdersButton(){
        clickOn(ordersButton);
    }
    public void clickLogoutLink(){
        clickOn(logoutLink);
    }
    public String getBackToLoginElement (){
      return  backToLoginElement.getText();
    }

}
