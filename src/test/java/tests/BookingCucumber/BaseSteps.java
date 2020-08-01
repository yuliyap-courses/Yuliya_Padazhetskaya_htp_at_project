package tests.BookingCucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseSteps {

    @FindBy(xpath = "[//*[@id='ss']")
    WebElement citySearchField;
    //enter city
    // click


    @FindBy(xpath = "//*[@id='xp__guests__toggle']/span[2]/span[1]")
    WebElement  satellitesSearchSelector;

    @FindBy(xpath = "//*[@id='//*class='sb-searchbox__button']")
    WebElement submitSearchButton;



    public void CitySearchField(WebElement citySearchField) {
        citySearchField.sendKeys();

    }
    public void SatellitesSearchSelector(WebElement satellitesSearchSelector) {
        satellitesSearchSelector.click();
    }

    public void SubmitSearchButton(WebElement submitSearchButton) {
        submitSearchButton.submit();
    }

}










