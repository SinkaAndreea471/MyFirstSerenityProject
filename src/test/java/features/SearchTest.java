package features;
import org.junit.Test;
import utils.Constants;

public class SearchTest extends BaseTest{
    @Test
    public void validSearchTest(){
        loginSteps.executeLogin(Constants.USER_EMAIl, Constants.USER_PASS);
 5
    }
    @Test
    public void invalidSearchTest(){
        loginSteps.executeLogin(Constants.USER_EMAIl, Constants.USER_PASS);
        searchSteps.searchForKeyword("Dress 211eqeeq");
        searchSteps.getProductNotFoundMessage();
    }

}
