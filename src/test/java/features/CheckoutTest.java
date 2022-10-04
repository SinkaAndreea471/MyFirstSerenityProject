package features;

import org.junit.Test;
import steps.CheckoutSteps;
import steps.LoginSteps;
import utils.Constants;


public class CheckoutTest extends BaseTest{
    @Test
    public void validCheckoutTest(){
        loginSteps.executeLogin(Constants.USER_EMAIl, Constants.USER_PASS);
        searchSteps.searchForKeyword("Dress 211");
        searchSteps.navigateToProductName("Dress 211");
        cartSteps.addProductToCart();
        cartSteps.goToCart();
        cartSteps.hitProceedToCheckout();
        checkoutSteps.setBillingFirstName("Andreea");
        checkoutSteps.setBillingLastName("Sinka");
        checkoutSteps.setStreetBillingAddress("Str. Avram Iancu Nr. 355");
        checkoutSteps.setBillingCity("Floresti");
        checkoutSteps.setPostcode("4545464");
        checkoutSteps.setPhoneNumber("48484844848");
        checkoutSteps.setBillingEmail(Constants.USER_EMAIl);
        checkoutSteps.hitPlaceOrderButton();
        checkoutSteps.checkOrderReceivedSuccess();
    }
    @Test
    public void invalidCheckoutTest(){
        loginSteps.executeLogin(Constants.USER_EMAIl, Constants.USER_PASS);
        searchSteps.searchForKeyword("Dress 211");
        searchSteps.navigateToProductName("Dress 211");
        cartSteps.addProductToCart();
        cartSteps.goToCart();
        cartSteps.hitProceedToCheckout();
        checkoutSteps.setBillingFirstName("Andreea");
        checkoutSteps.setBillingLastName("Sinka");
        checkoutSteps.setStreetBillingAddress("Str. Avram Iancu Nr. 355");
        checkoutSteps.setPostcode("4545464");
        checkoutSteps.setPhoneNumber("48484844848");
        checkoutSteps.setBillingEmail(Constants.USER_EMAIl);
        checkoutSteps.emptyMandatoryField();
        checkoutSteps.hitPlaceOrderButton();
        checkoutSteps.checkMandatoryFieldRequiredMessage();
    }
}
