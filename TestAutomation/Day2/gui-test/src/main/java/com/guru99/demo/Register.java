package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Register {

    public void setFirstName(WebDriver driver,String firstName){
        waitUntilNextElementAppears(driver,By.name("firstName"),5);
        driver.findElement(By.name("firstName")).sendKeys(firstName);
    }

    public void setLastName(WebDriver driver, String lastName){
        waitUntilNextElementAppears(driver,By.name("lastName"),5);
        driver.findElement(By.name("lastName")).sendKeys(lastName);
    }

    public void setPhone(WebDriver driver,String Phone){
        waitUntilNextElementAppears(driver,By.name("phone"),5);
        driver.findElement(By.name("phone")).sendKeys(Phone);
    }

    public void setUserName(WebDriver driver,String UserName){
        waitUntilNextElementAppears(driver,By.name("userName"),5);
        driver.findElement(By.id("userName")).sendKeys(UserName);
    }

    public void setEmail(WebDriver driver,String Email){
        waitUntilNextElementAppears(driver,By.name("email"),5);
        driver.findElement(By.id("email")).sendKeys(Email);
    }

    public void setPassword(WebDriver driver,String Password){
        waitUntilNextElementAppears(driver,By.name("password"),5);
        driver.findElement(By.name("password")).sendKeys(Password);
    }

    public void setConfirmPassword(WebDriver driver,String ConfirmPassword){
        waitUntilNextElementAppears(driver,By.name("confirmPassword"),5);
        driver.findElement(By.name("confirmPassword")).sendKeys(ConfirmPassword);
    }

    public void setSubmit(WebDriver driver){
        driver.findElement(By.name("submit")).click();
    }


    private WebElement waitUntilNextElementAppears(WebDriver driver, By locator, int timeout){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(
                ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }


}
