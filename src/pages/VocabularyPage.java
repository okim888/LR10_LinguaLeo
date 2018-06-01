package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VocabularyPage {

    public VocabularyPage(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver driver;
    String vocabularyButtonXPath = "//*[@data-a-target='topmenu-dict']";

    String searchWordXPath = "//*[@name='search']";
    String addButtonXPath =  "//*[@class='icon-add-meat-d']";
    String makeChoice = "//*[@data-tran='утверждать, заявлять']"; //"//div[@data-tran-item]";
    String titleXPath = "//*[@class='t-ellps dict-title-main']"; //added for LR10
    String addedValueXPath = "//div[@class='item-word-translate ']//*[text()='assert']"; //added for LR10


    //методы по взаимодействию элементов
    public void clickVocabularyButton () {
        driver.findElement(By.xpath(vocabularyButtonXPath)).click();
    }

    public void enterWord (String word) {
        driver.findElement(By.xpath(searchWordXPath)).sendKeys(word);
    }

    public void clickAddButton () {
        driver.findElement(By.xpath(addButtonXPath)).click();
    }

    public void clickChoice () {
        driver.findElement(By.xpath(makeChoice)).click();
    }

    public boolean atPage(){
        return driver.findElement(By.xpath(titleXPath)).isDisplayed(); } //added for LR10

    public boolean addedValueAtPage(){
        return driver.findElement(By.xpath(addedValueXPath)).isDisplayed(); } //added for LR10

}
