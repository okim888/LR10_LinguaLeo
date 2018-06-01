package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VocabularyPage;

import static org.testng.Assert.assertEquals;

public class AddWordToVocabularyTest {

    @Test
    public void addTest() {
        WebDriver driver = new FirefoxDriver();
        LoginPage loginPage = new LoginPage(driver);

        driver.get("https://lingualeo.com/ru#welcome");
        driver.findElement(By.id("headEnterBtn")).click();

        loginPage.enterEmail("ol4ik.kim17@gmail.com");
        loginPage.enterPassword("automation");
        loginPage.clickSendButton();


        //Wait for 5 Sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        VocabularyPage vocabularyPage = new VocabularyPage(driver);
        vocabularyPage.clickVocabularyButton();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals(vocabularyPage.atPage(), true); // check that the element from vocabulary page is at the page

        vocabularyPage.enterWord("assert");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        vocabularyPage.clickAddButton();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        vocabularyPage.clickChoice();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        assertEquals(vocabularyPage.addedValueAtPage(), true, "Oh, your word has not been added :("); // check that the element from vocabulary page is at the page


    }

}
