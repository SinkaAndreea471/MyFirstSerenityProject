package pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultsPage extends BasePage{
@FindBy (css = "h1.entry-title a[href*=\"http://qa1.fasttrackit.org:8008/product/dress-211/\"]")
    private List<WebElementFacade> listOfProductNames;

    public boolean findProductInGridAndOpen(String productName){
        for (WebElementFacade element : listOfProductNames){
            if (element.getText().equalsIgnoreCase(productName)){
                element.click();
                return true;
            }
        }
        return false;
    }

}
