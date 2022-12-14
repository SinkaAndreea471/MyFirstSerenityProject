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
    public void navigateToProductReviews(){
        productPage.clickOnProductReviewsButton();
    }
    @Step
    public void waitUntilElementIsVisible() {
        productPage.waitForReviewStars();
    }

    @Step
    public void hitRatingStarsForReview(){
        productPage.enterReviewStars();
    }
    @Step
    public void addACommentForReview(String  value){
        productPage.enterReviewText(value);
    }
    @Step
    public void hitSubmitYourReviewButton(){
        productPage.hitSubmitReviewForm();
    }
    @Step
    public void checkReviewSubmittedSuccessMessage(){
        Assert.assertEquals("Your review is awaiting approval", productPage.getSuccessfulReviewSubmittedMessage());
    }
    @Step
    public void checkReviewSubmissionSuccess(){
        getProductNotFoundMessage();
    }
}
