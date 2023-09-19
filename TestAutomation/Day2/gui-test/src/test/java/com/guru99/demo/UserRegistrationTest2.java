package com.guru99.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PropertyFileReader;

public class UserRegistrationTest2 {

    WebDriver driver;
    Home home;

    Register register;

    RegisterSuccess registerSuccess;

    PropertyFileReader prop = new PropertyFileReader();
    String url = prop.getProperty("config","url");

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        home = new Home();
        home.clickOnRegisterLink(driver);
        register = new Register();
        registerSuccess = new RegisterSuccess();
    }

    @Test
    public void testRegisterNewUser() {
        register.setFirstName(driver,"Dilru");
        register.setLastName(driver,"Senevirathna");
        register.setPhone(driver,"+5656555585");
        register.setEmail(driver,"dil@gmail.com");
        register.setUserName(driver,"New Admin");
        register.setPassword(driver,"789");
        register.setConfirmPassword(driver,"789");
        register.setSubmit(driver);
        Assert.assertEquals(registerSuccess.getSalutationMessage(driver),"Dear Dilru Senevirathna,");

    }

}
