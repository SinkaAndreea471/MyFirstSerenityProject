package features;
import pages.HomePage;
import utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{
    @Test
    public void loginAndAddToCartTest(){
        loginSteps.executeLogin(Constants.USER_EMAIl, Constants.USER_PASS);
        searchSteps.searchForKeyword("Dress 211");
        searchSteps.navigateToProductName("Dress 211");
        cartSteps.addProductToCart();
        cartSteps.checkAddToCartSuccess("Dress 211");
    }
    @Test
    public void loginAndRemoveOneProductFromCartTest(){
        loginSteps.executeLogin(Constants.USER_EMAIl, Constants.USER_PASS);
        searchSteps.searchForKeyword("Dress 211");
        searchSteps.navigateToProductName("Dress 211");
        cartSteps.addProductToCart();
        cartSteps.goToCart();
        cartSteps.removeProductFromCart();
        cartSteps.checkRemoveFromCartSuccess("Dress 211");
    }
    @Test
    public void checkTotalAndSubtotalTest(){
        searchSteps.searchForKeyword("Dress 211");
        searchSteps.navigateToProductName("Dress 211");
        cartSteps.addProductToCart();
        cartSteps.checkSubtotalPrice();
        cartSteps.checkTotalPrice();
    }

}
