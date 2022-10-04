package features;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import steps.*;


@RunWith(SerenityRunner.class)
    public class BaseTest {

        @Managed(uniqueSession = true)
        public WebDriver driver;

        @Steps
        protected LoginSteps loginSteps;
        @Steps
        protected SearchSteps searchSteps;
        @Steps
        protected CartSteps cartSteps;
        @Steps
        protected CheckoutSteps checkoutSteps;
        @Steps
        protected LogoutSteps logoutSteps;


        @Before
        public void init() {
            driver.manage().window().maximize();
            driver.get("http://qa1.fasttrackit.org:8008/");
        }
    }
