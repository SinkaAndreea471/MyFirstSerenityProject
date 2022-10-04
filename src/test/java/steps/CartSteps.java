package steps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{
    @Step
    public void addProductToCart(){
        productPage.clickAddToCartButton();
    }
    @Step
    public void goToCart(){
        productPage.clickOnCartButton();
    }
    @Step
    public void removeProductFromCart(){
        cartPage.clickRemoveFromCartButton();
    }
    @Step
    public void hitProceedToCheckout(){
        cartPage.clickproceedToCheckoutButton();
    }

    @Step
    public void checkAddToCartSuccess (String productName){
        String expected = "View cart\n“"+productName+"” has been added to your cart.";
        String actual = productPage.getSuccessMessage();
        Assert.assertEquals(expected, actual);
    }

    @Step
    public void checkRemoveFromCartSuccess(){
        String expected = "Your cart is currently empty.";
        String actual = cartPage.getCartIsEmptyMessage();
        Assert.assertEquals(expected, actual);
    }
    @Step
    public void checkSubtotalPrice(){
        Assert.assertTrue(cartPage.checkIfSubtotalMatches());
    }
    @Step
    public void checkTotalPrice(){
        Assert.assertTrue(cartPage.checkIfTotalPriceMatches());
    }
}

