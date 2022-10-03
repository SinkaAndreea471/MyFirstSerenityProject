package pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends BasePage{
    @FindBy(css= "div.woocommerce-MyAccount-content p:first-child")
    private WebElementFacade welcomeTextElement;
    @FindBy(css= "a[href*=\"http://qa1.fasttrackit.org:8008/my-account/orders/\"]")
    private WebElementFacade ordersButton;

    public String getWelcomeText(){
        return welcomeTextElement.getText();
    }
    public void clickOrdersButton(){
        clickOn(ordersButton);
    }
}
