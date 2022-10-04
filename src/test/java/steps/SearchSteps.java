package steps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{
    @Step
    public void searchForKeyword(String keyword){
        homePage.setSearchField(keyword);
    }
     @Step
   public void findProductWithNameInListAndOpen(String productName){
        Assert.assertTrue(searchResultsPage.findProductInGridAndOpen(productName));
    }
    @Step
    public void getProductNotFoundMessage(){
        searchResultsPage.getProductNotFoundMessage();
    }

    @Step
    public void navigateToProductName(String productName){
        findProductWithNameInListAndOpen(productName);
    }
    @Step
    public void addARatingForReview(){
        productPage.hitRatingStarts();
    }
    @Step
    public void addACommentforReview(){
        productPage.enterReviewText();
    }
    @Step
    public void hitSubmitYourReviewButton(){
        productPage.hitSubmitReviewForm();
    }
    @Step
    public void checkReviewSubmissionSuccess(){
        getProductNotFoundMessage();
    }
}
