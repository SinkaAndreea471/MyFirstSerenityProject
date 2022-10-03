package pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage {
    @FindBy(css = "h1.product_title.entry-title")
    private WebElementFacade productName;
    @FindBy (css="button.single_add_to_cart_button.button.alt")
    private WebElementFacade addToCartButton;
    @FindBy(css="div.woocommerce-message")
    private WebElementFacade addedToCartSuccessMessage;
    @FindBy (css="input#quantity_6339fe4974d7b")
    private WebElementFacade quantityField;
    @FindBy (css="textarea#comment")
    private WebElementFacade productFormTextArea;
    @FindBy (css = "p.form-submit")
    private WebElementFacade submitFormButton;
    @FindBy (css = "li#menu-item-59 a[href*=\"http://qa1.fasttrackit.org:8008/cart\"]")
    private WebElementFacade cartButton;


    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
    public String getSuccessMessage(){return addedToCartSuccessMessage.getText();
    }
    public void enterProductQuantity(String value){
        typeInto(quantityField, value);
    }
    public void clickOnCartButton(){
        clickOn(cartButton);
    }
    public void enterProductReview(String value){
        typeInto(productFormTextArea, value);
    }
    public void submitProductForm(){
        clickOn(submitFormButton);
    }
}
