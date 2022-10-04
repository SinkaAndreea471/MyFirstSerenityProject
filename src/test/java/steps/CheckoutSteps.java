package steps;

import net.thucydides.core.annotations.Step;
import org.checkerframework.checker.fenum.qual.SwingTextOrientation;
import org.junit.Assert;
import pages.CheckoutPage;

public class CheckoutSteps extends BaseSteps{
    @Step
    public void proceedToCheckout(){
        cartPage.clickproceedToCheckoutButton();
    }
    @Step
    public void setBillingFirstName(String firstName){
       checkoutPage.setFirstNameField(firstName);
    }
    @Step
    public void setBillingLastName(String lastName){
        checkoutPage.setLastNameField(lastName);
    }
    @Step
    public void setStreetBillingAddress (String address){
        checkoutPage.setBillingAddress(address);
    }
    @Step
    public void setBillingCity (String city){
        checkoutPage.setCityField(city);
    }
    @Step
    public void setPostcode (String postcode) {
        checkoutPage.setPostcodeField(postcode);
    }
    @Step
    public void setPhoneNumber (String phoneNumber) {
        checkoutPage.setPhoneNumberField(phoneNumber);
    }
    @Step
    public void setBillingEmail (String email) {
        checkoutPage.setBillingEmail(email);
    }
    @Step
    public void hitPlaceOrderButton (){
        checkoutPage.clickOnPlaceOrderButton();
    }

    @Step
    public void waitUntilElementIsVisible(){
        checkoutPage.waitForTitle();
    }

    @Step
    public void checkOrderReceivedSuccess (){
        checkoutPage.waitForTitle();
        String expected = "Order details";
        String actual = checkoutPage.getOrderReceivedMessage();
        Assert.assertEquals(expected, actual);
    }
    @Step
    public void emptyMandatoryField (){
        checkoutPage.emptyMandatoryField();
    }
    @Step
    public void checkMandatoryFieldRequiredMessage (){
        String expected = "Billing Email address is a required field.";
        String actual = checkoutPage.getMandatoryFieldRequiredMessage();
        Assert.assertEquals(expected, actual);
    }




}
