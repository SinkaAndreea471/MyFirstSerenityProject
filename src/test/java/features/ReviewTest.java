package features;

import utils.Constants;
import org.junit.Test;

public class ReviewTest extends BaseTest{
    @Test
    public void searchForProductAndAddReviewTest(){
        loginSteps.executeLogin(Constants.USER_EMAIl, Constants.USER_PASS);
        searchSteps.searchForKeyword("Dress 211");
        searchSteps.findProductWithNameInListAndOpen("Dress 211");
        searchSteps.navigateToProductReviews();
        searchSteps.waitUntilElementIsVisible();
        searchSteps.hitRatingStarsForReview();
        searchSteps.addACommentForReview("very nice product, enjoyed it");
        searchSteps.hitSubmitYourReviewButton();
        searchSteps.checkReviewSubmittedSuccessMessage();




    }
}
