package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //поля класса
    WebDriver driver;
    //локаторы
    String emailInputXPath = "//*[@id='loginForm']//child::*[@name='email']";
    String passwordInputXPath = "//*[@id='loginForm']//child::*[@name='password']";
    String sendButtonXPath = "//*[@id='loginForm']//child::*[@data-element='send']";

    //методы по взаимодействию элементов
    public void enterEmail (String email) {
        driver.findElement(By.xpath(emailInputXPath)).sendKeys(email);
    }

    public void enterPassword (String password) {
        driver.findElement(By.xpath(passwordInputXPath)).sendKeys(password);
    }

    public void clickSendButton () {
        driver.findElement(By.xpath(sendButtonXPath)).click();
    }
}
