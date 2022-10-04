package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.locators.WebElementFacadeListItemHandler;

public class CheckoutPage extends BasePage {
    @FindBy(css = "input#billing_first_name.input-text")
    private WebElementFacade firstNameField;
    @FindBy(css = "input#billing_last_name.input-text")
    private WebElementFacade lastNameField;
    @FindBy(css = "input#billing_address_1.input-text")
    private WebElementFacade streetAddressField;
    @FindBy(css = "input#billing_city.input-text")
    private WebElementFacade cityField;
    @FindBy(css = "input#billing_postcode.input-text")
    private WebElementFacade postcodeField;
    @FindBy(css = "input.select2-search__field")
    private WebElementFacade countryField;
    @FindBy(css = "input#billing_phone.input-text")
    private WebElementFacade phoneNumberField;
    @FindBy(css = "input#billing_email.input-text")
    private WebElementFacade emailField;
    @FindBy(css = "button#place_order.button.alt")
    private WebElementFacade placeOrderButton;
    @FindBy(css = ".woocommerce-order-details__title", timeoutInSeconds = "10")
    private WebElementFacade orderDetailsTitle;
    @FindBy(css = "ul.woocommerce-error li", timeoutInSeconds = "5")
    private WebElementFacade mandatoryFieldRequiredMessage;

    public void waitForTitle() {
        orderDetailsTitle.waitUntilVisible();
    }

    public void setFirstNameField(String value) {
        typeInto(firstNameField, value);
    }

    public void setLastNameField(String value) {
        typeInto(lastNameField, value);
    }

    public void setBillingAddress(String value) {
        typeInto(streetAddressField, value);
    }

    public void setCityField(String value) {
        typeInto(cityField, value);
    }

    public void setPostcodeField(String value) {
        typeInto(postcodeField, value);
    }

    public void setCountryField(String value) {
        typeInto(countryField, value);
    }

    public void setPhoneNumberField(String value) {
        typeInto(phoneNumberField, value);
    }

    public void setBillingEmail(String value) {
        typeInto(emailField, value);
    }

    public void clickOnPlaceOrderButton() {
        clickOn(placeOrderButton);
    }

    public String getOrderReceivedMessage() {
        return orderDetailsTitle.getText();
    }

    public void emptyMandatoryField() {
        emailField.clear();
    }
    public void waitForMandatoryMessage() {
        mandatoryFieldRequiredMessage.waitUntilVisible();
    }

    public String getMandatoryFieldRequiredMessage() {
        return mandatoryFieldRequiredMessage.getText();
    }
}
