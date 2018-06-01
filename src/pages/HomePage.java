package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
    String profileNameXPath = "//*[@data-a-target='topmenu-account']";

    public boolean atPage(){
        return driver.findElement(By.xpath(profileNameXPath)).isDisplayed();
    }

}