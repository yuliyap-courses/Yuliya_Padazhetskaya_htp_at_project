package tests.BookingSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BaseSteps {
    @FindBy(xpath = "[//*[@id='ss']")
    WebElement citySearchField;
//enter city
// click perform

    @FindBy(xpath = "//*[@id='xp__guests__toggle']/span[2]/span[1]")
    WebElement satellitesSearchSelector;

    @FindBy(xpath = "//*[@id='//*class='sb-searchbox__button']")
    WebElement submitSearchButton;

        public void CitySearchField(WebElement citySearchField) {
        citySearchField.sendKeys();
        }

        public void SubmitSearchButton(WebElement submitSearchButton) {
            submitSearchButton.click();
        }

    public void SatellitesSearchSelector(WebElement satellitesSearchSelector) {
        satellitesSearchSelector.click();
    }
    }








