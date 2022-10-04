package pages;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@DefaultUrl("http://qa1.fasttrackit.org:8008/")
public class HomePage extends BasePage {
    @FindBy(css = "li#menu-item-58 a[href^=\"http://qa1.fasttrackit.org:8008/my-account/\"]")
    private WebElementFacade accountLink;
    @FindBy(css = "a[href*=\"http://qa1.fasttrackit.org:8008/wp-login.php?action=register\"]")
    private WebElementFacade registerLink;
    @FindBy(css = "a[href$=\"http://qa1.fasttrackit.org:8008/wp-login.php\"]")
    private WebElementFacade loginLink;
    @FindBy(css = "ul#primary-menu a[href*=\"http://qa1.fasttrackit.org:8008/shop\"]")
    private WebElementFacade shopLink;
    @FindBy(css = "input.search-field")
    private WebElementFacade searchField;
    @FindBy(css = "li#menu-item-59 a[href*=\"http://qa1.fasttrackit.org:8008/cart\"]")
    private WebElementFacade cartButton;
    @FindBy(css = "div.menu-a-container a.cart-contents")
    private WebElementFacade cartPreview;
    @FindBy(css = "li a[href*=\"http://qa1.fasttrackit.org:8008/2021/06/29/welcome/\"]")
    private WebElementFacade welcomePost;
    @FindBy(css = "li#menu-item-61 a")
    private WebElementFacade checkoutButton;
    @FindBy(css = "li a[href*=\"http://qa1.fasttrackit.org:8008/wp-login.php?action=logout&_wpnonce=7eb56e9271\"]")
    private WebElementFacade logoutLink;
    @FindBy(css = "p a")
    private WebElementFacade doYouReallyWantToLogOutButton;
    @FindBy(css = "p.message")
    private WebElementFacade youAreLoggedOutMessage;

    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickRegisterLink() {
        clickOn(registerLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void setSearchField(String value) {
        typeInto(searchField, value + Keys.ENTER);
    }

    public void typeIntoFieldAndHitEnter(WebElementFacade webElement, String value) {
        typeInto(webElement, value);
    }

    public void clickShopButton() {
        clickOn(shopLink);
    }

    public void clickCartButton() {
        clickOn(cartButton);
    }

    public void clickCartPreview() {
        clickOn(cartPreview);
    }

    public void clickWelcomePost() {
        clickOn(welcomePost);
    }

    public void clickCheckoutButton() {
        clickOn(checkoutButton);
    }

    public void clickLogoutButton() {
        clickOn(logoutLink);
    }

    public void clickDoYouReallyWantToLogOutButton() {
        clickOn(doYouReallyWantToLogOutButton);
    }
}

