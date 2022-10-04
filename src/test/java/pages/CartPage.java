package pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.locators.WebElementFacadeListItemHandler;

import java.util.List;

public class CartPage extends BasePage{

    @FindBy(css = "td.product-subtotal span.woocommerce-Price-amount.amount")
    private List<WebElementFacade> subtotalProductsList;
    @FindBy(css="th.product-name")
    private WebElementFacade subtotalCartPrice;
    @FindBy(css = "tr.order-total span.woocommerce-Price-amount.amount")
    private WebElementFacade totalCartPrice;

    @FindBy(css =  " a.remove")
    private List<WebElementFacade> listOfRemoveFromCartButton;

    @FindBy (css = "p.cart-empty")
    private WebElementFacade cartIsEmptyMessage;

    @FindBy(css ="div.woocommerce-message")
    private WebElementFacade removedFromCartMessage;
    @FindBy (css = "a.checkout-button.button.alt.wc-forward")
    private WebElementFacade proceedToCheckoutButton;


    public int getProductsSubtotal(){
        int sum = 0;
        for(WebElementFacade elementFacade:subtotalProductsList){
            sum+= convertStringToInteger(elementFacade.getText());
        }
        return sum;
    }
    public boolean checkIfSubtotalMatches(){
        int expected = getProductsSubtotal();
        int actual = convertStringToInteger(subtotalCartPrice.getText());
        return expected == actual;
    }
    public boolean checkIfTotalPriceMatches(){
        int subtotal = getProductsSubtotal();
        int expectedTotal = subtotal;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }
    public void clickRemoveFromCartButton(){
        for (int i=0;i<listOfRemoveFromCartButton.size();i++){
            clickOn(listOfRemoveFromCartButton.get(i));
        }
    }
    public String getRemovedFromCartMessage(){
        return removedFromCartMessage.getText();
    }
    public String getCartIsEmptyMessage(){
        return cartIsEmptyMessage.getText();
    }
    public void clickProceedToCheckoutButton(){
        clickOn(proceedToCheckoutButton);
    }

}
